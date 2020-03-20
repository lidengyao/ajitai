package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class CompanyCharger implements Serializable {


    //    @ApiModelProperty("数据id")
    private Integer id;

    //    @ApiModelProperty("单位id")
    private Integer unitId;

    //    @ApiModelProperty("模块id")
    private Integer lx;

    //    @ApiModelProperty("姓名")
    private String name;

    //    @ApiModelProperty("性别")
    private Integer gender;

    //    @ApiModelProperty("证件类型")
    private Integer idcardType;

    //    @ApiModelProperty("证件号")
    private String idcardNumber;

    //    @ApiModelProperty("手机号")
    private String tel;

    //    @ApiModelProperty("电话号码")
    private String phone;

    //    @ApiModelProperty("备注")
    private String remark;

    //    @ApiModelProperty("创建时间")
    private Long createTime;

    //    @ApiModelProperty("最近一次更新时间")
    private Long updateTime;

    private String unitName;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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

    public Integer getLx() {
        return lx;
    }

    public void setLx(Integer lx) {
        this.lx = lx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(Integer idcardType) {
        this.idcardType = idcardType;
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
