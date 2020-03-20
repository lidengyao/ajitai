package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class UnitInfoChangeStatusInfo implements Serializable {

    /**
     * jibenxinxi : 1
     * wupinxinxi : 0
     * fujianxinxi : 1
     * renyuanxinxi : 0
     */

    private Integer jibenxinxi;
    private Integer wupinxinxi;
    private Integer fujianxinxi;
    private Integer renyuanxinxi;

    public Integer getJibenxinxi() {
        return jibenxinxi;
    }

    public void setJibenxinxi(Integer jibenxinxi) {
        this.jibenxinxi = jibenxinxi;
    }

    public Integer getWupinxinxi() {
        return wupinxinxi;
    }

    public void setWupinxinxi(Integer wupinxinxi) {
        this.wupinxinxi = wupinxinxi;
    }

    public Integer getFujianxinxi() {
        return fujianxinxi;
    }

    public void setFujianxinxi(Integer fujianxinxi) {
        this.fujianxinxi = fujianxinxi;
    }

    public Integer getRenyuanxinxi() {
        return renyuanxinxi;
    }

    public void setRenyuanxinxi(Integer renyuanxinxi) {
        this.renyuanxinxi = renyuanxinxi;
    }
}

