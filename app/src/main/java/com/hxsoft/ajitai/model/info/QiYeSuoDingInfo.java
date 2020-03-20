package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class QiYeSuoDingInfo implements Serializable {

    /**
     * id : 4
     * companyName : 连云港第一剧毒处理公司1
     * lockUnitName : 连云港公安总局1
     * unlockUnitName : 连云港公安总局1
     * lockStartTime : 1556532113039
     * unlockTime : 0
     * lockType : 1
     * lockStatus : 0
     * lockReason : 保质期过期
     * lockUserName : 刘佳伟
     * applyUnlockTime : null
     */

    private int id;
    private String companyName;
    private String lockUnitName;
    private String unlockUnitName;
    private long lockStartTime;
    private long unlockTime;
    private int lockType;
    private int lockStatus;
    private String lockReason;
    private String lockUserName;
    private long applyUnlockTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLockUnitName() {
        return lockUnitName;
    }

    public void setLockUnitName(String lockUnitName) {
        this.lockUnitName = lockUnitName;
    }

    public String getUnlockUnitName() {
        return unlockUnitName;
    }

    public void setUnlockUnitName(String unlockUnitName) {
        this.unlockUnitName = unlockUnitName;
    }

    public long getLockStartTime() {
        return lockStartTime;
    }

    public void setLockStartTime(long lockStartTime) {
        this.lockStartTime = lockStartTime;
    }

    public long getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(long unlockTime) {
        this.unlockTime = unlockTime;
    }

    public int getLockType() {
        return lockType;
    }

    public void setLockType(int lockType) {
        this.lockType = lockType;
    }

    public int getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(int lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getLockReason() {
        return lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    public String getLockUserName() {
        return lockUserName;
    }

    public void setLockUserName(String lockUserName) {
        this.lockUserName = lockUserName;
    }

    public long getApplyUnlockTime() {
        return applyUnlockTime;
    }

    public void setApplyUnlockTime(long applyUnlockTime) {
        this.applyUnlockTime = applyUnlockTime;
    }
}

