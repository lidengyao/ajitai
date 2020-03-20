package com.hxsoft.ajitai.test;


import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @author: king
 * @description: 55
 * FileName: DemoTest
 * Date:     2019-08-28 0028 13:00:19
 **/
public class DemoTest<T,W> {

    private List<T> list = new ArrayList<>();
    private W w;
    PullLoadMoreListView dataListView;

    public void setData(List<T> model, int pageIndex, int pageSize,W w) {
        if (model == null) {
            return;
        }
        if (pageIndex == 1) {
            list = model;
        } else {
            list.addAll(model);
        }
        dataListView = new PullLoadMoreListView();
        if (model.size() < pageSize) {
            dataListView.setSize(-1);
        } else {
            dataListView.setSize(1);
        }
    }
}
 