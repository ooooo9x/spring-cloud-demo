package com.liujf.springcloud02.test1Server.api;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生故障！";
    }
}