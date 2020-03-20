package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
单位备案查询类
 */
public class ToxicCompany_Filter_Bean implements Serializable {


    //    @ApiModelProperty("单位id")
    private Integer unitId;

    //    @ApiModelProperty("法人名字")
    private String legalRepresentativeName;

    //    @ApiModelProperty("法人身份证号")
    private String legalRepresentativeIdcard;

    //    @ApiModelProperty("法人电话")
    private String legalRepresentativeTel;

    //    @ApiModelProperty("操作人")
    private String charger;

    //    @ApiModelProperty("安全员姓名")
    private String securityerName;

    //    @ApiModelProperty("安全员电话")
    private String securityerTel;

    //    @ApiModelProperty(value = "存储风险等级", dataType = "int")
    private Integer storageRiskLevel;

    //     @ApiModelProperty("企业从业人数")
    private Integer companyMemberNumber;

    //     @ApiModelProperty("是否涉及进出口")
    private Integer importAndExport;

    //    @ApiModelProperty("是否有监控")
    private Integer monitors;

    //    @ApiModelProperty("值班室电话")
    private String dutyRoomTel;

    //    @ApiModelProperty("监控中心电话")
    private String monitoringCenterTel;

    //    @ApiModelProperty("剧毒存放地址")
    private String toxicStoreAddress;

    //    @ApiModelProperty("工商证编号")
    private String businessLicenseNo;

    //    @ApiModelProperty("工商证过期时间")
    private Long businessLicenseNoExpire;

    //    @ApiModelProperty("组织机构证号")
    private String organizationalCodeCertificate;

    //    @ApiModelProperty("组织机构正过期时间")
    private Long organizationalCodeCertificateExpire;

    //    @ApiModelProperty("安保证书")
    private String safetySupervision;

    //    @ApiModelProperty("安保证过期时间")
    private Long safetySupervisionExpire;

    //    @ApiModelProperty("环保证")
    private String environmentalCertificate;

    //    @ApiModelProperty("环保证过期时间")
    private Long environmentalCertificateExpire;

    //    @ApiModelProperty("专业设备证书")
    private String professionalInstitutions;

    //    @ApiModelProperty("专业设备过期时间")
    private Long professionalInstitutionsExpire;

    //    @ApiModelProperty("单位审查人id")
    private Integer companyCheckerId;

    //    @ApiModelProperty("单位审查人意见")
    private String companyCheckerOpinion;

    //    @ApiModelProperty("派出所审查人id")
    private Integer paichusuoCheckerId;

    //    @ApiModelProperty("派出所审查人意见")
    private String paichusuoCheckerOpinion;

    //     @ApiModelProperty("公安审查人id")
    private Integer policeCheckerId;

    //    @ApiModelProperty("公安审查人意见")
    private String policeCheckerOpinion;

    //    @ApiModelProperty("单位锁定状态")
    private Integer lockStatus;

    //    @ApiModelProperty("申请状态")
    private Integer applyStatus;

    //    @ApiModelProperty("申请通过时间")
    private Long passTime;

    //    @ApiModelProperty("数据创建时间")
    private Long createTime;

    //    @ApiModelProperty("数据更新时间")
    private Long updateTime;

    //    @ApiModelProperty("锁定类型")
    private Integer lockType;

    //    @ApiModelProperty("单位类型")
    private Integer unitType;


    /**
     * 中爆数据对接之后添加的字段
     */

//    @ApiModelProperty("数据来源，1：系统录入，2：接口获得")
    private Integer dataSource;

    //    @ApiModelProperty("单位备案id")
    private String dwbaId;

    //    @ApiModelProperty("单位id")
    private String compId;

    //    @ApiModelProperty("单位名称")
    private String compName;

    //    @ApiModelProperty("单位编码")
    private String compCode;

    //    @ApiModelProperty("法人证件类型，1、身份证 2、其它证件")
    private String dwbaArenzjlx;

    //    @ApiModelProperty("法人手机号")
    private String dwbaShoujihaoma;

    //    @ApiModelProperty("备案登记申办人姓名")
    private String dwbaShengbanren;

    //    @ApiModelProperty("申办人证件类型，1、身份证 2、其它证件")
    private String dwbaShengbanrenzjlx;

    //    @ApiModelProperty("申办人证件号码")
    private String dwbaShengbanrenzjhm;

    //    @ApiModelProperty("申办人电话号码")
    private String dwbaShengbanrendhhm;

    //    @ApiModelProperty("申办人手机号码")
    private String dwbaShengbanrensjhm;

    //    @ApiModelProperty("是否涉及出入库境，1、是 2、否")
    private String dwbaChurujing;

    //    @ApiModelProperty("是否安装监控，1、是 2、否")
    private String dwbaJiankong;

    //    @ApiModelProperty("业务类型 1是剧毒备案,2是易制爆备案")
    private Integer leixing;

    //    @ApiModelProperty("备案登记时间")
    private String dwbaDengjishijian;

