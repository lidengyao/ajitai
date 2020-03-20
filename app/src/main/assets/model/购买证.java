package com.lyg.weiguan.ui.toxic.add.model;

import java.util.List;

public class ToxicPurchaseGoodsAddModel {

    /*购买证id*/
    private Integer id;

    /*购买证号*/
    private String purchaseCertificateNumber;

    /*购买证申请单位id*/
    private Integer companyId;

    /*购买证申请单位地区id*/
    private Integer locationId;

    /*前缀*/
    private String toxicPrefix;

    /*骑缝号*/
    private String tallyMark;

    /*有效期*/
    private Long purchaseCertificateTerm;

    /*序列号*/
    private String serialNumber;

    /*操作人id*/
    private Integer chargerId;

    /*购买时间*/
    private Long purchaseTime;

    /*用途*/
    private String usages;

    /*销售单位id*/
    private Integer saleCompanyId;

    /*销售单位名称*/
    private String saleCompanyName;

    /*是否省内*/
    private Integer saleCompanyInProvince;


    /*@ApiModelProperty("企业审查人id")*/
    private Integer companyCheckerId;


    /*企业审核人id*/
    private Integer companyApprovalId;

    /*企业审核状态  不用管*/
    private Integer companyApprovalStatus;

    /*企业审核意见  不用管*/
    private String companyApprovalOpinion;

    /*企业审核时间  不用管*/
    private Long companyApprovalTime;


    /*公安受理单位id*/
    private Integer policeAcceptanceUnit;

    /*公安受理人id*/
    private Integer policeAcceptanceId;

    /*公安受理意见*/
    private String policeAcceptanceOpinion;

    /*公安受理状态*/
    private Integer policeAcceptanceStatus;

    /*公安受理时间*/
    private Long policeAcceptanceTime;


    /*公安审查单位id*/
    private Integer policeCheckUnit;

    /*公安审查人id*/
    private Integer policeCheckerId;

    /*公安审查意见*/
    private String policeCheckerOpinion;

    /*公安审查状态*/
    private Integer policeCheckStatus;

    /*公安审查时间*/
    private Long policeCheckTime;


    /*公安审批单位id*/
    private Integer policeApprovalUnit;

    /*公安审批人id*/
    private Integer policeApprovalId;

    /*公安审批意见*/
    private String policeApprovalOpinion;

    /*公安审批时间*/
    private Long policeApprovalTime;

    /*公安审批状态*/
    private Integer policeApprovalStatus;


    /*    企业操作：
         （初始化0）流程开始-------(提交信息：状态码：1)--->
          企业申请-------(提交信息：状态码：2)--->

    公安操作：
    受理-------(提交信息：状态码：3)或（驳回：变回0）--->
    审查-------(提交信息：状态码：4)或（驳回：变回0）--->
    审批-------(提交信息：状态码：5)或（驳回：变回0）--->
    已办结*/

    /*最终审批状态*/
    private Integer acceptStatus;

    /*审核通过时间*/
    private Long approvalTime;

    /*过期时间*/
    private Long expireTime;

    /*创建时间*/
    private Long createTime;

    /*修改时间*/
    private Long updateTime;

    /*购买证  物品*/
    private List<ToxicPurchaseGoods> purchaseGoodsList;

    /*司机姓名*/
    private String driverName;

    /*司机电话*/
    private String driverTel;

    /*司机车牌号*/
    private String vehicleNumber;

    /*运输开始时间*/
    private Long transportStartTime;

    /*运输结束时间*/
    private Long transportEndTime;

    /*运输起始点*/
    private String transportStartPlace;

    /*运输经过点*/
    private String transportPassPlace;

    /*运达地点*/
    private String transportEndPlace;

    /*经度精度*/
    private String startLongtitude;

    /*起点纬度*/
    private String startLatitude;

    /*终点经度*/
    private String endLongtitude;

