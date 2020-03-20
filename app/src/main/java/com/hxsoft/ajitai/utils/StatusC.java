package com.hxsoft.ajitai.utils;

import java.util.HashMap;

public class StatusC {
    private String DicKey;
    private String Des;
    private HashMap<Integer,String> statusHashMapArrayList;
    private HashMap<Integer,Integer> colorHashMapArrayList;

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public HashMap<Integer, Integer> getColorHashMapArrayList() {
        return colorHashMapArrayList;
    }

    public void setColorHashMapArrayList(HashMap<Integer, Integer> colorHashMapArrayList) {
        this.colorHashMapArrayList = colorHashMapArrayList;
    }

    public String getDicKey() {
        return DicKey;
    }

    public void setDicKey(String dicKey) {
        DicKey = dicKey;
    }

    public HashMap<Integer, String> getStatusHashMapArrayList() {
        return statusHashMapArrayList;
    }

    public void setStatusHashMapArrayList(HashMap<Integer, String> statusHashMapArrayList) {
        this.statusHashMapArrayList = statusHashMapArrayList;
    }


}
