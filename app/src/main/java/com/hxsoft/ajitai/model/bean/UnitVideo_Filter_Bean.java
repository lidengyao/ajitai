package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
剧毒购买证
 */
public class UnitVideo_Filter_Bean implements Serializable {

    private Object id;

    private Object unitId;

    private Object videoId;

    private Object status;

    private Object createTime;

    private Object updateTime;

    private Object unitName;

    private Object vcode;

    private Object deviceType;

    private Object vname;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getUnitId() {
        return unitId;
    }

    public void setUnitId(Object unitId) {
        this.unitId = unitId;
    }

    public Object getVideoId() {
        return videoId;
    }

    public void setVideoId(Object videoId) {
        this.videoId = videoId;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public Object getUnitName() {
        return unitName;
    }

    public void setUnitName(Object unitName) {
        this.unitName = unitName;
    }

    public Object getVcode() {
        return vcode;
    }

    public void setVcode(Object vcode) {
        this.vcode = vcode;
    }

    public Object getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Object deviceType) {
        this.deviceType = deviceType;
    }

    public Object getVname() {
        return vname;
    }

    public void setVname(Object vname) {
        this.vname = vname;
    }
}
