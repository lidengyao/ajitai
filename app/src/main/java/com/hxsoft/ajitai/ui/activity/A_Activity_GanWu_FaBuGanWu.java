package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.GridImageAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.CreateCconscious_Bean;
import com.hxsoft.ajitai.present.A_FaBuGanWu_Present;
import com.hxsoft.ajitai.ui.view.A_FaBuGanWu_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_FaBuGanWu_YuYin;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_GanWu_FaBuGanWu extends MvpActivity<A_FaBuGanWu_Present> implements A_FaBuGanWu_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.YuYin_IV)
    ImageView YuYinIV;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.LuYinIngRL)
    RelativeLayout LuYinIngRL;
    @Bind(R.id.GuanBiLuYin_IV)
    ImageView GuanBiLuYinIV;
    @Bind(R.id.BoFang_IV)
    ImageView BoFangIV;
    @Bind(R.id.ShiJian_TV)
    TextView ShiJianTV;
    @Bind(R.id.WanChengLuYin_RL)
    RelativeLayout WanChengLuYinRL;
    @Bind(R.id.WanCheng_TV)
    TextView WanChengTV;
    @Bind(R.id.addRecyclerView)
    RecyclerView addRecyclerView;

    private List<LocalMedia> selectList_Add = new ArrayList<>();
    private GridImageAdapter adapterAdd;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_ganwu_fabuganwu;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        YuYinIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_FaBuGanWu_YuYin.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_FaBuGanWu_YuYin.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {
                        if (type == 1) {
                            LuYinIngRL.setVisibility(View.VISIBLE);
                            YuYinIV.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

        GuanBiLuYinIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LuYinIngRL.setVisibility(View.GONE);
                YuYinIV.setVisibility(View.VISIBLE);
            }
        });

        WanChengTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("正常上传录音");
                LuYinIngRL.setVisibility(View.GONE);
                WanChengLuYinRL.setVisibility(View.VISIBLE);
            }
        });

        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                CreateCconscious_Bean createCconscious_bean = new CreateCconscious_Bean();
