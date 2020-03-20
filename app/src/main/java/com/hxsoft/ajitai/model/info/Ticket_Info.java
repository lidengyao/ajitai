package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class Ticket_Info implements Serializable {


    /**
     * id : 1
     * activity_id : 1
     * name : 一等票
     * price : 1000.00
     * limit_number : 100
     * sold_number : 0
     */

    private int id;
    private int activity_id;
    private String name;
    private String price;
    private int limit_number;
    private int sold_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getLimit_number() {
        return limit_number;
    }

    public void setLimit_number(int limit_number) {
        this.limit_number = limit_number;
    }

    public int getSold_number() {
        return sold_number;
    }

    public void setSold_number(int sold_number) {
        this.sold_number = sold_number;
    }
}





