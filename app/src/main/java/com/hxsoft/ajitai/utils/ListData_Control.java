package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;

import com.hxsoft.ajitai.adapter.CommonAdapter;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

public class ListData_Control<T, W> {

    public  ArrayList<T> SetData(ArrayList<T> infoArrayList, ArrayList<T> model, Integer page, Integer pageSize, W w, PullLoadMoreListView dataListView, Activity activity, Context context) {

        CommonAdapter<T> baseAdapter=(CommonAdapter)w;
        if (model == null) {
            if (page == 1) {
                infoArrayList = model;

                baseAdapter.refresh(infoArrayList);
            } else {
                dataListView.loadMoreFinish(false, false);
            }
            return infoArrayList;
        }

        if (page == 1) {
            infoArrayList = model;
            baseAdapter.refresh(infoArrayList);
        } else {
            infoArrayList.addAll(model);
            baseAdapter.notifyDataSetChanged();
        }
        dataListView.refreshComplete();

        if (model.size() < pageSize) {
            dataListView.loadMoreFinish(false, false);
        } else {
            dataListView.loadMoreFinish(false, true);
        }
        return infoArrayList;
    }
}
