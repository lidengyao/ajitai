package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class Message_Info implements Serializable {

    /**
     * id : 6
     * title : 消息标题
     * user_id : 10
     * content : 消息内容
     * status : 1
     * create_time_text : 2020-03-06
     * status_text : 已读
     */

    private int id;
    private String title;
    private int user_id;
    private String content;
    private int status;
    private String create_time_text;
    private String status_text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreate_time_text() {
        return create_time_text;
    }

    public void setCreate_time_text(String create_time_text) {
        this.create_time_text = create_time_text;
    }

    public String getStatus_text() {
        return status_text;
    }

    public void setStatus_text(String status_text) {
        this.status_text = status_text;
    }}
