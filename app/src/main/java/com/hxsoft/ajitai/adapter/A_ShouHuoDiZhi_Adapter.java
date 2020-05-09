package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.opengl.Visibility;
import android.view.View;
import android.widget.ImageView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.RealtimeInfo;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_ShouHuoDiZhi_Adapter extends CommonAdapter<Cuseraddress_Info.RecordsBean> {

    private Context _Context;
    private Integer _type;

    public A_ShouHuoDiZhi_Adapter(Context context, List<Cuseraddress_Info.RecordsBean> data, int itemLayoutId, Integer type) {
        super(context, data, itemLayoutId);
        _Context = context;
        _type = type;
    }

    @Override
    public void convert(int position, ViewHolder helper, Cuseraddress_Info.RecordsBean item) {

        ImageView Tip_IV = (ImageView) helper.getView(R.id.Tip_IV);
        if (item.getIsdefault() == 1) {
            Tip_IV.setImageResource(R.mipmap.a_shoucang_juse);
            helper.setText(R.id.FirstCharacter_TV, "默");
        }
        if (item.getIsdefault() == 0) {
            Tip_IV.setImageResource(R.mipmap.a_shouhuodizhi_touxiang);
            if (item.getUsername().length() > 0) {
                helper.setText(R.id.FirstCharacter_TV, item.getUsername().substring(0, 1));
            }
        }

        //地址管理
        if (_type == 0) {
            helper.setVisibility(R.id.A_Next_IV, View.VISIBLE);
        }
        //下单选择地址
        if (_type == 1) {
            helper.setVisibility(R.id.A_Next_IV, View.INVISIBLE);
        }

        helper.setText(R.id.username_TV, item.getUsername());
        helper.setText(R.id.phone_TV, item.getPhone());
        helper.setText(R.id.address_TV, item.getAddress());

    }
}
