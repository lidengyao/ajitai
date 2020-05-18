package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.Heartnectar_Info;
import com.hxsoft.ajitai.utils.GlideControl;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_WenZhang_Adapter extends CommonAdapter<Heartnectar_Info> {

    private Context _Context;
    private Integer _type;

    public A_WenZhang_Adapter(Context context, List<Heartnectar_Info> data, int itemLayoutId, Integer type) {
        super(context, data, itemLayoutId);
        _Context = context;
        _type = type;
    }

    @Override
    public void convert(int position, ViewHolder helper, Heartnectar_Info item) {

        ImageView faceurlIV = (ImageView) helper.getView(R.id.faceurlIV);
        GlideControl.SetImage(_Context, item.getFaceurl(), faceurlIV, R.mipmap.jiazaiing);

        helper.setText(R.id.titleTV, item.getTitle());
        helper.setText(R.id.thumbTV, item.getThumb() + "");
        helper.setText(R.id.createtimeTV, item.getCreatetime());

    }
}
