package com.polaris.entity.yzb;


import com.polaris.entity.vo.SearchParent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@ApiModel("易制爆购销合同")
public class YzbContract extends SearchParent {

    @ApiModelProperty("数据id")
    private Integer id;

    @ApiModelProperty("填写单位id")
    private Integer unitId;

    @ApiModelProperty("供求类型，1：供方，2：需方")
    private Integer sdType;

    @ApiModelProperty("购买单位id")
    private Integer purchaseUnitId;

    @ApiModelProperty("销售单位id")
    private Integer saleUnitId;

    @ApiModelProperty("签约时间")
    private Long signTime;

    @ApiModelProperty("过期时间")
    private Long expireTime;

    @ApiModelProperty("合同")
    private String contract;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("签约物品信息列表")
    private List<YzbContractGoods> goodsList;
}