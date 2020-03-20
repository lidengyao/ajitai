package com.hxsoft.ajitai.model.bean;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class W_ToxicPurchaseApplyEdit {

    private Integer id;
    private Integer acceptStatus;
    private String policeCheckerOpinion;
    private Integer policeCheckStatus;
    private String policeApprovalOpinion;
    private Integer policeApprovalStatus;

    public String getPoliceCheckerOpinion() {
        return policeCheckerOpinion;
    }

    public void setPoliceCheckerOpinion(String policeCheckerOpinion) {
        this.policeCheckerOpinion = policeCheckerOpinion;
    }

    public String getPoliceApprovalOpinion() {
        return policeApprovalOpinion;
    }

    public void setPoliceApprovalOpinion(String policeApprovalOpinion) {
        this.policeApprovalOpinion = policeApprovalOpinion;
    }

    public Integer getPoliceApprovalStatus() {
        return policeApprovalStatus;
    }

    public void setPoliceApprovalStatus(Integer policeApprovalStatus) {
        this.policeApprovalStatus = policeApprovalStatus;
    }

    public Integer getPoliceCheckStatus() {
        return policeCheckStatus;
    }

    public void setPoliceCheckStatus(Integer policeCheckStatus) {
        this.policeCheckStatus = policeCheckStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(Integer acceptStatus) {
        this.acceptStatus = acceptStatus;
    }


}
