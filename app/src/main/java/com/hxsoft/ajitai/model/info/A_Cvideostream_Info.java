package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class A_Cvideostream_Info implements Serializable {


    /**
     * vid : 101
     * sname : 测试直播xaadfasdf1
     * skind : 1
     * stype : 1
     * starttime : 2020-05-15 12:00:00
     * endtime : 2020-05-15 18:00:00
     * status : 0
     * faceurl : http://image.hxsoft.net/image/tim11111g.jpg
     * description : <html></html>
     * pushstatus : 0
     * videourl : 
     * joinnumber : 0
     */

    private Integer vid;
    private String sname;
    private Integer skind;
    private Integer stype;
    private String starttime;
    private String endtime;
    private Integer status;
    private String faceurl;
    private String description;
    private Integer pushstatus;
    private String videourl;
    private Integer joinnumber;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSkind() {
        return skind;
    }

    public void setSkind(Integer skind) {
        this.skind = skind;
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFaceurl() {
        return faceurl;
    }

    public void setFaceurl(String faceurl) {
        this.faceurl = faceurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(Integer pushstatus) {
        this.pushstatus = pushstatus;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public Integer getJoinnumber() {
        return joinnumber;
    }

    public void setJoinnumber(Integer joinnumber) {
        this.joinnumber = joinnumber;
    }
}



