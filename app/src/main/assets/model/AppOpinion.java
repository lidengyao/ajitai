package com.polaris.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 * @date 2019/8/13 9:50
 */

@ApiModel("app意见")
@Data
public class AppOpinion {

    @ApiModelProperty("数据id")
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("意见内容")
    private String content;

    @ApiModelProperty("创建时间")
    private Long createTime;
}
