package com.feng.tomcat.ch3.start;

import com.feng.tomcat.ch3.connector.http.HttpConnector;

/**
 * @author fengyadong
 * @date 2022/12/30 14:46
 * @Description
 */
public final class Bootstrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        connector.start();
    }
}