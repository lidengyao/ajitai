package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class A_addcomment_Bean implements Serializable {


    /**
     * comment : 测试回复1
     * vid : 101
     * ctype : 1
     */

    private String comment;
    private Integer vid;
    private Integer ctype;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }
}



