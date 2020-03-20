package com.lyg.weiguan.ui.toxic.detail.mdoel;

public class ToxicPurchaseApplyDetailVo {

    /**
     * 购买证号
     */
    private String purchaseCertificateNumber;


    private Integer id;

    /**
     * 单位id
     */
    private Integer unitId;

    /**
     * 所属区域
     */
    private String location;

    /**
     * 有效期
     */
    private String effectiveTime;


    /**
     * 剧购字
     */
    private String toxicPrefix;
    /**
     * 骑缝号
     */
    private String tallyMark;

    /**
     * 企业名称
     */
    private String unitName;

    /**
     * 企业别名、简称
     */
    private String unitAbbr;

    /**
     * 法人姓名
     */
    private String legalRepresentativeName;

    /**
     * 企业地址
     */
    private String address;

    /**
     * 法人电话
     */
    private String legalRepresentativeTel;

    /**
     * 组织机构证书过期时间
     */
    private String organizationalCodeCertificateExpire;

    /**
     * 工商证书过期时间
     */
    private String businessLicenseNoExpire;

    /**
     * 安保证书过期时间
     */
    private String safetySupervisionExpire;

    /**
     * 环保证书过期时间
     */
    private String environmentalCertificateExpire;

    /**
     * 流水号
     */
    private String serialNumber;

    /**
     * 购买经办人id
     */
    private Integer purchaseChargeId;

    /**
     * 购买经办人姓名
     */
    private String purchaseChargeName;

    /**
     * 证件号码
     */
    private String certificateNumber;

    /**
     * 购买时间
     */
    private String purchaseTime;

    /**
     * 是否省内
     */
    private  Integer inProvince;

    /**
     * 销售单位id
     */
    private Integer saleCompanyId;

    /**
     * 销售单位名称
     */
    private String saleCompanyName;

    /**
     * 购买用途
     */
    private String usages;




    /**
     * 单位审查人id  不用
     */
    private Integer unitCheckerId;

    /**
     * 单位审查人姓名
     */
    private String unitCheckerName;

    /**
     * 单位审批人id 不用
     */
    private Integer unitApprovalId;

    /**
     * 单位审批人姓名
     */
    private String unitApprovalName;

    /**
     * 单位审批人意见 不用
     */
    private String unitOpinion;

    /**
     * 单位同意状态 不用
     */
    private Integer unitStatus;

    /**
     * 单位审核时间   不用
     */
    private String unitApprovalTime;


    /*公安受理单位id*/
    private Integer policeAcceptanceUnit;

    /*公安受理单位名称*/
    private String policeAcceptanceUnitName;

    /*公安受理人id*/
    private Integer policeAcceptanceId;

    /*公安受理人名字*/
    private String policeAcceptanceName;

    /*公安受理意见*/
    private String policeAcceptanceOpinion;

    /*公安受理状态  1 同意  2不同意*/
    private Integer policeAcceptanceStatus;

    /*公安受理时间*/
    private String policeAcceptanceTime;


    /*公安审查单位id*/
    private Integer policeCheckUnit;
    /*公安审查单位名字*/
    private String policeCheckUnitName;
    /*公安审查人id*/
    private Integer policeCheckerId;
    /*公安审查人名字*/
    private String policeCheckerName;
    /*公安审查意见内容*/
    private String policeCheckOpinion;
    /*公安审查理状态  1 同意  2不同意*/
    private Integer policeCheckStatus;
    /*公安审查时间*/
    private String policeCheckTime;



    /**
     * 公安审核单位id
     */
    private  Integer policeApprovalUnitId;

    /**
     * 公安审核单位名称
     */
    private String policeApprovalUnitName;

    /**
     * 公安审核意见
     */
    private Integer policeApprovalStatus;

    /**
     * 公安审核人id
     */
    private Integer policeApprovalId;

    /**
     * 公安审核人姓名
     */
    private String policeApprovalName;

    /**
     * 公安意见
     */
    private String policeOpinion;

    /**
     *公安审核时间
     */
    private String policeApprovalTime;

