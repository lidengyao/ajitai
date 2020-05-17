package com.hxsoft.ajitai.ui.fragment;

import android.app.DialogFragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_Cconscious_Adapter;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.Inf.OnGanWuClickListener;
import com.hxsoft.ajitai.model.Inf.OnGanWu_HuiFuPingLun_ClickListener;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.A_Conscious_Total_Info;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.model.info.CommentConscious_Bean;
import com.hxsoft.ajitai.model.info.CommentreplyConscious_Bean;
import com.hxsoft.ajitai.present.A_GanWu_Present;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_FaBuGanWu;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_GuanZhuHaoYou;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_ZhuanFa;
import com.hxsoft.ajitai.ui.view.A_GanWu_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GanWu_FenXiang;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.DownLoadFileManager;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.utils.NoLineClickSpan;
import com.hxsoft.ajitai.utils.SpUtils;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;
import com.hxsoft.ajitai.wxapi.WXAPI;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_GanWu_Fragment extends MvpFragment<A_GanWu_Present> implements A_GanWu_View {


    @Bind(R.id.WenZhangYueDuLL)
    LinearLayout WenZhangYueDuLL;
    @Bind(R.id.HaoYouLL)
    LinearLayout HaoYouLL;
    @Bind(R.id.ShouYeTopRL)
    RelativeLayout ShouYeTopRL;
    @Bind(R.id.FaBuGanWu_RL)
    RelativeLayout FaBuGanWuRL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
    @Bind(R.id.TestTV)
    TextView TestTV;
    private int page = 1;
    private int size = 10;
    private A_Cconscious_Adapter adapter;
    private ArrayList<A_Conscious_Info> infoArrayList = new ArrayList<>();
    private DialogFragment dialogFragment;
    private A_Conscious_Info currentA_Conscious_Info;

    @Override
    protected A_GanWu_Present createPresenter() {
        return new A_GanWu_Present();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_ganwu;
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


//        TestTV.setText("这是一个spannable文本：");
//
//        SpannableString spStr = new SpannableString("sunflowerseat的博客:http://my.csdn.net/Fancy_xty");
//        String s1 = "sunflowerseat";
//        String s2 = "http://my.csdn.net/Fancy_xty";
//        NoLineClickSpan clickSpan = new NoLineClickSpan("#268F83"); //设置超链接
//        ClickableSpan clickSpan2 = new ClickableSpan() {
//            @Override
//            public void onClick(View widget) {
//                Toast.makeText(getContext(), "你点击了" + s2, Toast.LENGTH_SHORT).show();
//            }
//        }; //设置超链接
//        spStr.setSpan(clickSpan, 0, s1.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spStr.setSpan(clickSpan2, spStr.length() - s2.length(), spStr.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        TestTV.append(spStr);
//        TestTV.setMovementMethod(LinkMovementMethod.getInstance());
//        //设置文本不高亮，如果需要点击后高亮文本，删掉这句即可
//        TestTV.setHighlightColor(Color.parseColor("#00000000"));


//        ImageView OperateIVOne = (ImageView) GanwuOneLL.findViewById(R.id.OperateIV);
//        ImageView OperateIVTwo = (ImageView) GanwuTwoLL.findViewById(R.id.OperateIV);
//        LinearLayout ZhuanFa_LL_One = (LinearLayout) GanwuOneLL.findViewById(R.id.ZhuanFa_LL);
//        LinearLayout ZhuanFa_LL_Two = (LinearLayout) GanwuTwoLL.findViewById(R.id.ZhuanFa_LL);
//
//        LinearLayout FenXiang_LL_One = (LinearLayout) GanwuOneLL.findViewById(R.id.FenXiang_LL);
//        LinearLayout FenXiang_LL_Two = (LinearLayout) GanwuTwoLL.findViewById(R.id.FenXiang_LL);

//        FenXiang_LL_One.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//        FenXiang_LL_Two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//        OperateIVOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_GanWu.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//
//
//        OperateIVTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_GanWu.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//
//        ZhuanFa_LL_One.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_GanWu_ZhuanFa.class);
//                startActivity(intent);
//            }
//        });
//        ZhuanFa_LL_Two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_GanWu_ZhuanFa.class);
//                startActivity(intent);
//            }
//        });

        FaBuGanWuRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_FaBuGanWu.class);
                startActivity(intent);
            }
        });

