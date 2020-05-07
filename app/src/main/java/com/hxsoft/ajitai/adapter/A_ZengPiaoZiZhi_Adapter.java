package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.Cuserreceipt_Info;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_ZengPiaoZiZhi_Adapter extends CommonAdapter<Cuserreceipt_Info.RecordsBean> {

    private Context _Context;

    public A_ZengPiaoZiZhi_Adapter(Context context, List<Cuserreceipt_Info.RecordsBean> data, int itemLayoutId) {
        super(context, data, itemLayoutId);
        _Context = context;
    }

    @Override
    public void convert(int position, ViewHolder helper, Cuserreceipt_Info.RecordsBean item) {

        ImageView Tip_IV = (ImageView) helper.getView(R.id.Tip_IV);
        if (item.getUnitname().length() > 0) {
            helper.setText(R.id.FirstCharacter_TV, item.getUnitname().substring(0, 1));
        }

        helper.setText(R.id.unitname_TV, item.getUnitname());
        helper.setText(R.id.address_TV, item.getAddress());

    }
}
