package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class Unit_Info implements Serializable {


    /**
     * id : 1
     * unitName : 连云港公安总局1
     * legalRepresentativeName : null
     * address : null
     * legalRepresentativeTel : null
     * unitAbbr : null
     * organizationalCodeCertificateExpire : null
     * businessLicenseNoExpire : null
     * safetySupervisionExpire : null
     * environmentalCertificateExpire : null
     * unitCode : null
     * enterpriseCode : null
     */


    private Integer id;
    private String unitName;
    private String legalRepresentativeName;
    private String address;
    private String legalRepresentativeTel;
    private String unitAbbr;
    private Long organizationalCodeCertificateExpire;
    private Long businessLicenseNoExpire;
    private Long safetySupervisionExpire;
    private Long environmentalCertificateExpire;
    private String unitCode;
    private String enterpriseCode;
    private  Integer compDel;
    private Integer compToxicDel;
    private Integer compYzbDel;
    private Long createTime;
    private String highLevelUnitName;
    private String unitType;

    //@ApiModelProperty("上级单位id")
    private Integer higherLevelUnit;

    //@ApiModelProperty("单位类型，（2：企业3：派出所4：分局：5支队）")
    private Integer classification;

    private ArrayList<Unit_Info> unit_infos=new ArrayList<>();

    public ArrayList<Unit_Info> getUnit_infos() {
        return unit_infos;
    }

    public void setUnit_infos(ArrayList<Unit_Info> unit_infos) {
        this.unit_infos = unit_infos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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

    public String getUnitAbbr() {
        return unitAbbr;
    }

    public void setUnitAbbr(String unitAbbr) {
        this.unitAbbr = unitAbbr;
    }

    public Long getOrganizationalCodeCertificateExpire() {
        return organizationalCodeCertificateExpire;
    }

    public void setOrganizationalCodeCertificateExpire(Long organizationalCodeCertificateExpire) {
        this.organizationalCodeCertificateExpire = organizationalCodeCertificateExpire;
    }

    public Long getBusinessLicenseNoExpire() {
        return businessLicenseNoExpire;
    }

    public void setBusinessLicenseNoExpire(Long businessLicenseNoExpire) {
        this.businessLicenseNoExpire = businessLicenseNoExpire;
    }

    public Long getSafetySupervisionExpire() {
        return safetySupervisionExpire;
    }

    public void setSafetySupervisionExpire(Long safetySupervisionExpire) {
        this.safetySupervisionExpire = safetySupervisionExpire;
    }

    public Long getEnvironmentalCertificateExpire() {
        return environmentalCertificateExpire;
    }

    public void setEnvironmentalCertificateExpire(Long environmentalCertificateExpire) {
        this.environmentalCertificateExpire = environmentalCertificateExpire;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public Integer getCompDel() {
        return compDel;
    }

    public void setCompDel(Integer compDel) {
        this.compDel = compDel;
    }

    public Integer getCompToxicDel() {
        return compToxicDel;
    }

    public void setCompToxicDel(Integer compToxicDel) {
        this.compToxicDel = compToxicDel;
    }

    public Integer getCompYzbDel() {
        return compYzbDel;
    }

    public void setCompYzbDel(Integer compYzbDel) {
        this.compYzbDel = compYzbDel;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getHighLevelUnitName() {
        return highLevelUnitName;
    }

    public void setHighLevelUnitName(String highLevelUnitName) {
        this.highLevelUnitName = highLevelUnitName;
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

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }
}
