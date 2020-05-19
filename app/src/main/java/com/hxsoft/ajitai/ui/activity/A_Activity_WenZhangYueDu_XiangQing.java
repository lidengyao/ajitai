package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_Carticlecomment_Adapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.A_Carticlecomment_Info;
import com.hxsoft.ajitai.model.info.A_Carticlecomment_Total_Info;
import com.hxsoft.ajitai.model.info.A_carticlecomment_Bean;
import com.hxsoft.ajitai.model.info.Carticle_Info;
import com.hxsoft.ajitai.present.A_WenZhangYueDu_XiangQing_Present;
import com.hxsoft.ajitai.ui.view.A_WenZhangYueDu_XiangQing_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_WenZhangYueDu_XiangQing extends MvpActivity<A_WenZhangYueDu_XiangQing_Present> implements A_WenZhangYueDu_XiangQing_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
    @Bind(R.id.ContentET)
    EditText ContentET;
    @Bind(R.id.SendBtn)
    Button SendBtn;
    @Bind(R.id.CaoZuoLL)
    LinearLayout CaoZuoLL;
    @Bind(R.id.BottomRL)
    RelativeLayout BottomRL;
    @Bind(R.id.AdesWebView)
    WebView AdesWebView;
    private String aid;
    private int page = 1;
    private int size = 10;
    private A_Carticlecomment_Adapter adapter;
    private ArrayList<A_Carticlecomment_Info> infoArrayList = new ArrayList<>();
    private Carticle_Info carticle_info;
    private WebView desWebView;
    private TextView clicknumTV;
    private TextView supportnumTV;
    private ImageView DianZanIV;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinlingganlu_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        aid = getIntent().getStringExtra("aid");


        adapter = new A_Carticlecomment_Adapter(getContext(), infoArrayList, R.layout.a_item_wenzhangpinglun, 0);

        DataListView.setAdapter(adapter);
        DataListView.setOnPullLoadMoreListener(new PullLoadMoreListView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {

                page = 1;
                getCarticlecomment();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);

            }

            @Override
            public void onLoadMore() {
                page += 1;
                getCarticlecomment();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);
            }
        });

        DataListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getContext(), A_Activity_XinJianShouHuoDiZhi.class);
//                intent.putExtra("type", "1");
//                intent.putExtra("RecordsBean", infoArrayList.get(position));
//                startActivity(intent);
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
                A_carticlecomment_Bean a_carticlecomment_bean = new A_carticlecomment_Bean();
                a_carticlecomment_bean.setAid(Integer.parseInt(aid));
                a_carticlecomment_bean.setComment(content);
                mPresenter.carticlecommentAddcomment(a_carticlecomment_bean, getContext());
            }
        });

        View a_activity_xinlingganlu_xiangqing_header = View.inflate(getContext(), R.layout.a_activity_xinlingganlu_xiangqing_header, null);
        desWebView = (WebView) a_activity_xinlingganlu_xiangqing_header.findViewById(R.id.desWebView);

//        WebSettings settings = desWebView.getSettings();
//        settings.setJavaScriptEnabled(true);
//        settings.setSupportZoom(true);
//        settings.setBuiltInZoomControls(true);


        DataListView.addHeaderView(a_activity_xinlingganlu_xiangqing_header);

        View a_activity_xinlingganlu_xiangqing_header_dianzan = View.inflate(getContext(), R.layout.a_activity_xinlingganlu_xiangqing_header_dianzan, null);
        clicknumTV = (TextView) a_activity_xinlingganlu_xiangqing_header_dianzan.findViewById(R.id.clicknumTV);
        supportnumTV = (TextView) a_activity_xinlingganlu_xiangqing_header_dianzan.findViewById(R.id.supportnumTV);
        DianZanIV = (ImageView) a_activity_xinlingganlu_xiangqing_header_dianzan.findViewById(R.id.DianZanIV);


        LinearLayout supportLL = (LinearLayout) a_activity_xinlingganlu_xiangqing_header_dianzan.findViewById(R.id.supportLL);
        supportLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (carticle_info.getIsthumb() == 1) {
                    mPresenter.heartnectarCancleThumb(Integer.parseInt(aid), getContext());
                } else {
                    mPresenter.heartnectarThumb(Integer.parseInt(aid), getContext());
                }
            }
        });


        DataListView.addHeaderView(a_activity_xinlingganlu_xiangqing_header_dianzan);
        getData();

        //进入代表已阅读
        mPresenter.heartnectarClick(Integer.parseInt(aid), getContext());
    }

    private void getData() {
        mPresenter.carticleDetail(Integer.parseInt(aid), getContext());
    }

    private void getCarticlecomment() {
        mPresenter.carticlecommentPage(Integer.parseInt(aid), page, size, getContext());
    }

    @Override
    protected A_WenZhangYueDu_XiangQing_Present createPresenter() {
        return new A_WenZhangYueDu_XiangQing_Present();
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
    public void carticleDetailSuccess(Carticle_Info model) {

        if (model == null)
            return;
        carticle_info = model;

        desWebView.loadData(carticle_info.getDescription(), "text/html", "UTF-8");
        clicknumTV.setText(model.getClicknum() + "");
        if (model.getSupportnum() > 0) {
            supportnumTV.setText(model.getSupportnum() + "");
        }

        if (carticle_info.getIsthumb() == 1) {
            DianZanIV.setImageResource(R.mipmap.ganwu_dianzianhou);
        } else {
            DianZanIV.setImageResource(R.mipmap.a_ganwu_dianzan);
        }

        getCarticlecomment();
    }

    @Override
    public void carticlecommentPageSuccess(A_Carticlecomment_Total_Info model) {

        SetData(model.getRecords());
    }

    @Override
    public void carticlecommentAddcommentSuccess(Boolean model) {
        ContentET.setText("");
        getCarticlecomment();
    }

    @Override
    public void heartnectarThumbSuccess(Boolean model) {
        DianZanIV.setImageResource(R.mipmap.ganwu_dianzianhou);
        carticle_info.setIsthumb(1);
        getData();
    }

    @Override
    public void heartnectarCancleThumbSuccess(Boolean model) {
        getData();
        DianZanIV.setImageResource(R.mipmap.a_ganwu_dianzan);
        carticle_info.setIsthumb(0);
    }

    @Override
    public void heartnectarClickSuccess(Boolean model) {
        getData();
    }

    private void SetData(final ArrayList<A_Carticlecomment_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
