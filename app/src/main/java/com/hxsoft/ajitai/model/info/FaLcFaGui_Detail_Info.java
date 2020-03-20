package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class FaLcFaGui_Detail_Info implements Serializable {

    /**
     * id : 3
     * title : 法律
     * publisher : 2
     * publishTime : 1556437275253
     * pbTime : null
     * keywords : 爱国，爱党
     * createTime : 1556437275253
     * updateTime : 1556437275253
     * content : 法规
     */

    private int id;
    private String title;
    private int publisher;
    private long publishTime;
    private Object pbTime;
    private String keywords;
    private long createTime;
    private long updateTime;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public Object getPbTime() {
        return pbTime;
    }

    public void setPbTime(Object pbTime) {
        this.pbTime = pbTime;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

