package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class ListTaskInfo implements Serializable {


    private ArrayList<ListTaskDetailInfo> changeRecord = new ArrayList<>();
    private ArrayList<ListTaskDetailInfo> pa = new ArrayList<>();
    private ArrayList<ListTaskDetailInfo> unlock = new ArrayList<>();
    private ArrayList<ListTaskDetailInfo> driver = new ArrayList<>();
    private ArrayList<ListTaskDetailInfo> advice = new ArrayList<>();
    private ArrayList<ListTaskDetailInfo> companyRecord = new ArrayList<>();

    public ArrayList<ListTaskDetailInfo> getChangeRecord() {
        return changeRecord;
    }

    public void setChangeRecord(ArrayList<ListTaskDetailInfo> changeRecord) {
        this.changeRecord = changeRecord;
    }

    public ArrayList<ListTaskDetailInfo> getPa() {
        return pa;
    }

    public void setPa(ArrayList<ListTaskDetailInfo> pa) {
        this.pa = pa;
    }

    public ArrayList<ListTaskDetailInfo> getUnlock() {
        return unlock;
    }

    public void setUnlock(ArrayList<ListTaskDetailInfo> unlock) {
        this.unlock = unlock;
    }

    public ArrayList<ListTaskDetailInfo> getDriver() {
        return driver;
    }

    public void setDriver(ArrayList<ListTaskDetailInfo> driver) {
        this.driver = driver;
    }

    public ArrayList<ListTaskDetailInfo> getAdvice() {
        return advice;
    }

    public void setAdvice(ArrayList<ListTaskDetailInfo> advice) {
        this.advice = advice;
    }

    public ArrayList<ListTaskDetailInfo> getCompanyRecord() {
        return companyRecord;
    }

    public void setCompanyRecord(ArrayList<ListTaskDetailInfo> companyRecord) {
        this.companyRecord = companyRecord;
    }
}
