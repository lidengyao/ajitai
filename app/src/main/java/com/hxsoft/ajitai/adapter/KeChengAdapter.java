package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.model.info.RealtimeInfo;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class KeChengAdapter extends CommonAdapter<KeCheng_Info> {

    public KeChengAdapter(Context context, List<KeCheng_Info> data, int itemLayoutId) {
        super(context, data, itemLayoutId);
    }

    @Override
    public void convert(int position, ViewHolder helper, KeCheng_Info item) {
    }
}
