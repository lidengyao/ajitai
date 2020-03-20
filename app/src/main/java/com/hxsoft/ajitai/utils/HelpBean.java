package com.hxsoft.ajitai.utils;

import java.io.Serializable;

public class HelpBean implements Serializable {
    private String Name;
    private String ShowContent;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShowContent() {
        return ShowContent;
    }

    public void setShowContent(String showContent) {
        ShowContent = showContent;
    }
}
