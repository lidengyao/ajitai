package com.hxsoft.ajitai.ui.fragment;

import android.os.Bundle;
import android.os.Handler;
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
import com.hxsoft.ajitai.adapter.A_Caudiocomment_Adapter;
import com.hxsoft.ajitai.adapter.A_Cvideocomment_Adapter;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.info.A_Caudiocomment_Info;
import com.hxsoft.ajitai.model.info.A_Caudiocomment_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Info;
import com.hxsoft.ajitai.model.info.A_Cvideocomment_Info;
import com.hxsoft.ajitai.model.info.A_caudiocomment_Bean;
import com.hxsoft.ajitai.present.A_YinPinZhiBo_XiangQing_HuDong_Present;
import com.hxsoft.ajitai.ui.view.A_YinPinZhiBo_XiangQing_HuDong_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class Y_Fragment_YinPinZhiBo_XiangQing_HuDong extends MvpFragment<A_YinPinZhiBo_XiangQing_HuDong_Present> implements A_YinPinZhiBo_XiangQing_HuDong_View {


    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
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
    private Integer cid;


    private int page = 1;
    private int size = 10;
    private A_Caudiocomment_Adapter adapter;
    private ArrayList<A_Caudiocomment_Info> infoArrayList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_yinpinzhibo_xiangqing_hudong;
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

        SendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = ContentET.getText().toString();
                if (content.equals("")) {
                    showMessage("请输入评论内容");
                    return;
                }

                A_caudiocomment_Bean a_caudiocomment_bean = new A_caudiocomment_Bean();
                a_caudiocomment_bean.setComment(content);
                a_caudiocomment_bean.setVid(cid);
                presenter.caudiocommentAddcomment(a_caudiocomment_bean, getContext());

            }
        });

        adapter = new A_Caudiocomment_Adapter(getContext(), infoArrayList, R.layout.a_item_zhibopinglun, 0);

        DataListView.setAdapter(adapter);
        DataListView.setOnPullLoadMoreListener(new PullLoadMoreListView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {

                page = 1;
                getData();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);

            }

            @Override
            public void onLoadMore() {
                page += 1;
                getData();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);
            }
        });
    }

    public void SetData(A_Cmediaclasses_Info a_cmediaclasses_info) {
        cid = a_cmediaclasses_info.getCid();
    }


    public void getData() {
        presenter.caudiocommentPage(cid, page, size, getContext());
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
    protected A_YinPinZhiBo_XiangQing_HuDong_Present createPresenter() {
        return new A_YinPinZhiBo_XiangQing_HuDong_Present();
    }

    @Override
    public void caudiocommentAddcommentSuccess(Boolean model) {
        ContentET.setText("");
        getData();
    }

    @Override
    public void caudiocommentPageSuccess(A_Caudiocomment_Total_Info model) {
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<A_Caudiocomment_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
