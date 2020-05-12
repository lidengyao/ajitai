package com.hxsoft.ajitai.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.present.A_WoDe_Present;
import com.hxsoft.ajitai.ui.activity.A_Activity_ChengJiDan;
import com.hxsoft.ajitai.ui.activity.A_Activity_GeRenXinXi;
import com.hxsoft.ajitai.ui.activity.A_Activity_GouWuChe;
import com.hxsoft.ajitai.ui.activity.A_Activity_LiuYanJianYi;
import com.hxsoft.ajitai.ui.activity.A_Activity_QianBao;
import com.hxsoft.ajitai.ui.activity.A_Activity_SheZhi;
import com.hxsoft.ajitai.ui.activity.A_Activity_WoDeFenSi;
import com.hxsoft.ajitai.ui.activity.A_Activity_WoDeGuanZhu;
import com.hxsoft.ajitai.ui.activity.A_Activity_WoDeKeCheng;
import com.hxsoft.ajitai.ui.activity.A_Activity_WoDeShouCang;
import com.hxsoft.ajitai.ui.view.A_WoDe_View;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.GlideControl;
import com.hxsoft.ajitai.utils.SpUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_WoDe_Fragment extends MvpFragment<A_WoDe_Present> implements A_WoDe_View {
    @Bind(R.id.QianBaoRL)
    RelativeLayout QianBaoRL;
    @Bind(R.id.ChengJiDan_RL)
    RelativeLayout ChengJiDanRL;
    @Bind(R.id.GeRenXinXi_LL)
    LinearLayout GeRenXinXiLL;
    @Bind(R.id.SheZhi_RL)
    RelativeLayout SheZhiRL;
    @Bind(R.id.FenSi_LL)
    LinearLayout FenSiLL;
    @Bind(R.id.GuanZhu_LL)
    LinearLayout GuanZhuLL;
    @Bind(R.id.ShouCang_LL)
    LinearLayout ShouCangLL;
    @Bind(R.id.LiuYanJianYi_RL)
    RelativeLayout LiuYanJianYiRL;
    @Bind(R.id.GouWuChe_RL)
    RelativeLayout GouWuCheRL;
    @Bind(R.id.SendMsg_IV)
    ImageView SendMsgIV;
    @Bind(R.id.WoDeKeCheng_RL)
    RelativeLayout WoDeKeChengRL;
    @Bind(R.id.avatar_IV)
    ImageView avatarIV;
    @Bind(R.id.nickname_TV)
    TextView nicknameTV;
    @Bind(R.id.phone_TTV)
    TextView phoneTTV;

    @Override
    protected A_WoDe_Present createPresenter() {
        return new A_WoDe_Present();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_wode;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WoDeKeChengRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeKeCheng.class);
                startActivity(intent);
            }
        });
        SendMsgIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SmsManager.getDefault().sendTextMessage("18952460823",
//                        null, "付费短信", null, null);
            }
        });

        GouWuCheRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GouWuChe.class);
                startActivity(intent);
            }
        });
        LiuYanJianYiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_LiuYanJianYi.class);
                startActivity(intent);
            }
        });
        ShouCangLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeShouCang.class);
                startActivity(intent);
            }
        });

        GuanZhuLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeGuanZhu.class);
                startActivity(intent);
            }
        });

        FenSiLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeFenSi.class);
                startActivity(intent);
            }
        });
        SheZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_SheZhi.class);
                startActivity(intent);
            }
        });

        GeRenXinXiLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GeRenXinXi.class);
                startActivity(intent);
            }
        });
        QianBaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_QianBao.class);
                startActivity(intent);
            }
        });

        ChengJiDanRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ChengJiDan.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void userInfoSuccess(A_User_Info model) {
        if (model == null)
            return;
        Gson gson = new Gson();
        String gsonStr = gson.toJson(model);
        SpUtils.saveSettingNote(getContext(), DbKeyS.A_User_Info, gsonStr);
        SpUtils.saveSettingNote(getContext(), DbKeyS.uid, model.getSysUser().getUid() + "");

        //UI赋值
        GlideControl.SetCircleImage(getContext(), model.getSysUser().getAvatar(), avatarIV, R.mipmap.a_touxiang);

        nicknameTV.setText(model.getSysUser().getNickname());
        phoneTTV.setText(model.getSysUser().getPhone().substring(0, 3) + "****" + model.getSysUser().getPhone().substring(7, 11));

    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.userInfo(getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
