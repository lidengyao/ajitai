package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class XiuGaiMiMa_Bean implements Serializable {


    /**
     * id :
     * oldPassword :
     * newPassword :
     * newPasswordVerify :
     * userAccount :
     * userName :
     * userIdcard :
     * userTel :
     * userAddress :
     */

    private String oldPassword;
    private String newPassword;
    private String newPasswordVerify;


    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPasswordVerify() {
        return newPasswordVerify;
    }

    public void setNewPasswordVerify(String newPasswordVerify) {
        this.newPasswordVerify = newPasswordVerify;
    }

}
