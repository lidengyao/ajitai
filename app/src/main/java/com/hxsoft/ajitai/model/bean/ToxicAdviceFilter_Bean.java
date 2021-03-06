package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
剧毒咨询数据
 */
public class ToxicAdviceFilter_Bean implements Serializable {


    //    @ApiModelProperty("剧毒咨询id")
    private Integer id;

    //    @ApiModelProperty("咨询单位id")
    private Integer companyId;

    //    @ApiModelProperty("单位名称")
    private String companyValue;

    //    @ApiModelProperty("咨询编号")
    private String adviceNumber;

    //    @ApiModelProperty("接收单位id")
    private Integer receiverUnitId;

    //    @ApiModelProperty("接收单位名称")
    private String receiverUnitValue;

    //    @ApiModelProperty("咨询项目")
    private String subject;

    //    @ApiModelProperty("咨询类型")
    private Integer type;

    //    @ApiModelProperty("咨询人id")
    private Integer advicer;

    //    @ApiModelProperty("咨询人名称")
    private String advicerValue;

    //    @ApiModelProperty("咨询人电话")
    private String tel;

    //    @ApiModelProperty("咨询内容")
    private String content;

    //    @ApiModelProperty("状态")
    private Integer status;

    //    @ApiModelProperty("创建时间")
    private Long createTime;

    //    @ApiModelProperty("创建时间date格式")
    private String createTimeValue;

    //    @ApiModelProperty("更新时间")
    private Long updateTime;

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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyValue() {
        return companyValue;
    }

    public void setCompanyValue(String companyValue) {
        this.companyValue = companyValue;
    }

    public String getAdviceNumber() {
        return adviceNumber;
    }

    public void setAdviceNumber(String adviceNumber) {
        this.adviceNumber = adviceNumber;
    }

    public Integer getReceiverUnitId() {
        return receiverUnitId;
    }

    public void setReceiverUnitId(Integer receiverUnitId) {
        this.receiverUnitId = receiverUnitId;
    }

    public String getReceiverUnitValue() {
        return receiverUnitValue;
    }

    public void setReceiverUnitValue(String receiverUnitValue) {
        this.receiverUnitValue = receiverUnitValue;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAdvicer() {
        return advicer;
    }

    public void setAdvicer(Integer advicer) {
        this.advicer = advicer;
    }

    public String getAdvicerValue() {
        return advicerValue;
    }

    public void setAdvicerValue(String advicerValue) {
        this.advicerValue = advicerValue;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeValue() {
        return createTimeValue;
    }

    public void setCreateTimeValue(String createTimeValue) {
        this.createTimeValue = createTimeValue;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
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
