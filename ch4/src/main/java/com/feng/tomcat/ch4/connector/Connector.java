package com.feng.tomcat.ch4.connector;

import com.feng.tomcat.ch4.connector.http.HttpProcessor;
import org.apache.catalina.Container;

/**
 * @author fengyadong
 * @date 2022/12/30 17:50
 * @Description
 */
public interface Connector {
    Container getContainer();

    void setContainer(Container container);

    void createRequest();

    void createResponse();

    void recycle(HttpProcessor httpProcessor);
}