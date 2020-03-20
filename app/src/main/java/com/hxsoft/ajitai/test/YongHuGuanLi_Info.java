package com.hxsoft.ajitai.test;


import java.io.Serializable;

public class YongHuGuanLi_Info implements Serializable {

    /**
     * userId : 2
     * userName : ldy
     * userAbbr : xiaohong
     * userAccount : zejun
     * userPassword : PoPDk+mayUZrqiy1rOanEw==
     * userSalt : zI47
     * userTel : 15251435195
     * userIdcard : 410185198610076013
     * userOldAccount : 李登耀
     * userAddress : 无锡
     * userIsAdmin : false
     * userLevel : 1
     * userLevelUnitId : 10
     * userCreatedTime : -670931860
     * userUpdatedTime : 1558335993411
     * userLastLoginTime : 1564169301507
     * userStatus : null
     */

    private Integer userId;
    private String userName;
    private String userAbbr;
    private String userAccount;
    private String userPassword;
    private String userSalt;
    private String userTel;
    private String userIdcard;
    private String userOldAccount;
    private String userAddress;
    private boolean userIsAdmin;
    private Integer userLevel;
    private Integer userLevelUnitId;
    private long userCreatedTime;
    private long userUpdatedTime;
    private long userLastLoginTime;
    private Integer userGender;
    private boolean userStatus;

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAbbr() {
        return userAbbr;
    }

    public void setUserAbbr(String userAbbr) {
        this.userAbbr = userAbbr;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getUserOldAccount() {
        return userOldAccount;
    }

    public void setUserOldAccount(String userOldAccount) {
        this.userOldAccount = userOldAccount;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public boolean isUserIsAdmin() {
        return userIsAdmin;
    }

    public void setUserIsAdmin(boolean userIsAdmin) {
        this.userIsAdmin = userIsAdmin;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserLevelUnitId() {
        return userLevelUnitId;
    }

    public void setUserLevelUnitId(Integer userLevelUnitId) {
        this.userLevelUnitId = userLevelUnitId;
    }

    public long getUserCreatedTime() {
        return userCreatedTime;
    }

    public void setUserCreatedTime(long userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    public long getUserUpdatedTime() {
        return userUpdatedTime;
    }

    public void setUserUpdatedTime(long userUpdatedTime) {
        this.userUpdatedTime = userUpdatedTime;
    }

    public long getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(long userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }
}

