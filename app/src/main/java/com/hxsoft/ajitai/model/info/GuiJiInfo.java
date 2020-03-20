package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class GuiJiInfo implements Serializable {
    public String name;
    public String before;
    public String after;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
}
