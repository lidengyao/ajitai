package com.hxsoft.ajitai.model.bean;


import java.io.Serializable;

public class DanWeiZhuXiao_Bean implements Serializable {

    //@ApiModelProperty("单位id")
    private Integer id;

    //@ApiModelProperty("单位名称")
    private String unitName;

    //@ApiModelProperty("单位联系人")
    private String compContact;

    //@ApiModelProperty("单位联系人电话")
    private String compContactPhone;

    //@ApiModelProperty("单位注销状态")
    private Integer compDel;

    //@ApiModelProperty("单位注销操作单位id")
    private Integer compDelCharger;

    //@ApiModelProperty("单位注销操作单位名称")
    private String compDelUnitName;

    //@ApiModelProperty("单位注销时间")
    private Long compDelTime;

    //@ApiModelProperty("剧毒业务注销状态")
    private Integer compToxicDel;

    //@ApiModelProperty("剧毒业务注销操作单位id")
    private Integer compToxicDelCharger;

    //@ApiModelProperty("剧毒业务注销操作单位名称")
    private String compToxicDelUnitName;

    //@ApiModelProperty("剧毒业务注销时间")
    private Long compToxicDelTime;

    //@ApiModelProperty("易制爆业务注销状态")
    private Integer compYzbDel;

    //@ApiModelProperty("易制爆注销操作单位id")
    private Integer compYzbDelCharger;

    //@ApiModelProperty("易制爆注销操作单位名称")
    private String compYzbDelUnitName;

    //@ApiModelProperty("易制爆注销时间")
    private Long compYzbDelTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCompContact() {
        return compContact;
    }

    public void setCompContact(String compContact) {
        this.compContact = compContact;
    }

    public String getCompContactPhone() {
        return compContactPhone;
    }

    public void setCompContactPhone(String compContactPhone) {
        this.compContactPhone = compContactPhone;
    }

    public Integer getCompDel() {
        return compDel;
    }

    public void setCompDel(Integer compDel) {
        this.compDel = compDel;
    }

    public Integer getCompDelCharger() {
        return compDelCharger;
    }

    public void setCompDelCharger(Integer compDelCharger) {
        this.compDelCharger = compDelCharger;
    }

    public String getCompDelUnitName() {
        return compDelUnitName;
    }

    public void setCompDelUnitName(String compDelUnitName) {
        this.compDelUnitName = compDelUnitName;
    }

    public Long getCompDelTime() {
        return compDelTime;
    }

    public void setCompDelTime(Long compDelTime) {
        this.compDelTime = compDelTime;
    }

    public Integer getCompToxicDel() {
        return compToxicDel;
    }

    public void setCompToxicDel(Integer compToxicDel) {
        this.compToxicDel = compToxicDel;
    }

    public Integer getCompToxicDelCharger() {
        return compToxicDelCharger;
    }

    public void setCompToxicDelCharger(Integer compToxicDelCharger) {
        this.compToxicDelCharger = compToxicDelCharger;
    }

    public String getCompToxicDelUnitName() {
        return compToxicDelUnitName;
    }

    public void setCompToxicDelUnitName(String compToxicDelUnitName) {
        this.compToxicDelUnitName = compToxicDelUnitName;
    }

    public Long getCompToxicDelTime() {
        return compToxicDelTime;
    }

    public void setCompToxicDelTime(Long compToxicDelTime) {
        this.compToxicDelTime = compToxicDelTime;
    }

    public Integer getCompYzbDel() {
        return compYzbDel;
    }

    public void setCompYzbDel(Integer compYzbDel) {
        this.compYzbDel = compYzbDel;
    }

    public Integer getCompYzbDelCharger() {
        return compYzbDelCharger;
    }

    public void setCompYzbDelCharger(Integer compYzbDelCharger) {
        this.compYzbDelCharger = compYzbDelCharger;
    }

    public String getCompYzbDelUnitName() {
        return compYzbDelUnitName;
    }

    public void setCompYzbDelUnitName(String compYzbDelUnitName) {
        this.compYzbDelUnitName = compYzbDelUnitName;
    }

    public Long getCompYzbDelTime() {
        return compYzbDelTime;
    }

    public void setCompYzbDelTime(Long compYzbDelTime) {
        this.compYzbDelTime = compYzbDelTime;
    }
}

