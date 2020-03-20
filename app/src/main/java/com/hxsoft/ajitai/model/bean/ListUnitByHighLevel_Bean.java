package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;
import java.util.ArrayList;

/*
通知类
 */
public class ListUnitByHighLevel_Bean implements Serializable {

    ArrayList<Integer> ids=new ArrayList<>();

    public ArrayList<Integer> getIds() {
        return ids;
    }

    public void setIds(ArrayList<Integer> ids) {
        this.ids = ids;
    }
}
