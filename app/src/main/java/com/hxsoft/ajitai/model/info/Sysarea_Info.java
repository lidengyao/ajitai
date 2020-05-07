package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class Sysarea_Info implements Serializable {

    /**
     * aid : 1624
     * adcode : 410100
     * areaname : 郑州市
     * children : []
     */

    private Integer aid;
    private String adcode;
    private String areaname;
    private ArrayList<?> children;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public ArrayList<?> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<?> children) {
        this.children = children;
    }
}
