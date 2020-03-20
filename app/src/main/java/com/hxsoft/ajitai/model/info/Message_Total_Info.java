package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class Message_Total_Info implements Serializable {

    /**
     * total : 3
     * per_page : 15
     * current_page : 1
     * last_page : 1
     * data : [{"id":6,"title":"消息标题","user_id":10,"content":"消息内容","status":1,"create_time_text":"2020-03-06","status_text":"已读"},{"id":7,"title":"好消息","user_id":10,"content":"今天百万奖品免费送","status":1,"create_time_text":"2020-03-06","status_text":"已读"},{"id":8,"title":"系统提示","user_id":10,"content":"恭喜您获得了100w现金大奖","status":1,"create_time_text":"2020-03-06","status_text":"已读"}]
     */

    private int total;
    private int per_page;
    private int current_page;
    private int last_page;
    private ArrayList<Message_Info> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public ArrayList<Message_Info> getData() {
        return data;
    }

    public void setData(ArrayList<Message_Info> data) {
        this.data = data;
    }


}
