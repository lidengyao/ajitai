package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class CheLiangJianKong_ShiShi_Info implements Serializable {

    /**
     * rid : 3
     * licenseo : null
     * lat : 34.588442
     * lon : 119.209594
     * pname : 瀛州路与海宁中路交会处
     * createtime : 2019-05-29 17:30:49
     */

    private int rid;
    private String licenseo;
    private String lat;
    private String lon;
    private String pname;
    private String createtime;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getLicenseo() {
        return licenseo;
    }

    public void setLicenseo(String licenseo) {
        this.licenseo = licenseo;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}

