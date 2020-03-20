package com.lyg.weiguan.ui.toxic.add.model;

public class UnitFilingModel {
    private Integer unitId;
    private String legalRepresentativeName;//法人姓名
    private String legalRepresentativeIdcard;//法人身份证
    private String legalRepresentativeTel;//法人电话
    private Integer unitType;//单位类型
    private String securityerName;//安全负责人姓名
    private String securityerTel;//安全负责人电话
    private Integer storageRiskLevel;//存在风险等级
    private Integer companyMemberNumber;//从业人员数
    private Integer importAndExport;//是否进出口
    private Integer monitors;//是否有监控
    private String dutyRoomTel;//值班保卫室电话
    private String monitoringCenterTel;//监控中心电话
    private String toxicStoreAddress;//剧毒化学品存储地
    private String businessLicenseNo;//工商营业执照号
    private Long businessLicenseNoExpire;//工商营业执照过期时间
    private String organizationalCodeCertificate;//组织机构代码证
    private Long organizationalCodeCertificateExpire;//组织机构代码证过期时间
    private String safetySupervision;//安监部门证书
    private Long safetySupervisionExpire;//安监部门证书过期时间
    private String environmentalCertificate;//环保证书
    private Long environmentalCertificateExpire;//环保证书过期时间
    private String professionalInstitutions;//专业机构证书
    private Long professionalInstitutionsExpire;//专业机构证书过期时间
    private String toxicDescription;//生成，经营，存储，使用
    private String toxicEquipment;//剧毒化学品存储设备及安保措施
    private String remark;//备注

    private Integer companyCheckerId;//单位审查人id
    private String companyCheckerOpinion;//单位审查人意见
    private Integer applyStatus;//申请状态

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public Integer getCompanyCheckerId() {
        return companyCheckerId;
    }

    public void setCompanyCheckerId(Integer companyCheckerId) {
        this.companyCheckerId = companyCheckerId;
    }

    public String getCompanyCheckerOpinion() {
        return companyCheckerOpinion;
    }

    public void setCompanyCheckerOpinion(String companyCheckerOpinion) {
        this.companyCheckerOpinion = companyCheckerOpinion;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        this.legalRepresentativeName = legalRepresentativeName;
    }

    public String getLegalRepresentativeIdcard() {
        return legalRepresentativeIdcard;
    }

    public void setLegalRepresentativeIdcard(String legalRepresentativeIdcard) {
        this.legalRepresentativeIdcard = legalRepresentativeIdcard;
    }

    public String getLegalRepresentativeTel() {
        return legalRepresentativeTel;
    }

    public void setLegalRepresentativeTel(String legalRepresentativeTel) {
        this.legalRepresentativeTel = legalRepresentativeTel;
    }

    public String getSecurityerName() {
        return securityerName;
    }

    public void setSecurityerName(String securityerName) {
        this.securityerName = securityerName;
    }

    public String getSecurityerTel() {
        return securityerTel;
    }

    public void setSecurityerTel(String securityerTel) {
        this.securityerTel = securityerTel;
    }

    public Integer getStorageRiskLevel() {
        return storageRiskLevel;
    }

    public void setStorageRiskLevel(Integer storageRiskLevel) {
        this.storageRiskLevel = storageRiskLevel;
    }

    public Integer getCompanyMemberNumber() {
        return companyMemberNumber;
    }

    public void setCompanyMemberNumber(Integer companyMemberNumber) {
        this.companyMemberNumber = companyMemberNumber;
    }

    public Integer getImportAndExport() {
        return importAndExport;
    }

    public void setImportAndExport(Integer importAndExport) {
        this.importAndExport = importAndExport;
    }

    public Integer getMonitors() {
        return monitors;
    }

    public void setMonitors(Integer monitors) {
        this.monitors = monitors;
    }

    public String getDutyRoomTel() {
        return dutyRoomTel;
    }

    public void setDutyRoomTel(String dutyRoomTel) {
        this.dutyRoomTel = dutyRoomTel;
    }

    public String getMonitoringCenterTel() {
        return monitoringCenterTel;
    }

    public void setMonitoringCenterTel(String monitoringCenterTel) {
        this.monitoringCenterTel = monitoringCenterTel;
    }

    public String getToxicStoreAddress() {
        return toxicStoreAddress;
    }

    public void setToxicStoreAddress(String toxicStoreAddress) {
        this.toxicStoreAddress = toxicStoreAddress;
    }

