package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.A_Carticlecomment_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.utils.GlideControl;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_Carticlecomment_Adapter extends CommonAdapter<A_Carticlecomment_Info> {

    private Context _Context;
    private Integer _type;

    public A_Carticlecomment_Adapter(Context context, List<A_Carticlecomment_Info> data, int itemLayoutId, Integer type) {
        super(context, data, itemLayoutId);
        _Context = context;
        _type = type;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_Carticlecomment_Info item) {

        ImageView avatarIV = (ImageView) helper.getView(R.id.avatarIV);
        GlideControl.SetCircleImage(_Context, item.getAvatar(), avatarIV, R.mipmap.a_ganwu_item_headimg);
        helper.setText(R.id.nicknameTV, item.getNickname());
        helper.setText(R.id.contentTV, item.getContent());

    }
}
