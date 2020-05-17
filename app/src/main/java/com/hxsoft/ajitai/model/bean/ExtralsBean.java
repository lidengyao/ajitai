package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class ExtralsBean implements Serializable {
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
