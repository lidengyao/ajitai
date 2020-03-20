package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class ChangePwdObject implements Serializable {
    public String userpass;

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
}
