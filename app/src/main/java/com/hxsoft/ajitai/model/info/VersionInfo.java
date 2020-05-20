package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class VersionInfo implements Serializable {


    /**
     * id : 1
     * apptype : 1
     * appvernum : 2
     * appversion : 1.0.2
     * appurl : http://image.hxsoft.net/appinfo/ajitai-1.0.2.apk
     * createTime : 2020-05-20 14:45:51
     */

    private Integer id;
    private Integer apptype;
    private Integer appvernum;
    private String appversion;
    private String appurl;
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApptype() {
        return apptype;
    }

    public void setApptype(Integer apptype) {
        this.apptype = apptype;
    }

    public Integer getAppvernum() {
        return appvernum;
    }

    public void setAppvernum(Integer appvernum) {
        this.appvernum = appvernum;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public String getAppurl() {
        return appurl;
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

