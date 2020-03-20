package com.polaris.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 预警信息返回类
 *
 * @author zejun
 * @date 2019/5/14 16:52
 */

@ApiModel("预警信息返回类")
@Data
public class EarlyWarningVo {

    @ApiModelProperty("预警id")
    private Integer id;

    /**
     * 预警单位id
     */
    @ApiModelProperty("预警单位id")
    private Integer unitId;

    /**
     * 预警单位名称
     */
    @ApiModelProperty("预警单位名称")
    private String unitName;

    /**
     * 预警信息发生的模块id
     */
    @ApiModelProperty("预警信息发生的模块id")
    private Integer moduleType;

    /**
     * 预警类型
     */
    @ApiModelProperty("预警类型")
    private Integer warningType;

    /**
     * 预警内容过期时间
     */
    @ApiModelProperty("预警内容过期时间")
    private Long expireTime;

    /**
     * 预警次数
     */
    @ApiModelProperty("预警次数")
    private Integer warningCount;

    /**
     * 处置状态
     */
    @ApiModelProperty("处置状态")
    private Integer dealStatus;

    /**
     * 处置结果
     */
    @ApiModelProperty("处置结果")
    private Integer dealResult;

    /**
     * 额外信息
     */
    @ApiModelProperty("额外信息")
    private String extraText;

    /**
     * 预警发生时间
     */
    @ApiModelProperty("预警发生时间")
    private Long createTime;

    /**
     * 预警更新时间
     */
    @ApiModelProperty("预警更新时间")
    private Long updateTime;

    @ApiModelProperty("预警开始时间")
    private Long searchStartTime;

    @ApiModelProperty("预警结束时间")
    private Long searchEndTime;

    @ApiModelProperty("预警更新开始时间")
    private Long searchUpStartTime;

    @ApiModelProperty("预警更新结束时间")
    private Long searchUpEndTime;
}
