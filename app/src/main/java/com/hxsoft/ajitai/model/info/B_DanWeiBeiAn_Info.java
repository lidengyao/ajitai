package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class B_DanWeiBeiAn_Info implements Serializable {

    /**
     * unitId : 10
     * unitName : 连云港第一剧毒处理公司1
     * address : 连云港海州区苍梧路
     * unitType : 1
     * legalName : 蔡晓双
     * legalTel : 18051945907
     * status : 0
     * createTime : 1558424550355
     * changeTime : null
     */

    private int unitId;
    private String unitName;
    private String address;
    private int unitType;
    private String legalName;
    private String legalTel;
    private int status;
    private long createTime;
    private long changeTime;

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalTel() {
        return legalTel;
    }

    public void setLegalTel(String legalTel) {
        this.legalTel = legalTel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(long changeTime) {
        this.changeTime = changeTime;
    }
}


