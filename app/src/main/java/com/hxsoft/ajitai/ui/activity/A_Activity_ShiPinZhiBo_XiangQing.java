package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShiPinZhiBo_XiangQing_HuDong;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShiPinZhiBo_XiangQing_ZhuBan;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_ShiPinZhiBoFenXiang;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ShiPinZhiBo_XiangQing extends MvpActivity {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.BackIV)
    ImageView BackIV;
    @Bind(R.id.HeadToolbar)
    Toolbar HeadToolbar;
    @Bind(R.id.BaoMingBtn)
    Button BaoMingBtn;
    @Bind(R.id.ContentET)
    EditText ContentET;
    @Bind(R.id.Img_ShareLL)
    LinearLayout ImgShareLL;
    @Bind(R.id.SendBtn)
    Button SendBtn;
    @Bind(R.id.CaoZuoLL)
    LinearLayout CaoZuoLL;
    @Bind(R.id.BottomRL)
    RelativeLayout BottomRL;
    @Bind(R.id.FenXinagIV)
    ImageView FenXinagIV;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"主办", "互动"};
    private Y_Fragment_ShiPinZhiBo_XiangQing_ZhuBan y_fragment_shiPinZhiBo_xiangQing_zhuBan;
    private Y_Fragment_ShiPinZhiBo_XiangQing_HuDong y_fragment_shiPinZhiBo_xiangQing_huDong;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_shipinzhibo_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();

        BaoMingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BaoMingBtn.getText().toString().equals("免费报名")) {
                    BaoMingBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_gray_f6f6f6_4_shape));
                    BaoMingBtn.setText("已报名");
                    BaoMingBtn.setTextColor(getResources().getColor(R.color.C808080));
                }
            }
        });

        ContentET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.length() > 0) {
                    ImgShareLL.setVisibility(View.GONE);
                    SendBtn.setVisibility(View.VISIBLE);
                } else {

                    ImgShareLL.setVisibility(View.VISIBLE);
                    SendBtn.setVisibility(View.GONE);
                }
            }
        });

        FenXinagIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
    }

    private void init() {

        y_fragment_shiPinZhiBo_xiangQing_zhuBan = new Y_Fragment_ShiPinZhiBo_XiangQing_ZhuBan();
        y_fragment_shiPinZhiBo_xiangQing_huDong = new Y_Fragment_ShiPinZhiBo_XiangQing_HuDong();
        fragments.add(y_fragment_shiPinZhiBo_xiangQing_zhuBan);
        fragments.add(y_fragment_shiPinZhiBo_xiangQing_huDong);

        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.addTab(MenuTablayout.newTab());
        }

        MenuTablayout.setupWithViewPager(viewPager, false);
        pagerAdapter = new FmPagerAdapter(fragments, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.getTabAt(i).setText(titles[i]);
        }

    }

    @Override
    protected LoginPresent createPresenter() {
        return new LoginPresent();
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


}
