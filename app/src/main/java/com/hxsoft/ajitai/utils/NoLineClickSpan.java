package com.hxsoft.ajitai.utils;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;

public class NoLineClickSpan extends ClickableSpan {
    String color;

    public NoLineClickSpan(String color) {
        super();
        this.color = color;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        //设置字体颜色
        ds.setColor(Color.parseColor(color));
        ds.setUnderlineText(false); //去掉下划线
    }

    @Override
    public void onClick(View widget) {
        //点击超链接时调用
//        Toast.makeText(XXActivity.this, "您点击了sunflowerseat", Toast.LENGTH_SHORT).show();
    }
}