package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class ActivityTabs_Info implements Serializable {


    /**
     * processing : 2
     * un_published : 0
     * over : 0
     */

    private int processing;
    private int un_published;
    private int over;

    public int getProcessing() {
        return processing;
    }

    public void setProcessing(int processing) {
        this.processing = processing;
    }

    public int getUn_published() {
        return un_published;
    }

    public void setUn_published(int un_published) {
        this.un_published = un_published;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }
}
