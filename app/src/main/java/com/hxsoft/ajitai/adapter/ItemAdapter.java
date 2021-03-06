package com.hxsoft.ajitai.adapter;

import android.content.Context;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.BaoJingInfo;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class ItemAdapter extends CommonAdapter<BaoJingInfo.RecordsBean> {
    protected Context mContext;

    public ItemAdapter(Context context, List<BaoJingInfo.RecordsBean> data, int itemLayoutId) {
        super(context, data, itemLayoutId);
        this.mContext = context;
    }

    @Override
    public void convert(int position, ViewHolder helper, BaoJingInfo.RecordsBean item) {
        helper.setText(R.id.TitleTV, item.getDevicesn() + item.getRuledescription());
        helper.setText(R.id.CreateTimeTV, "发生时间：" + item.getCreatetime());
    }
}
