package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class DanWeiBeiAnListItemInfo implements Serializable {

    /**
     * id : 10
     * classification : 2
     * unitType : 2
     * higherLevelUnit : 4
     * higherLevelUnitName : null
     * unitName : 连云港第一剧毒处理公司1
     * unitAbbr : 连剧一
     * unitPinyinAbbr : lygdyjdclgs
     * unitLocationId : 36
     * unitAddress : 连云港海州区苍梧路
     * unitId : 10
     * legalRepresentativeName : 蔡晓晓
     * legalRepresentativeIdcard : 32132211886468
     * legalRepresentativeTel : 18051945908
     * charger : 8
     * securityerName : 蔡总
     * securityerTel : 180519456
     * storageRiskLevel : 138
     * companyMemberNumber : 120
     * importAndExport : 241
     * monitors : 240
     * dutyRoomTel : 1805194590
     * monitoringCenterTel : 1585768846
     * toxicStoreAddress : 连云港
     * businessLicenseNo : GSYYZZ65586
     * businessLicenseNoExpire : 1656140085000
     * organizationalCodeCertificate : ZZJG3584
     * organizationalCodeCertificateExpire : 1750834485000
     * safetySupervision : AJBM668446
     * safetySupervisionExpire : 1750834485000
     * environmentalCertificate : HBZZ6584
     * environmentalCertificateExpire : 1750834485000
     * professionalInstitutions : ZYJGZJH6484
     * professionalInstitutionsExpire : 1750834485000
     * companyCheckerId : null
     * companyCheckerOpinion : 同意
     * paichusuoCheckerId : null
     * paichusuoCheckerOpinion : null
     * policeCheckerId : 2
     * policeCheckerOpinion : 同意了。
     * lockStatus : 0
     * applyStatus : 5
     * passTime : 0
     * createTime : 1555996374488
     * updateTime : 1555996374488
     * toxicDescription : 硫酸亚铁离子365g
     * toxicEquipment : 摄像头
     * remark :
     */

    private Integer id;
    private Integer classification;
    private Integer unitType;
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

    public Integer getSuoding() {
        return suoding;
    }

    public void setSuoding(Integer suoding) {
        this.suoding = suoding;
    }

    public Integer getLockType() {
        return lockType;
    }

    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

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

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
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
}


