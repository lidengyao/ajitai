package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class CompanyRecord_Info implements Serializable {


    //    @ApiModelProperty("数据id")
    private Integer id;

    //    @ApiModelProperty("单位id")
    private Integer unitId;

    //    @ApiModelProperty("单位名称")
    private String unitName;

    //     @ApiModelProperty("状态")
    private Integer status;

    //     @ApiModelProperty("变更次数")
    private Integer changeNum;

    //     @ApiModelProperty("是否初始化数据，0：不是，1：是")
    private Integer initData;

    //     @ApiModelProperty("单位审核意见内容")
    private String unitCheckContent;

    //     @ApiModelProperty("单位审核人")
    private Integer unitCheckUserid;

    //     @ApiModelProperty("单位审核人姓名")
    private String unitCheckUserName;

    //    @ApiModelProperty("单位审核时间")
    private Long unitCheckTime;

    //     @ApiModelProperty("单位审核意见")
    private Integer unitCheckOpinion;

    //     @ApiModelProperty("审核单位id")
    private Integer unitCheckUnitid;

    //     @ApiModelProperty("派出所审核意见内容")
    private String pcsCheckContent;

    //      @ApiModelProperty("派出所审核人id")
    private Integer pcsCheckUserid;

    //     @ApiModelProperty("派出所审核人姓名")
    private String pcsCheckUserName;

    //      @ApiModelProperty("派出所审核时间")
    private Long pcsCheckTime;

    //     @ApiModelProperty("派出所审核意见")
    private Integer pcsCheckOpinion;

    //     @ApiModelProperty("审核派出所id")
    private Integer pcsCheckUnitid;

    //    @ApiModelProperty("审核派出所名称")
    private String pcsCheckUnitName;

    //     @ApiModelProperty("支队审核意见内容")
    private String zdCheckContent;

    //    @ApiModelProperty("支队审核人id")
    private Integer zdCheckUserid;

    //     @ApiModelProperty("支队审核人姓名")
    private String zdCheckUserName;

    //     @ApiModelProperty("支队审核时间")
    private Long zdCheckTime;

    //     @ApiModelProperty("支队审核意见")
    private Integer zdCheckOpinion;

    //      @ApiModelProperty("审核支队id")
    private Integer zdCheckUnitid;

    //     @ApiModelProperty("审核支队名称")
    private String zdCheckUnitName;

    //     @ApiModelProperty("数据创建时间")
    private Long createTime;

    //     @ApiModelProperty("数据更新时间")
    private Long updateTime;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
    }

    public Integer getInitData() {
        return initData;
    }

    public void setInitData(Integer initData) {
        this.initData = initData;
    }

    public String getUnitCheckContent() {
        return unitCheckContent;
    }

    public void setUnitCheckContent(String unitCheckContent) {
        this.unitCheckContent = unitCheckContent;
    }

    public Integer getUnitCheckUserid() {
        return unitCheckUserid;
    }

    public void setUnitCheckUserid(Integer unitCheckUserid) {
        this.unitCheckUserid = unitCheckUserid;
    }

    public String getUnitCheckUserName() {
        return unitCheckUserName;
    }

    public void setUnitCheckUserName(String unitCheckUserName) {
        this.unitCheckUserName = unitCheckUserName;
    }

    public Long getUnitCheckTime() {
        return unitCheckTime;
    }

    public void setUnitCheckTime(Long unitCheckTime) {
        this.unitCheckTime = unitCheckTime;
    }

    public Integer getUnitCheckOpinion() {
        return unitCheckOpinion;
    }

    public void setUnitCheckOpinion(Integer unitCheckOpinion) {
        this.unitCheckOpinion = unitCheckOpinion;
    }

    public Integer getUnitCheckUnitid() {
        return unitCheckUnitid;
    }

    public void setUnitCheckUnitid(Integer unitCheckUnitid) {
        this.unitCheckUnitid = unitCheckUnitid;
    }

    public String getPcsCheckContent() {
        return pcsCheckContent;
    }

    public void setPcsCheckContent(String pcsCheckContent) {
        this.pcsCheckContent = pcsCheckContent;
    }

    public Integer getPcsCheckUserid() {
        return pcsCheckUserid;
    }

    public void setPcsCheckUserid(Integer pcsCheckUserid) {
        this.pcsCheckUserid = pcsCheckUserid;
    }

    public String getPcsCheckUserName() {
        return pcsCheckUserName;
    }

    public void setPcsCheckUserName(String pcsCheckUserName) {
        this.pcsCheckUserName = pcsCheckUserName;
    }

    public Long getPcsCheckTime() {
        return pcsCheckTime;
    }

    public void setPcsCheckTime(Long pcsCheckTime) {
        this.pcsCheckTime = pcsCheckTime;
    }

    public Integer getPcsCheckOpinion() {
        return pcsCheckOpinion;
    }

    public void setPcsCheckOpinion(Integer pcsCheckOpinion) {
        this.pcsCheckOpinion = pcsCheckOpinion;
    }

    public Integer getPcsCheckUnitid() {
        return pcsCheckUnitid;
    }

    public void setPcsCheckUnitid(Integer pcsCheckUnitid) {
        this.pcsCheckUnitid = pcsCheckUnitid;
    }

    public String getPcsCheckUnitName() {
        return pcsCheckUnitName;
    }

    public void setPcsCheckUnitName(String pcsCheckUnitName) {
        this.pcsCheckUnitName = pcsCheckUnitName;
    }

    public String getZdCheckContent() {
        return zdCheckContent;
    }

    public void setZdCheckContent(String zdCheckContent) {
        this.zdCheckContent = zdCheckContent;
    }

    public Integer getZdCheckUserid() {
        return zdCheckUserid;
    }

    public void setZdCheckUserid(Integer zdCheckUserid) {
        this.zdCheckUserid = zdCheckUserid;
    }

    public String getZdCheckUserName() {
        return zdCheckUserName;
    }

    public void setZdCheckUserName(String zdCheckUserName) {
        this.zdCheckUserName = zdCheckUserName;
    }

    public Long getZdCheckTime() {
        return zdCheckTime;
    }

    public void setZdCheckTime(Long zdCheckTime) {
        this.zdCheckTime = zdCheckTime;
    }

    public Integer getZdCheckOpinion() {
        return zdCheckOpinion;
    }

    public void setZdCheckOpinion(Integer zdCheckOpinion) {
        this.zdCheckOpinion = zdCheckOpinion;
    }

    public Integer getZdCheckUnitid() {
        return zdCheckUnitid;
    }

    public void setZdCheckUnitid(Integer zdCheckUnitid) {
        this.zdCheckUnitid = zdCheckUnitid;
    }

    public String getZdCheckUnitName() {
        return zdCheckUnitName;
    }

    public void setZdCheckUnitName(String zdCheckUnitName) {
        this.zdCheckUnitName = zdCheckUnitName;
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
}
