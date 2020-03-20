package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class AppVersion_Info implements Serializable {

    /**
     * id : 1
     * versionType : 1
     * versionCode : 1
     * versionName :
     * downloadUrl : http://123
     * createTime : 1565660826232
     */

    private Integer id;
    private Integer versionType;
    private Integer versionCode;
    private String versionName;
    private String downloadUrl;
    private long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersionType() {
        return versionType;
    }

    public void setVersionType(Integer versionType) {
        this.versionType = versionType;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
}