    /*终点点纬度*/
    private String endLatitude;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurchaseCertificateNumber() {
        return purchaseCertificateNumber;
    }

    public void setPurchaseCertificateNumber(String purchaseCertificateNumber) {
        this.purchaseCertificateNumber = purchaseCertificateNumber;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getToxicPrefix() {
        return toxicPrefix;
    }

    public void setToxicPrefix(String toxicPrefix) {
        this.toxicPrefix = toxicPrefix;
    }

    public String getTallyMark() {
        return tallyMark;
    }

    public void setTallyMark(String tallyMark) {
        this.tallyMark = tallyMark;
    }

    public Long getPurchaseCertificateTerm() {
        return purchaseCertificateTerm;
    }

    public void setPurchaseCertificateTerm(Long purchaseCertificateTerm) {
        this.purchaseCertificateTerm = purchaseCertificateTerm;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getChargerId() {
        return chargerId;
    }

    public void setChargerId(Integer chargerId) {
        this.chargerId = chargerId;
    }

    public Long getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Long purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getUsages() {
        return usages;
    }

    public void setUsages(String usages) {
        this.usages = usages;
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

    public Integer getSaleCompanyInProvince() {
        return saleCompanyInProvince;
    }

    public void setSaleCompanyInProvince(Integer saleCompanyInProvince) {
        this.saleCompanyInProvince = saleCompanyInProvince;
    }

    public Integer getCompanyCheckerId() {
        return companyCheckerId;
    }

    public void setCompanyCheckerId(Integer companyCheckerId) {
        this.companyCheckerId = companyCheckerId;
    }

    public Integer getCompanyApprovalId() {
        return companyApprovalId;
    }

    public void setCompanyApprovalId(Integer companyApprovalId) {
        this.companyApprovalId = companyApprovalId;
    }

    public Integer getCompanyApprovalStatus() {
        return companyApprovalStatus;
    }

    public void setCompanyApprovalStatus(Integer companyApprovalStatus) {
        this.companyApprovalStatus = companyApprovalStatus;
    }

    public String getCompanyApprovalOpinion() {
        return companyApprovalOpinion;
    }

    public void setCompanyApprovalOpinion(String companyApprovalOpinion) {
        this.companyApprovalOpinion = companyApprovalOpinion;
    }

    public Long getCompanyApprovalTime() {
        return companyApprovalTime;
    }

    public void setCompanyApprovalTime(Long companyApprovalTime) {
        this.companyApprovalTime = companyApprovalTime;
    }

    public Integer getPoliceAcceptanceUnit() {
        return policeAcceptanceUnit;
    }

    public void setPoliceAcceptanceUnit(Integer policeAcceptanceUnit) {
        this.policeAcceptanceUnit = policeAcceptanceUnit;
    }

    public Integer getPoliceAcceptanceId() {
        return policeAcceptanceId;
    }

    public void setPoliceAcceptanceId(Integer policeAcceptanceId) {
        this.policeAcceptanceId = policeAcceptanceId;
    }

    public String getPoliceAcceptanceOpinion() {
        return policeAcceptanceOpinion;
    }

    public void setPoliceAcceptanceOpinion(String policeAcceptanceOpinion) {
        this.policeAcceptanceOpinion = policeAcceptanceOpinion;
    }

    public Integer getPoliceAcceptanceStatus() {
        return policeAcceptanceStatus;
    }

    public void setPoliceAcceptanceStatus(Integer policeAcceptanceStatus) {
        this.policeAcceptanceStatus = policeAcceptanceStatus;
    }

    public Long getPoliceAcceptanceTime() {
        return policeAcceptanceTime;
    }

    public void setPoliceAcceptanceTime(Long policeAcceptanceTime) {
        this.policeAcceptanceTime = policeAcceptanceTime;
    }

    public Integer getPoliceCheckUnit() {
        return policeCheckUnit;
    }

    public void setPoliceCheckUnit(Integer policeCheckUnit) {
        this.policeCheckUnit = policeCheckUnit;
    }

    public Integer getPoliceCheckerId() {
        return policeCheckerId;
    }

    public void setPoliceCheckerId(Integer policeCheckerId) {
        this.policeCheckerId = policeCheckerId;
    }

    public String getPoliceCheckerOpinion() {
        return policeCheckerOpinion;
    }

    public void setPoliceCheckerOpinion(String policeCheckerOpinion) {
        this.policeCheckerOpinion = policeCheckerOpinion;
    }

    public Integer getPoliceCheckStatus() {
        return policeCheckStatus;
    }

    public void setPoliceCheckStatus(Integer policeCheckStatus) {
        this.policeCheckStatus = policeCheckStatus;
    }

    public Long getPoliceCheckTime() {
        return policeCheckTime;
    }

    public void setPoliceCheckTime(Long policeCheckTime) {
        this.policeCheckTime = policeCheckTime;
    }

    public Integer getPoliceApprovalUnit() {
        return policeApprovalUnit;
    }

    public void setPoliceApprovalUnit(Integer policeApprovalUnit) {
        this.policeApprovalUnit = policeApprovalUnit;
    }

    public Integer getPoliceApprovalId() {
        return policeApprovalId;
    }

    public void setPoliceApprovalId(Integer policeApprovalId) {
        this.policeApprovalId = policeApprovalId;
    }

    public String getPoliceApprovalOpinion() {
        return policeApprovalOpinion;
    }

    public void setPoliceApprovalOpinion(String policeApprovalOpinion) {
        this.policeApprovalOpinion = policeApprovalOpinion;
    }

    public Long getPoliceApprovalTime() {
        return policeApprovalTime;
    }

    public void setPoliceApprovalTime(Long policeApprovalTime) {
        this.policeApprovalTime = policeApprovalTime;
    }

    public Integer getPoliceApprovalStatus() {
        return policeApprovalStatus;
    }

    public void setPoliceApprovalStatus(Integer policeApprovalStatus) {
        this.policeApprovalStatus = policeApprovalStatus;
    }

    public Integer getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(Integer acceptStatus) {
        this.acceptStatus = acceptStatus;
    }

    public Long getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public List<ToxicPurchaseGoods> getPurchaseGoodsList() {
        return purchaseGoodsList;
    }

    public void setPurchaseGoodsList(List<ToxicPurchaseGoods> purchaseGoodsList) {
        this.purchaseGoodsList = purchaseGoodsList;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverTel() {
        return driverTel;
    }

    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Long getTransportStartTime() {
        return transportStartTime;
    }

    public void setTransportStartTime(Long transportStartTime) {
        this.transportStartTime = transportStartTime;
    }

    public Long getTransportEndTime() {
        return transportEndTime;
    }

    public void setTransportEndTime(Long transportEndTime) {
        this.transportEndTime = transportEndTime;
    }

    public String getTransportStartPlace() {
        return transportStartPlace;
    }

    public void setTransportStartPlace(String transportStartPlace) {
        this.transportStartPlace = transportStartPlace;
    }

    public String getTransportPassPlace() {
        return transportPassPlace;
    }

    public void setTransportPassPlace(String transportPassPlace) {
        this.transportPassPlace = transportPassPlace;
    }

    public String getTransportEndPlace() {
        return transportEndPlace;
    }

    public void setTransportEndPlace(String transportEndPlace) {
        this.transportEndPlace = transportEndPlace;
    }

    public String getStartLongtitude() {
        return startLongtitude;
    }

    public void setStartLongtitude(String startLongtitude) {
        this.startLongtitude = startLongtitude;
    }

    public String getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(String startLatitude) {
        this.startLatitude = startLatitude;
    }

    public String getEndLongtitude() {
        return endLongtitude;
    }

    public void setEndLongtitude(String endLongtitude) {
        this.endLongtitude = endLongtitude;
    }

    public String getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude;
    }
}
