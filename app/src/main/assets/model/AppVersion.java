package com.polaris.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("app版本")
@Data
public class AppVersion {

    @ApiModelProperty("数据id")
    private Integer id;

    @ApiModelProperty("版本类型，1：公安，2：企业")
    private Integer versionType;

    @ApiModelProperty("版本号")
    private String versionNo;

    @ApiModelProperty("下载地址")
    private String downloadUrl;

    @ApiModelProperty("创建时间")
    private Long createTime;

}