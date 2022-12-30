package com.feng.tomcat.ch3;

import com.feng.tomcat.ch3.connector.http.HttpRequest;
import com.feng.tomcat.ch3.connector.http.HttpResponse;

import java.io.IOException;

/**
 * @author fengyadong
 * @date 2022/12/30 14:47
 * @Description
 */
public class StaticResourceProcessor {

    public void process(HttpRequest request, HttpResponse response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
