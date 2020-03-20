package com.hxsoft.ajitai.model.bean;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class W_toxicLockEdit {

    //    @ApiModelProperty("锁定记录id")
    private Integer id;

    //    @ApiModelProperty("被锁定单位id")
    private Integer companyId;

    //       @ApiModelProperty("锁定状态")
    private Integer lockStatus;

    //     @ApiModelProperty("锁定类型")
    private Integer lockType;

    //     @ApiModelProperty("执行锁定单位")
    private Integer lockUnit;

    //     @ApiModelProperty("执行锁定人员id")
    private Integer lockUnitCharger;

    //     @ApiModelProperty("锁定开始时间")
    private Long lockStartTime;

    //    @ApiModelProperty("解锁单位id")
    private Integer unlockUnit;

    //     @ApiModelProperty("解锁执行人员id")
    private Integer unlockUnitCharger;

    //     @ApiModelProperty("解锁时间")
    private String unlockTime;

    //    @ApiModelProperty("锁定范围")
    private String lockRange;

    //     @ApiModelProperty("锁定理由")
    private String lockReason;

    //    @ApiModelProperty("单位负责人id")
    private Integer companyManagerCheckerId;

    //     @ApiModelProperty("单位负责人意见")
    private String companyManagerCheckOpinion;

    //     @ApiModelProperty("单位负责人审核状态")
    private String companyManagerCheckStatus;

    //     @ApiModelProperty("单位负责人审核时间")
    private Long companyManagerCheckTime;

    //    @ApiModelProperty("解锁负责人id")
    private Integer unlockManagerCheckerId;

    //     @ApiModelProperty("解锁负责人意见")
    private String unlockManagerCheckOpinion;

    //     @ApiModelProperty("解锁负责人审核状态")
    private String unlockManagerCheckStatus;

    //    @ApiModelProperty("解锁负责人审核时间")
    private Long unlockManagerCheckTime;

    //     @ApiModelProperty("数据创建时间")
    private Long createTime;

    //     @ApiModelProperty("数据修改时间")
    private Long updateTime;

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

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getLockType() {
        return lockType;
    }

    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

    public Integer getLockUnit() {
        return lockUnit;
    }

    public void setLockUnit(Integer lockUnit) {
        this.lockUnit = lockUnit;
    }

    public Integer getLockUnitCharger() {
        return lockUnitCharger;
    }

    public void setLockUnitCharger(Integer lockUnitCharger) {
        this.lockUnitCharger = lockUnitCharger;
    }

    public Long getLockStartTime() {
        return lockStartTime;
    }

    public void setLockStartTime(Long lockStartTime) {
        this.lockStartTime = lockStartTime;
    }

    public Integer getUnlockUnit() {
        return unlockUnit;
    }

    public void setUnlockUnit(Integer unlockUnit) {
        this.unlockUnit = unlockUnit;
    }

    public Integer getUnlockUnitCharger() {
        return unlockUnitCharger;
    }

    public void setUnlockUnitCharger(Integer unlockUnitCharger) {
        this.unlockUnitCharger = unlockUnitCharger;
    }

    public String getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(String unlockTime) {
        this.unlockTime = unlockTime;
    }

    public String getLockRange() {
        return lockRange;
    }

    public void setLockRange(String lockRange) {
        this.lockRange = lockRange;
    }

    public String getLockReason() {
        return lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    public Integer getCompanyManagerCheckerId() {
        return companyManagerCheckerId;
    }

    public void setCompanyManagerCheckerId(Integer companyManagerCheckerId) {
        this.companyManagerCheckerId = companyManagerCheckerId;
    }

    public String getCompanyManagerCheckOpinion() {
        return companyManagerCheckOpinion;
    }

    public void setCompanyManagerCheckOpinion(String companyManagerCheckOpinion) {
        this.companyManagerCheckOpinion = companyManagerCheckOpinion;
    }

    public String getCompanyManagerCheckStatus() {
        return companyManagerCheckStatus;
    }

    public void setCompanyManagerCheckStatus(String companyManagerCheckStatus) {
        this.companyManagerCheckStatus = companyManagerCheckStatus;
    }

    public Long getCompanyManagerCheckTime() {
        return companyManagerCheckTime;
    }

    public void setCompanyManagerCheckTime(Long companyManagerCheckTime) {
        this.companyManagerCheckTime = companyManagerCheckTime;
    }

    public Integer getUnlockManagerCheckerId() {
        return unlockManagerCheckerId;
    }

    public void setUnlockManagerCheckerId(Integer unlockManagerCheckerId) {
        this.unlockManagerCheckerId = unlockManagerCheckerId;
    }

    public String getUnlockManagerCheckOpinion() {
        return unlockManagerCheckOpinion;
    }

    public void setUnlockManagerCheckOpinion(String unlockManagerCheckOpinion) {
        this.unlockManagerCheckOpinion = unlockManagerCheckOpinion;
    }

    public String getUnlockManagerCheckStatus() {
        return unlockManagerCheckStatus;
    }

    public void setUnlockManagerCheckStatus(String unlockManagerCheckStatus) {
        this.unlockManagerCheckStatus = unlockManagerCheckStatus;
    }

    public Long getUnlockManagerCheckTime() {
        return unlockManagerCheckTime;
    }

    public void setUnlockManagerCheckTime(Long unlockManagerCheckTime) {
        this.unlockManagerCheckTime = unlockManagerCheckTime;
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
