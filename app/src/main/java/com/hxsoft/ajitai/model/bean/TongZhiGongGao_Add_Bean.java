package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class TongZhiGongGao_Add_Bean implements Serializable {
    //    @ApiModelProperty("数据id")
    private Object id;

    //   @ApiModelProperty("发布人")
    private Object publisher;

    //  @ApiModelProperty("模块id")
    private Object moduleType;

    //  @ApiModelProperty("发布时间")
    private Object publishTime;

    //  @ApiModelProperty("标题")
    private Object title;

    // @ApiModelProperty("重要性")
    private Object importance;

    // @ApiModelProperty("状态")
    private Object status;

    // @ApiModelProperty("处理id")
    private Object dealId;

    //  @ApiModelProperty("附件")
    private Object attachment;

    // @ApiModelProperty("创建时间")
    private Object createTime;

    //  @ApiModelProperty("更新时间")
    private Object updateTime;

    //  @ApiModelProperty("内容")
    private Object content;

    //  @ApiModelProperty("抄送单位id列表")
    private Object ids;

    // @ApiModelProperty("地区")
    private Object areas;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getPublisher() {
        return publisher;
    }

    public void setPublisher(Object publisher) {
        this.publisher = publisher;
    }

    public Object getModuleType() {
        return moduleType;
    }

    public void setModuleType(Object moduleType) {
        this.moduleType = moduleType;
    }

    public Object getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Object publishTime) {
        this.publishTime = publishTime;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getImportance() {
        return importance;
    }

    public void setImportance(Object importance) {
        this.importance = importance;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getDealId() {
        return dealId;
    }

    public void setDealId(Object dealId) {
        this.dealId = dealId;
    }

    public Object getAttachment() {
        return attachment;
    }

    public void setAttachment(Object attachment) {
        this.attachment = attachment;
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

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getIds() {
        return ids;
    }

    public void setIds(Object ids) {
        this.ids = ids;
    }

    public Object getAreas() {
        return areas;
    }

    public void setAreas(Object areas) {
        this.areas = areas;
    }
}
