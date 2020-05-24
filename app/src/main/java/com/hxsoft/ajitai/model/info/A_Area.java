package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class A_Area implements Serializable {

    /**
     * aid : 44063
     * adcode : 110000
     * areaname : 北京市
     * children : [{"aid":44064,"adcode":"110100","areaname":"北京城区","children":[{"aid":44307,"adcode":"110101","areaname":"东城区","children":[]},{"aid":44291,"adcode":"110102","areaname":"西城区","children":[]},{"aid":44164,"adcode":"110105","areaname":"朝阳区","children":[]},{"aid":44394,"adcode":"110106","areaname":"丰台区","children":[]},{"aid":44354,"adcode":"110107","areaname":"石景山区","children":[]},{"aid":44364,"adcode":"110108","areaname":"海淀区","children":[]},{"aid":44124,"adcode":"110109","areaname":"门头沟区","children":[]},{"aid":44325,"adcode":"110111","areaname":"房山区","children":[]},{"aid":44227,"adcode":"110112","areaname":"通州区","children":[]},{"aid":44138,"adcode":"110113","areaname":"顺义区","children":[]},{"aid":44268,"adcode":"110114","areaname":"昌平区","children":[]},{"aid":44243,"adcode":"110115","areaname":"大兴区","children":[]},{"aid":44087,"adcode":"110116","areaname":"怀柔区","children":[]},{"aid":44208,"adcode":"110117","areaname":"平谷区","children":[]},{"aid":44065,"adcode":"110118","areaname":"密云区","children":[]},{"aid":44105,"adcode":"110119","areaname":"延庆区","children":[]}]}]
     */

    private Integer aid;
    private String adcode;
    private String areaname;
    private ArrayList<A_Area> children;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public ArrayList<A_Area> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<A_Area> children) {
        this.children = children;
    }
}
