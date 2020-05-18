package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.A_Caudiocomment_Info;
import com.hxsoft.ajitai.model.info.A_Cvideocomment_Info;
import com.hxsoft.ajitai.utils.GlideControl;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_Caudiocomment_Adapter extends CommonAdapter<A_Caudiocomment_Info> {

    private Context _Context;
    private Integer _type;

    public A_Caudiocomment_Adapter(Context context, List<A_Caudiocomment_Info> data, int itemLayoutId, Integer type) {
        super(context, data, itemLayoutId);
        _Context = context;
        _type = type;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_Caudiocomment_Info item) {

        ImageView avatarIV = (ImageView) helper.getView(R.id.avatarIV);
        GlideControl.SetCircleImage(_Context, item.getAvatar(), avatarIV, R.mipmap.a_ganwu_item_headimg);
        helper.setText(R.id.nicknameTV, item.getNickname());
        helper.setText(R.id.contentTV, item.getContent());

    }
}
