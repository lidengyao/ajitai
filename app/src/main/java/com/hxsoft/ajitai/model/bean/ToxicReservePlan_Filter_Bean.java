package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
应急预案数据
 */
public class ToxicReservePlan_Filter_Bean implements Serializable {

    //    @ApiModelProperty("应急预案id")
    private Integer id;

    //    @ApiModelProperty("模块id")
    private Integer moduleType;

    //    @ApiModelProperty("预案名称")
    private String planName;

    //    @ApiModelProperty("预案类型")
    private Integer planType;

    //    @ApiModelProperty("制定者")
    private String customMader;

    //    @ApiModelProperty("发布者id")
    private Integer publisher;

    //    @ApiModelProperty("备注")
    private String remark;

    //    @ApiModelProperty("创建时间")
    private Long createTime;

    //    @ApiModelProperty("更新时间")
    private Long updateTime;

    //    @ApiModelProperty("预案内容")
    private String content;

    //    @ApiModelProperty("制定者名称")
    private String customMaderValue;

    //    @ApiModelProperty("发布者名称")
    private String publisherValue;

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

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public String getCustomMader() {
        return customMader;
    }

    public void setCustomMader(String customMader) {
        this.customMader = customMader;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getCustomMaderValue() {
        return customMaderValue;
    }

    public void setCustomMaderValue(String customMaderValue) {
        this.customMaderValue = customMaderValue;
    }

    public String getPublisherValue() {
        return publisherValue;
    }

    public void setPublisherValue(String publisherValue) {
        this.publisherValue = publisherValue;
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
