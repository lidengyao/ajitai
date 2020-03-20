package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class DanWeiBeiAnBianGeng_WuPin_Info implements Serializable {

    private Integer id;
    private Integer unitId;
    private String goodsName;
    private Integer goodsType;
    private String goodsUnit;
    private String goodsAlias;
    private String uses;
    private Integer maxNumber;
    private String yearConsume;
    private Long createTime;
    private Long updateTime;
    private Integer opType;
    private Integer goodsId;
    private String yearMax;
    private Integer status;

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

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
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

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getYearMax() {
        return yearMax;
    }

    public void setYearMax(String yearMax) {
        this.yearMax = yearMax;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

