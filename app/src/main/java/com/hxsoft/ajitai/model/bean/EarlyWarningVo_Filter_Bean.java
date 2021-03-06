package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
预警管理信息返回类
 */
public class EarlyWarningVo_Filter_Bean implements Serializable {

    //    @ApiModelProperty("预警id")
    private Integer id;

    /**
     * 预警单位id
     */
//    @ApiModelProperty("预警单位id")
    private Integer unitId;

    /**
     * 预警单位名称
     */
//    @ApiModelProperty("预警单位名称")
    private String unitName;

    /**
     * 预警信息发生的模块id
     */
//    @ApiModelProperty("预警信息发生的模块id")
    private Integer moduleType;

    /**
     * 预警类型
     */
//    @ApiModelProperty("预警类型")
    private Integer warningType;

    /**
     * 预警内容过期时间
     */
//    @ApiModelProperty("预警内容过期时间")
    private Long expireTime;

    /**
     * 预警次数
     */
//    @ApiModelProperty("预警次数")
    private Integer warningCount;

    /**
     * 处置状态
     */
//    @ApiModelProperty("处置状态")
    private Integer dealStatus;

    /**
     * 处置结果
     */
//    @ApiModelProperty("处置结果")
    private Integer dealResult;

    /**
     * 额外信息
     */
//    @ApiModelProperty("额外信息")
    private String extraText;

    /**
     * 预警发生时间
     */
//    @ApiModelProperty("预警发生时间")
    private Long createTime;

    /**
     * 预警更新时间
     */
//    @ApiModelProperty("预警更新时间")
    private Long updateTime;

    //    @ApiModelProperty("预警开始时间")
    private Long searchStartTime;

    //    @ApiModelProperty("预警结束时间")
    private Long searchEndTime;

    //    @ApiModelProperty("预警更新开始时间")
    private Long searchUpStartTime;

    //    @ApiModelProperty("预警更新结束时间")
    private Long searchUpEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Integer getWarningType() {
        return warningType;
    }

    public void setWarningType(Integer warningType) {
        this.warningType = warningType;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
    }

    public Integer getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }

    public Integer getDealResult() {
        return dealResult;
    }

    public void setDealResult(Integer dealResult) {
        this.dealResult = dealResult;
    }

    public String getExtraText() {
        return extraText;
    }

    public void setExtraText(String extraText) {
        this.extraText = extraText;
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

    public Long getSearchUpStartTime() {
        return searchUpStartTime;
    }

    public void setSearchUpStartTime(Long searchUpStartTime) {
        this.searchUpStartTime = searchUpStartTime;
    }

    public Long getSearchUpEndTime() {
        return searchUpEndTime;
    }

    public void setSearchUpEndTime(Long searchUpEndTime) {
        this.searchUpEndTime = searchUpEndTime;
    }
}
