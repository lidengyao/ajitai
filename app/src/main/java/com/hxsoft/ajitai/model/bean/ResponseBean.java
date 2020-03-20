package com.hxsoft.ajitai.model.bean;

/**
 * Created by jinxh on 16/2/17.
 */
public class ResponseBean<T> {
    private String code;
    private T data;
    private String msg;
    private String time;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return data;
    }

    public void setBody(T data) {
        this.data = data;
    }
}
