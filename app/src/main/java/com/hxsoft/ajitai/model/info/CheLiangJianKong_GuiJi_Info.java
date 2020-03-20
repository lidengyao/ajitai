package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class CheLiangJianKong_GuiJi_Info implements Serializable {

    /**
     * licenseo : 苏G1234P
     * list : [{"rid":3,"lat":"34.588442","lon":"119.209594","pname":"瀛州路与海宁中路交会处","createtime":"2019-05-29 17:30:49"},{"rid":2,"lat":"34.595685","lon":"119.200274","pname":"瀛州路与朝阳中路交会处","createtime":"2019-05-29 16:11:26"},{"rid":1,"lat":"34.600096","lon":"119.19792","pname":"苏欣客运站","createtime":"2019-05-29 15:29:59"}]
     */

    private String licenseo;
    private List<ListBean> list;

    public String getLicenseo() {
        return licenseo;
    }

    public void setLicenseo(String licenseo) {
        this.licenseo = licenseo;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * rid : 3
         * lat : 34.588442
         * lon : 119.209594
         * pname : 瀛州路与海宁中路交会处
         * createtime : 2019-05-29 17:30:49
         */

        private int rid;
        private String lat;
        private String lon;
        private String pname;
        private String createtime;

        public int getRid() {
            return rid;
        }

        public void setRid(int rid) {
            this.rid = rid;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getPname() {
            return pname;
        }

        public void setPname(String pname) {
            this.pname = pname;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }
    }

}

