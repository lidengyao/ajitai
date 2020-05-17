package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreateCconscious_Bean implements Serializable {

    /**
     * content : 123
     * extral : [{"type":2,"uri":"image/1589423537640639.png"},{"type":2,"uri":"image/1589439816668646.jpg"},{"type":2,"uri":"image/1589423537640639.jpg"},{"type":2,"uri":"image/1589423537640639.png"},{"type":2,"uri":"image/1589439816668646.jpg"},{"type":2,"uri":"image/1589423537640639.jpg"}]
     * lon : 123
     * lat : 1234
     */

    private String content;
    private String lon;
    private String lat;
    private ArrayList<ExtralBean> extral;
    private String position;
    private Integer relaycid;

    public Integer getRelaycid() {
        return relaycid;
    }

    public void setRelaycid(Integer relaycid) {
        this.relaycid = relaycid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public ArrayList<ExtralBean> getExtral() {
        return extral;
    }

    public void setExtral(ArrayList<ExtralBean> extral) {
        this.extral = extral;
    }

    public static class ExtralBean implements Serializable{
        /**
         * type : 2
         * uri : image/1589423537640639.png
         */

        private Integer type;
        private String uri;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }
    }
}



