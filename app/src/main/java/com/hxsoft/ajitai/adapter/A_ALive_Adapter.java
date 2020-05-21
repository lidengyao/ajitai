package com.hxsoft.ajitai.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.A_ALive_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShiPinZhiBo_XiangQing;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_Tip;
import com.hxsoft.ajitai.utils.GlideControl;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_ALive_Adapter extends CommonAdapter<A_ALive_Info> {

    private Context _Context;
    private Activity _Activity;
    private Integer _type;

    public A_ALive_Adapter(Context context, Activity activity, List<A_ALive_Info> data, int itemLayoutId, Integer type) {
        super(context, data, itemLayoutId);
        _Context = context;
        _Activity = activity;
        _type = type;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_ALive_Info item) {

        ImageView zhibo_item_bg = (ImageView) helper.getView(R.id.zhibo_item_bg);
        GlideControl.SetFilletImage(_Context, item.getFaceurl(), zhibo_item_bg, R.mipmap.jiazaiing, 6);

        Button statusBtn = (Button) helper.getView(R.id.statusBtn);
        TextView snameTV = (TextView) helper.getView(R.id.snameTV);
        TextView numberTV = (TextView) helper.getView(R.id.numberTV);
        snameTV.setText(item.getSname());
        numberTV.setText(item.getNumber() + "");

        if (item.getStatus() == 0) {
            statusBtn.setText("未开始");
        }
        if (item.getStatus() == 1) {
            statusBtn.setText("直播中");
        }
        if (item.getStatus() == 2) {
            statusBtn.setText("已结束");
        }

        LinearLayout zhiboLL = (LinearLayout) helper.getView(R.id.zhiboLL);
        zhiboLL.setTag(R.id.one, item);
        zhiboLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_ALive_Info a_aLive_info = (A_ALive_Info) v.getTag(R.id.one);
                if (a_aLive_info.getStatus() == 2) {
                    CheckControl_Dialog_Tip.ShowDialog(_Context, _Activity, "直播已结束");
                    return;
                } else {
                    Intent intent = new Intent(_Context, A_Activity_ShiPinZhiBo_XiangQing.class);
                    intent.putExtra("vid", a_aLive_info.getVid() + "");
                    _Context.startActivity(intent);
                }
            }
        });

    }
}
