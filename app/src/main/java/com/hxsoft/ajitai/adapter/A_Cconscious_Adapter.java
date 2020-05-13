package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.utils.AutoLinefeedLayout;
import com.hxsoft.ajitai.utils.GlideControl;
import com.hxsoft.ajitai.utils.PrettyTime;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_Cconscious_Adapter extends CommonAdapter<A_Conscious_Info> {

    private Context _Context;
    private Integer _type;

    public A_Cconscious_Adapter(Context context, List<A_Conscious_Info> data, int itemLayoutId, Integer type) {
        super(context, data, itemLayoutId);
        _Context = context;
        _type = type;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_Conscious_Info item) {

        ImageView avatarIV = (ImageView) helper.getView(R.id.avatarIV);
        GlideControl.SetCircleImage(_Context, item.getAvatar(), avatarIV, R.mipmap.a_ganwu_item_headimg);
        helper.setText(R.id.nicknameTV, item.getNickname());
        helper.setText(R.id.createTimeTV, PrettyTime.friendly_time(item.getCreateTime()));
        helper.setText(R.id.contentTV, item.getContent());

        if (item.getThumbs().size() > 0) {
            helper.setVisibility(R.id.thumbsLL, View.VISIBLE);
            AutoLinefeedLayout thumbsAutoLinefeedLayout = (AutoLinefeedLayout) helper.getView(R.id.thumbsAutoLinefeedLayout);
            thumbsAutoLinefeedLayout.removeAllViews();
            for (int i = 0; i < item.getThumbs().size(); i++) {
                A_Conscious_Info.ThumbsBean thumbsBean = item.getThumbs().get(i);
                View a_item_ganwu_thumb = View.inflate(_Context, R.layout.a_item_ganwu_thumb, null);
                TextView nicknameTV = (TextView) a_item_ganwu_thumb.findViewById(R.id.nicknameTV);
                if (i == item.getThumbs().size() - 1) {
                    nicknameTV.setText(thumbsBean.getNickname());
                } else {
                    nicknameTV.setText(thumbsBean.getNickname() + ",");
                }

                thumbsAutoLinefeedLayout.addView(a_item_ganwu_thumb);
            }
        } else {
            helper.setVisibility(R.id.thumbsLL, View.GONE);
        }
//        helper.setText(R.id.username_TV, item.getUsername());
//        helper.setText(R.id.phone_TV, item.getPhone());
//        helper.setText(R.id.address_TV, item.getAddress());

    }
}
