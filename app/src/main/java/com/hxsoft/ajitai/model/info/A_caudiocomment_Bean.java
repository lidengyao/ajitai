package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class A_caudiocomment_Bean implements Serializable {


    /**
     * comment : 测试评论
     * vid : 1
     */

    private String comment;
    private Integer vid;

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
}



