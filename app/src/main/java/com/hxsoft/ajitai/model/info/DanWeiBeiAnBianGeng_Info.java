package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class DanWeiBeiAnBianGeng_Info implements Serializable {
    //    @ApiModelProperty("变更记录id")
    private Integer id;

    //    @ApiModelProperty("单位id")
    private Integer unitId;

    //    @ApiModelProperty("状态")
    private Integer status;

    //    @ApiModelProperty("操作人员id")
    private Integer changer;

    //    @ApiModelProperty("操作人员名称")
    private String chargerName;

    //    @ApiModelProperty("创建时间")
    private Long createTime;

    //    @ApiModelProperty("更新时间")
    private Long updateTime;

    //    @ApiModelProperty("修改字段，用json字符串形式")
    private String changeField;

    //    @ApiModelProperty("单位审核人id")
    private Integer unitCheckUserid;

    //    @ApiModelProperty("单位审核人姓名")
    private String unitCheckUserName;

    //    @ApiModelProperty("单位审核时间")
    private Long unitCheckTime;

    //    @ApiModelProperty("单位审核人意见")
    private Integer unitCheckOpinion;

    //    @ApiModelProperty("单位id")
    private Integer unitCheckUnitid;

    //    @ApiModelProperty("单位名称")
    private String unitCheckUnitName;

    //    @ApiModelProperty("派出所审核人id")
    private Integer pcsCheckUserid;

    //    @ApiModelProperty("派出所审核人姓名")
    private String pcsCheckUserName;

    //    @ApiModelProperty("派出所审核时间")
    private Long pcsCheckTime;

    //    @ApiModelProperty("派出所审核意见")
    private Integer pcsCheckOpinion;

    //    @ApiModelProperty("派出所id")
    private Integer pcsCheckUnitid;

    //    @ApiModelProperty("派出所名称")
    private String pcsCheckUnitName;

    //    @ApiModelProperty("支队审核人id")
    private Integer zdCheckUserid;

    //    @ApiModelProperty("支队审核人姓名")
    private String zdCheckUserName;

    //    @ApiModelProperty("支队审核时间")
    private Long zdCheckTime;

    //    @ApiModelProperty("支队审核意见")
    private Integer zdCheckOpinion;

    //    @ApiModelProperty("支队id")
    private Integer zdCheckUnitid;

    //    @ApiModelProperty("支队名称")
    private String zdCheckUnitName;

    //    @ApiModelProperty("单位审查内容")
    private String unitCheckContent;

    //    @ApiModelProperty("派出所审查内容")
    private String pcsCheckContent;

    //    @ApiModelProperty("支队审查内容")
    private String zdCheckContent;

    //    @ApiModelProperty("联系电话")
    private String tel;

    //    @ApiModelProperty("单位类型名称")
    private String lbcTypeName;

    //    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    //    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;

    //    @ApiModelProperty("单位类型")
    private Integer unitType;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getChanger() {
        return changer;
    }

    public void setChanger(Integer changer) {
        this.changer = changer;
    }

    public String getChargerName() {
        return chargerName;
    }

    public void setChargerName(String chargerName) {
        this.chargerName = chargerName;
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

    public String getChangeField() {
        return changeField;
    }

    public void setChangeField(String changeField) {
        this.changeField = changeField;
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

    public String getUnitCheckUnitName() {
        return unitCheckUnitName;
    }

    public void setUnitCheckUnitName(String unitCheckUnitName) {
        this.unitCheckUnitName = unitCheckUnitName;
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

    public String getUnitCheckContent() {
        return unitCheckContent;
    }

    public void setUnitCheckContent(String unitCheckContent) {
        this.unitCheckContent = unitCheckContent;
    }

    public String getPcsCheckContent() {
        return pcsCheckContent;
    }

    public void setPcsCheckContent(String pcsCheckContent) {
        this.pcsCheckContent = pcsCheckContent;
    }

    public String getZdCheckContent() {
        return zdCheckContent;
    }

    public void setZdCheckContent(String zdCheckContent) {
        this.zdCheckContent = zdCheckContent;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLbcTypeName() {
        return lbcTypeName;
    }

    public void setLbcTypeName(String lbcTypeName) {
        this.lbcTypeName = lbcTypeName;
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

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }
}


