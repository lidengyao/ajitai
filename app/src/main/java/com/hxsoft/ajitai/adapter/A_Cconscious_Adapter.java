package com.hxsoft.ajitai.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.Inf.OnGanWuClickListener;
import com.hxsoft.ajitai.model.Inf.OnGanWu_HuiFuPingLun_ClickListener;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.model.bean.ExtralsBean;
import com.hxsoft.ajitai.ui.activity.A_Activity_Vedio;
import com.hxsoft.ajitai.ui.activity.FullyGridLayoutManager;
import com.hxsoft.ajitai.ui.activity.MainActivity;
import com.hxsoft.ajitai.ui.activity.Picture_Select_Activity;
import com.hxsoft.ajitai.utils.AutoLinefeedLayout;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.GlideControl;
import com.hxsoft.ajitai.utils.NoLineClickSpan;
import com.hxsoft.ajitai.utils.PrettyTime;
import com.hxsoft.ajitai.utils.SpUtils;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.entity.LocalMedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_Cconscious_Adapter extends CommonAdapter<A_Conscious_Info> {

    private Context _Context;
    private Activity _Activity;
    private OnGanWuClickListener _OnGanWuClickListener;
    private OnGanWu_HuiFuPingLun_ClickListener _OnGanWu_HuiFuPingLun_ClickListener;

    public A_Cconscious_Adapter(Context context, Activity activity, List<A_Conscious_Info> data, int itemLayoutId, OnGanWuClickListener onGanWuClickListener, OnGanWu_HuiFuPingLun_ClickListener onGanWu_huiFuPingLun_clickListener) {
        super(context, data, itemLayoutId);
        _Context = context;
        _Activity = activity;
        _OnGanWuClickListener = onGanWuClickListener;
        _OnGanWu_HuiFuPingLun_ClickListener = onGanWu_huiFuPingLun_clickListener;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_Conscious_Info item) {

        ImageView avatarIV = (ImageView) helper.getView(R.id.avatarIV);
        GlideControl.SetCircleImage(_Context, item.getAvatar(), avatarIV, R.mipmap.a_ganwu_item_headimg);
        helper.setText(R.id.nicknameTV, item.getNickname());
        helper.setText(R.id.createTimeTV, PrettyTime.friendly_time(item.getCreateTime()));
        if (item.getContent().equals("")) {
            helper.setVisibility(R.id.contentTV, View.GONE);
        } else {
            helper.setVisibility(R.id.contentTV, View.VISIBLE);
            helper.setText(R.id.contentTV, item.getContent());
        }

        helper.setText(R.id.positionTV, item.getPosition());
        LinearLayout DianZanLL = (LinearLayout) helper.getView(R.id.DianZanLL);
        ImageView DianZanIV = (ImageView) helper.getView(R.id.DianZanIV);
        TextView DianZanNumTV = (TextView) helper.getView(R.id.DianZanNumTV);
        LinearLayout FenXiang_LL = (LinearLayout) helper.getView(R.id.FenXiang_LL);
        LinearLayout PingLunLL = (LinearLayout) helper.getView(R.id.PingLunLL);
        LinearLayout JiaoHuLL = (LinearLayout) helper.getView(R.id.JiaoHuLL);
        LinearLayout commentsLL = (LinearLayout) helper.getView(R.id.commentsLL);
        LinearLayout ZhuanFa_LL = (LinearLayout) helper.getView(R.id.ZhuanFa_LL);


        ZhuanFa_LL.setTag(R.id.one, item);
        ZhuanFa_LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Conscious_Info a_conscious_info = (A_Conscious_Info) v.getTag(R.id.one);
                _OnGanWuClickListener.OnClick(5, a_conscious_info);
            }
        });

        FenXiang_LL.setTag(R.id.one, item);
        FenXiang_LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Conscious_Info a_conscious_info = (A_Conscious_Info) v.getTag(R.id.one);
                _OnGanWuClickListener.OnClick(1, a_conscious_info);
            }
        });
        DianZanLL.setTag(R.id.one, item);
        DianZanLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Conscious_Info a_conscious_info = (A_Conscious_Info) v.getTag(R.id.one);
                _OnGanWuClickListener.OnClick(3, a_conscious_info);
            }
        });

        PingLunLL.setTag(R.id.one, item);
        PingLunLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Conscious_Info a_conscious_info = (A_Conscious_Info) v.getTag(R.id.one);
                _OnGanWuClickListener.OnClick(2, a_conscious_info);
            }
        });

        Boolean isJiaoHu = false;
        //region 点攒
        if (item.getThumbs().size() > 0) {
            isJiaoHu = true;

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


            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(_Context, DbKeyS.A_User_Info);
            A_User_Info a_user_info = gson.fromJson(gsonData, A_User_Info.class);
            //判断是否当前操作人是否已经点攒
            Boolean IsThumb = false;
            for (int i = 0; i < item.getThumbs().size(); i++) {
                A_Conscious_Info.ThumbsBean thumbsBean = item.getThumbs().get(i);
                if (thumbsBean.getUid() == a_user_info.getSysUser().getUid()) {
                    IsThumb = true;
                }
            }

            if (IsThumb == true) {
                DianZanNumTV.setText(item.getThumbs().size() + "");
                DianZanIV.setImageResource(R.mipmap.ganwu_dianzianhou);
            } else {
                DianZanNumTV.setText(item.getThumbs().size() + "");
                DianZanIV.setImageResource(R.mipmap.a_ganwu_dianzan);
            }


        } else {
            DianZanNumTV.setText("点攒");
            DianZanIV.setImageResource(R.mipmap.a_ganwu_dianzan);
            helper.setVisibility(R.id.thumbsLL, View.GONE);
        }
        //endregion

        //region 图片
        AutoLinefeedLayout PicAutoLinefeedLayout = (AutoLinefeedLayout) helper.getView(R.id.PicAutoLinefeedLayout);
        PicAutoLinefeedLayout.removeAllViews();

        ArrayList<ExtralsBean> yuanshiImgs = item.getExtrals();
