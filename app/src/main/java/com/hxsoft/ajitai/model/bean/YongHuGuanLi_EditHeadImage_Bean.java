package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class YongHuGuanLi_EditHeadImage_Bean implements Serializable {

    /**
     * userId : 2
     * userHeadimg : 1
     */

    private Integer userId;
    private String userHeadimg;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserHeadimg() {
        return userHeadimg;
    }

    public void setUserHeadimg(String userHeadimg) {
        this.userHeadimg = userHeadimg;
    }
}