    /**
     * 当前购买证审核状态  1 同意  2不同意
     */
    private Integer acceptStatus;


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
    /* 经度精度*/
    private String startLongtitude;
    /* 起点纬度*/
    private String startLatitude;
    /* 终点经度*/
    private String endLongtitude;
    /* 终点点纬度*/
    private String endLatitude;

    public String getPurchaseCertificateNumber() {
        return purchaseCertificateNumber;
    }

    public void setPurchaseCertificateNumber(String purchaseCertificateNumber) {
        this.purchaseCertificateNumber = purchaseCertificateNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitAbbr() {
        return unitAbbr;
    }

    public void setUnitAbbr(String unitAbbr) {
        this.unitAbbr = unitAbbr;
    }

    public String getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        this.legalRepresentativeName = legalRepresentativeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegalRepresentativeTel() {
        return legalRepresentativeTel;
    }

    public void setLegalRepresentativeTel(String legalRepresentativeTel) {
        this.legalRepresentativeTel = legalRepresentativeTel;
    }

    public String getOrganizationalCodeCertificateExpire() {
        return organizationalCodeCertificateExpire;
    }

    public void setOrganizationalCodeCertificateExpire(String organizationalCodeCertificateExpire) {
        this.organizationalCodeCertificateExpire = organizationalCodeCertificateExpire;
    }

    public String getBusinessLicenseNoExpire() {
        return businessLicenseNoExpire;
    }

    public void setBusinessLicenseNoExpire(String businessLicenseNoExpire) {
        this.businessLicenseNoExpire = businessLicenseNoExpire;
    }

    public String getSafetySupervisionExpire() {
        return safetySupervisionExpire;
    }

    public void setSafetySupervisionExpire(String safetySupervisionExpire) {
        this.safetySupervisionExpire = safetySupervisionExpire;
    }

    public String getEnvironmentalCertificateExpire() {
        return environmentalCertificateExpire;
    }

    public void setEnvironmentalCertificateExpire(String environmentalCertificateExpire) {
        this.environmentalCertificateExpire = environmentalCertificateExpire;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getPurchaseChargeId() {
        return purchaseChargeId;
    }

    public void setPurchaseChargeId(Integer purchaseChargeId) {
        this.purchaseChargeId = purchaseChargeId;
    }

    public String getPurchaseChargeName() {
        return purchaseChargeName;
    }

    public void setPurchaseChargeName(String purchaseChargeName) {
        this.purchaseChargeName = purchaseChargeName;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public Integer getInProvince() {
        return inProvince;
    }

    public void setInProvince(Integer inProvince) {
        this.inProvince = inProvince;
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

    public String getUsages() {
        return usages;
    }

    public void setUsages(String usages) {
        this.usages = usages;
    }

    public Integer getUnitCheckerId() {
        return unitCheckerId;
    }

    public void setUnitCheckerId(Integer unitCheckerId) {
        this.unitCheckerId = unitCheckerId;
    }

    public String getUnitCheckerName() {
        return unitCheckerName;
    }

    public void setUnitCheckerName(String unitCheckerName) {
        this.unitCheckerName = unitCheckerName;
    }

    public Integer getUnitApprovalId() {
        return unitApprovalId;
    }

    public void setUnitApprovalId(Integer unitApprovalId) {
        this.unitApprovalId = unitApprovalId;
    }

    public String getUnitApprovalName() {
        return unitApprovalName;
    }

    public void setUnitApprovalName(String unitApprovalName) {
        this.unitApprovalName = unitApprovalName;
    }

    public String getUnitOpinion() {
        return unitOpinion;
    }

    public void setUnitOpinion(String unitOpinion) {
        this.unitOpinion = unitOpinion;
    }

    public Integer getUnitStatus() {
        return unitStatus;
    }

    public void setUnitStatus(Integer unitStatus) {
        this.unitStatus = unitStatus;
    }

    public String getUnitApprovalTime() {
        return unitApprovalTime;
    }

    public void setUnitApprovalTime(String unitApprovalTime) {
        this.unitApprovalTime = unitApprovalTime;
    }

    public Integer getPoliceAcceptanceUnit() {
        return policeAcceptanceUnit;
    }

    public void setPoliceAcceptanceUnit(Integer policeAcceptanceUnit) {
        this.policeAcceptanceUnit = policeAcceptanceUnit;
    }

    public String getPoliceAcceptanceUnitName() {
        return policeAcceptanceUnitName;
    }

    public void setPoliceAcceptanceUnitName(String policeAcceptanceUnitName) {
        this.policeAcceptanceUnitName = policeAcceptanceUnitName;
    }

    public Integer getPoliceAcceptanceId() {
        return policeAcceptanceId;
    }

    public void setPoliceAcceptanceId(Integer policeAcceptanceId) {
        this.policeAcceptanceId = policeAcceptanceId;
    }

    public String getPoliceAcceptanceName() {
        return policeAcceptanceName;
    }

    public void setPoliceAcceptanceName(String policeAcceptanceName) {
        this.policeAcceptanceName = policeAcceptanceName;
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

    public String getPoliceAcceptanceTime() {
        return policeAcceptanceTime;
    }

    public void setPoliceAcceptanceTime(String policeAcceptanceTime) {
        this.policeAcceptanceTime = policeAcceptanceTime;
    }

    public Integer getPoliceCheckUnit() {
        return policeCheckUnit;
    }

    public void setPoliceCheckUnit(Integer policeCheckUnit) {
        this.policeCheckUnit = policeCheckUnit;
    }

    public String getPoliceCheckUnitName() {
        return policeCheckUnitName;
    }

    public void setPoliceCheckUnitName(String policeCheckUnitName) {
        this.policeCheckUnitName = policeCheckUnitName;
    }

    public Integer getPoliceCheckerId() {
        return policeCheckerId;
    }

    public void setPoliceCheckerId(Integer policeCheckerId) {
        this.policeCheckerId = policeCheckerId;
    }

    public String getPoliceCheckerName() {
        return policeCheckerName;
    }

    public void setPoliceCheckerName(String policeCheckerName) {
        this.policeCheckerName = policeCheckerName;
    }

    public String getPoliceCheckOpinion() {
        return policeCheckOpinion;
    }

    public void setPoliceCheckOpinion(String policeCheckOpinion) {
        this.policeCheckOpinion = policeCheckOpinion;
    }

    public Integer getPoliceCheckStatus() {
        return policeCheckStatus;
    }

    public void setPoliceCheckStatus(Integer policeCheckStatus) {
        this.policeCheckStatus = policeCheckStatus;
    }

    public String getPoliceCheckTime() {
        return policeCheckTime;
    }

    public void setPoliceCheckTime(String policeCheckTime) {
        this.policeCheckTime = policeCheckTime;
    }

    public Integer getPoliceApprovalUnitId() {
        return policeApprovalUnitId;
    }

    public void setPoliceApprovalUnitId(Integer policeApprovalUnitId) {
        this.policeApprovalUnitId = policeApprovalUnitId;
    }

    public String getPoliceApprovalUnitName() {
        return policeApprovalUnitName;
    }

    public void setPoliceApprovalUnitName(String policeApprovalUnitName) {
        this.policeApprovalUnitName = policeApprovalUnitName;
    }

    public Integer getPoliceApprovalStatus() {
        return policeApprovalStatus;
    }

    public void setPoliceApprovalStatus(Integer policeApprovalStatus) {
        this.policeApprovalStatus = policeApprovalStatus;
    }

    public Integer getPoliceApprovalId() {
        return policeApprovalId;
    }

    public void setPoliceApprovalId(Integer policeApprovalId) {
        this.policeApprovalId = policeApprovalId;
    }

    public String getPoliceApprovalName() {
        return policeApprovalName;
    }

    public void setPoliceApprovalName(String policeApprovalName) {
        this.policeApprovalName = policeApprovalName;
    }

    public String getPoliceOpinion() {
        return policeOpinion;
    }

    public void setPoliceOpinion(String policeOpinion) {
        this.policeOpinion = policeOpinion;
    }

    public String getPoliceApprovalTime() {
        return policeApprovalTime;
    }

    public void setPoliceApprovalTime(String policeApprovalTime) {
        this.policeApprovalTime = policeApprovalTime;
    }

    public Integer getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(Integer acceptStatus) {
        this.acceptStatus = acceptStatus;
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
