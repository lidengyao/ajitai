package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class Heartnectar_Info implements Serializable {

    /**
     * createtime : 2020-05-18T11:44:10.598Z
     * faceurl : string
     * readers : 0
     * thumb : 0
     * title : string
     */

    private Integer aid;
    private String createtime;
    private String faceurl;
    private Integer readers;
    private Integer thumb;
    private String title;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getFaceurl() {
        return faceurl;
    }

    public void setFaceurl(String faceurl) {
        this.faceurl = faceurl;
    }

    public Integer getReaders() {
        return readers;
    }

    public void setReaders(Integer readers) {
        this.readers = readers;
    }

    public Integer getThumb() {
        return thumb;
    }

    public void setThumb(Integer thumb) {
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}




