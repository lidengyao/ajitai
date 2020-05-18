package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class Carticle_Info implements Serializable {


    private Integer aid;
    private Integer atype;
    private String aname;
    private String aface;
    private String description;
    private Integer clicknum;
    private Integer supportnum;
    private String audiourl;
    private Integer idx;
    private String createTime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAtype() {
        return atype;
    }

    public void setAtype(Integer atype) {
        this.atype = atype;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAface() {
        return aface;
    }

    public void setAface(String aface) {
        this.aface = aface;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Integer getSupportnum() {
        return supportnum;
    }

    public void setSupportnum(Integer supportnum) {
        this.supportnum = supportnum;
    }

    public String getAudiourl() {
        return audiourl;
    }

    public void setAudiourl(String audiourl) {
        this.audiourl = audiourl;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}




