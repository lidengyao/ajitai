package com.polaris.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("单位视频设备")
@Data
public class UnitVideo {

    @ApiModelProperty("记录id")
    private Integer id;

    @ApiModelProperty("单位id")
    private Integer unitId;

    @ApiModelProperty("模块id")
    private Integer moduleType;

    @ApiModelProperty("视频设备id")
    private Integer videoId;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("单位名称")
    private String unitName;

    @ApiModelProperty("设备编号")
    private String vcode;

    @ApiModelProperty("设备类型")
    private String deviceType;

    @ApiModelProperty("设备名称")
    private String vname;

    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;

}