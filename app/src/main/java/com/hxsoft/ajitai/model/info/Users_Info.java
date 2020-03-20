package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

/**
 * Created by lidengyao on 2016-09-30 0030.
 */
public class Users_Info implements Serializable{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
