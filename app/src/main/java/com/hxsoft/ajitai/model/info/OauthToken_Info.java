package com.hxsoft.ajitai.model.info;


import java.io.Serializable;


public class OauthToken_Info implements Serializable {


    /**
     * dept_id : null
     * user_id : 4
     * username : 15251435195
     * access_token : 3a25ddb7-4e1d-4133-9243-bae2ba440206
     * refresh_token : 37333d2f-5992-42f3-9cf7-71194b6b7bf2
     */

    private Integer dept_id;
    private Integer user_id;
    private String username;
    private String access_token;
    private String refresh_token;

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
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


