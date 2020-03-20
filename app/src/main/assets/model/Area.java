package com.polaris.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("地区")
public class Area {

    @ApiModelProperty("数据id")
    private Integer id;

    @ApiModelProperty("地区代码")
    private String areaCode;

    @ApiModelProperty("上级地区代码")
    private String areaPcode;

    @ApiModelProperty("名称")
    private String areaName;

    @ApiModelProperty("区划级别，2市，3区，4街道")
    private Integer areaLevel;

    @ApiModelProperty("排序")
   private Integer areaSort;

}