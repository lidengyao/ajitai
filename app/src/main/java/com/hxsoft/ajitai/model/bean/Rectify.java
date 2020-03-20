package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class Rectify implements Serializable {


    //    @ApiModelProperty("数据id")
    private Integer id;

    //    @ApiModelProperty(value = "模块id", notes = "不用传")
    private Integer lx;

    //    @ApiModelProperty("整改单位id")
    private Integer unitId;

    //    @ApiModelProperty("发出整改公安单位id")
    private Integer policeUnitId;

    //    @ApiModelProperty("整改类型")
    private Integer rectifyType;

    //    @ApiModelProperty("整改级别")
    private Integer rectifyLevel;

    //    @ApiModelProperty("标题")
    private String title;

    //    @ApiModelProperty("内容")
    private String content;

    //    @ApiModelProperty(value = "整改单位名称", notes = "不用传")
    private String unitName;

    //    @ApiModelProperty(value = "发出整改公安单位名称", notes = "不用传")
    private String policeUnitName;

    //    @ApiModelProperty("图片")
    private String img;

    //    @ApiModelProperty("期限")
    private Long termTime;

    //    @ApiModelProperty("状态")
    private Integer status;

    //    @ApiModelProperty(value = "单位操作人id", notes = "暂时不用")
    private Integer unitChargerId;

    //    @ApiModelProperty("公安操作人id")
    private Integer policeChargerId;

    //    @ApiModelProperty(value = "单位回复时间", notes = "暂时不用")
    private Long unitReplyTime;

    //    @ApiModelProperty("创建时间")
    private Long createTime;

    //    @ApiModelProperty("修改时间")
    private Long updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLx() {
        return lx;
    }

    public void setLx(Integer lx) {
        this.lx = lx;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getPoliceUnitId() {
        return policeUnitId;
    }

    public void setPoliceUnitId(Integer policeUnitId) {
        this.policeUnitId = policeUnitId;
    }

    public Integer getRectifyType() {
        return rectifyType;
    }

    public void setRectifyType(Integer rectifyType) {
        this.rectifyType = rectifyType;
    }

    public Integer getRectifyLevel() {
        return rectifyLevel;
    }

    public void setRectifyLevel(Integer rectifyLevel) {
        this.rectifyLevel = rectifyLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getPoliceUnitName() {
        return policeUnitName;
    }

    public void setPoliceUnitName(String policeUnitName) {
        this.policeUnitName = policeUnitName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getTermTime() {
        return termTime;
    }

    public void setTermTime(Long termTime) {
        this.termTime = termTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUnitChargerId() {
        return unitChargerId;
    }

    public void setUnitChargerId(Integer unitChargerId) {
        this.unitChargerId = unitChargerId;
    }

    public Integer getPoliceChargerId() {
        return policeChargerId;
    }

    public void setPoliceChargerId(Integer policeChargerId) {
        this.policeChargerId = policeChargerId;
    }

    public Long getUnitReplyTime() {
        return unitReplyTime;
    }

    public void setUnitReplyTime(Long unitReplyTime) {
        this.unitReplyTime = unitReplyTime;
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
