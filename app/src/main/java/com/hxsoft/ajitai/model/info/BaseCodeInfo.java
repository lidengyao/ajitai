package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class BaseCodeInfo implements Serializable {

    /**
     * id : 15
     * title : 民爆单位类型
     * keyword :
     * rules : [{"id":16,"title":null,"keyword":null,"rules":null,"cardNo":"其他民爆物品使用单位"},{"id":17,"title":null,"keyword":null,"rules":null,"cardNo":"生产单位"},{"id":18,"title":null,"keyword":null,"rules":null,"cardNo":"销售单位"},{"id":19,"title":null,"keyword":null,"rules":null,"cardNo":"爆破作业单位"},{"id":20,"title":null,"keyword":null,"rules":null,"cardNo":"储存库区"},{"id":21,"title":null,"keyword":null,"rules":null,"cardNo":"硝酸铵生产企业"}]
     * cardNo : null
     */

    private Integer id;
    private String title;
    private String keyword;
    private String cardNo;
    private ArrayList<BaseCodeInfo> rules;
    private Boolean isCheck=false;

    public Boolean getCheck() {
        return isCheck;
    }

    public void setCheck(Boolean check) {
        isCheck = check;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public ArrayList<BaseCodeInfo> getRules() {
        return rules;
    }

    public void setRules(ArrayList<BaseCodeInfo> rules) {
        this.rules = rules;
    }

}


