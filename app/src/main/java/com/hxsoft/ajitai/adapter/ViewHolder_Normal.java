package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.utils.ViewHoder_GetDataBean;
import com.hxsoft.ajitai.widget.Normal;

import java.util.ArrayList;


/**
 * Created by jinxh on 15/12/4.
 */
public class ViewHolder_Normal {
    private final SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;
    private Context mContext;
    private ArrayList<Normal> normalArrayList;

    private ViewHolder_Normal(Context context, ViewGroup parent, int layoutId,
                              int position, String LayoutName) {
        mContext = context;
        this.mPosition = position;
        this.mViews = new SparseArray<View>();
//        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent,
//                false);

//        ViewHoder_GetDataBean viewHoder_getDataBean = AnalyzeNormalControl.getViewHoder_GetDataBean(mContext, LayoutName);
//
//        mConvertView = viewHoder_getDataBean.getView();
//        normalArrayList = viewHoder_getDataBean.getNormalArrayList();
        // setTag
        mConvertView.setTag(this);

    }


    /**
     * 拿到一个ViewHolder对象
     *
     * @param context
     * @param convertView
     * @param parent
     * @param layoutId
     * @param position
     * @return
     */
    public static ViewHolder_Normal get(Context context, View convertView,
                                        ViewGroup parent, int layoutId, int position, String LayoutName) {
        if (convertView == null) {
            return new ViewHolder_Normal(context, parent, layoutId, position, LayoutName);
        }
        return (ViewHolder_Normal) convertView.getTag();
    }

    public View getConvertView() {
        return mConvertView;
    }

    public ArrayList<Normal> getNormalArrayList() {
        return normalArrayList;
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
    public ViewHolder_Normal setText(int viewId, String text) {
        TextView view = getView(viewId);
        if (view != null) {
            view.setText(text);

            if (view.getText().toString().equals("字典里没有查到")) {
                view.setTextColor(mContext.getResources().getColor(R.color.color26));
            }
            if (view.getText().toString().trim().equals("")) {
                view.setText("无");
//                view.setTextColor(mContext.getResources().getColor(R.color.color15));
            }
        }
        return this;
    }

    public ViewHolder_Normal setVisibility(int viewId, int visibility) {
        View view = getView(viewId);
        view.setVisibility(visibility);
        return this;
    }

    public ViewHolder_Normal setChecked(int viewId, boolean isChecked) {
        CheckBox view = getView(viewId);
        view.setChecked(isChecked);
        return this;
    }

    public ViewHolder_Normal setOnClickListener(int viewId, View.OnClickListener onClickListener) {
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
    public ViewHolder_Normal setText(int viewId, int resId) {
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
    public ViewHolder_Normal setImageResource(int viewId, int drawableId) {
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
    public ViewHolder_Normal setImageBitmap(int viewId, Bitmap bm) {
        ImageView view = getView(viewId);
        view.setImageBitmap(bm);
        return this;
    }

    public int getPosition() {
        return mPosition;
    }

}
