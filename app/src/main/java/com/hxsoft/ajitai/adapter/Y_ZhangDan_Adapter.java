package com.hxsoft.ajitai.adapter;

import android.content.Context;


import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class Y_ZhangDan_Adapter extends CommonAdapter<String> {

    private Context _context;
    private OnClickListener _OnClickListener;

    public Y_ZhangDan_Adapter(Context context, List<String> data, int itemLayoutId) {
        super(context, data, itemLayoutId);
        _context = context;
    }

    @Override
    public void convert(int position, ViewHolder helper, String item) {


    }

    public interface OnClickListener {
        void OnClick(int brand_id, int is_attention);
    }
}
