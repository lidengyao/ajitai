package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class Area_Info implements Serializable {


    /**
     * id : 49
     * areaCode : 320707104
     * areaPcode : 320707000
     * areaName : 黑林镇
     * areaLevel : 4
     * areaSort : 9
     */

    private Integer id;
    private String areaCode;
    private String areaPcode;
    private String areaName;
    private Integer areaLevel;
    private Integer areaSort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaPcode() {
        return areaPcode;
    }

    public void setAreaPcode(String areaPcode) {
        this.areaPcode = areaPcode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(Integer areaLevel) {
        this.areaLevel = areaLevel;
    }

    public Integer getAreaSort() {
        return areaSort;
    }

    public void setAreaSort(Integer areaSort) {
        this.areaSort = areaSort;
    }
}
