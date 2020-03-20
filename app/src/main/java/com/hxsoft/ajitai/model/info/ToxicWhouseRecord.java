package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class ToxicWhouseRecord implements Serializable {

//    @ApiModelProperty("记录id")
    private Integer id;

    /**
     * 单位id
     */
//    @ApiModelProperty("单位id")
    private Integer companyId;

    /**
     * 单位名
     */
//    @ApiModelProperty("单位名")
    private String companyName;

//    @ApiModelProperty("销售单位id")
    private Integer saleCompanyId;

//    @ApiModelProperty("销售单位名称")
    private String saleCompanyName;

    /**
     * 仓库id
     */
//    @ApiModelProperty("仓库id")
    private Integer warehouseId;

    /**
     * 仓库名
     */
//    @ApiModelProperty("仓库名")
    private String warehouseName;

    /**
     * 出入库类型
     */
//    @ApiModelProperty("出入库类型")
    private Integer outgoType;
    /**
     * 出入库类型名称
     */
//    @ApiModelProperty("出入库类型名称")
    private String outgoTypeName;

    /**
     * 订单、购买证号（实际未必有这个值）
     */
//    @ApiModelProperty("订单、购买证号")
    private Integer orderId;

    /**
     * 记录开始时间
     */
//    @ApiModelProperty("记录开始时间")
    private String recordStartTime;

    /**
     * 记录结束时间
     */
//    @ApiModelProperty("记录结束时间")
    private String recordEndTime;

    /**
     * 操作时间
     */
//    @ApiModelProperty("操作时间")
    private Long outgoTime;

    /**
     * 操作时间string后
     */
//    @ApiModelProperty("操作时间string后")
    private String outgoDate;

    /**
     * 出入库人员1id
     */
//    @ApiModelProperty("出入库人员1id")
    private Integer outgoMemberOne;

    /**
     * 出入库人员1姓名
     */
//    @ApiModelProperty("出入库人员1姓名")
    private String outgoMemberOneName;

    /**
     * 出入库人员2id
     */
//    @ApiModelProperty("出入库人员2id")
    private Integer outgoMemberTwo;

    /**
     * 出入库人员2姓名
     */
//    @ApiModelProperty("出入库人员2姓名")
    private String outgoMemberTwoName;

    /**
     * 入库批准人id
     */
//    @ApiModelProperty("入库批准人id")
    private Integer outgoApprovaler;

    /**
     * 入库批准人姓名
     */
//    @ApiModelProperty("入库批准人姓名")
    private String outgoApprovalerName;

    /**
     * 是否虚拟入库， 0否，1是
     */
//    @ApiModelProperty("是否虚拟入库， 0否，1是")
    private Integer isUnreal;

    /**
     * 出入库依据
     */
//    @ApiModelProperty("出入库依据")
    private Integer outgoBasis;

    /**
     * 出入库依据号码
     */
//    @ApiModelProperty("出入库依据号码")
    private String outgoBisisNumber;

    /**
     * 仓库保管员1id
     */
//    @ApiModelProperty("仓库保管员1id")
    private Integer outgoKeeperOne;

    /**
     * 仓库保管员1姓名
     */
//    @ApiModelProperty("仓库保管员1姓名")
    private String outgoKeeperOneName;

    /**
     * 仓库保管员2id
     */
//    @ApiModelProperty("仓库保管员2id")
    private Integer outgoKeeperTwo;

    /**
     * 仓库保管员2姓名
     */
    //     @ApiModelProperty("仓库保管员2姓名")
    private String outgoKeeperTwoName;

    /**
     * 现场监管人id
     */
    //    @ApiModelProperty("现场监管人id")
    private Integer senceSuperviser;

    /**
     * 现场监管人员姓名
     */
    //    @ApiModelProperty("现场监管人员姓名")
    private String senceSuperviserName;

    //    @ApiModelProperty("创建时间")
    private Long createTime;

    //    @ApiModelProperty("提交时间date类型")
    private String createTimeDate;

    //    @ApiModelProperty("更新时间")
    private Long updateTime;

    /**
     * 备注
     */
    //    @ApiModelProperty("备注")
    private String remark;

    /**
     * 此记录关联的物品信息
     */
    //    @ApiModelProperty("此记录关联的物品信息")
    ArrayList<ToxicWhouseGoodsDetail> goodsDetailList;

    //    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    //    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;

    //    @ApiModelProperty("模块id")
    private Integer lx;

    //    @ApiModelProperty("添加数据的公安单位id，如果是公安添加")
    private Integer addPoliceId;

    //    @ApiModelProperty("添加数据的公安单位名称")
    private String addPoliceName;

    //    @ApiModelProperty("数据来源，1：企业添加2：公安添加")
    private Integer dataSource;

    //    @ApiModelProperty("所属区域公安单位id")
    private Integer areaPoliceId;

    //    @ApiModelProperty("所属区域公安单位名称")
    private String areaPoliceName;

    //    @ApiModelProperty("购买经办人id")
    private Integer purchaseChargerId;

    //     @ApiModelProperty("购买经办人姓名")
    private String purchaseChargerName;

    //     @ApiModelProperty("销售经办人id")
    private Integer saleChargerId;

    //    @ApiModelProperty("销售经办人姓名")
    private String saleChargerName;

    //    @ApiModelProperty("电话")
    private String tel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getSaleCompanyId() {
        return saleCompanyId;
    }

    public void setSaleCompanyId(Integer saleCompanyId) {
        this.saleCompanyId = saleCompanyId;
    }

    public String getSaleCompanyName() {
        return saleCompanyName;
    }

    public void setSaleCompanyName(String saleCompanyName) {
        this.saleCompanyName = saleCompanyName;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Integer getOutgoType() {
        return outgoType;
    }

    public void setOutgoType(Integer outgoType) {
        this.outgoType = outgoType;
    }

    public String getOutgoTypeName() {
        return outgoTypeName;
    }

    public void setOutgoTypeName(String outgoTypeName) {
        this.outgoTypeName = outgoTypeName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getRecordStartTime() {
        return recordStartTime;
    }

    public void setRecordStartTime(String recordStartTime) {
        this.recordStartTime = recordStartTime;
    }

    public String getRecordEndTime() {
        return recordEndTime;
    }

    public void setRecordEndTime(String recordEndTime) {
        this.recordEndTime = recordEndTime;
    }

    public Long getOutgoTime() {
        return outgoTime;
    }

    public void setOutgoTime(Long outgoTime) {
        this.outgoTime = outgoTime;
    }

    public String getOutgoDate() {
        return outgoDate;
    }

    public void setOutgoDate(String outgoDate) {
        this.outgoDate = outgoDate;
    }

    public Integer getOutgoMemberOne() {
        return outgoMemberOne;
    }

    public void setOutgoMemberOne(Integer outgoMemberOne) {
        this.outgoMemberOne = outgoMemberOne;
    }

    public String getOutgoMemberOneName() {
        return outgoMemberOneName;
    }

    public void setOutgoMemberOneName(String outgoMemberOneName) {
        this.outgoMemberOneName = outgoMemberOneName;
    }

    public Integer getOutgoMemberTwo() {
        return outgoMemberTwo;
    }

    public void setOutgoMemberTwo(Integer outgoMemberTwo) {
        this.outgoMemberTwo = outgoMemberTwo;
    }

    public String getOutgoMemberTwoName() {
        return outgoMemberTwoName;
    }

    public void setOutgoMemberTwoName(String outgoMemberTwoName) {
        this.outgoMemberTwoName = outgoMemberTwoName;
    }

    public Integer getOutgoApprovaler() {
        return outgoApprovaler;
    }

    public void setOutgoApprovaler(Integer outgoApprovaler) {
        this.outgoApprovaler = outgoApprovaler;
    }

    public String getOutgoApprovalerName() {
        return outgoApprovalerName;
    }

    public void setOutgoApprovalerName(String outgoApprovalerName) {
        this.outgoApprovalerName = outgoApprovalerName;
    }

    public Integer getIsUnreal() {
        return isUnreal;
    }

    public void setIsUnreal(Integer isUnreal) {
        this.isUnreal = isUnreal;
    }

    public Integer getOutgoBasis() {
        return outgoBasis;
    }

    public void setOutgoBasis(Integer outgoBasis) {
        this.outgoBasis = outgoBasis;
    }

    public String getOutgoBisisNumber() {
        return outgoBisisNumber;
    }

    public void setOutgoBisisNumber(String outgoBisisNumber) {
        this.outgoBisisNumber = outgoBisisNumber;
    }

    public Integer getOutgoKeeperOne() {
        return outgoKeeperOne;
    }

    public void setOutgoKeeperOne(Integer outgoKeeperOne) {
        this.outgoKeeperOne = outgoKeeperOne;
    }

    public String getOutgoKeeperOneName() {
        return outgoKeeperOneName;
    }

    public void setOutgoKeeperOneName(String outgoKeeperOneName) {
        this.outgoKeeperOneName = outgoKeeperOneName;
    }

    public Integer getOutgoKeeperTwo() {
        return outgoKeeperTwo;
    }

    public void setOutgoKeeperTwo(Integer outgoKeeperTwo) {
        this.outgoKeeperTwo = outgoKeeperTwo;
    }

    public String getOutgoKeeperTwoName() {
        return outgoKeeperTwoName;
    }

    public void setOutgoKeeperTwoName(String outgoKeeperTwoName) {
        this.outgoKeeperTwoName = outgoKeeperTwoName;
    }

    public Integer getSenceSuperviser() {
        return senceSuperviser;
    }

    public void setSenceSuperviser(Integer senceSuperviser) {
        this.senceSuperviser = senceSuperviser;
    }

    public String getSenceSuperviserName() {
        return senceSuperviserName;
    }

    public void setSenceSuperviserName(String senceSuperviserName) {
        this.senceSuperviserName = senceSuperviserName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeDate() {
        return createTimeDate;
    }

    public void setCreateTimeDate(String createTimeDate) {
        this.createTimeDate = createTimeDate;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ArrayList<ToxicWhouseGoodsDetail> getGoodsDetailList() {
        return goodsDetailList;
    }

    public void setGoodsDetailList(ArrayList<ToxicWhouseGoodsDetail> goodsDetailList) {
        this.goodsDetailList = goodsDetailList;
    }

    public Long getSearchStartTime() {
        return searchStartTime;
    }

    public void setSearchStartTime(Long searchStartTime) {
        this.searchStartTime = searchStartTime;
    }

    public Long getSearchEndTime() {
        return searchEndTime;
    }

    public void setSearchEndTime(Long searchEndTime) {
        this.searchEndTime = searchEndTime;
    }

    public Integer getLx() {
        return lx;
    }

    public void setLx(Integer lx) {
        this.lx = lx;
    }

    public Integer getAddPoliceId() {
        return addPoliceId;
    }

    public void setAddPoliceId(Integer addPoliceId) {
        this.addPoliceId = addPoliceId;
    }

    public String getAddPoliceName() {
        return addPoliceName;
    }

    public void setAddPoliceName(String addPoliceName) {
        this.addPoliceName = addPoliceName;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getAreaPoliceId() {
        return areaPoliceId;
    }

    public void setAreaPoliceId(Integer areaPoliceId) {
        this.areaPoliceId = areaPoliceId;
    }

    public String getAreaPoliceName() {
        return areaPoliceName;
    }

    public void setAreaPoliceName(String areaPoliceName) {
        this.areaPoliceName = areaPoliceName;
    }

    public Integer getPurchaseChargerId() {
        return purchaseChargerId;
    }

    public void setPurchaseChargerId(Integer purchaseChargerId) {
        this.purchaseChargerId = purchaseChargerId;
    }

    public String getPurchaseChargerName() {
        return purchaseChargerName;
    }

    public void setPurchaseChargerName(String purchaseChargerName) {
        this.purchaseChargerName = purchaseChargerName;
    }

    public Integer getSaleChargerId() {
        return saleChargerId;
    }

    public void setSaleChargerId(Integer saleChargerId) {
        this.saleChargerId = saleChargerId;
    }

    public String getSaleChargerName() {
        return saleChargerName;
    }

    public void setSaleChargerName(String saleChargerName) {
        this.saleChargerName = saleChargerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}


