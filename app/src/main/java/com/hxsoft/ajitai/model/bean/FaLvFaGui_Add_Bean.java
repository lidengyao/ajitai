package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class FaLvFaGui_Add_Bean implements Serializable {

    /**
     * id : null
     * title : 法律2
     * publisher : null
     * publishTime : null
     * pbTime :
     * keywords : 爱国，爱党
     * createTime : null
     * updateTime : null
     * content : 法规
     * searchStartTime : null
     * searchEndTime : null
     */

    private Integer moduleType;
    private Integer id;
    private String title;
    private Integer publisher;
    private String publishTime;
    private String pbTime;
    private String keywords;
    private String createTime;
    private String updateTime;
    private String content;
    private String searchStartTime;
    private String searchEndTime;

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSearchStartTime() {
        return searchStartTime;
    }

    public void setSearchStartTime(String searchStartTime) {
        this.searchStartTime = searchStartTime;
    }

    public String getSearchEndTime() {
        return searchEndTime;
    }

    public void setSearchEndTime(String searchEndTime) {
        this.searchEndTime = searchEndTime;
    }
}
