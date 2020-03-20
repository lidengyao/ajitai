package com.hxsoft.ajitai.model.bean;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class W_LoginBean {

    private String userAccount;
    private String userPassword;
    private Integer sysType=1;

    public Integer getSysType() {
        return sysType;
    }

    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
