package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class BeforeAfterChange_Info implements Serializable {

    /**
     * change : {"superiorPcs":null,"superiorFj":null,"id":null,"unitId":null,"legalRepresentativeName":"蔡健雅3","legalRepresentativeIdcard":"123456678","legalRepresentativeTel":null,"charger":null,"securityerName":null,"securityerTel":null,"storageRiskLevel":138,"companyMemberNumber":null,"importAndExport":241,"monitors":240,"dutyRoomTel":null,"monitoringCenterTel":null,"toxicStoreAddress":null,"businessLicenseNo":null,"businessLicenseNoExpire":1568649600000,"organizationalCodeCertificate":null,"organizationalCodeCertificateExpire":null,"safetySupervision":null,"safetySupervisionExpire":null,"environmentalCertificate":null,"environmentalCertificateExpire":null,"professionalInstitutions":null,"professionalInstitutionsExpire":null,"lockStatus":null,"applyStatus":null,"passTime":null,"createTime":null,"updateTime":null,"lockType":null,"unitType":null,"dataSource":null,"dwbaId":null,"compId":null,"compName":null,"compCode":null,"dwbaArenzjlx":null,"dwbaShoujihaoma":null,"dwbaShengbanren":null,"dwbaShengbanrenzjlx":null,"dwbaShengbanrenzjhm":null,"dwbaShengbanrendhhm":null,"dwbaShengbanrensjhm":null,"dwbaChurujing":null,"dwbaJiankong":null,"leixing":null,"dwbaDengjishijian":null,"dwbaUpdatetime":null,"dwbaTongguoshijian":null,"notpass":null,"state":null,"dwbaJindu":null,"version":null,"bgState":null,"cangku":null,"kurongliang":null,"zaNum":null,"bj":null,"toxicDescription":null,"toxicEquipment":null,"remark":null,"dwbaBeizhu1":null,"dwbaBeizhu2":null,"dwbaBeizhu3":null,"dwbaBeizhu4":null,"dwbaBeizhu5":null,"dwbaBeizhu6":null,"dwbaBeizhu7":null,"dwbaBeizhu8":null,"dwbaBeizhu9":null,"dwbaBeizhu10":null,"suoding":null,"zhuxiao":null,"oldId":null}
     * history : {"superiorPcs":null,"superiorFj":null,"id":1,"unitId":10,"legalRepresentativeName":"蔡健雅","legalRepresentativeIdcard":"GDGD22455","legalRepresentativeTel":"1859555452458","charger":"8","securityerName":"蔡文姬","securityerTel":"1805194589","storageRiskLevel":140,"companyMemberNumber":200,"importAndExport":241,"monitors":241,"dutyRoomTel":"1805194580","monitoringCenterTel":"1805194584055","toxicStoreAddress":"连云港","businessLicenseNo":"GS24585","businessLicenseNoExpire":1562138814000,"organizationalCodeCertificate":"ZZJG2855","organizationalCodeCertificateExpire":1562138814000,"safetySupervision":"YFH5556","safetySupervisionExpire":1562138814000,"environmentalCertificate":"HB5556","environmentalCertificateExpire":1562138814000,"professionalInstitutions":"ZYHF55545","professionalInstitutionsExpire":1562138814000,"lockStatus":0,"applyStatus":5,"passTime":1570608823725,"createTime":1562139215958,"updateTime":1571204430541,"lockType":null,"unitType":null,"dataSource":null,"dwbaId":null,"compId":null,"compName":null,"compCode":null,"dwbaArenzjlx":null,"dwbaShoujihaoma":null,"dwbaShengbanren":null,"dwbaShengbanrenzjlx":null,"dwbaShengbanrenzjhm":null,"dwbaShengbanrendhhm":null,"dwbaShengbanrensjhm":null,"dwbaChurujing":null,"dwbaJiankong":null,"leixing":null,"dwbaDengjishijian":null,"dwbaUpdatetime":null,"dwbaTongguoshijian":null,"notpass":null,"state":null,"dwbaJindu":null,"version":null,"bgState":null,"cangku":null,"kurongliang":null,"zaNum":null,"bj":null,"toxicDescription":"这是描述","toxicEquipment":"这是设施","remark":"这是备注","dwbaBeizhu1":null,"dwbaBeizhu2":null,"dwbaBeizhu3":null,"dwbaBeizhu4":null,"dwbaBeizhu5":null,"dwbaBeizhu6":null,"dwbaBeizhu7":null,"dwbaBeizhu8":null,"dwbaBeizhu9":null,"dwbaBeizhu10":null,"suoding":null,"zhuxiao":null,"oldId":99}
     */

    private ChangeBean change;
    private HistoryBean history;

    public ChangeBean getChange() {
        return change;
    }

    public void setChange(ChangeBean change) {
        this.change = change;
    }

    public HistoryBean getHistory() {
        return history;
    }

    public void setHistory(HistoryBean history) {
        this.history = history;
    }

    public static class ChangeBean {
        /**
         * superiorPcs : null
         * superiorFj : null
         * id : null
         * unitId : null
         * legalRepresentativeName : 蔡健雅3
         * legalRepresentativeIdcard : 123456678
         * legalRepresentativeTel : null
         * charger : null
         * securityerName : null
         * securityerTel : null
         * storageRiskLevel : 138
         * companyMemberNumber : null
         * importAndExport : 241
         * monitors : 240
         * dutyRoomTel : null
         * monitoringCenterTel : null
         * toxicStoreAddress : null
         * businessLicenseNo : null
         * businessLicenseNoExpire : 1568649600000
         * organizationalCodeCertificate : null
         * organizationalCodeCertificateExpire : null
         * safetySupervision : null
         * safetySupervisionExpire : null
         * environmentalCertificate : null
         * environmentalCertificateExpire : null
         * professionalInstitutions : null
         * professionalInstitutionsExpire : null
         * lockStatus : null
         * applyStatus : null
         * passTime : null
         * createTime : null
         * updateTime : null
         * lockType : null
         * unitType : null
         * dataSource : null
         * dwbaId : null
         * compId : null
         * compName : null
         * compCode : null
         * dwbaArenzjlx : null
         * dwbaShoujihaoma : null
         * dwbaShengbanren : null
         * dwbaShengbanrenzjlx : null
         * dwbaShengbanrenzjhm : null
         * dwbaShengbanrendhhm : null
         * dwbaShengbanrensjhm : null
         * dwbaChurujing : null
         * dwbaJiankong : null
         * leixing : null
         * dwbaDengjishijian : null
         * dwbaUpdatetime : null
         * dwbaTongguoshijian : null
         * notpass : null
         * state : null
         * dwbaJindu : null
         * version : null
         * bgState : null
         * cangku : null
         * kurongliang : null
         * zaNum : null
         * bj : null
         * toxicDescription : null
         * toxicEquipment : null
         * remark : null
         * dwbaBeizhu1 : null
         * dwbaBeizhu2 : null
         * dwbaBeizhu3 : null
         * dwbaBeizhu4 : null
         * dwbaBeizhu5 : null
         * dwbaBeizhu6 : null
         * dwbaBeizhu7 : null
         * dwbaBeizhu8 : null
         * dwbaBeizhu9 : null
         * dwbaBeizhu10 : null
         * suoding : null
         * zhuxiao : null
         * oldId : null
         */

        private Object superiorPcs;
        private Object superiorFj;
        private Object id;
        private Object unitId;
        private String legalRepresentativeName;
        private String legalRepresentativeIdcard;
        private Object legalRepresentativeTel;
        private Object charger;
        private Object securityerName;
        private Object securityerTel;
        private int storageRiskLevel;
        private Object companyMemberNumber;
        private int importAndExport;
        private int monitors;
        private Object dutyRoomTel;
        private Object monitoringCenterTel;
        private Object toxicStoreAddress;
        private Object businessLicenseNo;
        private long businessLicenseNoExpire;
        private Object organizationalCodeCertificate;
        private Object organizationalCodeCertificateExpire;
        private Object safetySupervision;
        private Object safetySupervisionExpire;
        private Object environmentalCertificate;
        private Object environmentalCertificateExpire;
        private Object professionalInstitutions;
        private Object professionalInstitutionsExpire;
        private Object lockStatus;
        private Object applyStatus;
        private Object passTime;
        private Object createTime;
        private Object updateTime;
        private Object lockType;
        private Object unitType;
        private Object dataSource;
        private Object dwbaId;
        private Object compId;
        private Object compName;
        private Object compCode;
        private Object dwbaArenzjlx;
        private Object dwbaShoujihaoma;
        private Object dwbaShengbanren;
        private Object dwbaShengbanrenzjlx;
        private Object dwbaShengbanrenzjhm;
        private Object dwbaShengbanrendhhm;
        private Object dwbaShengbanrensjhm;
        private Object dwbaChurujing;
        private Object dwbaJiankong;
        private Object leixing;
        private Object dwbaDengjishijian;
        private Object dwbaUpdatetime;
        private Object dwbaTongguoshijian;
        private Object notpass;
        private Object state;
        private Object dwbaJindu;
        private Object version;
        private Object bgState;
        private Object cangku;
        private Object kurongliang;
        private Object zaNum;
        private Object bj;
        private Object toxicDescription;
        private Object toxicEquipment;
        private Object remark;
        private Object dwbaBeizhu1;
        private Object dwbaBeizhu2;
        private Object dwbaBeizhu3;
        private Object dwbaBeizhu4;
        private Object dwbaBeizhu5;
        private Object dwbaBeizhu6;
        private Object dwbaBeizhu7;
        private Object dwbaBeizhu8;
        private Object dwbaBeizhu9;
        private Object dwbaBeizhu10;
        private Object suoding;
        private Object zhuxiao;
        private Object oldId;

        public Object getSuperiorPcs() {
            return superiorPcs;
        }

        public void setSuperiorPcs(Object superiorPcs) {
            this.superiorPcs = superiorPcs;
        }

        public Object getSuperiorFj() {
            return superiorFj;
        }

        public void setSuperiorFj(Object superiorFj) {
            this.superiorFj = superiorFj;
        }

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public Object getUnitId() {
            return unitId;
        }

        public void setUnitId(Object unitId) {
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

        public Object getLegalRepresentativeTel() {
            return legalRepresentativeTel;
        }

        public void setLegalRepresentativeTel(Object legalRepresentativeTel) {
            this.legalRepresentativeTel = legalRepresentativeTel;
        }

        public Object getCharger() {
            return charger;
        }

        public void setCharger(Object charger) {
            this.charger = charger;
        }

        public Object getSecurityerName() {
            return securityerName;
        }

        public void setSecurityerName(Object securityerName) {
            this.securityerName = securityerName;
        }

        public Object getSecurityerTel() {
            return securityerTel;
        }

        public void setSecurityerTel(Object securityerTel) {
            this.securityerTel = securityerTel;
        }

        public int getStorageRiskLevel() {
            return storageRiskLevel;
        }

        public void setStorageRiskLevel(int storageRiskLevel) {
            this.storageRiskLevel = storageRiskLevel;
        }

        public Object getCompanyMemberNumber() {
            return companyMemberNumber;
        }

        public void setCompanyMemberNumber(Object companyMemberNumber) {
            this.companyMemberNumber = companyMemberNumber;
        }

        public int getImportAndExport() {
            return importAndExport;
        }

        public void setImportAndExport(int importAndExport) {
            this.importAndExport = importAndExport;
        }

        public int getMonitors() {
            return monitors;
        }

        public void setMonitors(int monitors) {
            this.monitors = monitors;
        }

        public Object getDutyRoomTel() {
            return dutyRoomTel;
        }

        public void setDutyRoomTel(Object dutyRoomTel) {
            this.dutyRoomTel = dutyRoomTel;
        }

        public Object getMonitoringCenterTel() {
            return monitoringCenterTel;
        }

        public void setMonitoringCenterTel(Object monitoringCenterTel) {
            this.monitoringCenterTel = monitoringCenterTel;
        }

        public Object getToxicStoreAddress() {
            return toxicStoreAddress;
        }

        public void setToxicStoreAddress(Object toxicStoreAddress) {
            this.toxicStoreAddress = toxicStoreAddress;
        }

        public Object getBusinessLicenseNo() {
            return businessLicenseNo;
        }

        public void setBusinessLicenseNo(Object businessLicenseNo) {
            this.businessLicenseNo = businessLicenseNo;
        }

        public long getBusinessLicenseNoExpire() {
            return businessLicenseNoExpire;
        }

        public void setBusinessLicenseNoExpire(long businessLicenseNoExpire) {
            this.businessLicenseNoExpire = businessLicenseNoExpire;
        }

        public Object getOrganizationalCodeCertificate() {
            return organizationalCodeCertificate;
        }

        public void setOrganizationalCodeCertificate(Object organizationalCodeCertificate) {
            this.organizationalCodeCertificate = organizationalCodeCertificate;
        }

        public Object getOrganizationalCodeCertificateExpire() {
            return organizationalCodeCertificateExpire;
        }

        public void setOrganizationalCodeCertificateExpire(Object organizationalCodeCertificateExpire) {
            this.organizationalCodeCertificateExpire = organizationalCodeCertificateExpire;
        }

        public Object getSafetySupervision() {
            return safetySupervision;
        }

        public void setSafetySupervision(Object safetySupervision) {
            this.safetySupervision = safetySupervision;
        }

        public Object getSafetySupervisionExpire() {
            return safetySupervisionExpire;
        }

        public void setSafetySupervisionExpire(Object safetySupervisionExpire) {
            this.safetySupervisionExpire = safetySupervisionExpire;
        }

        public Object getEnvironmentalCertificate() {
            return environmentalCertificate;
        }

        public void setEnvironmentalCertificate(Object environmentalCertificate) {
            this.environmentalCertificate = environmentalCertificate;
        }

        public Object getEnvironmentalCertificateExpire() {
            return environmentalCertificateExpire;
        }

        public void setEnvironmentalCertificateExpire(Object environmentalCertificateExpire) {
            this.environmentalCertificateExpire = environmentalCertificateExpire;
        }

        public Object getProfessionalInstitutions() {
            return professionalInstitutions;
        }

        public void setProfessionalInstitutions(Object professionalInstitutions) {
            this.professionalInstitutions = professionalInstitutions;
        }

        public Object getProfessionalInstitutionsExpire() {
            return professionalInstitutionsExpire;
        }

        public void setProfessionalInstitutionsExpire(Object professionalInstitutionsExpire) {
            this.professionalInstitutionsExpire = professionalInstitutionsExpire;
        }

        public Object getLockStatus() {
            return lockStatus;
        }

        public void setLockStatus(Object lockStatus) {
            this.lockStatus = lockStatus;
        }

        public Object getApplyStatus() {
            return applyStatus;
        }

        public void setApplyStatus(Object applyStatus) {
            this.applyStatus = applyStatus;
        }

        public Object getPassTime() {
            return passTime;
        }

        public void setPassTime(Object passTime) {
            this.passTime = passTime;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public Object getLockType() {
            return lockType;
        }

        public void setLockType(Object lockType) {
            this.lockType = lockType;
        }

        public Object getUnitType() {
            return unitType;
        }

        public void setUnitType(Object unitType) {
            this.unitType = unitType;
        }

        public Object getDataSource() {
            return dataSource;
        }

        public void setDataSource(Object dataSource) {
            this.dataSource = dataSource;
        }

        public Object getDwbaId() {
            return dwbaId;
        }

        public void setDwbaId(Object dwbaId) {
            this.dwbaId = dwbaId;
        }

        public Object getCompId() {
            return compId;
        }

        public void setCompId(Object compId) {
            this.compId = compId;
        }

        public Object getCompName() {
            return compName;
        }

        public void setCompName(Object compName) {
            this.compName = compName;
        }

        public Object getCompCode() {
            return compCode;
        }

        public void setCompCode(Object compCode) {
            this.compCode = compCode;
        }

        public Object getDwbaArenzjlx() {
            return dwbaArenzjlx;
        }

        public void setDwbaArenzjlx(Object dwbaArenzjlx) {
            this.dwbaArenzjlx = dwbaArenzjlx;
        }

        public Object getDwbaShoujihaoma() {
            return dwbaShoujihaoma;
        }

        public void setDwbaShoujihaoma(Object dwbaShoujihaoma) {
            this.dwbaShoujihaoma = dwbaShoujihaoma;
        }

        public Object getDwbaShengbanren() {
            return dwbaShengbanren;
        }

        public void setDwbaShengbanren(Object dwbaShengbanren) {
            this.dwbaShengbanren = dwbaShengbanren;
        }

        public Object getDwbaShengbanrenzjlx() {
            return dwbaShengbanrenzjlx;
        }

        public void setDwbaShengbanrenzjlx(Object dwbaShengbanrenzjlx) {
            this.dwbaShengbanrenzjlx = dwbaShengbanrenzjlx;
        }

        public Object getDwbaShengbanrenzjhm() {
            return dwbaShengbanrenzjhm;
        }

        public void setDwbaShengbanrenzjhm(Object dwbaShengbanrenzjhm) {
            this.dwbaShengbanrenzjhm = dwbaShengbanrenzjhm;
        }

        public Object getDwbaShengbanrendhhm() {
            return dwbaShengbanrendhhm;
        }

        public void setDwbaShengbanrendhhm(Object dwbaShengbanrendhhm) {
            this.dwbaShengbanrendhhm = dwbaShengbanrendhhm;
        }

        public Object getDwbaShengbanrensjhm() {
            return dwbaShengbanrensjhm;
        }

        public void setDwbaShengbanrensjhm(Object dwbaShengbanrensjhm) {
            this.dwbaShengbanrensjhm = dwbaShengbanrensjhm;
        }

        public Object getDwbaChurujing() {
            return dwbaChurujing;
        }

        public void setDwbaChurujing(Object dwbaChurujing) {
            this.dwbaChurujing = dwbaChurujing;
        }

        public Object getDwbaJiankong() {
            return dwbaJiankong;
        }

        public void setDwbaJiankong(Object dwbaJiankong) {
            this.dwbaJiankong = dwbaJiankong;
        }

        public Object getLeixing() {
            return leixing;
        }

        public void setLeixing(Object leixing) {
            this.leixing = leixing;
        }

        public Object getDwbaDengjishijian() {
            return dwbaDengjishijian;
        }

        public void setDwbaDengjishijian(Object dwbaDengjishijian) {
            this.dwbaDengjishijian = dwbaDengjishijian;
        }

        public Object getDwbaUpdatetime() {
            return dwbaUpdatetime;
        }

        public void setDwbaUpdatetime(Object dwbaUpdatetime) {
            this.dwbaUpdatetime = dwbaUpdatetime;
        }

        public Object getDwbaTongguoshijian() {
            return dwbaTongguoshijian;
        }

        public void setDwbaTongguoshijian(Object dwbaTongguoshijian) {
            this.dwbaTongguoshijian = dwbaTongguoshijian;
        }

        public Object getNotpass() {
            return notpass;
        }

        public void setNotpass(Object notpass) {
            this.notpass = notpass;
        }

        public Object getState() {
            return state;
        }

        public void setState(Object state) {
            this.state = state;
        }

        public Object getDwbaJindu() {
            return dwbaJindu;
        }

        public void setDwbaJindu(Object dwbaJindu) {
            this.dwbaJindu = dwbaJindu;
        }

        public Object getVersion() {
            return version;
        }

        public void setVersion(Object version) {
            this.version = version;
        }

        public Object getBgState() {
            return bgState;
        }

        public void setBgState(Object bgState) {
            this.bgState = bgState;
        }

        public Object getCangku() {
            return cangku;
        }

        public void setCangku(Object cangku) {
            this.cangku = cangku;
        }

        public Object getKurongliang() {
            return kurongliang;
        }

        public void setKurongliang(Object kurongliang) {
            this.kurongliang = kurongliang;
        }

        public Object getZaNum() {
            return zaNum;
        }

        public void setZaNum(Object zaNum) {
            this.zaNum = zaNum;
        }

        public Object getBj() {
            return bj;
        }

        public void setBj(Object bj) {
            this.bj = bj;
        }

        public Object getToxicDescription() {
            return toxicDescription;
        }

        public void setToxicDescription(Object toxicDescription) {
            this.toxicDescription = toxicDescription;
        }

        public Object getToxicEquipment() {
            return toxicEquipment;
        }

        public void setToxicEquipment(Object toxicEquipment) {
            this.toxicEquipment = toxicEquipment;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public Object getDwbaBeizhu1() {
            return dwbaBeizhu1;
        }

        public void setDwbaBeizhu1(Object dwbaBeizhu1) {
            this.dwbaBeizhu1 = dwbaBeizhu1;
        }

        public Object getDwbaBeizhu2() {
            return dwbaBeizhu2;
        }

        public void setDwbaBeizhu2(Object dwbaBeizhu2) {
            this.dwbaBeizhu2 = dwbaBeizhu2;
        }

        public Object getDwbaBeizhu3() {
            return dwbaBeizhu3;
        }

        public void setDwbaBeizhu3(Object dwbaBeizhu3) {
            this.dwbaBeizhu3 = dwbaBeizhu3;
        }

        public Object getDwbaBeizhu4() {
            return dwbaBeizhu4;
        }

        public void setDwbaBeizhu4(Object dwbaBeizhu4) {
            this.dwbaBeizhu4 = dwbaBeizhu4;
        }

        public Object getDwbaBeizhu5() {
            return dwbaBeizhu5;
        }

        public void setDwbaBeizhu5(Object dwbaBeizhu5) {
            this.dwbaBeizhu5 = dwbaBeizhu5;
        }

        public Object getDwbaBeizhu6() {
            return dwbaBeizhu6;
        }

        public void setDwbaBeizhu6(Object dwbaBeizhu6) {
            this.dwbaBeizhu6 = dwbaBeizhu6;
        }

        public Object getDwbaBeizhu7() {
            return dwbaBeizhu7;
        }

        public void setDwbaBeizhu7(Object dwbaBeizhu7) {
            this.dwbaBeizhu7 = dwbaBeizhu7;
        }

        public Object getDwbaBeizhu8() {
            return dwbaBeizhu8;
        }

        public void setDwbaBeizhu8(Object dwbaBeizhu8) {
            this.dwbaBeizhu8 = dwbaBeizhu8;
        }

        public Object getDwbaBeizhu9() {
            return dwbaBeizhu9;
        }

        public void setDwbaBeizhu9(Object dwbaBeizhu9) {
            this.dwbaBeizhu9 = dwbaBeizhu9;
        }

        public Object getDwbaBeizhu10() {
            return dwbaBeizhu10;
        }

        public void setDwbaBeizhu10(Object dwbaBeizhu10) {
            this.dwbaBeizhu10 = dwbaBeizhu10;
        }

        public Object getSuoding() {
            return suoding;
        }

        public void setSuoding(Object suoding) {
            this.suoding = suoding;
        }

        public Object getZhuxiao() {
            return zhuxiao;
        }

        public void setZhuxiao(Object zhuxiao) {
            this.zhuxiao = zhuxiao;
        }

        public Object getOldId() {
            return oldId;
        }

        public void setOldId(Object oldId) {
            this.oldId = oldId;
        }
    }

    public static class HistoryBean {
        /**
         * superiorPcs : null
         * superiorFj : null
         * id : 1
         * unitId : 10
         * legalRepresentativeName : 蔡健雅
         * legalRepresentativeIdcard : GDGD22455
         * legalRepresentativeTel : 1859555452458
         * charger : 8
         * securityerName : 蔡文姬
         * securityerTel : 1805194589
         * storageRiskLevel : 140
         * companyMemberNumber : 200
         * importAndExport : 241
         * monitors : 241
         * dutyRoomTel : 1805194580
         * monitoringCenterTel : 1805194584055
         * toxicStoreAddress : 连云港
         * businessLicenseNo : GS24585
         * businessLicenseNoExpire : 1562138814000
         * organizationalCodeCertificate : ZZJG2855
         * organizationalCodeCertificateExpire : 1562138814000
         * safetySupervision : YFH5556
         * safetySupervisionExpire : 1562138814000
         * environmentalCertificate : HB5556
         * environmentalCertificateExpire : 1562138814000
         * professionalInstitutions : ZYHF55545
         * professionalInstitutionsExpire : 1562138814000
         * lockStatus : 0
         * applyStatus : 5
         * passTime : 1570608823725
         * createTime : 1562139215958
         * updateTime : 1571204430541
         * lockType : null
         * unitType : null
         * dataSource : null
         * dwbaId : null
         * compId : null
         * compName : null
         * compCode : null
         * dwbaArenzjlx : null
         * dwbaShoujihaoma : null
         * dwbaShengbanren : null
         * dwbaShengbanrenzjlx : null
         * dwbaShengbanrenzjhm : null
         * dwbaShengbanrendhhm : null
         * dwbaShengbanrensjhm : null
         * dwbaChurujing : null
         * dwbaJiankong : null
         * leixing : null
         * dwbaDengjishijian : null
         * dwbaUpdatetime : null
         * dwbaTongguoshijian : null
         * notpass : null
         * state : null
         * dwbaJindu : null
         * version : null
         * bgState : null
         * cangku : null
         * kurongliang : null
         * zaNum : null
         * bj : null
         * toxicDescription : 这是描述
         * toxicEquipment : 这是设施
         * remark : 这是备注
         * dwbaBeizhu1 : null
         * dwbaBeizhu2 : null
         * dwbaBeizhu3 : null
         * dwbaBeizhu4 : null
         * dwbaBeizhu5 : null
         * dwbaBeizhu6 : null
         * dwbaBeizhu7 : null
         * dwbaBeizhu8 : null
         * dwbaBeizhu9 : null
         * dwbaBeizhu10 : null
         * suoding : null
         * zhuxiao : null
         * oldId : 99
         */

        private Object superiorPcs;
        private Object superiorFj;
        private int id;
        private int unitId;
        private String legalRepresentativeName;
        private String legalRepresentativeIdcard;
        private String legalRepresentativeTel;
        private String charger;
        private String securityerName;
        private String securityerTel;
        private int storageRiskLevel;
        private int companyMemberNumber;
        private int importAndExport;
        private int monitors;
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
        private int lockStatus;
        private int applyStatus;
        private long passTime;
        private long createTime;
        private long updateTime;
        private Object lockType;
        private Object unitType;
        private Object dataSource;
        private Object dwbaId;
        private Object compId;
        private Object compName;
        private Object compCode;
        private Object dwbaArenzjlx;
        private Object dwbaShoujihaoma;
        private Object dwbaShengbanren;
        private Object dwbaShengbanrenzjlx;
        private Object dwbaShengbanrenzjhm;
        private Object dwbaShengbanrendhhm;
        private Object dwbaShengbanrensjhm;
        private Object dwbaChurujing;
        private Object dwbaJiankong;
        private Object leixing;
        private Object dwbaDengjishijian;
        private Object dwbaUpdatetime;
        private Object dwbaTongguoshijian;
        private Object notpass;
        private Object state;
        private Object dwbaJindu;
        private Object version;
        private Object bgState;
        private Object cangku;
        private Object kurongliang;
        private Object zaNum;
        private Object bj;
        private String toxicDescription;
        private String toxicEquipment;
        private String remark;
        private Object dwbaBeizhu1;
        private Object dwbaBeizhu2;
        private Object dwbaBeizhu3;
        private Object dwbaBeizhu4;
        private Object dwbaBeizhu5;
        private Object dwbaBeizhu6;
        private Object dwbaBeizhu7;
        private Object dwbaBeizhu8;
        private Object dwbaBeizhu9;
        private Object dwbaBeizhu10;
        private Object suoding;
        private Object zhuxiao;
        private int oldId;

        public Object getSuperiorPcs() {
            return superiorPcs;
        }

        public void setSuperiorPcs(Object superiorPcs) {
            this.superiorPcs = superiorPcs;
        }

        public Object getSuperiorFj() {
            return superiorFj;
        }

        public void setSuperiorFj(Object superiorFj) {
            this.superiorFj = superiorFj;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUnitId() {
            return unitId;
        }

        public void setUnitId(int unitId) {
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

        public int getStorageRiskLevel() {
            return storageRiskLevel;
        }

        public void setStorageRiskLevel(int storageRiskLevel) {
            this.storageRiskLevel = storageRiskLevel;
        }

        public int getCompanyMemberNumber() {
            return companyMemberNumber;
        }

        public void setCompanyMemberNumber(int companyMemberNumber) {
            this.companyMemberNumber = companyMemberNumber;
        }

        public int getImportAndExport() {
            return importAndExport;
        }

        public void setImportAndExport(int importAndExport) {
            this.importAndExport = importAndExport;
        }

        public int getMonitors() {
            return monitors;
        }

        public void setMonitors(int monitors) {
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

        public int getLockStatus() {
            return lockStatus;
        }

        public void setLockStatus(int lockStatus) {
            this.lockStatus = lockStatus;
        }

        public int getApplyStatus() {
            return applyStatus;
        }

        public void setApplyStatus(int applyStatus) {
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

        public Object getLockType() {
            return lockType;
        }

        public void setLockType(Object lockType) {
            this.lockType = lockType;
        }

        public Object getUnitType() {
            return unitType;
        }

        public void setUnitType(Object unitType) {
            this.unitType = unitType;
        }

        public Object getDataSource() {
            return dataSource;
        }

        public void setDataSource(Object dataSource) {
            this.dataSource = dataSource;
        }

        public Object getDwbaId() {
            return dwbaId;
        }

        public void setDwbaId(Object dwbaId) {
            this.dwbaId = dwbaId;
        }

        public Object getCompId() {
            return compId;
        }

        public void setCompId(Object compId) {
            this.compId = compId;
        }

        public Object getCompName() {
            return compName;
        }

        public void setCompName(Object compName) {
            this.compName = compName;
        }

        public Object getCompCode() {
            return compCode;
        }

        public void setCompCode(Object compCode) {
            this.compCode = compCode;
        }

        public Object getDwbaArenzjlx() {
            return dwbaArenzjlx;
        }

        public void setDwbaArenzjlx(Object dwbaArenzjlx) {
            this.dwbaArenzjlx = dwbaArenzjlx;
        }

        public Object getDwbaShoujihaoma() {
            return dwbaShoujihaoma;
        }

        public void setDwbaShoujihaoma(Object dwbaShoujihaoma) {
            this.dwbaShoujihaoma = dwbaShoujihaoma;
        }

        public Object getDwbaShengbanren() {
            return dwbaShengbanren;
        }

        public void setDwbaShengbanren(Object dwbaShengbanren) {
            this.dwbaShengbanren = dwbaShengbanren;
        }

        public Object getDwbaShengbanrenzjlx() {
            return dwbaShengbanrenzjlx;
        }

        public void setDwbaShengbanrenzjlx(Object dwbaShengbanrenzjlx) {
            this.dwbaShengbanrenzjlx = dwbaShengbanrenzjlx;
        }

        public Object getDwbaShengbanrenzjhm() {
            return dwbaShengbanrenzjhm;
        }

        public void setDwbaShengbanrenzjhm(Object dwbaShengbanrenzjhm) {
            this.dwbaShengbanrenzjhm = dwbaShengbanrenzjhm;
        }

        public Object getDwbaShengbanrendhhm() {
            return dwbaShengbanrendhhm;
        }

        public void setDwbaShengbanrendhhm(Object dwbaShengbanrendhhm) {
            this.dwbaShengbanrendhhm = dwbaShengbanrendhhm;
        }

        public Object getDwbaShengbanrensjhm() {
            return dwbaShengbanrensjhm;
        }

        public void setDwbaShengbanrensjhm(Object dwbaShengbanrensjhm) {
            this.dwbaShengbanrensjhm = dwbaShengbanrensjhm;
        }

        public Object getDwbaChurujing() {
            return dwbaChurujing;
        }

        public void setDwbaChurujing(Object dwbaChurujing) {
            this.dwbaChurujing = dwbaChurujing;
        }

        public Object getDwbaJiankong() {
            return dwbaJiankong;
        }

        public void setDwbaJiankong(Object dwbaJiankong) {
            this.dwbaJiankong = dwbaJiankong;
        }

        public Object getLeixing() {
            return leixing;
        }

        public void setLeixing(Object leixing) {
            this.leixing = leixing;
        }

        public Object getDwbaDengjishijian() {
            return dwbaDengjishijian;
        }

        public void setDwbaDengjishijian(Object dwbaDengjishijian) {
            this.dwbaDengjishijian = dwbaDengjishijian;
        }

        public Object getDwbaUpdatetime() {
            return dwbaUpdatetime;
        }

        public void setDwbaUpdatetime(Object dwbaUpdatetime) {
            this.dwbaUpdatetime = dwbaUpdatetime;
        }

        public Object getDwbaTongguoshijian() {
            return dwbaTongguoshijian;
        }

        public void setDwbaTongguoshijian(Object dwbaTongguoshijian) {
            this.dwbaTongguoshijian = dwbaTongguoshijian;
        }

        public Object getNotpass() {
            return notpass;
        }

        public void setNotpass(Object notpass) {
            this.notpass = notpass;
        }

        public Object getState() {
            return state;
        }

        public void setState(Object state) {
            this.state = state;
        }

        public Object getDwbaJindu() {
            return dwbaJindu;
        }

        public void setDwbaJindu(Object dwbaJindu) {
            this.dwbaJindu = dwbaJindu;
        }

        public Object getVersion() {
            return version;
        }

        public void setVersion(Object version) {
            this.version = version;
        }

        public Object getBgState() {
            return bgState;
        }

        public void setBgState(Object bgState) {
            this.bgState = bgState;
        }

        public Object getCangku() {
            return cangku;
        }

        public void setCangku(Object cangku) {
            this.cangku = cangku;
        }

        public Object getKurongliang() {
            return kurongliang;
        }

        public void setKurongliang(Object kurongliang) {
            this.kurongliang = kurongliang;
        }

        public Object getZaNum() {
            return zaNum;
        }

        public void setZaNum(Object zaNum) {
            this.zaNum = zaNum;
        }

        public Object getBj() {
            return bj;
        }

        public void setBj(Object bj) {
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

        public Object getDwbaBeizhu1() {
            return dwbaBeizhu1;
        }

        public void setDwbaBeizhu1(Object dwbaBeizhu1) {
            this.dwbaBeizhu1 = dwbaBeizhu1;
        }

        public Object getDwbaBeizhu2() {
            return dwbaBeizhu2;
        }

        public void setDwbaBeizhu2(Object dwbaBeizhu2) {
            this.dwbaBeizhu2 = dwbaBeizhu2;
        }

        public Object getDwbaBeizhu3() {
            return dwbaBeizhu3;
        }

        public void setDwbaBeizhu3(Object dwbaBeizhu3) {
            this.dwbaBeizhu3 = dwbaBeizhu3;
        }

        public Object getDwbaBeizhu4() {
            return dwbaBeizhu4;
        }

        public void setDwbaBeizhu4(Object dwbaBeizhu4) {
            this.dwbaBeizhu4 = dwbaBeizhu4;
        }

        public Object getDwbaBeizhu5() {
            return dwbaBeizhu5;
        }

        public void setDwbaBeizhu5(Object dwbaBeizhu5) {
            this.dwbaBeizhu5 = dwbaBeizhu5;
        }

        public Object getDwbaBeizhu6() {
            return dwbaBeizhu6;
        }

        public void setDwbaBeizhu6(Object dwbaBeizhu6) {
            this.dwbaBeizhu6 = dwbaBeizhu6;
        }

        public Object getDwbaBeizhu7() {
            return dwbaBeizhu7;
        }

        public void setDwbaBeizhu7(Object dwbaBeizhu7) {
            this.dwbaBeizhu7 = dwbaBeizhu7;
        }

        public Object getDwbaBeizhu8() {
            return dwbaBeizhu8;
        }

        public void setDwbaBeizhu8(Object dwbaBeizhu8) {
            this.dwbaBeizhu8 = dwbaBeizhu8;
        }

        public Object getDwbaBeizhu9() {
            return dwbaBeizhu9;
        }

        public void setDwbaBeizhu9(Object dwbaBeizhu9) {
            this.dwbaBeizhu9 = dwbaBeizhu9;
        }

        public Object getDwbaBeizhu10() {
            return dwbaBeizhu10;
        }

        public void setDwbaBeizhu10(Object dwbaBeizhu10) {
            this.dwbaBeizhu10 = dwbaBeizhu10;
        }

        public Object getSuoding() {
            return suoding;
        }

        public void setSuoding(Object suoding) {
            this.suoding = suoding;
        }

        public Object getZhuxiao() {
            return zhuxiao;
        }

        public void setZhuxiao(Object zhuxiao) {
            this.zhuxiao = zhuxiao;
        }

        public int getOldId() {
            return oldId;
        }

        public void setOldId(int oldId) {
            this.oldId = oldId;
        }
    }

}

