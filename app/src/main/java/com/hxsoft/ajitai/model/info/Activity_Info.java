package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class Activity_Info implements Serializable {


    /**
     * id : 5
     * operator_id : 14
     * name : 活动名称005
     * type : 1
     * pavilion_name : 展馆名称0045
     * address : 展馆名称005
     * view_count : 0
     * live_count : 0
     * start_time : 1580863168
     * end_time : 1581035968
     * deadline_time : 1582462718
     * head_img : http://47.92.221.41/image/zhibosan.png
     * intro_img : ["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"]
     * status : 1
     * desc : 活动描述
     * is_attention : 0
     * is_promoter : 0
     * start_time_text : 2020-02-05 08:39
     * surplus_time_text :
     * status_text : 已发布
     * type_text : 线上活动
     */

    private int id;
    private int operator_id;
    private String name;
    private int type;
    private String pavilion_name;
    private String address;
    private int view_count;
    private int live_count;
    private int start_time;
    private int end_time;
    private int deadline_time;
    private String head_img;
    private int status;
    private String desc;
    private int is_attention;
    private int is_promoter;
    private String start_time_text;
    private String surplus_time_text;
    private String status_text;
    private String type_text;
    private ArrayList<String> intro_img;
    private String activity_sign_count;
    private String qr_code;


    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public String getActivity_sign_count() {
        return activity_sign_count;
    }

    public void setActivity_sign_count(String activity_sign_count) {
        this.activity_sign_count = activity_sign_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(int operator_id) {
        this.operator_id = operator_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPavilion_name() {
        return pavilion_name;
    }

    public void setPavilion_name(String pavilion_name) {
        this.pavilion_name = pavilion_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public int getLive_count() {
        return live_count;
    }

    public void setLive_count(int live_count) {
        this.live_count = live_count;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public int getDeadline_time() {
        return deadline_time;
    }

    public void setDeadline_time(int deadline_time) {
        this.deadline_time = deadline_time;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIs_attention() {
        return is_attention;
    }

    public void setIs_attention(int is_attention) {
        this.is_attention = is_attention;
    }

    public int getIs_promoter() {
        return is_promoter;
    }

    public void setIs_promoter(int is_promoter) {
        this.is_promoter = is_promoter;
    }

    public String getStart_time_text() {
        return start_time_text;
    }

    public void setStart_time_text(String start_time_text) {
        this.start_time_text = start_time_text;
    }

    public String getSurplus_time_text() {
        return surplus_time_text;
    }

    public void setSurplus_time_text(String surplus_time_text) {
        this.surplus_time_text = surplus_time_text;
    }

    public String getStatus_text() {
        return status_text;
    }

    public void setStatus_text(String status_text) {
        this.status_text = status_text;
    }

    public String getType_text() {
        return type_text;
    }

    public void setType_text(String type_text) {
        this.type_text = type_text;
    }

    public ArrayList<String> getIntro_img() {
        return intro_img;
    }

    public void setIntro_img(ArrayList<String> intro_img) {
        this.intro_img = intro_img;
    }
}

