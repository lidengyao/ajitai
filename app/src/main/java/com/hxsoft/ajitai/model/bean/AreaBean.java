package com.hxsoft.ajitai.model.bean;

public class AreaBean {
    private String sid;
    private String district;

    public AreaBean(String sid, String district) {
        this.sid = sid;
        this.district = district;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
