package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class P_Bean implements Serializable {

    /**
     * n : 北京
     * i : 110000
     * c : [{"n":"北京市","i":"110100","u":"100000","c":[{"n":"东城区","i":"110101","u":"100010"},{"n":"西城区","i":"110102","u":"100032"},{"n":"朝阳区","i":"110105","u":"100020"},{"n":"丰台区","i":"110106","u":"100071"},{"n":"石景山区","i":"110107","u":"100043"},{"n":"海淀区","i":"110108","u":"100089"},{"n":"门头沟区","i":"110109","u":"102300"},{"n":"房山区","i":"110111","u":"102488"},{"n":"通州区","i":"110112","u":"101149"},{"n":"顺义区","i":"110113","u":"101300"},{"n":"昌平区","i":"110114","u":"102200"},{"n":"大兴区","i":"110115","u":"102600"},{"n":"怀柔区","i":"110116","u":"101400"},{"n":"平谷区","i":"110117","u":"101200"},{"n":"密云县","i":"110228","u":"101500"},{"n":"延庆县","i":"110229","u":"102100"}]}]
     */

    private String n;
    private String i;
    private ArrayList<C_Bean> c;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public ArrayList<C_Bean> getC() {
        return c;
    }

    public void setC(ArrayList<C_Bean> c) {
        this.c = c;
    }


}



