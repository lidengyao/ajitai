package com.hxsoft.ajitai.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 *
 * 通用Adapter
 *
 * Created by jinxh on 15/12/4.
 */
public abstract class CommonAdapter_Normal<T> extends BaseAdapter {
    protected LayoutInflater mInflater;
    protected Context mContext;
    protected List<T> mData;
    protected final int mItemLayoutId;
    private String LayoutName;

    public CommonAdapter_Normal(Context context, List<T> data, int itemLayoutId, String tempLayoutName) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(mContext);
        this.mData = data;
        this.mItemLayoutId = itemLayoutId;
        this.LayoutName=tempLayoutName;
    }

    @Override
    public int getCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData == null ? null :mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {
        final ViewHolder_Normal viewHolder = getViewHolder(position, convertView,
                parent,LayoutName);
        convert(position,viewHolder, getItem(position));
        return viewHolder.getConvertView();

    }

    public abstract void convert(int position,ViewHolder_Normal helper, T item);

    private ViewHolder_Normal getViewHolder(int position, View convertView,
                                     ViewGroup parent,String LayoutName) {
        return ViewHolder_Normal.get(mContext, convertView, parent, mItemLayoutId,
                position, LayoutName);
    }

    public void refresh(List<T> data){
        this.mData = data;
        notifyDataSetChanged();
    }
}