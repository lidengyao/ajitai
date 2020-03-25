package com.hxsoft.ajitai.ui.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class Y_Fragment_ShiPinZhiBo_XiangQing_HuDong extends MvpFragment {


    @Bind(R.id.Img_ShareLL)
    LinearLayout ImgShareLL;
    @Bind(R.id.SendBtn)
    Button SendBtn;
    @Bind(R.id.CaoZuoLL)
    LinearLayout CaoZuoLL;
    @Bind(R.id.BottomRL)
    RelativeLayout BottomRL;
    @Bind(R.id.ContentET)
    EditText ContentET;

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_shipinzhibo_xiangqing_hudong;
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
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

}
