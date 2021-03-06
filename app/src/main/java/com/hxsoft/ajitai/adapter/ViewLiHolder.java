package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by jinxh on 15/12/4.
 */
public class ViewLiHolder {
    private final SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;
    private Context mContext;

    private ViewLiHolder(Context context, ViewGroup parent, View itemView,
                         int position) {
        this.mPosition = position;
        this.mViews = new SparseArray<View>();
        mConvertView =itemView;
        // setTag
        mConvertView.setTag(this);
        mContext = context;
    }

    /**
     * 拿到一个ViewHolder对象
     *
     * @param context
     * @param convertView
     * @param parent
     * @param itemView
     * @param position
     * @return
     */
    public static ViewLiHolder get(Context context, View convertView,
                                   ViewGroup parent, View itemView, int position) {
        if (convertView == null) {
            return new ViewLiHolder(context, parent, itemView, position);
        }
        return (ViewLiHolder) convertView.getTag();
    }

    public View getConvertView() {
        return mConvertView;
    }

    /**
     * 通过控件的Id获取对于的控件，如果没有则加入views
     *
     * @param viewId
     * @return
     */
    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    /**
     * 为TextView设置字符串
     *
     * @param viewId
     * @param text
     * @return
     */
    public ViewLiHolder setText(int viewId, String text) {
        TextView view = getView(viewId);
        if(view!=null){
            view.setText(text);
        }
        return this;
    }

    public ViewLiHolder setVisibility(int viewId, int visibility) {
        View view = getView(viewId);
        view.setVisibility(visibility);
        return this;
    }

    public ViewLiHolder setChecked(int viewId, boolean isChecked) {
        CheckBox view = getView(viewId);
        view.setChecked(isChecked);
        return this;
    }

    public ViewLiHolder setOnClickListener(int viewId, View.OnClickListener onClickListener) {
        View view = getView(viewId);
        view.setOnClickListener(onClickListener);
        return this;
    }

    /**
     * 为TextView设置字符串
     *
     * @param viewId
     * @return
     */
    public ViewLiHolder setText(int viewId, int resId) {
        TextView view = getView(viewId);
        String text = mContext.getResources().getString(resId);
        view.setText(text);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @param drawableId
     * @return
     */
    public ViewLiHolder setImageResource(int viewId, int drawableId) {
        ImageView view = getView(viewId);
        view.setImageResource(drawableId);

        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @return
     */
    public ViewLiHolder setImageBitmap(int viewId, Bitmap bm) {
        ImageView view = getView(viewId);
        view.setImageBitmap(bm);
        return this;
    }

    public int getPosition() {
        return mPosition;
    }

}
