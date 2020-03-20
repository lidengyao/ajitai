package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class Brand_PPS_Info implements Serializable {

    /**
     * id : 3
     * user_id : 13
     * brand_id : 5
     * is_admin : 0
     * status : 1
     * username : 18661012702
     * nickname : hahaha
     * mobile : 18661012702
     * url : /u/13
     */

    private int id;
    private int user_id;
    private int brand_id;
    private int is_admin;
    private int status;
    private String username;
    private String nickname;
    private String mobile;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}





