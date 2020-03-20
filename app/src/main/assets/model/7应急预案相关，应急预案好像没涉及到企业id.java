package com.polaris.entity.toxic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 * @description 剧毒应急预案
 */

@ApiModel("应急预案数据")
@Data
public class ToxicReservePlan {

    @ApiModelProperty("应急预案id")
    private Integer id;

    @ApiModelProperty("模块id")
    private Integer moduleType;

    @ApiModelProperty("预案名称")
    private String planName;

    @ApiModelProperty("预案类型")
    private Integer planType;

    @ApiModelProperty("制定者")
    private String customMader;

    @ApiModelProperty("发布者id")
    private Integer publisher;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("预案内容")
    private String content;

    @ApiModelProperty("制定者名称")
    private String customMaderValue;

    @ApiModelProperty("发布者名称")
    private String publisherValue;

    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;
}