    public String getBusinessLicenseNo() {
        return businessLicenseNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public Long getBusinessLicenseNoExpire() {
        return businessLicenseNoExpire;
    }

    public void setBusinessLicenseNoExpire(Long businessLicenseNoExpire) {
        this.businessLicenseNoExpire = businessLicenseNoExpire;
    }

    public String getOrganizationalCodeCertificate() {
        return organizationalCodeCertificate;
    }

    public void setOrganizationalCodeCertificate(String organizationalCodeCertificate) {
        this.organizationalCodeCertificate = organizationalCodeCertificate;
    }

    public Long getOrganizationalCodeCertificateExpire() {
        return organizationalCodeCertificateExpire;
    }

    public void setOrganizationalCodeCertificateExpire(Long organizationalCodeCertificateExpire) {
        this.organizationalCodeCertificateExpire = organizationalCodeCertificateExpire;
    }

    public String getSafetySupervision() {
        return safetySupervision;
    }

    public void setSafetySupervision(String safetySupervision) {
        this.safetySupervision = safetySupervision;
    }

    public Long getSafetySupervisionExpire() {
        return safetySupervisionExpire;
    }

    public void setSafetySupervisionExpire(Long safetySupervisionExpire) {
        this.safetySupervisionExpire = safetySupervisionExpire;
    }

    public String getEnvironmentalCertificate() {
        return environmentalCertificate;
    }

    public void setEnvironmentalCertificate(String environmentalCertificate) {
        this.environmentalCertificate = environmentalCertificate;
    }

    public Long getEnvironmentalCertificateExpire() {
        return environmentalCertificateExpire;
    }

    public void setEnvironmentalCertificateExpire(Long environmentalCertificateExpire) {
        this.environmentalCertificateExpire = environmentalCertificateExpire;
    }

    public String getProfessionalInstitutions() {
        return professionalInstitutions;
    }

    public void setProfessionalInstitutions(String professionalInstitutions) {
        this.professionalInstitutions = professionalInstitutions;
    }

    public Long getProfessionalInstitutionsExpire() {
        return professionalInstitutionsExpire;
    }

    public void setProfessionalInstitutionsExpire(Long professionalInstitutionsExpire) {
        this.professionalInstitutionsExpire = professionalInstitutionsExpire;
    }

    public String getToxicDescription() {
        return toxicDescription;
    }

    public void setToxicDescription(String toxicDescription) {
        this.toxicDescription = toxicDescription;
    }

    public String getToxicEquipment() {
        return toxicEquipment;
    }

    public void setToxicEquipment(String toxicEquipment) {
        this.toxicEquipment = toxicEquipment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "UnitFilingModel{" +
                "unitId=" + unitId +
                ", legalRepresentativeName='" + legalRepresentativeName + '\'' +
                ", legalRepresentativeIdcard='" + legalRepresentativeIdcard + '\'' +
                ", legalRepresentativeTel='" + legalRepresentativeTel + '\'' +
                ", securityerName='" + securityerName + '\'' +
                ", securityerTel='" + securityerTel + '\'' +
                ", storageRiskLevel=" + storageRiskLevel +
                ", companyMemberNumber=" + companyMemberNumber +
                ", importAndExport=" + importAndExport +
                ", monitors=" + monitors +
                ", dutyRoomTel='" + dutyRoomTel + '\'' +
                ", monitoringCenterTel='" + monitoringCenterTel + '\'' +
                ", toxicStoreAddress='" + toxicStoreAddress + '\'' +
                ", businessLicenseNo='" + businessLicenseNo + '\'' +
                ", businessLicenseNoExpire=" + businessLicenseNoExpire +
                ", organizationalCodeCertificate='" + organizationalCodeCertificate + '\'' +
                ", organizationalCodeCertificateExpire=" + organizationalCodeCertificateExpire +
                ", safetySupervision='" + safetySupervision + '\'' +
                ", safetySupervisionExpire=" + safetySupervisionExpire +
                ", environmentalCertificate='" + environmentalCertificate + '\'' +
                ", environmentalCertificateExpire=" + environmentalCertificateExpire +
                ", professionalInstitutions='" + professionalInstitutions + '\'' +
                ", professionalInstitutionsExpire=" + professionalInstitutionsExpire +
                ", toxicDescription='" + toxicDescription + '\'' +
                ", toxicEquipment='" + toxicEquipment + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
