package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class KuFangJianKongInfo implements Serializable {


    /**
     * id : 9
     * unitId : 10
     * moduleType : null
     * videoId : 0
     * status : 1
     * createTime : null
     * updateTime : null
     * unitName : 连云港第一剧毒处理公司1
     * vcode : FDFD7457
     * deviceType : null
     * vname : 测试设备
     * searchStartTime : null
     * searchEndTime : null
     * videoUrl : https://www.bilibili.com/video/av68940129/
     * videoName : 库房1---东门
     * vtype : cs-102
     */

    private Integer id;
    private Integer unitId;
    private String moduleType;
    private Integer videoId;
    private Integer status;
    private long createTime;
    private long updateTime;
    private String unitName;
    private String vcode;
    private Integer deviceType;
    private String vname;
    private long searchStartTime;
    private long searchEndTime;
    private String videoUrl;
    private String videoName;
    private String vtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public long getSearchStartTime() {
        return searchStartTime;
    }

    public void setSearchStartTime(long searchStartTime) {
        this.searchStartTime = searchStartTime;
    }

    public long getSearchEndTime() {
        return searchEndTime;
    }

    public void setSearchEndTime(long searchEndTime) {
        this.searchEndTime = searchEndTime;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }
}

