package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class DanWeiBeiAnBianGeng_JiBen_Info implements Serializable {

    /**
     * toxicCompanyChange : {"id":null,"classification":null,"unitType":null,"higherLevelUnit":null,"higherLevelUnitName":null,"unitName":null,"unitAbbr":null,"unitPinyinAbbr":null,"unitLocationId":null,"unitAddress":null,"unitId":null,"legalRepresentativeName":"蔡健雅3","legalRepresentativeIdcard":"123456678","legalRepresentativeTel":null,"charger":null,"securityerName":null,"securityerTel":null,"storageRiskLevel":138,"companyMemberNumber":null,"importAndExport":241,"monitors":240,"dutyRoomTel":null,"monitoringCenterTel":null,"toxicStoreAddress":null,"businessLicenseNo":null,"businessLicenseNoExpire":1568649600000,"organizationalCodeCertificate":null,"organizationalCodeCertificateExpire":null,"safetySupervision":null,"safetySupervisionExpire":null,"environmentalCertificate":null,"environmentalCertificateExpire":null,"professionalInstitutions":null,"professionalInstitutionsExpire":null,"companyCheckerId":null,"companyCheckerOpinion":null,"paichusuoCheckerId":null,"paichusuoCheckerOpinion":null,"policeCheckerId":null,"policeCheckerOpinion":null,"lockStatus":null,"applyStatus":null,"passTime":null,"createTime":null,"updateTime":null,"toxicDescription":null,"toxicEquipment":null,"remark":null,"lockType":null,"suoding":null,"companyCheckTime":null,"paichusuoCheckTime":null,"policeCheckTime":null,"companyCheckName":null,"paichusuoCheckName":null,"policeCheckName":null,"companyCheckerName":null,"paichusuoCheckerName":null,"policeCheckerName":null}
     * record : {"id":18,"unitId":10,"status":1,"changer":8,"chargerName":null,"createTime":1569210364679,"updateTime":1569218767522,"changeField":"{\"legalRepresentativeIdcard\":\"123456678\",\"legalRepresentativeName\":\"蔡健雅3\",\"storageRiskLevel\":138,\"businessLicenseNoExpire\":1568649600000,\"importAndExport\":241,\"monitors\":240}","unitCheckUserid":9,"unitCheckUserName":"蔡双的领导","unitCheckTime":1569217852288,"unitCheckOpinion":2,"unitCheckUnitid":10,"unitCheckUnitName":"连云港第一剧毒处理公司1","pcsCheckUserid":0,"pcsCheckUserName":null,"pcsCheckTime":0,"pcsCheckOpinion":0,"pcsCheckUnitid":0,"pcsCheckUnitName":null,"zdCheckUserid":0,"zdCheckUserName":null,"zdCheckTime":0,"zdCheckOpinion":0,"zdCheckUnitid":0,"zdCheckUnitName":null,"unitCheckContent":"123123","pcsCheckContent":null,"zdCheckContent":null,"tel":null,"lbcTypeName":null,"searchStartTime":null,"searchEndTime":null,"unitType":null,"version":null}
     */

    private DanWeiBeiAn_JiBen_Info toxicCompanyChange;
    private RecordBean record;

    public DanWeiBeiAn_JiBen_Info getToxicCompanyChange() {
        return toxicCompanyChange;
    }

    public void setToxicCompanyChange(DanWeiBeiAn_JiBen_Info toxicCompanyChange) {
        this.toxicCompanyChange = toxicCompanyChange;
    }

    public RecordBean getRecord() {
        return record;
    }

    public void setRecord(RecordBean record) {
        this.record = record;
    }



    public static class RecordBean {
        /**
         * id : 18
         * unitId : 10
         * status : 1
         * changer : 8
         * chargerName : null
         * createTime : 1569210364679
         * updateTime : 1569218767522
         * changeField : {"legalRepresentativeIdcard":"123456678","legalRepresentativeName":"蔡健雅3","storageRiskLevel":138,"businessLicenseNoExpire":1568649600000,"importAndExport":241,"monitors":240}
         * unitCheckUserid : 9
         * unitCheckUserName : 蔡双的领导
         * unitCheckTime : 1569217852288
         * unitCheckOpinion : 2
         * unitCheckUnitid : 10
         * unitCheckUnitName : 连云港第一剧毒处理公司1
         * pcsCheckUserid : 0
         * pcsCheckUserName : null
         * pcsCheckTime : 0
         * pcsCheckOpinion : 0
         * pcsCheckUnitid : 0
         * pcsCheckUnitName : null
         * zdCheckUserid : 0
         * zdCheckUserName : null
         * zdCheckTime : 0
         * zdCheckOpinion : 0
         * zdCheckUnitid : 0
         * zdCheckUnitName : null
         * unitCheckContent : 123123
         * pcsCheckContent : null
         * zdCheckContent : null
         * tel : null
         * lbcTypeName : null
         * searchStartTime : null
         * searchEndTime : null
         * unitType : null
         * version : null
         */

        private int id;
        private int unitId;
        private int status;
        private int changer;
        private Object chargerName;
        private long createTime;
        private long updateTime;
        private String changeField;
        private int unitCheckUserid;
        private String unitCheckUserName;
        private long unitCheckTime;
        private int unitCheckOpinion;
        private int unitCheckUnitid;
        private String unitCheckUnitName;
        private int pcsCheckUserid;
        private Object pcsCheckUserName;
        private int pcsCheckTime;
        private int pcsCheckOpinion;
        private int pcsCheckUnitid;
        private Object pcsCheckUnitName;
        private int zdCheckUserid;
        private Object zdCheckUserName;
        private int zdCheckTime;
        private int zdCheckOpinion;
        private int zdCheckUnitid;
        private Object zdCheckUnitName;
        private String unitCheckContent;
        private Object pcsCheckContent;
        private Object zdCheckContent;
        private Object tel;
        private Object lbcTypeName;
        private Object searchStartTime;
        private Object searchEndTime;
        private Object unitType;
        private Object version;

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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getChanger() {
            return changer;
        }

        public void setChanger(int changer) {
            this.changer = changer;
        }

        public Object getChargerName() {
            return chargerName;
        }

        public void setChargerName(Object chargerName) {
            this.chargerName = chargerName;
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

        public String getChangeField() {
            return changeField;
        }

        public void setChangeField(String changeField) {
            this.changeField = changeField;
        }

        public int getUnitCheckUserid() {
            return unitCheckUserid;
        }

        public void setUnitCheckUserid(int unitCheckUserid) {
            this.unitCheckUserid = unitCheckUserid;
        }

        public String getUnitCheckUserName() {
            return unitCheckUserName;
        }

        public void setUnitCheckUserName(String unitCheckUserName) {
            this.unitCheckUserName = unitCheckUserName;
        }

        public long getUnitCheckTime() {
            return unitCheckTime;
        }

        public void setUnitCheckTime(long unitCheckTime) {
            this.unitCheckTime = unitCheckTime;
        }

        public int getUnitCheckOpinion() {
            return unitCheckOpinion;
        }

        public void setUnitCheckOpinion(int unitCheckOpinion) {
            this.unitCheckOpinion = unitCheckOpinion;
        }

        public int getUnitCheckUnitid() {
            return unitCheckUnitid;
        }

        public void setUnitCheckUnitid(int unitCheckUnitid) {
            this.unitCheckUnitid = unitCheckUnitid;
        }

        public String getUnitCheckUnitName() {
            return unitCheckUnitName;
        }

        public void setUnitCheckUnitName(String unitCheckUnitName) {
            this.unitCheckUnitName = unitCheckUnitName;
        }

        public int getPcsCheckUserid() {
            return pcsCheckUserid;
        }

        public void setPcsCheckUserid(int pcsCheckUserid) {
            this.pcsCheckUserid = pcsCheckUserid;
        }

        public Object getPcsCheckUserName() {
            return pcsCheckUserName;
        }

        public void setPcsCheckUserName(Object pcsCheckUserName) {
            this.pcsCheckUserName = pcsCheckUserName;
        }

        public int getPcsCheckTime() {
            return pcsCheckTime;
        }

        public void setPcsCheckTime(int pcsCheckTime) {
            this.pcsCheckTime = pcsCheckTime;
        }

        public int getPcsCheckOpinion() {
            return pcsCheckOpinion;
        }

        public void setPcsCheckOpinion(int pcsCheckOpinion) {
            this.pcsCheckOpinion = pcsCheckOpinion;
        }

        public int getPcsCheckUnitid() {
            return pcsCheckUnitid;
        }

        public void setPcsCheckUnitid(int pcsCheckUnitid) {
            this.pcsCheckUnitid = pcsCheckUnitid;
        }

        public Object getPcsCheckUnitName() {
            return pcsCheckUnitName;
        }

        public void setPcsCheckUnitName(Object pcsCheckUnitName) {
            this.pcsCheckUnitName = pcsCheckUnitName;
        }

        public int getZdCheckUserid() {
            return zdCheckUserid;
        }

        public void setZdCheckUserid(int zdCheckUserid) {
            this.zdCheckUserid = zdCheckUserid;
        }

        public Object getZdCheckUserName() {
            return zdCheckUserName;
        }

        public void setZdCheckUserName(Object zdCheckUserName) {
            this.zdCheckUserName = zdCheckUserName;
        }

        public int getZdCheckTime() {
            return zdCheckTime;
        }

        public void setZdCheckTime(int zdCheckTime) {
            this.zdCheckTime = zdCheckTime;
        }

        public int getZdCheckOpinion() {
            return zdCheckOpinion;
        }

        public void setZdCheckOpinion(int zdCheckOpinion) {
            this.zdCheckOpinion = zdCheckOpinion;
        }

        public int getZdCheckUnitid() {
            return zdCheckUnitid;
        }

        public void setZdCheckUnitid(int zdCheckUnitid) {
            this.zdCheckUnitid = zdCheckUnitid;
        }

        public Object getZdCheckUnitName() {
            return zdCheckUnitName;
        }

        public void setZdCheckUnitName(Object zdCheckUnitName) {
            this.zdCheckUnitName = zdCheckUnitName;
        }

        public String getUnitCheckContent() {
            return unitCheckContent;
        }

        public void setUnitCheckContent(String unitCheckContent) {
            this.unitCheckContent = unitCheckContent;
        }

        public Object getPcsCheckContent() {
            return pcsCheckContent;
        }

        public void setPcsCheckContent(Object pcsCheckContent) {
            this.pcsCheckContent = pcsCheckContent;
        }

        public Object getZdCheckContent() {
            return zdCheckContent;
        }

        public void setZdCheckContent(Object zdCheckContent) {
            this.zdCheckContent = zdCheckContent;
        }

        public Object getTel() {
            return tel;
        }

        public void setTel(Object tel) {
            this.tel = tel;
        }

        public Object getLbcTypeName() {
            return lbcTypeName;
        }

        public void setLbcTypeName(Object lbcTypeName) {
            this.lbcTypeName = lbcTypeName;
        }

        public Object getSearchStartTime() {
            return searchStartTime;
        }

        public void setSearchStartTime(Object searchStartTime) {
            this.searchStartTime = searchStartTime;
        }

        public Object getSearchEndTime() {
            return searchEndTime;
        }

        public void setSearchEndTime(Object searchEndTime) {
            this.searchEndTime = searchEndTime;
        }

        public Object getUnitType() {
            return unitType;
        }

        public void setUnitType(Object unitType) {
            this.unitType = unitType;
        }

        public Object getVersion() {
            return version;
        }

        public void setVersion(Object version) {
            this.version = version;
        }
    }
}

