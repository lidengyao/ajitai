package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class Customer_Info implements Serializable {

    //    @ApiModelProperty("数据id")
    private Integer id;

    //    @ApiModelProperty(value = "填写记录单位id", notes = "自动获得")
    private Integer unitId;

    //    @ApiModelProperty("组织机构代码证号")
    private String orgCodeNo;

    //    @ApiModelProperty("客户单位名称")
    private String customerUnitName;

    //    @ApiModelProperty("单位类型")
    private Integer unitType;

    //    @ApiModelProperty("省")
    private Integer areaProvince;

    //    @ApiModelProperty("省直辖市，地区（州，盟）")
    private Integer areaSzxs;

    //    @ApiModelProperty("市")
    private Integer areaCity;

    //    @ApiModelProperty("县")
    private Integer areaCountry;

    //    @ApiModelProperty("上级单位")
    private Integer superiorUnit;

    //    @ApiModelProperty("删除状态")
    private Integer status;

    //    @ApiModelProperty("核查状态")
    private Integer checkStatus;

    //    @ApiModelProperty("核查单位id")
    private Integer checkUnitId;

    //审核单位名称
    private String checkUnitName;

    //    @ApiModelProperty("核查用户id")
    private Integer checkUserId;

    //审核人名称
    private String checkUserName;

    //    @ApiModelProperty("核查时间")
    private Long checkTime;

    //    @ApiModelProperty("地址")
    private String address;

    //    @ApiModelProperty("联系人")
    private String contacts;

    //    @ApiModelProperty("联系人电话")
    private String contactsTel;

    //    @ApiModelProperty("数据创建时间")
    private Long createTime;

    //    @ApiModelProperty("数据更新时间")
    private Long updateTime;

    //    @ApiModelProperty("单位字符id")
    private String compStr;

    //录入企业名称
    private String unitName;

    //上级单位
    private String superiorUnitName;

    private String comp_str;

    //核查理由
    private String checkReason;

    public String getCheckReason() {
        return checkReason;
    }

    public void setCheckReason(String checkReason) {
        this.checkReason = checkReason;
    }

    public String getCheckUnitName() {
        return checkUnitName;
    }

    public void setCheckUnitName(String checkUnitName) {
        this.checkUnitName = checkUnitName;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

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

    public String getOrgCodeNo() {
        return orgCodeNo;
    }

    public void setOrgCodeNo(String orgCodeNo) {
        this.orgCodeNo = orgCodeNo;
    }

    public String getCustomerUnitName() {
        return customerUnitName;
    }

    public void setCustomerUnitName(String customerUnitName) {
        this.customerUnitName = customerUnitName;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public Integer getAreaProvince() {
        return areaProvince;
    }

    public void setAreaProvince(Integer areaProvince) {
        this.areaProvince = areaProvince;
    }

    public Integer getAreaSzxs() {
        return areaSzxs;
    }

    public void setAreaSzxs(Integer areaSzxs) {
        this.areaSzxs = areaSzxs;
    }

    public Integer getAreaCity() {
        return areaCity;
    }

    public void setAreaCity(Integer areaCity) {
        this.areaCity = areaCity;
    }

    public Integer getAreaCountry() {
        return areaCountry;
    }

    public void setAreaCountry(Integer areaCountry) {
        this.areaCountry = areaCountry;
    }

    public Integer getSuperiorUnit() {
        return superiorUnit;
    }

    public void setSuperiorUnit(Integer superiorUnit) {
        this.superiorUnit = superiorUnit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getCheckUnitId() {
        return checkUnitId;
    }

    public void setCheckUnitId(Integer checkUnitId) {
        this.checkUnitId = checkUnitId;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Long getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactsTel() {
        return contactsTel;
    }

    public void setContactsTel(String contactsTel) {
        this.contactsTel = contactsTel;
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

    public String getCompStr() {
        return compStr;
    }

    public void setCompStr(String compStr) {
        this.compStr = compStr;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getSuperiorUnitName() {
        return superiorUnitName;
    }

    public void setSuperiorUnitName(String superiorUnitName) {
        this.superiorUnitName = superiorUnitName;
    }

    public String getComp_str() {
        return comp_str;
    }

    public void setComp_str(String comp_str) {
        this.comp_str = comp_str;
    }
}
