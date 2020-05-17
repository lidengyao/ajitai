package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

import com.hxsoft.ajitai.Constants;
import com.hxsoft.ajitai.R;

public class Clickable extends ClickableSpan {
    private final View.OnClickListener mListener;
    private boolean isColor;
    private Context _context;
    public Clickable(View.OnClickListener l, boolean isColor) {
        mListener = l;
        this.isColor = isColor;
    }
    /**
     * 重写父类点击事件
     */
    @Override
    public void onClick(View v) {
        mListener.onClick(v);
    }

    /**
     * 重写父类updateDrawState方法  我们可以给TextView设置字体颜色,背景颜色等等...
     */
    @Override
    public void updateDrawState(TextPaint ds) {
        if (isColor) {
            ds.setColor(_context.getResources().getColor(R.color.blue));
        } else {

        }
    }
}

