package com.hxsoft.ajitai.adapter;

import android.content.Context;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.TypeInfo;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class TypeDialogAdapter extends CommonAdapter<TypeInfo> {

    public TypeDialogAdapter(Context context, List<TypeInfo> data, int itemLayoutId) {
        super(context, data, itemLayoutId);
    }

    @Override
    public void convert(int position, ViewHolder helper, TypeInfo item) {
        helper.setText(R.id.ContentTV, item.getVname());
    }
}
