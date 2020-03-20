package com.hxsoft.ajitai.test;

import java.util.ArrayList;

public class B_Bean {

    private int pageIndex = 1;
    private int pageSize = 10;
    private YongHuGuanLi_Info yongHuGuanLi_info;
    private W_YongHuGuanLiAdapter w_yongHuGuanLiAdapter;
    private ArrayList<YongHuGuanLi_Info> infoArrayList = new ArrayList<>();
//    private Context context;
//    private Activity activity;
    PullLoadMoreListView dataListView;

    private void SetData(final ArrayList<YongHuGuanLi_Info> model) {
        if (model == null)
            return;

        if (this.pageIndex == 1) {
            infoArrayList = model;
            w_yongHuGuanLiAdapter = new W_YongHuGuanLiAdapter();
        } else {
            infoArrayList.addAll(model);
        }

        if (model.size() < this.pageSize) {
            dataListView.setSize(-1);
        } else {
            dataListView.setSize(1);
        }

    }
}