//        SouSuoLL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_GanWu_SouSuo.class);
//                startActivity(intent);
//            }
//        });

        HaoYouLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_GuanZhuHaoYou.class);
                startActivity(intent);
            }
        });
        adapter = new A_Cconscious_Adapter(getContext(), getActivity(), infoArrayList, R.layout.a_item_ganwu, new OnGanWuClickListener() {
            @Override
            public void OnClick(int type, A_Conscious_Info a_conscious_info) {
                currentA_Conscious_Info = a_conscious_info;

                //region 分享
                if (type == 1) {
                    CheckControl_Dialog_GanWu_FenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu_FenXiang.OnCheckControl_dialogClickListener() {
                        @Override
                        public void OnClick(int type) {

                            //微信好友
                            if (type == 0) {

                                String url = currentA_Conscious_Info.getExtrals().size() > 0 ?
                                        currentA_Conscious_Info.getExtrals().get(0).getUri() : null;


                                if (url == null) {
                                    WXAPI.Share("www.baidu.com", "来自" + currentA_Conscious_Info.getNickname() + "的分享", currentA_Conscious_Info.getContent(), "", false);
                                } else {
                                    String fileName = url.substring(url.lastIndexOf("/") + 1);
                                    DownLoadFileManager updateManager = new DownLoadFileManager(getContext());
                                    updateManager.downLoadFile(url, fileName, new DownLoadFileManager.IsDownLoadFinishListener() {
                                        @Override
                                        public void IsDownLoadFinish(Boolean IsFinish) {
                                            WXAPI.Share("www.baidu.com", "来自" + currentA_Conscious_Info.getNickname() + "的分享", currentA_Conscious_Info.getContent(), fileName, true);
                                        }
                                    });
                                }


                            }

                            //朋友圈
                            if (type == 1) {

                                String url = currentA_Conscious_Info.getExtrals().size() > 0 ?
                                        currentA_Conscious_Info.getExtrals().get(0).getUri() : null;

                                if (url == null) {
                                    WXAPI.ShareCOF("www.baidu.com", "来自" + currentA_Conscious_Info.getNickname() + "的分享",
                                            currentA_Conscious_Info.getContent(), "", false);
                                } else {
                                    String fileName = url.substring(url.lastIndexOf("/") + 1);
                                    DownLoadFileManager updateManager = new DownLoadFileManager(getContext());
                                    updateManager.downLoadFile(url, fileName, new DownLoadFileManager.IsDownLoadFinishListener() {
                                        @Override
                                        public void IsDownLoadFinish(Boolean IsFinish) {
                                            WXAPI.ShareCOF("www.baidu.com", "来自" + currentA_Conscious_Info.getNickname() + "的分享",
                                                    currentA_Conscious_Info.getContent(), fileName, true);
                                        }
                                    });
                                }


                            }
                        }
                    });
                }
                //endregion

                //region 评论
                if (type == 2) {
                    dialogFragment = new DefaultDialogFragment(new DefaultDialogFragment.OnSendMsgListener() {
                        @Override
                        public void SendMsg(String msg) {
                            CommentConscious_Bean commentConscious_bean = new CommentConscious_Bean();
                            commentConscious_bean.setCid(currentA_Conscious_Info.getCid());
                            commentConscious_bean.setContent(msg);
                            presenter.commentConscious(commentConscious_bean, getContext());
                        }
                    }, "评论：" + currentA_Conscious_Info.getNickname());
                    dialogFragment.show(getActivity().getFragmentManager(), "DefaultDialogFragment");
                }
                //endregion

                //region 点攒
                if (type == 3) {

                    Gson gson = new Gson();
                    String gsonData = SpUtils.getSettingNote(getContext(), DbKeyS.A_User_Info);
                    A_User_Info a_user_info = gson.fromJson(gsonData, A_User_Info.class);
                    //判断是否当前操作人是否已经点攒
                    Boolean IsThumb = false;
                    for (int i = 0; i < currentA_Conscious_Info.getThumbs().size(); i++) {
                        A_Conscious_Info.ThumbsBean thumbsBean = currentA_Conscious_Info.getThumbs().get(i);
                        if (thumbsBean.getUid() == a_user_info.getSysUser().getUid()) {
                            IsThumb = true;
                        }
                    }

                    if (IsThumb == true) {
                        deleteThumbConscious();
                    } else {
                        thumbConscious();
                    }


                }
                //endregion

                //region 转发
                if (type == 5) {

                    Intent intent = new Intent(getContext(), A_Activity_GanWu_ZhuanFa.class);
                    intent.putExtra("A_Conscious_Info", currentA_Conscious_Info);
                    startActivity(intent);

                }
                //endregion


            }
        }, new OnGanWu_HuiFuPingLun_ClickListener() {
            @Override
            public void OnClick(int type, A_Conscious_Info a_conscious_info, A_Conscious_Info.CommentsBean commentsBean) {
                currentA_Conscious_Info = a_conscious_info;
                //region 回复评论
                if (type == 4) {
                    dialogFragment = new DefaultDialogFragment(new DefaultDialogFragment.OnSendMsgListener() {
                        @Override
                        public void SendMsg(String msg) {
                            CommentreplyConscious_Bean commentreplyConscious_bean = new CommentreplyConscious_Bean();
                            commentreplyConscious_bean.setCmid(commentsBean.getCmid());
                            commentreplyConscious_bean.setContent(msg);
                            presenter.commentreplyConscious(commentreplyConscious_bean, getContext());
                        }
                    }, "回复：" + commentsBean.getNickname());
                    dialogFragment.show(getActivity().getFragmentManager(), "DefaultDialogFragment");
                }
                //endregion
            }
        });

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


    @Override
    public void onResume() {
        super.onResume();
        getData();
    }

    private void getData() {
        presenter.queryConscious(page, size, getContext());
    }

    private void thumbConscious() {
        presenter.thumbConscious(currentA_Conscious_Info.getCid() + "", getContext());
    }

    private void deleteThumbConscious() {
        presenter.deleteThumbConscious(currentA_Conscious_Info.getCid() + "", getContext());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    //点攒
    @Override
    public void thumbConsciousSuccess(Boolean model) {
        if (model == true) {

            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(getContext(), DbKeyS.A_User_Info);
            A_User_Info a_user_info = gson.fromJson(gsonData, A_User_Info.class);
            //判断是否当前操作人是否已经点攒
            Boolean IsThumb = false;
            for (int i = 0; i < currentA_Conscious_Info.getThumbs().size(); i++) {
                A_Conscious_Info.ThumbsBean thumbsBean = currentA_Conscious_Info.getThumbs().get(i);
                if (thumbsBean.getUid() == a_user_info.getSysUser().getUid()) {
                    IsThumb = true;
                }
            }

            if (IsThumb == true)
                return;

            A_Conscious_Info.ThumbsBean thumbsBean = new A_Conscious_Info.ThumbsBean();
            thumbsBean.setUid(a_user_info.getSysUser().getUid());
            thumbsBean.setNickname(a_user_info.getSysUser().getNickname());
            currentA_Conscious_Info.getThumbs().add(thumbsBean);

            adapter.notifyDataSetChanged();
        }
    }

    //取消点攒
    @Override
    public void deleteThumbConsciousSuccess(Boolean model) {
        if (model == true) {

            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(getContext(), DbKeyS.A_User_Info);
            A_User_Info a_user_info = gson.fromJson(gsonData, A_User_Info.class);
            for (int i = 0; i < currentA_Conscious_Info.getThumbs().size(); i++) {
                A_Conscious_Info.ThumbsBean thumbsBean = currentA_Conscious_Info.getThumbs().get(i);
                if (thumbsBean.getUid() == a_user_info.getSysUser().getUid()) {
                    currentA_Conscious_Info.getThumbs().remove(thumbsBean);
                }
            }

            adapter.notifyDataSetChanged();
        }
    }

    //评论结果
    @Override
    public void commentConsciousSuccess(ArrayList<A_Conscious_Info.CommentsBean> model) {
        if (model != null && model.size() > 0) {
            dialogFragment.dismiss();
            currentA_Conscious_Info.setComments(model);
            adapter.notifyDataSetChanged();
        }
    }

    //回复评论
    @Override
    public void commentreplyConsciousSuccess(ArrayList<A_Conscious_Info.CommentsBean> model) {
        if (model != null && model.size() > 0) {
            dialogFragment.dismiss();
            currentA_Conscious_Info.setComments(model);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void queryConsciousSuccess(A_Conscious_Total_Info model) {
        if (model == null)
            return;
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<A_Conscious_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
