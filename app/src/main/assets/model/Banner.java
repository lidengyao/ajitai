package com.polaris.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("首页轮播图")
@Data
public class Banner {

    @ApiModelProperty("数据id")
    private Integer id;

    @ApiModelProperty("图片地址")
    private String imgUrl;

    @ApiModelProperty("图片名称")
    private String imgName;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("修改时间")
    private Long updateTime;

}