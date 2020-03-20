package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class UpLoadFileInfo implements Serializable {

    /**
     * fileSize : 1K
     * fileUrl : \2019\5\20190520162221914.png
     * suffix : png
     * originName : 我的.png
     */

    private String fileSize;
    private String fileUrl;
    private String suffix;
    private String originName;

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }
}

