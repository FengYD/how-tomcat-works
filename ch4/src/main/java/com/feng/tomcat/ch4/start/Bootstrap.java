package com.feng.tomcat.ch4.start;

import com.feng.tomcat.ch4.connector.http.HttpConnector;
import com.feng.tomcat.ch4.core.SimpleContainer;

/**
 * @author fengyadong
 * @date 2022/12/30 14:46
 * @Description
 */
public final class Bootstrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        SimpleContainer container = new SimpleContainer();
        connector.setContainer(container);
        try {
            connector.init();
            connector.start();

            // make the application wait until we press any key.
            System.in.read();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}