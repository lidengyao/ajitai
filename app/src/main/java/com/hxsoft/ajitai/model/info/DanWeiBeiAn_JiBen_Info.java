package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class DanWeiBeiAn_JiBen_Info implements Serializable {

    /**
     * id : 1
     * classification : 1
     * unitType : 2
     * higherLevelUnit : 10
     * higherLevelUnitName : 连云港第一剧毒处理公司1
     * unitName : 连云港公安总局1
     * unitAbbr : 连公安
     * unitPinyinAbbr : lygga
     * unitLocationId : 36
     * unitAddress : 连云港海州区苍梧路
     * unitId : 1
     * legalRepresentativeName : 王刚
     * legalRepresentativeIdcard : 310102021352145236521
     * legalRepresentativeTel : 18352825635
     * charger : 17
     * securityerName : 刘伟家
     * securityerTel : 18352852412
     * storageRiskLevel : 1
     * companyMemberNumber : 15
     * importAndExport : 1
     * monitors : 1
     * dutyRoomTel : 87654565
     * monitoringCenterTel : 879856544
     * toxicStoreAddress : 连云港花果山
     * businessLicenseNo : 3215412xxx25463
     * businessLicenseNoExpire : 1555996394488
     * organizationalCodeCertificate : 33xx33
     * organizationalCodeCertificateExpire : 1555996394488
     * safetySupervision : 22xxx222
     * safetySupervisionExpire : 1555996394488
     * environmentalCertificate : 11ccc111
     * environmentalCertificateExpire : 1555996394488
     * professionalInstitutions : 444cccc4444
     * professionalInstitutionsExpire : 1555996394488
     * companyCheckerId : null
     * companyCheckerOpinion : null
     * paichusuoCheckerId : null
     * paichusuoCheckerOpinion : null
     * policeCheckerId : null
     * policeCheckerOpinion : null
     * lockStatus : 0
     * applyStatus : 0
     * passTime : 0
     * createTime : 1555996374488
     * updateTime : 1555996374488
     * toxicDescription : 叽里呱啦
     * toxicEquipment : 最新的防火设备
     * remark : 连云港最大的
     */

    private Integer id;
    private Integer classification;
    private String unitType;
    private Integer higherLevelUnit;
    private String higherLevelUnitName;
    private String unitName;
    private String unitAbbr;
    private String unitPinyinAbbr;
    private Integer unitLocationId;
    private String unitAddress;
    private Integer unitId;
    private String legalRepresentativeName;
    private String legalRepresentativeIdcard;
    private String legalRepresentativeTel;
    private Integer charger;
    private String securityerName;
    private String securityerTel;
    private Integer storageRiskLevel;
    private Integer companyMemberNumber;
    private Integer importAndExport;
    private Integer monitors;
    private String dutyRoomTel;
    private String monitoringCenterTel;
    private String toxicStoreAddress;
    private String businessLicenseNo;
    private long businessLicenseNoExpire;
    private String organizationalCodeCertificate;
    private long organizationalCodeCertificateExpire;
    private String safetySupervision;
    private long safetySupervisionExpire;
    private String environmentalCertificate;
    private long environmentalCertificateExpire;
    private String professionalInstitutions;
    private long professionalInstitutionsExpire;
    private Integer companyCheckerId;
    private String companyCheckerOpinion;
    private Integer paichusuoCheckerId;
    private String paichusuoCheckerOpinion;
    private Integer policeCheckerId;
    private String policeCheckerOpinion;
    private Integer lockStatus;
    private Integer applyStatus;
    private long passTime;
    private long createTime;
    private long updateTime;
    private String toxicDescription;
    private String toxicEquipment;
    private String remark;
    private Integer lockType;
    private Integer suoding;

    private long companyCheckTime;
    private long paichusuoCheckTime;
    private long policeCheckTime;
    private String companyCheckName;
    private String paichusuoCheckName;
    private String policeCheckName;

    private String companyCheckerName;
    private String paichusuoCheckerName;
    private String policeCheckerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Integer getHigherLevelUnit() {
        return higherLevelUnit;
    }

    public void setHigherLevelUnit(Integer higherLevelUnit) {
        this.higherLevelUnit = higherLevelUnit;
    }

    public String getHigherLevelUnitName() {
        return higherLevelUnitName;
    }

    public void setHigherLevelUnitName(String higherLevelUnitName) {
        this.higherLevelUnitName = higherLevelUnitName;
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

    public String getUnitPinyinAbbr() {
        return unitPinyinAbbr;
    }

    public void setUnitPinyinAbbr(String unitPinyinAbbr) {
        this.unitPinyinAbbr = unitPinyinAbbr;
    }

    public Integer getUnitLocationId() {
        return unitLocationId;
    }

    public void setUnitLocationId(Integer unitLocationId) {
        this.unitLocationId = unitLocationId;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
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

    public Integer getCharger() {
        return charger;
    }

    public void setCharger(Integer charger) {
        this.charger = charger;
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

    public long getBusinessLicenseNoExpire() {
        return businessLicenseNoExpire;
    }

    public void setBusinessLicenseNoExpire(long businessLicenseNoExpire) {
        this.businessLicenseNoExpire = businessLicenseNoExpire;
    }

    public String getOrganizationalCodeCertificate() {
        return organizationalCodeCertificate;
    }

    public void setOrganizationalCodeCertificate(String organizationalCodeCertificate) {
        this.organizationalCodeCertificate = organizationalCodeCertificate;
    }

    public long getOrganizationalCodeCertificateExpire() {
        return organizationalCodeCertificateExpire;
    }

    public void setOrganizationalCodeCertificateExpire(long organizationalCodeCertificateExpire) {
        this.organizationalCodeCertificateExpire = organizationalCodeCertificateExpire;
    }

    public String getSafetySupervision() {
        return safetySupervision;
    }

    public void setSafetySupervision(String safetySupervision) {
        this.safetySupervision = safetySupervision;
    }

    public long getSafetySupervisionExpire() {
        return safetySupervisionExpire;
    }

    public void setSafetySupervisionExpire(long safetySupervisionExpire) {
        this.safetySupervisionExpire = safetySupervisionExpire;
    }

    public String getEnvironmentalCertificate() {
        return environmentalCertificate;
    }

    public void setEnvironmentalCertificate(String environmentalCertificate) {
        this.environmentalCertificate = environmentalCertificate;
    }

    public long getEnvironmentalCertificateExpire() {
        return environmentalCertificateExpire;
    }

    public void setEnvironmentalCertificateExpire(long environmentalCertificateExpire) {
        this.environmentalCertificateExpire = environmentalCertificateExpire;
    }

    public String getProfessionalInstitutions() {
        return professionalInstitutions;
    }

    public void setProfessionalInstitutions(String professionalInstitutions) {
        this.professionalInstitutions = professionalInstitutions;
    }

    public long getProfessionalInstitutionsExpire() {
        return professionalInstitutionsExpire;
    }

    public void setProfessionalInstitutionsExpire(long professionalInstitutionsExpire) {
        this.professionalInstitutionsExpire = professionalInstitutionsExpire;
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

    public Integer getPaichusuoCheckerId() {
        return paichusuoCheckerId;
    }

    public void setPaichusuoCheckerId(Integer paichusuoCheckerId) {
        this.paichusuoCheckerId = paichusuoCheckerId;
    }

    public String getPaichusuoCheckerOpinion() {
        return paichusuoCheckerOpinion;
    }

    public void setPaichusuoCheckerOpinion(String paichusuoCheckerOpinion) {
        this.paichusuoCheckerOpinion = paichusuoCheckerOpinion;
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

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public long getPassTime() {
        return passTime;
    }

    public void setPassTime(long passTime) {
        this.passTime = passTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
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

    public Integer getLockType() {
        return lockType;
    }

    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

    public Integer getSuoding() {
        return suoding;
    }

    public void setSuoding(Integer suoding) {
        this.suoding = suoding;
    }

    public long getCompanyCheckTime() {
        return companyCheckTime;
    }

    public void setCompanyCheckTime(long companyCheckTime) {
        this.companyCheckTime = companyCheckTime;
    }

    public long getPaichusuoCheckTime() {
        return paichusuoCheckTime;
    }

    public void setPaichusuoCheckTime(long paichusuoCheckTime) {
        this.paichusuoCheckTime = paichusuoCheckTime;
    }

    public long getPoliceCheckTime() {
        return policeCheckTime;
    }

    public void setPoliceCheckTime(long policeCheckTime) {
        this.policeCheckTime = policeCheckTime;
    }

    public String getCompanyCheckName() {
        return companyCheckName;
    }

    public void setCompanyCheckName(String companyCheckName) {
        this.companyCheckName = companyCheckName;
    }

    public String getPaichusuoCheckName() {
        return paichusuoCheckName;
    }

    public void setPaichusuoCheckName(String paichusuoCheckName) {
        this.paichusuoCheckName = paichusuoCheckName;
    }

    public String getPoliceCheckName() {
        return policeCheckName;
    }

    public void setPoliceCheckName(String policeCheckName) {
        this.policeCheckName = policeCheckName;
    }

    public String getCompanyCheckerName() {
        return companyCheckerName;
    }

    public void setCompanyCheckerName(String companyCheckerName) {
        this.companyCheckerName = companyCheckerName;
    }

    public String getPaichusuoCheckerName() {
        return paichusuoCheckerName;
    }

    public void setPaichusuoCheckerName(String paichusuoCheckerName) {
        this.paichusuoCheckerName = paichusuoCheckerName;
    }

    public String getPoliceCheckerName() {
        return policeCheckerName;
    }

    public void setPoliceCheckerName(String policeCheckerName) {
        this.policeCheckerName = policeCheckerName;
    }
}

