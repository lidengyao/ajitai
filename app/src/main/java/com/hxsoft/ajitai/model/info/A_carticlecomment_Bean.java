package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class A_carticlecomment_Bean implements Serializable {


    /**
     * comment : 测试评论
     * aid : 100
     */

    private String comment;
    private Integer aid;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}



