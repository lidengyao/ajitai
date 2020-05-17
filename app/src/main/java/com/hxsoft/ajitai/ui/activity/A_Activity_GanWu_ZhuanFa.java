package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.info.CreateCconscious_Bean;
import com.hxsoft.ajitai.present.A_ZhuanFaGanWu_Present;
import com.hxsoft.ajitai.ui.view.A_ZhuanFaGanWu_View;
import com.hxsoft.ajitai.utils.GlideControl;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_GanWu_ZhuanFa extends MvpActivity<A_ZhuanFaGanWu_Present> implements A_ZhuanFaGanWu_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.ZhuanFaIV)
    ImageView ZhuanFaIV;
    @Bind(R.id.ZuoZheTV)
    TextView ZuoZheTV;
    @Bind(R.id.ContentTV)
    TextView ContentTV;
    @Bind(R.id.GuanBiLuYin_IV)
    ImageView GuanBiLuYinIV;
    @Bind(R.id.WanCheng_TV)
    TextView WanChengTV;
    @Bind(R.id.LuYinIngRL)
    RelativeLayout LuYinIngRL;
    @Bind(R.id.BoFang_IV)
    ImageView BoFangIV;
    @Bind(R.id.ShiJian_TV)
    TextView ShiJianTV;
    @Bind(R.id.WanChengLuYin_RL)
    RelativeLayout WanChengLuYinRL;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.ZhuanFaContentET)
    EditText ZhuanFaContentET;
    private A_Conscious_Info a_conscious_info;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_ganwu_zhuanfa;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        a_conscious_info = (A_Conscious_Info) getIntent().getSerializableExtra("A_Conscious_Info");


        if (a_conscious_info.getRelayObject() == null) {
            if (a_conscious_info.getExtrals().size() > 0) {
                ZhuanFaIV.setVisibility(View.VISIBLE);
                GlideControl.SetImage(getContext(), a_conscious_info.getExtrals().get(0).getUri(), ZhuanFaIV, R.mipmap.jiazaiing);
                ContentTV.setText(a_conscious_info.getContent());
                ZuoZheTV.setText("@" + a_conscious_info.getNickname());

            } else {
                ZhuanFaIV.setVisibility(View.GONE);
            }
        } else {
            if (a_conscious_info.getRelayObject().getExtrals().size() > 0) {
                ZhuanFaIV.setVisibility(View.VISIBLE);
                GlideControl.SetImage(getContext(), a_conscious_info.getRelayObject().getExtrals().get(0).getUri(), ZhuanFaIV, R.mipmap.jiazaiing);
                ContentTV.setText(a_conscious_info.getRelayObject().getContent());
                ZuoZheTV.setText("@" + a_conscious_info.getNickname());

            } else {
                ZhuanFaIV.setVisibility(View.GONE);
            }
        }


        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ZhuanFaContentET.getText().toString().trim().equals("")) {
                    showMessage("你还没有填写感悟的内容哦");
                    return;
                }

                CreateCconscious_Bean createCconscious_bean = new CreateCconscious_Bean();

                createCconscious_bean.setContent(ZhuanFaContentET.getText().toString());
                createCconscious_bean.setPosition("测试位置");
                createCconscious_bean.setRelaycid(a_conscious_info.getCid());
                mPresenter.postConscious(createCconscious_bean, getContext());
            }
        });
    }

    @Override
    protected A_ZhuanFaGanWu_Present createPresenter() {
        return new A_ZhuanFaGanWu_Present();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initView() {
        super.initView();
    }


    @Override
    public void postConsciousSuccess(Boolean model) {
        showMessage("转发成功");
        finish();
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
