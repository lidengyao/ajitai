package com.hxsoft.ajitai.test;

import java.util.ArrayList;

public class A_Bean {
    private int pageIndex = 1;
    private int pageSize = 10;
    private ArrayList<FaLvFaGuiInfo> infoArrayList = new ArrayList<>();
    private W_FaLvFaGuiAdapter adapter;
    private ArrayList<Normal> normalArrayList_filter;
    PullLoadMoreListView dataListView;

    private void SetData(final ArrayList<FaLvFaGuiInfo> model) {

        if (model == null)
            return;

        if (this.pageIndex == 1) {
            infoArrayList = model;
            adapter = new W_FaLvFaGuiAdapter();
        } else {
            infoArrayList.addAll(model);
        }

        if (model.size() < this.pageSize) {
            dataListView.setSize(-1);
        } else {
            dataListView.setSize(1);
        }


    }

    public static void main(String[] args) {

        ArrayList<FaLvFaGuiInfo> model = new ArrayList<>();
        Integer pageIndex = 1;
        Integer pageSize = 10;

        DemoTest test = new DemoTest();
        W_FaLvFaGuiAdapter adapter = new W_FaLvFaGuiAdapter();
        test.setData(model, pageIndex, pageSize, adapter);
    }
}
