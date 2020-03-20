package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class toxicCount_Info implements Serializable {

    /**
     * effective : 0
     * currentWarning : 0
     * vehicleCount : 2
     * apply : 0
     * unitCount : 215
     * earlyWarningCount : 0
     */

    //有效备案数量
    private int effective;

    //实时预警数
    private int currentWarning;

    //监控车辆数
    private int vehicleCount;

    //已完成审批数
    private int apply;

    //企业单位数
    private int unitCount;

    //累计预警数
    private int earlyWarningCount;

    public int getEffective() {
        return effective;
    }

    public void setEffective(int effective) {
        this.effective = effective;
    }

    public int getCurrentWarning() {
        return currentWarning;
    }

    public void setCurrentWarning(int currentWarning) {
        this.currentWarning = currentWarning;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public int getApply() {
        return apply;
    }

    public void setApply(int apply) {
        this.apply = apply;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }

    public int getEarlyWarningCount() {
        return earlyWarningCount;
    }

    public void setEarlyWarningCount(int earlyWarningCount) {
        this.earlyWarningCount = earlyWarningCount;
    }
}
