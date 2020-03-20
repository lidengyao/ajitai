package com.hxsoft.ajitai.model.bean;


import java.io.Serializable;

public class DanWeiBeiAn_Bean implements Serializable {
    private String unitName;
    private String unitAddress;
    private Integer unitType;
    private Integer unitLocationId;
    private Integer higherLevelUnit;
    private Integer classification;

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Integer getHigherLevelUnit() {
        return higherLevelUnit;
    }

    public void setHigherLevelUnit(Integer higherLevelUnit) {
        this.higherLevelUnit = higherLevelUnit;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public Integer getUnitLocationId() {
        return unitLocationId;
    }

    public void setUnitLocationId(Integer unitLocationId) {
        this.unitLocationId = unitLocationId;
    }
}

