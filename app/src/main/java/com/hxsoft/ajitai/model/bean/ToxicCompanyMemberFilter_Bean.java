package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
剧毒单位从业人员
 */
public class ToxicCompanyMemberFilter_Bean implements Serializable {
    //    @ApiModelProperty("从业人员id")
    private Integer id;

    //        @ApiModelProperty("单位id")
    private Integer companyId;

    //        @ApiModelProperty("姓名")
    private String name;

    //       @ApiModelProperty("别名曾用名")
    private String aliasName;

    //       @ApiModelProperty("性别")
    private Integer gender;

    //      @ApiModelProperty("生日")
    private String birthday;

    //     @ApiModelProperty("证书类型")
    private Integer certificateType;

    //    @ApiModelProperty("证书号")
    private String certificateNumber;

    //     @ApiModelProperty("开始工作时间")
    private String workBeginTime;

    //     @ApiModelProperty("民族")
    private Integer raceType;

    //     @ApiModelProperty("户籍地址")
    private String householdAddress;

    //     @ApiModelProperty("居住地址")
    private String liveAddress;

    //    @ApiModelProperty("文化程度")
    private Integer cultural;

    //      @ApiModelProperty("政治面貌")
    private Integer political;

    //      @ApiModelProperty("现在职务")
    private String nowDuty;

    //    @ApiModelProperty("职务类型")
    private Integer dutyType;

    //    @ApiModelProperty("联系电话")
    private String tel;

    //     @ApiModelProperty("资格证书名称")
    private String qualificationName;

    //     @ApiModelProperty("资格证书号")
    private String qualificationNumber;

    //     @ApiModelProperty("资格证书发证机关")
    private String qualificationIssuing;

    //      @ApiModelProperty("资格证书有效期")
    private String qualificationEndTime;

    //     @ApiModelProperty("重点人员比对结果")
    private Integer comparisonResult;

    //     @ApiModelProperty("创建时间")
    private Long createTime;

    //     @ApiModelProperty("修改时间")
    private Long updateTime;

    //     @ApiModelProperty("简历")
    private String resume;

    //      @ApiModelProperty("状态")
    private Integer status;

    //     @ApiModelProperty("籍贯")
    private String nativePlace;

    //     @ApiModelProperty("身份证正面照片")
    private String idcardFront;

    //     @ApiModelProperty("身份证反面照片")
    private String idcardBack;

    //      @ApiModelProperty("开始申请时间")
    private Long startApplyTime;

    //     @ApiModelProperty("结束申请时间")
    private Long endApplyTime;

    //     @ApiModelProperty("注销状态")
    private Integer cancellation;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getWorkBeginTime() {
        return workBeginTime;
    }

    public void setWorkBeginTime(String workBeginTime) {
        this.workBeginTime = workBeginTime;
    }

    public Integer getRaceType() {
        return raceType;
    }

    public void setRaceType(Integer raceType) {
        this.raceType = raceType;
    }

    public String getHouseholdAddress() {
        return householdAddress;
    }

    public void setHouseholdAddress(String householdAddress) {
        this.householdAddress = householdAddress;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public Integer getCultural() {
        return cultural;
    }

    public void setCultural(Integer cultural) {
        this.cultural = cultural;
    }

    public Integer getPolitical() {
        return political;
    }

    public void setPolitical(Integer political) {
        this.political = political;
    }

    public String getNowDuty() {
        return nowDuty;
    }

    public void setNowDuty(String nowDuty) {
        this.nowDuty = nowDuty;
    }

    public Integer getDutyType() {
        return dutyType;
    }

    public void setDutyType(Integer dutyType) {
        this.dutyType = dutyType;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    public String getQualificationNumber() {
        return qualificationNumber;
    }

    public void setQualificationNumber(String qualificationNumber) {
        this.qualificationNumber = qualificationNumber;
    }

    public String getQualificationIssuing() {
        return qualificationIssuing;
    }

    public void setQualificationIssuing(String qualificationIssuing) {
        this.qualificationIssuing = qualificationIssuing;
    }

    public String getQualificationEndTime() {
        return qualificationEndTime;
    }

    public void setQualificationEndTime(String qualificationEndTime) {
        this.qualificationEndTime = qualificationEndTime;
    }

    public Integer getComparisonResult() {
        return comparisonResult;
    }

    public void setComparisonResult(Integer comparisonResult) {
        this.comparisonResult = comparisonResult;
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

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getIdcardFront() {
        return idcardFront;
    }

    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront;
    }

    public String getIdcardBack() {
        return idcardBack;
    }

    public void setIdcardBack(String idcardBack) {
        this.idcardBack = idcardBack;
    }

    public Long getStartApplyTime() {
        return startApplyTime;
    }

    public void setStartApplyTime(Long startApplyTime) {
        this.startApplyTime = startApplyTime;
    }

    public Long getEndApplyTime() {
        return endApplyTime;
    }

    public void setEndApplyTime(Long endApplyTime) {
        this.endApplyTime = endApplyTime;
    }

    public Integer getCancellation() {
        return cancellation;
    }

    public void setCancellation(Integer cancellation) {
        this.cancellation = cancellation;
    }
}
