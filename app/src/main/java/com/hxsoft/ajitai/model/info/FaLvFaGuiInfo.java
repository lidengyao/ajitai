package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class FaLvFaGuiInfo implements Serializable {

    /**
     * id : 3
     * title : 法律
     * publisher : null
     * publishTime : null
     * pbTime : 2019.04.28 15:41:15
     * keywords : 爱国，爱党
     * createTime : null
     * updateTime : null
     * content : 法规
     */

    private int id;
    private String title;
    private Object publisher;
    private String publishTime;
    private String pbTime;
    private String keywords;
    private Object createTime;
    private Object updateTime;
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

    public Object getPublisher() {
        return publisher;
    }

    public void setPublisher(Object publisher) {
        this.publisher = publisher;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getPbTime() {
        return pbTime;
    }

    public void setPbTime(String pbTime) {
        this.pbTime = pbTime;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

