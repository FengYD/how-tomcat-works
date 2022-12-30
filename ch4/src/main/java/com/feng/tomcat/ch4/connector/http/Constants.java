package com.feng.tomcat.ch4.connector.http;

import java.io.File;

/**
 * @author fengyadong
 * @date 2022/12/30 14:50
 * @Description
 */
public final class Constants {
    public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator  + "webroot";
    public static final String Package = "com.feng.tomcat.ch4.connector.http";
    public static final int DEFAULT_CONNECTION_TIMEOUT = 60000;
    public static final int PROCESSOR_IDLE = 0;
    public static final int PROCESSOR_ACTIVE = 1;
}

