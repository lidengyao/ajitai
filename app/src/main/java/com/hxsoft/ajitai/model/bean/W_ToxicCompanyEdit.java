package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class W_ToxicCompanyEdit implements Serializable {

    private int unitId;
    private String policeCheckerOpinion;
    private String paichusuoCheckerOpinion;
    private int applyStatus;

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getPoliceCheckerOpinion() {
        return policeCheckerOpinion;
    }

    public void setPoliceCheckerOpinion(String policeCheckerOpinion) {
        this.policeCheckerOpinion = policeCheckerOpinion;
    }

    public String getPaichusuoCheckerOpinion() {
        return paichusuoCheckerOpinion;
    }

    public void setPaichusuoCheckerOpinion(String paichusuoCheckerOpinion) {
        this.paichusuoCheckerOpinion = paichusuoCheckerOpinion;
    }

    public int getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(int applyStatus) {
        this.applyStatus = applyStatus;
    }
}
