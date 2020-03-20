package com.polaris.entity.toxic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zejun
 * @description 剧毒购买证申请
 */

@ApiModel("剧毒购买证")
@Data
public class ToxicPurchaseApply {

    @ApiModelProperty("购买证id")
    private Integer id;

    @ApiModelProperty("购买证号")
    private String purchaseCertificateNumber;

    @ApiModelProperty("购买证申请单位id")
    private Integer companyId;

    @ApiModelProperty("购买证申请单位地区id")
    private Integer locationId;

    @ApiModelProperty("前缀")
    private String toxicPrefix;

    @ApiModelProperty("骑缝号")
    private String tallyMark;

    @ApiModelProperty("有效期")
    private Long purchaseCertificateTerm;

    @ApiModelProperty("序列号")
    private String serialNumber;

    @ApiModelProperty("操作人id")
    private Integer chargerId;

    @ApiModelProperty("购买时间")
    private Long purchaseTime;

    @ApiModelProperty("用途")
    private String usages;

    @ApiModelProperty("销售单位id")
    private Integer saleCompanyId;

    @ApiModelProperty("销售单位名称")
    private String saleCompanyName;

    @ApiModelProperty("是否省内")
    private Integer saleCompanyInProvince;

    @ApiModelProperty("企业审查人id")
    private Integer companyCheckerId;

    @ApiModelProperty("企业审核人id")
    private Integer companyApprovalId;

    @ApiModelProperty("企业审核状态")
    private Integer companyApprovalStatus;

    @ApiModelProperty("企业审核意见")
    private String companyApprovalOpinion;

    @ApiModelProperty("企业审核时间")
    private Long companyApprovalTime;

    @ApiModelProperty("公安受理单位id")
    private Integer policeAcceptanceUnit;

    @ApiModelProperty("公安受理人id")
    private Integer policeAcceptanceId;

    @ApiModelProperty("公安受理意见")
    private String policeAcceptanceOpinion;

    @ApiModelProperty("公安受理状态")
    private Integer policeAcceptanceStatus;

    @ApiModelProperty("公安受理时间")
    private Long policeAcceptanceTime;

    @ApiModelProperty("公安审查单位id")
    private Integer policeCheckUnit;

    @ApiModelProperty("公安审查人id")
    private Integer policeCheckerId;

    @ApiModelProperty("公安审查意见")
    private String policeCheckerOpinion;

    @ApiModelProperty("公安审查状态")
    private Integer policeCheckStatus;

    @ApiModelProperty("公安审查时间")
    private Long policeCheckTime;

    @ApiModelProperty("公安审核单位id")
    private Integer policeApprovalUnit;

    @ApiModelProperty("公安审核人id")
    private Integer policeApprovalId;

    @ApiModelProperty("公安审核意见")
    private String policeApprovalOpinion;

    @ApiModelProperty("公安审核时间")
    private Long policeApprovalTime;

    @ApiModelProperty("公安审核状态")
    private Integer policeApprovalStatus;

    @ApiModelProperty("最终审核状态")
    private Integer acceptStatus;

    @ApiModelProperty("审核通过时间")
    private Long approvalTime;

    @ApiModelProperty("过期时间")
    private Long expireTime;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("修改时间")
    private Long updateTime;

    /**
     * 购买物品信息列表
     */
    @ApiModelProperty("购买证设计物品列表")
    private List<ToxicPurchaseGoods> purchaseGoodsList;

    @ApiModelProperty("司机姓名")
    private String driverName;

    @ApiModelProperty("司机电话")
    private String driverTel;

    @ApiModelProperty("司机车牌号")
    private String vehicleNumber;

    @ApiModelProperty("运输开始时间")
    private Long transportStartTime;

    @ApiModelProperty("运输结束时间")
    private Long transportEndTime;

    @ApiModelProperty("运输起始点")
    private String transportStartPlace;

    @ApiModelProperty("运输经过点")
    private String transportPassPlace;

    @ApiModelProperty("运达地点")
    private String transportEndPlace;

    @ApiModelProperty("经度精度")
    private String startLongtitude;

    @ApiModelProperty("起点纬度")
    private String startLatitude;

    @ApiModelProperty("终点经度")
    private String endLongtitude;

    @ApiModelProperty("终点点纬度")
    private String endLatitude;

    @ApiModelProperty("查询开始时间")
    private Long searchStart;

    @ApiModelProperty("查询结束时间")
    private Long searchEnd;

    @ApiModelProperty("批量审核的id列表")
    private List<Integer> ids;

    @ApiModelProperty("业务类型")
    private Integer lx;
}