//        if (item.getRelayObject() == null) {
//            yuanshiImgs = item.getExtrals();
//        } else {
//            yuanshiImgs = item.getRelayObject().getExtrals();
//        }
        if (yuanshiImgs.size() > 0) {
            for (int i = 0; i < yuanshiImgs.size(); i++) {
                ExtralsBean extralsBean = yuanshiImgs.get(i);
                View a_item_ganwu_pic = View.inflate(_Context, R.layout.a_item_ganwu_pic, null);
                ImageView ganwuIV = (ImageView) a_item_ganwu_pic.findViewById(R.id.ganwuIV);
                ImageView BoFangIV = (ImageView) a_item_ganwu_pic.findViewById(R.id.BoFangIV);
                if (extralsBean.getType() == 1) {
                    BoFangIV.setVisibility(View.VISIBLE);
                } else {
                    BoFangIV.setVisibility(View.GONE);
                }
                GlideControl.SetImage(_Context, extralsBean.getUri(), ganwuIV, R.mipmap.jiazaiing);
                PicAutoLinefeedLayout.addView(a_item_ganwu_pic);

                ganwuIV.setTag(R.id.one, yuanshiImgs);
                ganwuIV.setTag(R.id.two, i);
                ganwuIV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ArrayList<ExtralsBean> extralsBeanArrayList = (ArrayList<ExtralsBean>) v.getTag(R.id.one);
                        List<LocalMedia> selectList_Detail = new ArrayList<>();
                        if (extralsBeanArrayList != null) {

                            for (int i = 0; i < extralsBeanArrayList.size(); i++) {
                                ExtralsBean extralsBean = extralsBeanArrayList.get(i);
                                LocalMedia localMedia = new LocalMedia();
                                localMedia.setChecked(false);
                                localMedia.setCut(false);
                                localMedia.setCompressed(false);
                                localMedia.setPath(extralsBean.getUri());
                                localMedia.setMimeType(extralsBean.getType());
                                selectList_Detail.add(localMedia);


                            }
                        }

                        int Index = (int) v.getTag(R.id.two);

                        LocalMedia media = selectList_Detail.get(Index);
                        int mediaType = media.getMimeType();
                        switch (mediaType) {
                            case 1:
                                // 预览视频
                                Intent intent = new Intent(_Context, A_Activity_Vedio.class);
                                intent.putExtra("url",media.getPath());
                                _Context.startActivity(intent);
//                                PictureSelector.create(_Activity).externalPictureVideo(media.getPath());
                                break;
                            case 2:
                                // 预览图片 可自定长按保存路径
                                PictureSelector.create(_Activity).themeStyle(R.style.picture_default_style).openExternalPreview(Index, "/custom_file", selectList_Detail);
//                                PictureSelector.create(_Activity).externalPicturePreview(Index, selectList_Detail);
                                break;

                            case 3:
                                // 预览音频
                                PictureSelector.create(_Activity).externalPictureAudio(media.getPath());
                                break;

                        }

                    }
                });
            }
        }
        //endregion

        //region 评论
        commentsLL.removeAllViews();
        if (item.getComments().size() > 0) {
            isJiaoHu = true;


            for (int i = 0; i < item.getComments().size(); i++) {
                A_Conscious_Info.CommentsBean commentsBean = item.getComments().get(i);

                if (commentsBean.getReplyid() == 0) {
                    View a_item_ganwu_pinglun = View.inflate(_Context, R.layout.a_item_ganwu_pinglun, null);
                    LinearLayout ganWuPingLunLL = (LinearLayout) a_item_ganwu_pinglun.findViewById(R.id.ganWuPingLunLL);
                    TextView nicknameTV = (TextView) a_item_ganwu_pinglun.findViewById(R.id.nicknameTV);
                    TextView contentTV = (TextView) a_item_ganwu_pinglun.findViewById(R.id.contentTV);

                    nicknameTV.setText(commentsBean.getNickname() + ":");
                    contentTV.setText(commentsBean.getContent());

                    ganWuPingLunLL.setTag(R.id.one, commentsBean);
                    ganWuPingLunLL.setTag(R.id.two, item);
                    ganWuPingLunLL.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            A_Conscious_Info.CommentsBean commentsBean1 = (A_Conscious_Info.CommentsBean) v.getTag(R.id.one);
                            A_Conscious_Info a_conscious_info = (A_Conscious_Info) v.getTag(R.id.two);
                            _OnGanWu_HuiFuPingLun_ClickListener.OnClick(4, a_conscious_info, commentsBean1);
                        }
                    });
                    commentsLL.addView(a_item_ganwu_pinglun);
                } else {
                    View a_item_ganwu_pinglun = View.inflate(_Context, R.layout.a_item_ganwu_huifupinglun, null);
                    LinearLayout ganWuPingLunLL = (LinearLayout) a_item_ganwu_pinglun.findViewById(R.id.ganWuPingLunLL);
                    TextView nicknameTV = (TextView) a_item_ganwu_pinglun.findViewById(R.id.nicknameTV);
                    TextView replynicknameTV = (TextView) a_item_ganwu_pinglun.findViewById(R.id.replynicknameTV);
                    TextView contentTV = (TextView) a_item_ganwu_pinglun.findViewById(R.id.contentTV);

                    nicknameTV.setText(commentsBean.getNickname());
                    contentTV.setText(commentsBean.getContent());
                    replynicknameTV.setText(commentsBean.getReplynickname() + ":");

                    ganWuPingLunLL.setTag(R.id.one, commentsBean);
                    ganWuPingLunLL.setTag(R.id.two, item);
                    ganWuPingLunLL.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            A_Conscious_Info.CommentsBean commentsBean1 = (A_Conscious_Info.CommentsBean) v.getTag(R.id.one);
                            A_Conscious_Info a_conscious_info = (A_Conscious_Info) v.getTag(R.id.two);
                            _OnGanWu_HuiFuPingLun_ClickListener.OnClick(4, a_conscious_info, commentsBean1);
                        }
                    });
                    commentsLL.addView(a_item_ganwu_pinglun);
                }


            }
        }
        //endregion

        //region 转发内容
        LinearLayout relayLL = (LinearLayout) helper.getView(R.id.relayLL);
        TextView RelayContentTV = (TextView) helper.getView(R.id.RelayContentTV);
        AutoLinefeedLayout RelayImgAutoLinefeedLayout = (AutoLinefeedLayout) helper.getView(R.id.RelayImgAutoLinefeedLayout);
        if (item.getExtrals() != null) {
            if (item.getExtrals().size() > 0) {
                relayLL.setVisibility(View.GONE);
            } else {
                relayLL.setVisibility(View.VISIBLE);
//            PicAutoLinefeedLayout.setVisibility(View.GONE);
                RelayContentTV.setText("");
                String name = "@" + item.getRelayObject().getNickname() + ":";
                String content = item.getRelayObject().getContent();
                SpannableString spStr = new SpannableString(name + content);
//            NoLineClickSpan clickSpan = new NoLineClickSpan("#268F83"); //设置超链接
                NoLineClickSpan clickSpan2 = new NoLineClickSpan("#268F83") {
                    @Override
                    public void onClick(View widget) {
                        Toast.makeText(_Context, name, Toast.LENGTH_SHORT).show();
                    }
                }; //设置超链接
//            spStr.setSpan(clickSpan, 0, name.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spStr.setSpan(clickSpan2, 0, name.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                RelayContentTV.append(spStr);
                RelayContentTV.setMovementMethod(LinkMovementMethod.getInstance());
                //设置文本不高亮，如果需要点击后高亮文本，删掉这句即可
//            RelayContentTV.setHighlightColor(Color.parseColor("#00000000"));

                ArrayList<ExtralsBean> zhuanfaImgs = item.getRelayObject().getExtrals();
                RelayImgAutoLinefeedLayout.removeAllViews();
                if (zhuanfaImgs != null && zhuanfaImgs.size() > 0) {
                    for (int i = 0; i < zhuanfaImgs.size(); i++) {
                        ExtralsBean extralsBean = zhuanfaImgs.get(i);
                        View a_item_ganwu_pic = View.inflate(_Context, R.layout.a_item_ganwu_pic, null);
                        ImageView ganwuIV = (ImageView) a_item_ganwu_pic.findViewById(R.id.ganwuIV);
                        ImageView BoFangIV = (ImageView) a_item_ganwu_pic.findViewById(R.id.BoFangIV);
                        if (extralsBean.getType() == 1) {
                            BoFangIV.setVisibility(View.VISIBLE);
                        } else {
                            BoFangIV.setVisibility(View.GONE);
                        }

                        GlideControl.SetImage(_Context, zhuanfaImgs.get(i).getUri(), ganwuIV, R.mipmap.jiazaiing);
                        RelayImgAutoLinefeedLayout.addView(a_item_ganwu_pic);

                        ganwuIV.setTag(R.id.one, zhuanfaImgs);
                        ganwuIV.setTag(R.id.two, i);
                        ganwuIV.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ArrayList<ExtralsBean> extralsBeanArrayList = (ArrayList<ExtralsBean>) v.getTag(R.id.one);
                                List<LocalMedia> selectList_Detail = new ArrayList<>();
                                if (extralsBeanArrayList != null) {

                                    for (int i = 0; i < extralsBeanArrayList.size(); i++) {
                                        ExtralsBean extralsBean = extralsBeanArrayList.get(i);
                                        LocalMedia localMedia = new LocalMedia();
                                        localMedia.setChecked(false);
                                        localMedia.setCut(false);
                                        localMedia.setCompressed(false);
                                        localMedia.setPath(extralsBean.getUri());
                                        localMedia.setMimeType(extralsBean.getType());
                                        selectList_Detail.add(localMedia);


                                    }
                                }

                                int Index = (int) v.getTag(R.id.two);

                                LocalMedia media = selectList_Detail.get(Index);
                                int mediaType = media.getMimeType();
                                switch (mediaType) {
                                    case 1:
                                        Intent intent = new Intent(_Context, A_Activity_Vedio.class);
                                        intent.putExtra("url",media.getPath());
                                        _Context.startActivity(intent);
//                                        PictureSelector.create(_Activity).externalPictureVideo(media.getPath());
                                        break;
                                    case 2:
                                        // 预览图片 可自定长按保存路径
                                        PictureSelector.create(_Activity).themeStyle(R.style.picture_default_style).openExternalPreview(Index, "/custom_file", selectList_Detail);
//                                PictureSelector.create(_Activity).externalPicturePreview(Index, selectList_Detail);
                                        break;

                                    case 3:
                                        // 预览音频
                                        PictureSelector.create(_Activity).externalPictureAudio(media.getPath());
                                        break;

                                }

                            }
                        });
                    }
                }
            }
        }
//        if (item.getRelayObject() == null) {
//            relayLL.setVisibility(View.GONE);
//        } else {
//
//        }


        //endregion

        if (isJiaoHu == true)
            JiaoHuLL.setVisibility(View.VISIBLE);
        else {
            JiaoHuLL.setVisibility(View.GONE);
        }
    }
}
