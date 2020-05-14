package com.hxsoft.ajitai.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.ui.activity.FullyGridLayoutManager;
import com.hxsoft.ajitai.utils.AutoLinefeedLayout;
import com.hxsoft.ajitai.utils.GlideControl;
import com.hxsoft.ajitai.utils.PrettyTime;
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

    public A_Cconscious_Adapter(Context context, Activity activity, List<A_Conscious_Info> data, int itemLayoutId ) {
        super(context, data, itemLayoutId);
        _Context = context;
        _Activity = activity;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_Conscious_Info item) {

        ImageView avatarIV = (ImageView) helper.getView(R.id.avatarIV);
        GlideControl.SetCircleImage(_Context, item.getAvatar(), avatarIV, R.mipmap.a_ganwu_item_headimg);
        helper.setText(R.id.nicknameTV, item.getNickname());
        helper.setText(R.id.createTimeTV, PrettyTime.friendly_time(item.getCreateTime()));
        helper.setText(R.id.contentTV, item.getContent());

        if (item.getThumbs().size() > 0) {
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
        } else {
            helper.setVisibility(R.id.thumbsLL, View.GONE);
        }

        AutoLinefeedLayout PicAutoLinefeedLayout = (AutoLinefeedLayout) helper.getView(R.id.PicAutoLinefeedLayout);
        PicAutoLinefeedLayout.removeAllViews();
        if (item.getExtrals().size() > 0) {
            for (int i = 0; i < item.getExtrals().size(); i++) {
                View a_item_ganwu_pic = View.inflate(_Context, R.layout.a_item_ganwu_pic, null);
                ImageView ganwuIV = (ImageView) a_item_ganwu_pic.findViewById(R.id.ganwuIV);
                GlideControl.SetImage(_Context, item.getExtrals().get(i).getUri(), ganwuIV, R.mipmap.jiazaiing);
                PicAutoLinefeedLayout.addView(a_item_ganwu_pic);

                ganwuIV.setTag(R.id.one, item.getExtrals());
                ganwuIV.setTag(R.id.two, i);
                ganwuIV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ArrayList<A_Conscious_Info.ExtralsBean> extralsBeanArrayList = (ArrayList<A_Conscious_Info.ExtralsBean>) v.getTag(R.id.one);
                        List<LocalMedia> selectList_Detail = new ArrayList<>();
                        if (extralsBeanArrayList != null) {

                            for (int i = 0; i < extralsBeanArrayList.size(); i++) {
                                A_Conscious_Info.ExtralsBean extralsBean = extralsBeanArrayList.get(i);
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
//                            Intent intent = new Intent(getContext(), W_KuFangJianKong_Detail_Activity.class);
//                            intent.putExtra("url", media.getPath());
//                            startActivity(intent);
                                // 预览视频
//                            PictureSelector.create(getActivity()).externalPictureVideo(media.getPath());
//                            OpenVideo(media.getPath());
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
