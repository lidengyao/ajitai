package com.polaris.entity.yzb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel("易制爆购销合同签约物品")
public class YzbContractGoods {

    @ApiModelProperty("数据id")
    private Integer id;

    @ApiModelProperty("合同id")
    private Integer contractId;

    @ApiModelProperty("物品id")
    private Integer goodsId;

    @ApiModelProperty("物品数量")
    private String goodsNum;

    @ApiModelProperty("删除状态（1:默认，-1：删除）")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;
	
	@ApiModelProperty(value = "物品名称", notes = "返回用")
	private String goodsName;

	@ApiModelProperty(value = "物品计量单位", notes = "返回用")
	private String goodsUnit;
}