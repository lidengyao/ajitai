package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cat.cc.taglibrary.util.DensityUtil;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.KeCheng_Info;

import java.util.ArrayList;

/**
 * Created by WuXiaolong
 * on 2015/7/2.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private OnItemClickListener _OnItemClickListener;
    private ArrayList<KeCheng_Info> dataList = new ArrayList<>();


    public void addAllData(ArrayList<KeCheng_Info> dataList) {
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void clearData() {
        this.dataList.clear();
    }

    public RecyclerViewAdapter(Context context, OnItemClickListener onItemClickListener) {
        mContext = context;
        _OnItemClickListener = onItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView price_TV;
        public TextView goodsname_TV;
        public LinearLayout RootLL;

        public ViewHolder(View itemView) {
            super(itemView);
            price_TV = (TextView) itemView.findViewById(R.id.price_TV);
            goodsname_TV = (TextView) itemView.findViewById(R.id.goodsname_TV);
            RootLL = (LinearLayout) itemView.findViewById(R.id.RootLL);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.a_item_goumaikecheng, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.price_TV.setText("¥"+dataList.get(position).getPrice() + "");
        holder.goodsname_TV.setText(dataList.get(position).getGoodsname() + "");

        if (position % 2 == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) holder.RootLL.getLayoutParams();
            layoutParams.rightMargin = px2Dip(5);
            holder.RootLL.setLayoutParams(layoutParams);
        } else {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) holder.RootLL.getLayoutParams();
            layoutParams.leftMargin = px2Dip(5);
            holder.RootLL.setLayoutParams(layoutParams);
        }
        holder.RootLL.setTag(R.id.one, dataList.get(position));
        holder.RootLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeCheng_Info keCheng_info = (KeCheng_Info) v.getTag(R.id.one);
                _OnItemClickListener.OnClick(v, keCheng_info);
            }
        });
    }

    public int px2Dip(int px) {

        return mContext.getResources().getDimensionPixelSize(R.dimen.base_dip) * px;
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    public interface OnItemClickListener {
        void OnClick(View view, KeCheng_Info keCheng_info);
    }
}