package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class CommentreplyConscious_Bean implements Serializable {


    /**
     * cid : 70
     * content : 测试评论
     */

    private Integer cmid;
    private String content;

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