//
//                mPresenter.postConscious(createCconscious_bean, getContext());

            }
        });

        initWidget_Add();
    }

    private void initWidget_Add() {
        FullyGridLayoutManager manager = new FullyGridLayoutManager(getContext(), 3, GridLayoutManager.VERTICAL, false);
        addRecyclerView.setLayoutManager(manager);
        adapterAdd = new GridImageAdapter(getContext(), onAddPicClickListener, true);
        adapterAdd.setList(selectList_Add);
        adapterAdd.setSelectMax(9);
        addRecyclerView.setAdapter(adapterAdd);
        adapterAdd.setOnItemClickListener(new GridImageAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                if (selectList_Add.size() > 0) {
                    LocalMedia media = selectList_Add.get(position);
                    int mediaType = media.getMimeType();
                    switch (mediaType) {
                        case 1:
                            // 预览视频
                            PictureSelector.create(getActivity()).externalPictureVideo(media.getPath());
                            break;
                        case 2:
                            // 预览图片 可自定长按保存路径
                            PictureSelector.create(getActivity()).themeStyle(R.style.picture_default_style).openExternalPreview(position, "/custom_file", selectList_Add);
//                            PictureSelector.create(getActivity()).themeStyle(R.style.picture_default_style).openExternalPreview(position, selectList_Add);

                            break;
                        case 3:
                            // 预览音频
                            PictureSelector.create(getActivity()).externalPictureAudio(media.getPath());
                            break;
                    }
                }
            }
        });
    }

    private GridImageAdapter.onAddPicClickListener onAddPicClickListener = new GridImageAdapter.onAddPicClickListener() {
        @Override
        public void onAddPicClick() {
            commonAction_Add(PictureMimeType.ofImage(), selectList_Add);
        }
    };

    private void commonAction_Add(int type, List<LocalMedia> localMediaList) {
        PictureSelector.create(getActivity())
                .openGallery(type)// 全部.PictureMimeType.ofAll()、图片.ofImage()、视频.ofVideo()、音频.ofAudio()
                .theme(R.style.picture_Sina_style)// 主题样式设置 具体参考 values/styles   用法：R.style.picture.white.style
//                    themeId = R.style.picture_default_style;   默认样式
//                    themeId = R.style.picture_white_style;
//                    themeId = R.style.picture_QQ_style;
//                    themeId = R.style.picture_Sina_style;
                .maxSelectNum(9)// 最大图片选择数量
                .minSelectNum(1)// 最小选择数量
                .imageSpanCount(3)// 每行显示个数
                .selectionMode(
                        PictureConfig.MULTIPLE)// 多选 or 单选
                .previewImage(true)// 是否可预览图片
                .previewVideo(true)// 是否可预览视频
                .enablePreviewAudio(true) // 是否可播放音频
                .isCamera(true)// 是否显示拍照按钮
                .isZoomAnim(true)// 图片列表点击 缩放效果 默认true
                //.imageFormat(PictureMimeType.PNG)// 拍照保存图片格式后缀,默认jpeg
                //.setOutputCameraPath("/CustomPath")// 自定义拍照保存路径
                .enableCrop(false)// 是否裁剪
                .compress(true)// 是否压缩
                .synOrAsy(true)//同步true或异步false 压缩 默认同步
//                .compressSavePath("/custom_file")//压缩图片保存地址
                //.sizeMultiplier(0.5f)// glide 加载图片大小 0~1之间 如设置 .glideOverride()无效
                .glideOverride(160, 160)// glide 加载宽高，越小图片列表越流畅，但会影响列表图片浏览的清晰度
                .withAspectRatio(0, 0)// 裁剪比例 如16:9 3:2 3:4 1:1 可自定义
                .hideBottomControls(true)// 是否显示uCrop工具栏，默认不显示
                .isGif(true)// 是否显示gif图片
                .freeStyleCropEnabled(true)// 裁剪框是否可拖拽
                .circleDimmedLayer(false)// 是否圆形裁剪
                .showCropFrame(true)// 是否显示裁剪矩形边框 圆形裁剪时建议设为false
                .showCropGrid(true)// 是否显示裁剪矩形网格 圆形裁剪时建议设为false
                .openClickSound(false)// 是否开启点击声音
                .selectionMedia(localMediaList)// 是否传入已选图片
                //.isDragFrame(false)// 是否可拖动裁剪框(固定)
//                        .videoMaxSecond(15)
//                        .videoMinSecond(10)
                //.previewEggs(false)// 预览图片时 是否增强左右滑动图片体验(图片滑动一半即可看到上一张是否选中)
                //.cropCompressQuality(90)// 裁剪压缩质量 默认100
                .minimumCompressSize(100)// 小于100kb的图片不压缩
                //.cropWH()// 裁剪宽高比，设置如果大于图片本身宽高则无效
                //.rotateEnabled(true) // 裁剪是否可旋转图片
                //.scaleEnabled(true)// 裁剪是否可放大缩小图片
                .videoQuality(1)// 视频录制质量 0 or 1
                .videoMaxSecond(10)//显示多少秒以内的视频or音频也可适用
                .recordVideoSecond(10)//录制视频秒数 默认60s
                .forResult(PictureConfig.CHOOSE_REQUEST);//结果回调onActivityResult code
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            switch (requestCode) {

                case PictureConfig.CHOOSE_REQUEST:
                    // 图片选择结果回调
                    selectList_Add = PictureSelector.obtainMultipleResult(data);
                    // 例如 LocalMedia 里面返回三种path
                    // 1.media.getPath(); 为原图path
                    // 2.media.getCutPath();为裁剪后path，需判断media.isCut();是否为true
                    // 3.media.getCompressPath();为压缩后path，需判断media.isCompressed();是否为true
                    // 如果裁剪并压缩了，已取压缩路径为准，因为是先裁剪后压缩的
                    for (LocalMedia media : selectList_Add) {
                        Log.i("图片-----》", media.getPath());
                    }
                    adapterAdd.setList(selectList_Add);
                    adapterAdd.notifyDataSetChanged();


                    break;
            }
        }
    }

    @Override
    protected A_FaBuGanWu_Present createPresenter() {
        return new A_FaBuGanWu_Present();
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
        showMessage("发布成功");
        finish();
    }

    @Override
    public void onFailure(int code, String msg) {

    }
}
