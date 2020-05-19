package com.hxsoft.ajitai.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.ui.activity.A_Activity_DaJiangTang;
import com.hxsoft.ajitai.ui.activity.A_Activity_DuShuHui;
import com.hxsoft.ajitai.ui.activity.A_Activity_DuShuHui_List;
import com.hxsoft.ajitai.ui.activity.A_Activity_FaXian_SouSuo;
import com.hxsoft.ajitai.ui.activity.A_Activity_FaXian_WenZhangYueDu;
import com.hxsoft.ajitai.ui.activity.A_Activity_LianMengYiYuan;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShangCheng;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShangPin_XiangQing;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShiPinZhiBo;
import com.hxsoft.ajitai.ui.activity.A_Activity_XianChangJiangZuo;
import com.hxsoft.ajitai.ui.activity.A_Activity_XiaoXi;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinLingGanLu;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinLingXiangYue;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinLingXiangYue_XiangQing;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinShenHuDong;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinYuanQiang;
import com.hxsoft.ajitai.ui.activity.A_Activity_XueYuanHuiBao;
import com.hxsoft.ajitai.ui.activity.A_Activity_YangShengGuan;
import com.hxsoft.ajitai.ui.activity.A_Activity_YinPinZhiBo;
import com.hxsoft.ajitai.ui.activity.A_Activity_YinYue;
import com.hxsoft.ajitai.utils.GlideControl;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_FaXian_Fragment extends MvpFragment {


    @Bind(R.id.WenZhangYueDuLL)
    LinearLayout WenZhangYueDuLL;
    @Bind(R.id.XiaoXi_LL)
    LinearLayout XiaoXiLL;
    @Bind(R.id.ShouYeTopRL)
    RelativeLayout ShouYeTopRL;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.DuShuHuiRL)
    RelativeLayout DuShuHuiRL;
    @Bind(R.id.ShangChengLL)
    LinearLayout ShangChengLL;
    @Bind(R.id.TuiJiangRL)
    RelativeLayout TuiJiangRL;
    @Bind(R.id.XinLingXiangYueRL)
    RelativeLayout XinLingXiangYueRL;
    @Bind(R.id.XueYuanHuiBaoLL)
    LinearLayout XueYuanHuiBaoLL;
    @Bind(R.id.YangShengLL)
    LinearLayout YangShengLL;
    @Bind(R.id.YinPinZhiBoLL)
    LinearLayout YinPinZhiBoLL;
    @Bind(R.id.YinYueLL)
    LinearLayout YinYueLL;
    @Bind(R.id.LianMengYiYuanLL)
    LinearLayout LianMengYiYuanLL;
    @Bind(R.id.XinYuanQiangLL)
    LinearLayout XinYuanQiangLL;
    @Bind(R.id.ZhiBoLL)
    LinearLayout ZhiBoLL;
    @Bind(R.id.DuShuHui_IV)
    ImageView DuShuHuiIV;
    @Bind(R.id.XinShenHuDong_IV)
    ImageView XinShenHuDongIV;
    @Bind(R.id.XinLingGanLu_IV)
    ImageView XinLingGanLuIV;
    @Bind(R.id.DuShuHui4_IV)
    ImageView DuShuHui4IV;
    @Bind(R.id.DuShuHui5_IV)
    ImageView DuShuHui5IV;
    @Bind(R.id.DuShuHui6_IV)
    ImageView DuShuHui6IV;
    @Bind(R.id.SouSuo_LL)
    LinearLayout SouSuoLL;
    @Bind(R.id.ShangPin1_LL)
    LinearLayout ShangPin1LL;
    @Bind(R.id.ZiXun_LL)
    LinearLayout ZiXunLL;
    @Bind(R.id.JianKangLvYou_LL)
    LinearLayout JianKangLvYouLL;
    @Bind(R.id.XianChangJiangZuo_LL)
    LinearLayout XianChangJiangZuoLL;
    @Bind(R.id.XinLingGanLu_LL)
    LinearLayout XinLingGanLuLL;
    @Bind(R.id.DaJiangTang_LL)
    LinearLayout DaJiangTangLL;

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_faxian;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        DaJiangTangLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("敬请期待");
//                Intent intent = new Intent(getContext(), A_Activity_DaJiangTang.class);
//                startActivity(intent);
            }
        });
        ZiXunLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("敬请期待");
            }
        });

        JianKangLvYouLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("敬请期待");
//                Intent intent = new Intent(getContext(), A_Activity_FaXian_WenZhangYueDu.class);
//                startActivity(intent);
            }
        });

        XianChangJiangZuoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XianChangJiangZuo.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        XinLingGanLuLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_FaXian_WenZhangYueDu.class);
                startActivity(intent);
            }
        });
        XiaoXiLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XiaoXi.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });


        ShangPin1LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_ShangPin_XiangQing.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        WenZhangYueDuLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_FaXian_WenZhangYueDu.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        SouSuoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_FaXian_SouSuo.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        DuShuHuiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_DuShuHui.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        ShangChengLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_ShangCheng.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        TuiJiangRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_ShangCheng.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        XinLingXiangYueRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XinLingXiangYue.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        XueYuanHuiBaoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        YangShengLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_YangShengGuan.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        YinPinZhiBoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_YinPinZhiBo.class);
                startActivity(intent);
            }
        });

        YinYueLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_YinYue.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        LianMengYiYuanLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_LianMengYiYuan.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        XinYuanQiangLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XinYuanQiang.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });

        ZhiBoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShiPinZhiBo.class);
                startActivity(intent);
            }
        });

        DuShuHuiIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_DuShuHui_List.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        XinShenHuDongIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XinShenHuDong.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        XinLingGanLuIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XinLingGanLu.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        DuShuHui4IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XinLingXiangYue_XiangQing.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        DuShuHui5IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XinLingXiangYue_XiangQing.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });
        DuShuHui6IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_XinLingXiangYue_XiangQing.class);
//                startActivity(intent);
                showMessage("敬请期待");
            }
        });


        GlideControl.SetFilletImage_Mipmap(getContext(), R.mipmap.a_shuji1, DuShuHuiIV, R.mipmap.jiazaiing, 4);
        GlideControl.SetFilletImage_Mipmap(getContext(), R.mipmap.a_ditu1, XinShenHuDongIV, R.mipmap.jiazaiing, 4);
        GlideControl.SetFilletImage_Mipmap(getContext(), R.mipmap.a_ditu2, XinLingGanLuIV, R.mipmap.jiazaiing, 4);

        GlideControl.SetFilletImage_Mipmap(getContext(), R.mipmap.a_ditu2, DuShuHui4IV, R.mipmap.jiazaiing, 4);
        GlideControl.SetFilletImage_Mipmap(getContext(), R.mipmap.a_shuji1, DuShuHui5IV, R.mipmap.jiazaiing, 4);
        GlideControl.SetFilletImage_Mipmap(getContext(), R.mipmap.a_ditu1, DuShuHui6IV, R.mipmap.jiazaiing, 4);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
