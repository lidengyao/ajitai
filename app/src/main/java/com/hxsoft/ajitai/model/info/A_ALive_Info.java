package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_ALive_Info implements Serializable {


    /**
     * vid : 101
     * sname : 测试直播xaadfasdf1
     * status : 0
     * starttime : 2020-05-15 12:00:00
     * endtime : 2020-05-15 18:00:00
     * number : 0
     */

    private Integer vid;
    private String sname;
    private Integer status;
    private String starttime;
    private String endtime;
    private Integer number;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}



