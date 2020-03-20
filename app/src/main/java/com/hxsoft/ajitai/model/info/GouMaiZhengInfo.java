package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class GouMaiZhengInfo implements Serializable {

    /**
     * id : 14
     * applyCompanyName : 连云港第一剧毒处理公司1
     * saleCompanyName : 连云港第一剧毒处理公司1
     * chargerName : 你好
     * inProvince : 3
     * createTime : 2019.05.09 17:12:33
     * approvalTime :
     * purchaseCertificationNumber : null
     * approvalUnitName : null
     * effectiveTime :
     * status : 0
     */

    private int id;
    private String applyCompanyName;
    private String saleCompanyName;
    private String chargerName;
    private int inProvince;
    private String createTime;
    private String approvalTime;
    private String purchaseCertificationNumber;
    private String approvalUnitName;
    private String effectiveTime;
    private int status;
    private Boolean isCheck=false;

    public Boolean getCheck() {
        return isCheck;
    }

    public void setCheck(Boolean check) {
        isCheck = check;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApplyCompanyName() {
        return applyCompanyName;
    }

    public void setApplyCompanyName(String applyCompanyName) {
        this.applyCompanyName = applyCompanyName;
    }

    public String getSaleCompanyName() {
        return saleCompanyName;
    }

    public void setSaleCompanyName(String saleCompanyName) {
        this.saleCompanyName = saleCompanyName;
    }

    public String getChargerName() {
        return chargerName;
    }

    public void setChargerName(String chargerName) {
        this.chargerName = chargerName;
    }

    public int getInProvince() {
        return inProvince;
    }

    public void setInProvince(int inProvince) {
        this.inProvince = inProvince;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getPurchaseCertificationNumber() {
        return purchaseCertificationNumber;
    }

    public void setPurchaseCertificationNumber(String purchaseCertificationNumber) {
        this.purchaseCertificationNumber = purchaseCertificationNumber;
    }

    public String getApprovalUnitName() {
        return approvalUnitName;
    }

    public void setApprovalUnitName(String approvalUnitName) {
        this.approvalUnitName = approvalUnitName;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

