package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;


public class Driver_Filter_Bean implements Serializable {

    private Integer status;
    private Integer unitId;

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
