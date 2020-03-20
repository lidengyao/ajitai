package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class SiJiBeiAn_Info implements Serializable {

    //    @ApiModelProperty("数据id")
    private Integer id;

    //    @ApiModelProperty("记录id")
    private Integer recordId;

    //    @ApiModelProperty("姓名")
    private String name;

    //车牌号
    private String numberPlate;

    //    @ApiModelProperty("性别")
    private Integer gender;

    //    @ApiModelProperty("电话")
    private String tel;

    //    @ApiModelProperty("地址")
    private String address;

    //    @ApiModelProperty("驾驶证")
    private String jsz;

    //    @ApiModelProperty("运输资格证")
    private String yszgz;

    //    @ApiModelProperty("身份证")
    private String sfz;

    //    @ApiModelProperty("单位id")
    private Integer unitId;

    //    @ApiModelProperty(value = "单位名称", notes = "返回用，不需要提交")
    private String unitName;

    //    @ApiModelProperty("企业负责人")
    private String qyfzr;

    //    @ApiModelProperty("企业负责人电话")
    private String qyfzedh;

    //    @ApiModelProperty("文化程度")
    private Integer culture;

    //    @ApiModelProperty("民族")
    private Integer nation;

    //    @ApiModelProperty("状态")
    private Integer status;

    //    @ApiModelProperty("证件到期时间")
    private Long zjdqsj;

    //    @ApiModelProperty("运输证到期时间")
    private Long yszdqsj;

    //    @ApiModelProperty("数据创建时间")
    private Long createTime;

    //    @ApiModelProperty("数据更新时间")
    private Long updateTime;

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJsz() {
        return jsz;
    }

    public void setJsz(String jsz) {
        this.jsz = jsz;
    }

    public String getYszgz() {
        return yszgz;
    }

    public void setYszgz(String yszgz) {
        this.yszgz = yszgz;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getQyfzr() {
        return qyfzr;
    }

    public void setQyfzr(String qyfzr) {
        this.qyfzr = qyfzr;
    }

    public String getQyfzedh() {
        return qyfzedh;
    }

    public void setQyfzedh(String qyfzedh) {
        this.qyfzedh = qyfzedh;
    }

    public Integer getCulture() {
        return culture;
    }

    public void setCulture(Integer culture) {
        this.culture = culture;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getZjdqsj() {
        return zjdqsj;
    }

    public void setZjdqsj(Long zjdqsj) {
        this.zjdqsj = zjdqsj;
    }

    public Long getYszdqsj() {
        return yszdqsj;
    }

    public void setYszdqsj(Long yszdqsj) {
        this.yszdqsj = yszdqsj;
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