    //    @ApiModelProperty("备案修改时间")
    private String dwbaUpdatetime;

    //    @ApiModelProperty("备案通过时间")
    private String dwbaTongguoshijian;

    //    @ApiModelProperty("审核流程状态")
    private String notpass;

    //    @ApiModelProperty("备案状态 0未备案，1已备案")
    private Integer state;

    //    @ApiModelProperty("备案进度，1为填写基本信息 2为填写物品信息 3为上传附件信息 4为添加备案人员信息 5为递交审核 6进入公安审批")
    private Integer dwbaJindu;

    //    @ApiModelProperty("变更版本号，0-N，代表第几次变更了")
    private Integer version;

    //    @ApiModelProperty("变更状态，1为未变更或变更完成  -1为申请变更了但未递交审核 0为已递交审核")
    private Integer bgState;

    //    @ApiModelProperty("危险化学品仓库数量")
    private Integer cangku;

    //    @ApiModelProperty("库容量")
    private Float kurongliang;

    //    @ApiModelProperty("治安保卫人员人数，0表示没有，大于0表示有、且记录具体数量")
    private Integer zaNum;

    //    @ApiModelProperty("是否有报警装置，0表示没有，1表示有")
    private Integer bj;

    //    @ApiModelProperty("剧毒化学品经营范围描述")
    private String toxicDescription;

    //    @ApiModelProperty("剧毒化学品储存设备及安保措施")
    private String toxicEquipment;

    //    @ApiModelProperty("备注")
    private String remark;

    //    @ApiModelProperty("生产、经营、 储存、使用、销毁 剧毒易制爆的品名、数量")
    private String dwbaBeizhu1;

    //    @ApiModelProperty("储存设施 及 安全保卫措施")
    private String dwbaBeizhu2;

    //    @ApiModelProperty("备注")
    private String dwbaBeizhu3;

    //    @ApiModelProperty("是否可直接购买，0 需要 1不需要")
    private String dwbaBeizhu4;

    //    @ApiModelProperty("安全责任人电话")
    private String dwbaBeizhu5;

    //    @ApiModelProperty("是否申请备案延期变更")
    private String dwbaBeizhu6;

    //    @ApiModelProperty("单位地址")
    private String dwbaBeizhu7;

    //    @ApiModelProperty("存放风险等级")
    private String dwbaBeizhu8;

    //    @ApiModelProperty("公安为自行购买单位发放的购买凭证纸发放数")
    private String dwbaBeizhu9;

    //    @ApiModelProperty("企业简称,用于购买许可证")
    private String dwbaBeizhu10;

    //    @ApiModelProperty("筛选条件，锁定")
    private Integer suoding;

//    @ApiModelProperty("筛选条件，注销")
    private Integer zhuxiao;

    public Integer getZhuxiao() {
        return zhuxiao;
    }

