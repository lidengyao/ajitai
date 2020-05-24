package com.hxsoft.ajitai.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.ui.activity.A_Activity_YinPinZhiBo_XiangQing;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_Tip;
import com.hxsoft.ajitai.utils.GlideControl;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_YinPinZhiBo_Adapter extends CommonAdapter<A_Cmediaclasses_Info> {

    private Context _Context;
    private Activity _Activity;
    private Integer _type;

    public A_YinPinZhiBo_Adapter(Context context, Activity activity, List<A_Cmediaclasses_Info> data, int itemLayoutId, Integer type) {
        super(context, data, itemLayoutId);
        _Context = context;
        _type = type;
        _Activity = activity;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_Cmediaclasses_Info item) {

        ImageView faceurlIV = (ImageView) helper.getView(R.id.faceurlIV);
        GlideControl.SetFilletImage(_Context, item.getFaceurl(), faceurlIV, R.mipmap.jiazaiing, 10);

        Button statusBtn = (Button) helper.getView(R.id.statusBtn);
        if (item.getStatus() == 0) {
            statusBtn.setText("未开始");
        }
        if (item.getStatus() == 1) {
            statusBtn.setText("直播中");
        }
        if (item.getStatus() == 2) {
            statusBtn.setText("已结束");
        }
        helper.setText(R.id.joinnumberTV, item.getJoinnumber() + "");
        helper.setText(R.id.titleTV, item.getTitle());
        helper.setText(R.id.timelabelBtn, item.getTimelabel());

        LinearLayout YinPinLL = (LinearLayout) helper.getView(R.id.YinPinLL);
        YinPinLL.setTag(R.id.one, item);
        YinPinLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                A_Cmediaclasses_Info a_cmediaclasses_info = (A_Cmediaclasses_Info) v.getTag(R.id.one);
                if (a_cmediaclasses_info.getStatus() == 2) {
                    CheckControl_Dialog_Tip.ShowDialog(_Context, _Activity, "直播已结束");
                } else {
                    Intent intent = new Intent(_Context, A_Activity_YinPinZhiBo_XiangQing.class);
                    intent.putExtra("cid", a_cmediaclasses_info.getCid() + "");
                    _Context.startActivity(intent);
                }

            }
        });

    }
}
