package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class W_ToxicPurchaseApplydoBatch implements Serializable {


    /**
     * ids : [34,35]
     * policeApprovalStatus : 3
     */

    private int policeApprovalStatus;
    private List<Integer> ids;

    public int getPoliceApprovalStatus() {
        return policeApprovalStatus;
    }

    public void setPoliceApprovalStatus(int policeApprovalStatus) {
        this.policeApprovalStatus = policeApprovalStatus;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