    public void setZhuxiao(Integer zhuxiao) {
        this.zhuxiao = zhuxiao;
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

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
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

    public Long getPassTime() {
        return passTime;
    }

    public void setPassTime(Long passTime) {
        this.passTime = passTime;
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

    public Integer getLockType() {
        return lockType;
    }

    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public String getDwbaId() {
        return dwbaId;
    }

    public void setDwbaId(String dwbaId) {
        this.dwbaId = dwbaId;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getDwbaArenzjlx() {
        return dwbaArenzjlx;
    }

    public void setDwbaArenzjlx(String dwbaArenzjlx) {
        this.dwbaArenzjlx = dwbaArenzjlx;
    }

    public String getDwbaShoujihaoma() {
        return dwbaShoujihaoma;
    }

    public void setDwbaShoujihaoma(String dwbaShoujihaoma) {
        this.dwbaShoujihaoma = dwbaShoujihaoma;
    }

    public String getDwbaShengbanren() {
        return dwbaShengbanren;
    }

    public void setDwbaShengbanren(String dwbaShengbanren) {
        this.dwbaShengbanren = dwbaShengbanren;
    }

    public String getDwbaShengbanrenzjlx() {
        return dwbaShengbanrenzjlx;
    }

    public void setDwbaShengbanrenzjlx(String dwbaShengbanrenzjlx) {
        this.dwbaShengbanrenzjlx = dwbaShengbanrenzjlx;
    }

    public String getDwbaShengbanrenzjhm() {
        return dwbaShengbanrenzjhm;
    }

    public void setDwbaShengbanrenzjhm(String dwbaShengbanrenzjhm) {
        this.dwbaShengbanrenzjhm = dwbaShengbanrenzjhm;
    }

    public String getDwbaShengbanrendhhm() {
        return dwbaShengbanrendhhm;
    }

    public void setDwbaShengbanrendhhm(String dwbaShengbanrendhhm) {
        this.dwbaShengbanrendhhm = dwbaShengbanrendhhm;
    }

    public String getDwbaShengbanrensjhm() {
        return dwbaShengbanrensjhm;
    }

    public void setDwbaShengbanrensjhm(String dwbaShengbanrensjhm) {
        this.dwbaShengbanrensjhm = dwbaShengbanrensjhm;
    }

    public String getDwbaChurujing() {
        return dwbaChurujing;
    }

    public void setDwbaChurujing(String dwbaChurujing) {
        this.dwbaChurujing = dwbaChurujing;
    }

    public String getDwbaJiankong() {
        return dwbaJiankong;
    }

    public void setDwbaJiankong(String dwbaJiankong) {
        this.dwbaJiankong = dwbaJiankong;
    }

    public Integer getLeixing() {
        return leixing;
    }

    public void setLeixing(Integer leixing) {
        this.leixing = leixing;
    }

    public String getDwbaDengjishijian() {
        return dwbaDengjishijian;
    }

    public void setDwbaDengjishijian(String dwbaDengjishijian) {
        this.dwbaDengjishijian = dwbaDengjishijian;
    }

    public String getDwbaUpdatetime() {
        return dwbaUpdatetime;
    }

    public void setDwbaUpdatetime(String dwbaUpdatetime) {
        this.dwbaUpdatetime = dwbaUpdatetime;
    }

    public String getDwbaTongguoshijian() {
        return dwbaTongguoshijian;
    }

    public void setDwbaTongguoshijian(String dwbaTongguoshijian) {
        this.dwbaTongguoshijian = dwbaTongguoshijian;
    }

    public String getNotpass() {
        return notpass;
    }

    public void setNotpass(String notpass) {
        this.notpass = notpass;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDwbaJindu() {
        return dwbaJindu;
    }

    public void setDwbaJindu(Integer dwbaJindu) {
        this.dwbaJindu = dwbaJindu;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getBgState() {
        return bgState;
    }

    public void setBgState(Integer bgState) {
        this.bgState = bgState;
    }

    public Integer getCangku() {
        return cangku;
    }

    public void setCangku(Integer cangku) {
        this.cangku = cangku;
    }

    public Float getKurongliang() {
        return kurongliang;
    }

    public void setKurongliang(Float kurongliang) {
        this.kurongliang = kurongliang;
    }

    public Integer getZaNum() {
        return zaNum;
    }

    public void setZaNum(Integer zaNum) {
        this.zaNum = zaNum;
    }

    public Integer getBj() {
        return bj;
    }

    public void setBj(Integer bj) {
        this.bj = bj;
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

    public String getDwbaBeizhu1() {
        return dwbaBeizhu1;
    }

    public void setDwbaBeizhu1(String dwbaBeizhu1) {
        this.dwbaBeizhu1 = dwbaBeizhu1;
    }

    public String getDwbaBeizhu2() {
        return dwbaBeizhu2;
    }

    public void setDwbaBeizhu2(String dwbaBeizhu2) {
        this.dwbaBeizhu2 = dwbaBeizhu2;
    }

    public String getDwbaBeizhu3() {
        return dwbaBeizhu3;
    }

    public void setDwbaBeizhu3(String dwbaBeizhu3) {
        this.dwbaBeizhu3 = dwbaBeizhu3;
    }

    public String getDwbaBeizhu4() {
        return dwbaBeizhu4;
    }

    public void setDwbaBeizhu4(String dwbaBeizhu4) {
        this.dwbaBeizhu4 = dwbaBeizhu4;
    }

    public String getDwbaBeizhu5() {
        return dwbaBeizhu5;
    }

    public void setDwbaBeizhu5(String dwbaBeizhu5) {
        this.dwbaBeizhu5 = dwbaBeizhu5;
    }

    public String getDwbaBeizhu6() {
        return dwbaBeizhu6;
    }

    public void setDwbaBeizhu6(String dwbaBeizhu6) {
        this.dwbaBeizhu6 = dwbaBeizhu6;
    }

    public String getDwbaBeizhu7() {
        return dwbaBeizhu7;
    }

    public void setDwbaBeizhu7(String dwbaBeizhu7) {
        this.dwbaBeizhu7 = dwbaBeizhu7;
    }

    public String getDwbaBeizhu8() {
        return dwbaBeizhu8;
    }

    public void setDwbaBeizhu8(String dwbaBeizhu8) {
        this.dwbaBeizhu8 = dwbaBeizhu8;
    }

    public String getDwbaBeizhu9() {
        return dwbaBeizhu9;
    }

    public void setDwbaBeizhu9(String dwbaBeizhu9) {
        this.dwbaBeizhu9 = dwbaBeizhu9;
    }

    public String getDwbaBeizhu10() {
        return dwbaBeizhu10;
    }

    public void setDwbaBeizhu10(String dwbaBeizhu10) {
        this.dwbaBeizhu10 = dwbaBeizhu10;
    }

    public Integer getSuoding() {
        return suoding;
    }

    public void setSuoding(Integer suoding) {
        this.suoding = suoding;
    }
}
