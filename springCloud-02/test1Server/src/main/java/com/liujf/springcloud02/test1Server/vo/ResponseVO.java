package com.liujf.springcloud02.test1Server.vo;

import java.io.Serializable;

public class ResponseVO<T> implements Serializable {
    private static final long serialVersionUID = -6925010887949792100L;
    private Integer code;
    private String message;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}