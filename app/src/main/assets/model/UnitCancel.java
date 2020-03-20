package com.polaris.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 * @date 2019/7/31 9:38
 */

@ApiModel("业务注销")
@Data
public class UnitCancel {

    @ApiModelProperty("单位id")
    private Integer id;

    @ApiModelProperty("单位名称")
    private String unitName;

    @ApiModelProperty("单位联系人")
    private String compContact;

    @ApiModelProperty("单位联系人电话")
    private String compContactPhone;

    @ApiModelProperty("单位注销状态")
    private Integer compDel;

    @ApiModelProperty("单位注销操作单位id")
    private Integer compDelCharger;

    @ApiModelProperty("单位注销操作单位名称")
    private String compDelUnitName;

    @ApiModelProperty("单位注销时间")
    private Long compDelTime;

    @ApiModelProperty("剧毒业务注销状态")
    private Integer compToxicDel;

    @ApiModelProperty("剧毒业务注销操作单位id")
    private Integer compToxicDelCharger;

    @ApiModelProperty("剧毒业务注销操作单位名称")
    private String compToxicDelUnitName;

    @ApiModelProperty("剧毒业务注销时间")
    private Long compToxicDelTime;

    @ApiModelProperty("易制爆业务注销状态")
    private Integer compYzbDel;

    @ApiModelProperty("易制爆注销操作单位id")
    private Integer compYzbDelCharger;

    @ApiModelProperty("易制爆注销操作单位名称")
    private String compYzbDelUnitName;

    @ApiModelProperty("易制爆注销时间")
    private Long compYzbDelTime;
}
