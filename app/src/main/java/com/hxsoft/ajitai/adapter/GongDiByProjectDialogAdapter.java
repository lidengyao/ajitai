package com.hxsoft.ajitai.adapter;

import android.content.Context;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.GongDiInfo;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class GongDiByProjectDialogAdapter extends CommonAdapter<GongDiInfo> {

    public GongDiByProjectDialogAdapter(Context context, List<GongDiInfo> data, int itemLayoutId) {
        super(context, data, itemLayoutId);
    }

    @Override
    public void convert(int position, ViewHolder helper, GongDiInfo item) {
        helper.setText(R.id.ContentTV, item.getSname());
    }
}
