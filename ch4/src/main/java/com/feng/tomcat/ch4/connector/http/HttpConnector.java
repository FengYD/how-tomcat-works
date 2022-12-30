package com.feng.tomcat.ch4.connector.http;

import com.feng.tomcat.ch4.connector.Connector;
import org.apache.catalina.*;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author fengyadong
 * @date 2022/12/30 14:51
 * @Description
 */

public class HttpConnector implements Connector, Runnable, Lifecycle {

    boolean stopped;
    private final String scheme = "http";

    public String getScheme() {
        return scheme;
    }

    public void run() {
        ServerSocket serverSocket = null;
        int port = 8080;
        try {
            serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        while (!stopped) {
            // Accept the next incoming connection from the server socket
            Socket socket;
            try {
                socket = serverSocket.accept();
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            // Hand this socket off to an HttpProcessor
            HttpProcessor processor = new HttpProcessor(this);
            processor.process(socket);
        }
    }

    @Override
    public void addLifecycleListener(LifecycleListener lifecycleListener) {

    }

    @Override
    public LifecycleListener[] findLifecycleListeners() {
        return new LifecycleListener[0];
    }

    @Override
    public void removeLifecycleListener(LifecycleListener lifecycleListener) {

    }

    @Override
    public void init() throws LifecycleException {

    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void stop() throws LifecycleException {

    }

    @Override
    public void destroy() throws LifecycleException {

    }

    @Override
    public LifecycleState getState() {
        return null;
    }

    @Override
    public String getStateName() {
        return null;
    }

    @Override
    public Container getContainer() {
        return null;
    }

    @Override
    public void setContainer(Container container) {

    }

    @Override
    public void createRequest() {

    }

    @Override
    public void createResponse() {

    }

    @Override
    public void recycle(HttpProcessor httpProcessor) {

    }
}
