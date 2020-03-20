package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class YongHuGuanLi_Add_Bean implements Serializable {

    /**
     * userName : ceshi001
     * userAbbr : xiaohong
     * userLevel : 1
     * userLevelUnitId : 10
     * userAccount : zejun
     * userTel : 15251435195
     * userIdcard : 410185198610076013
     * unitType : 2
     * userIsAdmin : 0
     * unitName : 连云港第一剧毒处理公司1
     * higherUnitName : 连云港公安1
     * unitAddress : 连云港海州区苍梧路
     */

    private String userName;
    private String userAbbr;
    private Integer userLevel;
    private Integer userLevelUnitId;
    private String userAccount;
    private String userTel;
    private String userIdcard;
    private Integer unitType;
    private Integer userIsAdmin;
    private String unitName;
    private String higherUnitName;
    private String unitAddress;
    private Integer userGender;
    private String userAddress;
    private String userPassword;
    private String comp_type;

//    @ApiModelProperty("用户权限组id")
    private Integer userRoleRule;

    public Integer getUserRoleRule() {
        return userRoleRule;
    }

    public void setUserRoleRule(Integer userRoleRule) {
        this.userRoleRule = userRoleRule;
    }

    public String getComp_type() {
        return comp_type;
    }

    public void setComp_type(String comp_type) {
        this.comp_type = comp_type;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public void setUserIsAdmin(Integer userIsAdmin) {
        this.userIsAdmin = userIsAdmin;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserLevelUnitId(Integer userLevelUnitId) {
        this.userLevelUnitId = userLevelUnitId;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
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

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public int getUserLevelUnitId() {
        return userLevelUnitId;
    }

    public void setUserLevelUnitId(int userLevelUnitId) {
        this.userLevelUnitId = userLevelUnitId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
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

    public int getUnitType() {
        return unitType;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public int getUserIsAdmin() {
        return userIsAdmin;
    }

    public void setUserIsAdmin(int userIsAdmin) {
        this.userIsAdmin = userIsAdmin;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getHigherUnitName() {
        return higherUnitName;
    }

    public void setHigherUnitName(String higherUnitName) {
        this.higherUnitName = higherUnitName;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }
}
