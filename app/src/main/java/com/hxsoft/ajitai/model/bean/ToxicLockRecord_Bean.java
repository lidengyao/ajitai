package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
锁定查询类
 */
public class ToxicLockRecord_Bean implements Serializable {

    private Integer companyId;

    //    @ApiModelProperty("锁定类型")
    private Integer lockType;

    //    @ApiModelProperty("锁定状态")
    private Integer lockStatus;

    //    @ApiModelProperty("锁定开始时间")
    private Long startTime;

    //    @ApiModelProperty("锁定结束时间")
    private Long endTime;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getLockType() {
        return lockType;
    }

    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
