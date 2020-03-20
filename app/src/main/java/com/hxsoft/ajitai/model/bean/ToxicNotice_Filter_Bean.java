package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
通知类
 */
public class ToxicNotice_Filter_Bean implements Serializable {
    //    @ApiModelProperty("通知id")
    private Integer id;

    //    @ApiModelProperty("发布者id")
    private Integer publisher;

    //    @ApiModelProperty("发布时间")
    private String publishTime;

    //    @ApiModelProperty("通知标题")
    private String title;

    //    @ApiModelProperty("是否重要")
    private Integer importance;

    //    @ApiModelProperty("附件")
    private Integer attachment;

    //    @ApiModelProperty("状态")
    private Integer status;

    //    @ApiModelProperty("该通知对应本单位的处理数据id")
    private Integer dealId;

    private Long createTime;

    private Long updateTime;

    //    @ApiModelProperty("通知内容")
    private String content;

    //    @ApiModelProperty("接收方id")
    private Integer receiverId;

    //    @ApiModelProperty("处理状态")
    private Integer dealStatus;

    //    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    //    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;

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

    public Integer getAttachment() {
        return attachment;
    }

    public void setAttachment(Integer attachment) {
        this.attachment = attachment;
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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }

    public Long getSearchStartTime() {
        return searchStartTime;
    }

    public void setSearchStartTime(Long searchStartTime) {
        this.searchStartTime = searchStartTime;
    }

    public Long getSearchEndTime() {
        return searchEndTime;
    }

    public void setSearchEndTime(Long searchEndTime) {
        this.searchEndTime = searchEndTime;
    }
}
