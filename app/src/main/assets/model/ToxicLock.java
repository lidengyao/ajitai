package com.polaris.entity.toxic;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 */

@Data
public class ToxicLock {

    @ApiModelProperty("锁定记录id")
    private Integer id;

    @ApiModelProperty("被锁定单位id")
    private Integer companyId;

    @ApiModelProperty("锁定状态")
    private Integer lockStatus;

    @ApiModelProperty("锁定类型")
    private Integer lockType;

    @ApiModelProperty("执行锁定单位")
    private Integer lockUnit;

    @ApiModelProperty("执行锁定人员id")
    private Integer lockUnitCharger;

    @ApiModelProperty("锁定开始时间")
    private Long lockStartTime;

    @ApiModelProperty("解锁单位id")
    private Integer unlockUnit;

    @ApiModelProperty("解锁执行人员id")
    private Integer unlockUnitCharger;

    @ApiModelProperty("解锁时间")
    private String unlockTime;

    @ApiModelProperty("锁定范围")
    private String lockRange;

    @ApiModelProperty("锁定理由")
    private String lockReason;

    @ApiModelProperty("单位负责人id")
    private Integer companyManagerCheckerId;

    @ApiModelProperty("单位负责人意见")
    private String companyManagerCheckOpinion;

    @ApiModelProperty("单位负责人审核状态")
    private String companyManagerCheckStatus;

    @ApiModelProperty("单位负责人审核时间")
    private Long companyManagerCheckTime;

    @ApiModelProperty("解锁负责人id")
    private Integer unlockManagerCheckerId;

    @ApiModelProperty("解锁负责人意见")
    private String unlockManagerCheckOpinion;

    @ApiModelProperty("解锁负责人审核状态")
    private String unlockManagerCheckStatus;

    @ApiModelProperty("解锁负责人审核时间")
    private Long unlockManagerCheckTime;

    @ApiModelProperty("数据创建时间")
    private Long createTime;

    @ApiModelProperty("数据修改时间")
    private Long updateTime;
}