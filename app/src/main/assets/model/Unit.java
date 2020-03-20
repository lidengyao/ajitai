package com.polaris.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 */

@ApiModel("单位基本信息")
@Data
public class Unit {

    @ApiModelProperty("单位id")
    private Integer id;

    @ApiModelProperty("分类")
    private Integer classification;

    @ApiModelProperty("单位类型")
    private Integer unitType;

    @ApiModelProperty("上级单位id")
    private Integer higherLevelUnit;

    @ApiModelProperty("单位名称")
    private String unitName;

    @ApiModelProperty("单位名称简写")
    private String unitAbbr;

    @ApiModelProperty("单位名称拼音简写")
    private String unitPinyinAbbr;

    @ApiModelProperty("区域id")
    private Integer unitLocationId;

    @ApiModelProperty("单位地址")
    private String unitAddress;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("单位代码")
    private String unitCode;

    @ApiModelProperty("企业代号")
    private String enterpriseCode;

    @ApiModelProperty("数据来源")
    private Integer dataSource;

    @ApiModelProperty("单位联系人")
    private String compContact;

    @ApiModelProperty("单位联系电话")
    private String compContactPhone;

    @ApiModelProperty("单位id")
    private String compId;

    @ApiModelProperty("地址区划编码")
    private String compAreaCode;

    @ApiModelProperty("单位编号")
    private String compNo;

    @ApiModelProperty("行政区划编码")
    private String compCode;

    @ApiModelProperty("单位电话")
    private String compPhone;

    @ApiModelProperty("登记时间")
    private String compRegTime;

    @ApiModelProperty("单位有效期")
    private String compYxq;

    @ApiModelProperty("单位有效期")
    private String compYxqDate;

    @ApiModelProperty("上级管理单位id")
    private String compManager;

    @ApiModelProperty("单位注销状态")
    private Integer compDel;

    @ApiModelProperty("系统外单位标识")
    private Integer compOut;

    @ApiModelProperty("单位锁定状态")
    private Integer suoding;

    @ApiModelProperty("单位停产停业状态")
    private Integer tingye;

    @ApiModelProperty("是否公安")
    private Integer isga;

    @ApiModelProperty("单位信息上报状态")
    private Integer dataup;

    @ApiModelProperty("是否公安备案")
    private Integer isGaba;

    @ApiModelProperty("单位性质")
    private String compNature;

    @ApiModelProperty("单位类型")
    private String compType;

    @ApiModelProperty("锁定状态")
    private Integer lockStatus;

    @ApiModelProperty("数据id， 发送给中爆时候")
    private String dataId;

    @ApiModelProperty("派出所地区编码")
    private String pcsAreaCode;

    @ApiModelProperty("分局地区编码")
    private String fjAreaCode;

    @ApiModelProperty("市局地区编码")
    private String sjAreaCode;

}