package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class IntegralPrize_Info implements Serializable {


    /**
     * id : 1
     * reward_integral_id : 1
     * type : 1
     * head_img : http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png
     * name : 海尔冰箱
     * member : 10
     * integral_start : 500
     * rank_start : 0
     * rank_end : 0
     * type_text : 一等奖
     */

    private int id;
    private int reward_integral_id;
    private int type;
    private String head_img;
    private String name;
    private int member;
    private int integral_start;
    private int rank_start;
    private int rank_end;
    private String type_text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReward_integral_id() {
        return reward_integral_id;
    }

    public void setReward_integral_id(int reward_integral_id) {
        this.reward_integral_id = reward_integral_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public int getIntegral_start() {
        return integral_start;
    }

    public void setIntegral_start(int integral_start) {
        this.integral_start = integral_start;
    }

    public int getRank_start() {
        return rank_start;
    }

    public void setRank_start(int rank_start) {
        this.rank_start = rank_start;
    }

    public int getRank_end() {
        return rank_end;
    }

    public void setRank_end(int rank_end) {
        this.rank_end = rank_end;
    }

    public String getType_text() {
        return type_text;
    }

    public void setType_text(String type_text) {
        this.type_text = type_text;
    }
}
