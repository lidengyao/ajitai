package com.hxsoft.ajitai.CheckListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by SYSTEM on 2017/4/29.
 */
public abstract class MyBaseAdapterListview<T>  extends BaseAdapter {
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;
    private int mLayoutId;
    private boolean mIsReUse;
    public MyBaseAdapterListview(Context context, List<T> datas, int layoutId, boolean isReUse)
    {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        this.mDatas = datas;
        this.mLayoutId = layoutId;
        mIsReUse=isReUse;
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }
    @Override
    public T getItem(int i) {
        return mDatas.get(i);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolderExpandbleListView holder = MyViewHolderExpandbleListView.get(
                mContext, view, viewGroup, mLayoutId, i,mIsReUse);
        convert(holder, getItem(i),i);
        return holder.getConvertView();
    }
    public abstract void convert(MyViewHolderExpandbleListView holder, T t,int position);

}
