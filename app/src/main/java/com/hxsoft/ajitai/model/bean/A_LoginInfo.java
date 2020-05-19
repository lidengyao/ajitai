package com.hxsoft.ajitai.model.bean;


public class A_LoginInfo {


    /**
     * user_id : 1
     * nickname : 测试
     * avator : http://image.hxsoft.net/asdfasdfsadfasdf
     * dept_id : 1
     * username : admin
     * access_token : 8b3feab1-8351-4252-bc2e-f511d3f3014f
     * refresh_token : 3d46f54a-d8cb-4806-b98e-1dcfbd02ec21
     */

    private Integer user_id;
    private String nickname;
    private String avator;
    private Integer dept_id;
    private String username;
    private String access_token;
    private String refresh_token;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
}

