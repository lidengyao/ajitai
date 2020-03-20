package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
应急预案数据
 */
public class User_Filter_Bean implements Serializable {

    //    @ApiModelProperty("用户id")
    private Integer userId;

    //    @ApiModelProperty("用户名")
    private String userName;

    //    @ApiModelProperty("用户简称")
    private String userAbbr;

    //    @ApiModelProperty("用户登录账号")
    private String userAccount;

    //    @ApiModelProperty("用户登录密码")
    private String userPassword;

    //    @ApiModelProperty("加密盐值")
    private String userSalt;

    //    @ApiModelProperty("用户电话")
    private String userTel;

    //    @ApiModelProperty("用户身份证号")
    private String userIdcard;

    //    @ApiModelProperty(value = "用户原登录账号",notes = "只能修改一次，如果该值不为空，则无法再次修改")
    private String userOldAccount;

    //    @ApiModelProperty("用户地址")
    private String userAddress;

    //    @ApiModelProperty("是否是管理员")
    private Boolean userIsAdmin;

    //    @ApiModelProperty(value = "用户身份级别",notes = "2为企业用户")
    private Integer userLevel;

    //    @ApiModelProperty("用户所属单位id")
    private Integer userLevelUnitId;

    //    @ApiModelProperty("数据创建时间")
    private Long userCreatedTime;

    //    @ApiModelProperty("数据上一次更新时间")
    private Long userUpdatedTime;

    //    @ApiModelProperty("用户最近一次登录时间")
    private Long userLastLoginTime;

    //    @ApiModelProperty("用户性别")
    private Integer userGender;

    //    @ApiModelProperty("用户账号状态")
    private Boolean userStatus;

    //    @ApiModelProperty("用户头像")
    private String userHeadimg;

    //    @ApiModelProperty("用户单位名称")
    private String unitName;

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

    public Boolean getUserIsAdmin() {
        return userIsAdmin;
    }

    public void setUserIsAdmin(Boolean userIsAdmin) {
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

    public Long getUserCreatedTime() {
        return userCreatedTime;
    }

    public void setUserCreatedTime(Long userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    public Long getUserUpdatedTime() {
        return userUpdatedTime;
    }

    public void setUserUpdatedTime(Long userUpdatedTime) {
        this.userUpdatedTime = userUpdatedTime;
    }

    public Long getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Long userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserHeadimg() {
        return userHeadimg;
    }

    public void setUserHeadimg(String userHeadimg) {
        this.userHeadimg = userHeadimg;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
