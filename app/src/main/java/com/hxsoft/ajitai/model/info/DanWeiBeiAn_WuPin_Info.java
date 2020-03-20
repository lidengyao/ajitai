package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class DanWeiBeiAn_WuPin_Info implements Serializable {

    private Integer id;
    private Integer whouseId;
    private Integer goodsId;
    private String charger;
    private String goodsNumber;
    private Integer createtime;
    private Integer updatetime;
    private Integer whouseName;
    private String goodsName;
    private String goodsUnit;
    private Integer chargerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWhouseId() {
        return whouseId;
    }

    public void setWhouseId(Integer whouseId) {
        this.whouseId = whouseId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getWhouseName() {
        return whouseName;
    }

    public void setWhouseName(Integer whouseName) {
        this.whouseName = whouseName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public Integer getChargerName() {
        return chargerName;
    }

    public void setChargerName(Integer chargerName) {
        this.chargerName = chargerName;
    }
}

