package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class Rectify_Detail_Info implements Serializable {


    /**
     * id : 1
     * recordId : 1
     * status : 4
     * unitId : 538
     * policeUnitId : 538
     * unitDealTime : 0
     * unitDealContent : 已整改，请领导验证
     * unitImg : \2019\12\20191219100412533.png
     * policeDealTime : 1576744036345
     * policeDealContent : 通过11114444455555
     * policeDealImg : \2019\12\20191219100412533.png
     * createTime : 1576742731595
     * updateTime : 1576744036345
     */

    private Integer id;
    private Integer recordId;
    private Integer status;
    private Integer unitId;
    private Integer policeUnitId;
    private Integer unitDealTime;
    private String unitDealContent;
    private String unitImg;
    private Long policeDealTime;
    private String policeDealContent;
    private String policeDealImg;
    private Long createTime;
    private Long updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getPoliceUnitId() {
        return policeUnitId;
    }

    public void setPoliceUnitId(Integer policeUnitId) {
        this.policeUnitId = policeUnitId;
    }

    public Integer getUnitDealTime() {
        return unitDealTime;
    }

    public void setUnitDealTime(Integer unitDealTime) {
        this.unitDealTime = unitDealTime;
    }

    public String getUnitDealContent() {
        return unitDealContent;
    }

    public void setUnitDealContent(String unitDealContent) {
        this.unitDealContent = unitDealContent;
    }

    public String getUnitImg() {
        return unitImg;
    }

    public void setUnitImg(String unitImg) {
        this.unitImg = unitImg;
    }

    public Long getPoliceDealTime() {
        return policeDealTime;
    }

    public void setPoliceDealTime(Long policeDealTime) {
        this.policeDealTime = policeDealTime;
    }

    public String getPoliceDealContent() {
        return policeDealContent;
    }

    public void setPoliceDealContent(String policeDealContent) {
        this.policeDealContent = policeDealContent;
    }

    public String getPoliceDealImg() {
        return policeDealImg;
    }

    public void setPoliceDealImg(String policeDealImg) {
        this.policeDealImg = policeDealImg;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}

