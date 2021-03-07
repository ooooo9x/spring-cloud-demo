package com.liujf.springcloud02.test1Server.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * class_name: $
 * package: com.media.transcode.common.utils$
 * describe: TODO
 * creat_user: yangyang
 * creat_date: $ $
 **/
@Component
public class HttpClientUtils {
    private static final Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);
    public static final String CONTENT_TYPE_XML = "application/xml";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_TYPE_TEXT = "text/plain";
    private final static String LOGIN_URI = "/api/v1/login";

    public String post(String url, String req, String contentType) {
        logger.info("发给地址：{},报文为：\n{}", url, req);
        
        return "";
    }
}
