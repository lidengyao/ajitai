package com.polaris.entity.vo.toxicVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 * @date Created in 2019/5/6 14:10y
 */

@ApiModel("锁定查询类")
@Data
public class ToxicLockSearchVo {

    @ApiModelProperty("锁定类型")
    private Integer lockType;

    @ApiModelProperty("锁定状态")
    private Integer lockStatus;

    @ApiModelProperty("锁定开始时间")
    private Long startTime;

    @ApiModelProperty("锁定结束时间")
    private Long endTime;

}
