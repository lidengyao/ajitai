package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class CommentConscious_Bean implements Serializable {


    /**
     * cid : 70
     * content : 测试评论
     */

    private Integer cid;
    private String content;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



