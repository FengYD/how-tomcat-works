package com.feng.tomcat.ch2;

import java.io.IOException;

/**
 * @author fengyadong
 * @date 2022/12/30 10:42
 * @Description
 */
public class StaticResourceProcessor {

    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
