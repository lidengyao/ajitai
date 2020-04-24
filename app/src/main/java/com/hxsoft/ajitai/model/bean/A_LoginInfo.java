package com.hxsoft.ajitai.model.bean;


public class A_LoginInfo {


    /**
     * dept_id : 1
     * user_id : 1
     * username : 哈哈and小猪
     * access_token : 3c91a379-9ec4-4321-be72-41edfa23052b
     * refresh_token : 076dc134-84f4-4c01-be81-a13ea61fb0cd
     */

    private Integer dept_id;
    private Integer user_id;
    private String username;
    private String access_token;
    private String refresh_token;

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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

