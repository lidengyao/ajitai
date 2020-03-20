package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class TongZhiGongGaoInfo implements Serializable {
    /**
     * id : 7
     * publisher : 3
     * publishTime : 2019.04.18 17:07:54
     * title : 这是第一个通知哟
     * importance : 1
     * status : 1
     * dealId : 37
     * attachment : 2
     * createTime : null
     * updateTime : null
     * content : 你们好
     * ids : null
     */

    private Integer id;
    private Integer publisher;
    private String publishUnit;
    private Integer moduleType;
    private String publishTime;
    private String title;
    private Integer importance;
    private Integer status;
    private Integer dealId;
    private Integer attachment;
    private String createTime;
    private String updateTime;
    private String content;
    private Object ids;
    private String areas;
    private String publisherName;
    private String publisherUnitName;
    private String receiveName;

    public String getPublishUnit() {
        return publishUnit;
    }

    public void setPublishUnit(String publishUnit) {
        this.publishUnit = publishUnit;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherUnitName() {
        return publisherUnitName;
    }

    public void setPublisherUnitName(String publisherUnitName) {
        this.publisherUnitName = publisherUnitName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public Integer getAttachment() {
        return attachment;
    }

    public void setAttachment(Integer attachment) {
        this.attachment = attachment;
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

    public Object getIds() {
        return ids;
    }

    public void setIds(Object ids) {
        this.ids = ids;
    }
}


