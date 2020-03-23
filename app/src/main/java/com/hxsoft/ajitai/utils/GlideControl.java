package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.hxsoft.ajitai.widget.CenterCropRoundCornerTransform;

public class GlideControl {

    public static void SetImage(Context context, String imgUrl, ImageView imageView, int normalImg) {
        //单独赋值
        RequestOptions options = new RequestOptions()
                .placeholder(normalImg)//图片加载出来前，显示的图片
                .fallback(normalImg) //url为空的时候,显示的图片
                .error(normalImg);//图片加载失败后，显示的图片

        Glide.with(context)
                .load(imgUrl) //图片地址
                .apply(options)
                .into(imageView);

    }

    public static void SetCircleImage(Context context, String imgUrl, ImageView imageView, int normalImg) {
        //单独赋值
        RequestOptions options = new RequestOptions()
                .placeholder(normalImg)//图片加载出来前，显示的图片
                .fallback(normalImg) //url为空的时候,显示的图片
                .error(normalImg);//图片加载失败后，显示的图片


        Glide.with(context)
                .load(imgUrl) //图片地址
                .apply(options)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(imageView);

    }

    public static void SetFilletImage(Context context, String imgUrl, ImageView imageView, int normalImg,int radius) {
        RequestOptions options = RequestOptions.bitmapTransform(new CenterCropRoundCornerTransform(radius, context)).placeholder(normalImg)//图片加载出来前，显示的图片
                .fallback(normalImg) //url为空的时候,显示的图片
                .error(normalImg);
        Glide.with(context)
                .load(imgUrl)
                .apply(options)
                .into(imageView);


    }

    public static void SetFilletImage_Mipmap(Context context, int imgUrl, ImageView imageView, int normalImg,int radius) {
        RequestOptions options = RequestOptions.bitmapTransform(new CenterCropRoundCornerTransform(radius, context)).placeholder(normalImg)//图片加载出来前，显示的图片
                .fallback(normalImg) //url为空的时候,显示的图片
                .error(normalImg);
        Glide.with(context)
                .load(imgUrl)
                .apply(options)
                .into(imageView);


    }
}
