package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class GouMaiZheng_WuPin_Info implements Serializable {

    /**
     * id : 7
     * pid : 14
     * goodsName : 木炭
     * currentInventory : 85555
     * currentTimeInventory : 5
     * currentTimeMonthAverageUsage : 6
     * approvedMaximumInventory : 5
     * residualPurchases : 56
     * applyPurchaseNumber : 5
     * reachPurchaseNumber : 3
     * warehousingNumber : 5
     * outgoingNumber : 5555
     * remark : 看看
     * goodsUnit : 千克
     */

    private int id;
    private int pid;
    private String goodsName;
    private String currentInventory;
    private String currentTimeInventory;
    private String currentTimeMonthAverageUsage;
    private String approvedMaximumInventory;
    private String residualPurchases;
    private String applyPurchaseNumber;
    private String reachPurchaseNumber;
    private String warehousingNumber;
    private String outgoingNumber;
    private String remark;
    private String goodsUnit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(String currentInventory) {
        this.currentInventory = currentInventory;
    }

    public String getCurrentTimeInventory() {
        return currentTimeInventory;
    }

    public void setCurrentTimeInventory(String currentTimeInventory) {
        this.currentTimeInventory = currentTimeInventory;
    }

    public String getCurrentTimeMonthAverageUsage() {
        return currentTimeMonthAverageUsage;
    }

    public void setCurrentTimeMonthAverageUsage(String currentTimeMonthAverageUsage) {
        this.currentTimeMonthAverageUsage = currentTimeMonthAverageUsage;
    }

    public String getApprovedMaximumInventory() {
        return approvedMaximumInventory;
    }

    public void setApprovedMaximumInventory(String approvedMaximumInventory) {
        this.approvedMaximumInventory = approvedMaximumInventory;
    }

    public String getResidualPurchases() {
        return residualPurchases;
    }

    public void setResidualPurchases(String residualPurchases) {
        this.residualPurchases = residualPurchases;
    }

    public String getApplyPurchaseNumber() {
        return applyPurchaseNumber;
    }

    public void setApplyPurchaseNumber(String applyPurchaseNumber) {
        this.applyPurchaseNumber = applyPurchaseNumber;
    }

    public String getReachPurchaseNumber() {
        return reachPurchaseNumber;
    }

    public void setReachPurchaseNumber(String reachPurchaseNumber) {
        this.reachPurchaseNumber = reachPurchaseNumber;
    }

    public String getWarehousingNumber() {
        return warehousingNumber;
    }

    public void setWarehousingNumber(String warehousingNumber) {
        this.warehousingNumber = warehousingNumber;
    }

    public String getOutgoingNumber() {
        return outgoingNumber;
    }

    public void setOutgoingNumber(String outgoingNumber) {
        this.outgoingNumber = outgoingNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }
}

