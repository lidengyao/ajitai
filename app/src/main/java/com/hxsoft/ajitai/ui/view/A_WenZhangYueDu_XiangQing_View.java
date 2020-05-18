package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.A_Carticlecomment_Total_Info;
import com.hxsoft.ajitai.model.info.Carticle_Info;
import com.hxsoft.ajitai.model.info.WenZhang_Total_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_WenZhangYueDu_XiangQing_View extends BaseMvpView {
    void carticleDetailSuccess(Carticle_Info model);

    //评论列表
    void carticlecommentPageSuccess(A_Carticlecomment_Total_Info model);

    //添加评论
    void carticlecommentAddcommentSuccess(Boolean model);


    //文章点攒
    void heartnectarThumbSuccess(Boolean model);

    //文章取消点攒
    void heartnectarCancleThumbSuccess(Boolean model);

    //心灵甘露阅读
    void heartnectarClickSuccess(Boolean model);


    void onFailure(int code, String msg);
}
