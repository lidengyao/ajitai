package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class A_Carticlecomment_Info implements Serializable {


    /**
     * cid : 3
     * uid : 1
     * nickname : 测试
     * avatar : http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf
     * ctype : 1
     * content : 测试评论
     * createTime : 2020-05-18 21:39:53
     */

    private Integer cid;
    private Integer uid;
    private String nickname;
    private String avatar;
    private Integer ctype;
    private String content;
    private String createTime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    
}



