package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class SearchUser_Info implements Serializable {


    /**
     * mobile : 15251435195
     * user_id : 10
     * username : 15251435195
     * nickname : 修修
     */

    private String mobile;
    private int user_id;
    private String username;
    private String nickname;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
}



