package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class DanWeiBeiAn_WuPin_New_Info implements Serializable {


    /**
     * id : 57
     * unitId : 609
     * goodsName : 666111
     * goodsType : 1
     * goodsUnit : g
     * goodsAlias : null
     * uses : 289,288,
     * maxNumber : 1
     * yearConsume : 1
     * createTime : null
     * updateTime : null
     */

    private Integer id;
    private Integer unitId;
    private String goodsName;
    private Integer goodsType;
    private String goodsUnit;
    private String goodsAlias;
    private String uses;
    private String maxNumber;
    private String yearConsume;
    private Long createTime;
    private Long updateTime;


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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getGoodsAlias() {
        return goodsAlias;
    }

    public void setGoodsAlias(String goodsAlias) {
        this.goodsAlias = goodsAlias;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public String getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(String maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getYearConsume() {
        return yearConsume;
    }

    public void setYearConsume(String yearConsume) {
        this.yearConsume = yearConsume;
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

