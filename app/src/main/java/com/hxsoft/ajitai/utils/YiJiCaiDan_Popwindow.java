package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;


import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.YiJiType_Info;
import com.hxsoft.ajitai.yijicaidan.wheelview.OnWheelChangedListener;
import com.hxsoft.ajitai.yijicaidan.wheelview.OnWheelScrollListener;
import com.hxsoft.ajitai.yijicaidan.wheelview.WheelView;
import com.hxsoft.ajitai.yijicaidan.wheelview.adapter.AbstractWheelTextAdapter1;
import com.hxsoft.ajitai.yijicaidan.wheelview.adapter.WheelViewAdapter;

import java.util.ArrayList;

public class YiJiCaiDan_Popwindow extends PopupWindow implements View.OnClickListener {

    private WheelView wvYiJi;
    private TextView btnSure;
    private TextView btnCancel;

    private Context context;
    private ArrayList<String> arrProvinces = new ArrayList<String>();
    private AddressTextAdapter provinceAdapter;
    private String strYiJiValue = "心灵甘露";
    private OnAddressCListener onAddressCListener;
    private int maxsize = 16;
    private int minsize = 16;
    private ArrayList<YiJiType_Info> TotalDataList = new ArrayList<>();

    private YiJiType_Info yiJiType_info = new YiJiType_Info();

    public YiJiCaiDan_Popwindow(final Context context, final Activity activity, ArrayList<YiJiType_Info> model) {
        super(context);

        View view = View.inflate(context, R.layout.m_dialog_edit_changeaddress_pop_layout, null);

        PopupWindow pop = new PopupWindow(view, -1, -2);
        pop.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pop.setOutsideTouchable(true);
        pop.setFocusable(true);
        WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
        lp.alpha = 0.5f;
        activity.getWindow().setAttributes(lp);
        pop.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
                lp.alpha = 1f;
                activity.getWindow().setAttributes(lp);
            }
        });
        pop.setAnimationStyle(R.style.bottom_dialog_anim);

        this.context = context;
        TotalDataList = model;

        wvYiJi = (WheelView) view.findViewById(R.id.wv_YiJi);
        btnSure = (TextView) view.findViewById(R.id.btn_myinfo_sure);
        btnCancel = (TextView) view.findViewById(R.id.btn_myinfo_cancel);


        //设置SelectPicPopupWindow的View
        this.setContentView(view);
        //设置SelectPicPopupWindow弹出窗体的宽
        this.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        //设置SelectPicPopupWindow弹出窗体的高
        this.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
        //设置SelectPicPopupWindow弹出窗体可点击
        this.setFocusable(true);
        //设置SelectPicPopupWindow弹出窗体动画效果
//		this.setAnimationStyle(R.style.AnimBottom);
        //实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0xb0000000);
        //设置SelectPicPopupWindow弹出窗体的背景
        this.setBackgroundDrawable(dw);

        btnSure.setOnClickListener(this);
        btnCancel.setOnClickListener(this);


        initProvinces();
        provinceAdapter = new AddressTextAdapter(context, arrProvinces, getProvinceItem(strYiJiValue), maxsize, minsize);

        wvYiJi.setVisibleItems(5);
        wvYiJi.setViewAdapter((WheelViewAdapter) provinceAdapter);
        wvYiJi.setCurrentItem(getProvinceItem(strYiJiValue));

        wvYiJi.addChangingListener(new OnWheelChangedListener() {

            @Override
            public void onChanged(WheelView wheel, int oldValue, int newValue) {
                yiJiType_info = TotalDataList.get(newValue);
                strYiJiValue = yiJiType_info.getName();
                setTextviewSize(strYiJiValue, provinceAdapter);


            }
        });

        wvYiJi.addScrollingListener(new OnWheelScrollListener() {

            @Override
            public void onScrollingStarted(WheelView wheel) {

            }

            @Override
            public void onScrollingFinished(WheelView wheel) {
                String currentText = (String) provinceAdapter.getItemText(wheel.getCurrentItem());
                setTextviewSize(currentText, provinceAdapter);
            }
        });

        pop.showAtLocation(activity.getWindow().getDecorView(), Gravity.BOTTOM, 0, 0);
    }


    private class AddressTextAdapter extends AbstractWheelTextAdapter1 {
        ArrayList<String> list;

        protected AddressTextAdapter(Context context, ArrayList<String> list, int currentItem, int maxsize, int minsize) {
            super(context, R.layout.item_birth_year, NO_RESOURCE, currentItem, maxsize, minsize);
            this.list = list;
            setItemTextResource(R.id.tempValue);

        }

        @Override
        public View getItem(int index, View cachedView, ViewGroup parent) {
            View view = super.getItem(index, cachedView, parent);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "dddd", Toast.LENGTH_LONG).show();
                }
            });
//            CheckBox checkBox=(CheckBox)view.findViewById(R.id.DataCheckBox);
//            checkBox.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(context,"dddd",Toast.LENGTH_LONG).show();
//                }
//            });
            return view;
        }

        @Override
        public int getItemsCount() {
            return list.size();
        }

        @Override
        protected CharSequence getItemText(int index) {
            return list.get(index) + "";
        }
    }

    /**
     * 设置字体大小
     *
     * @param curriteItemText
     * @param adapter
     */
    public void setTextviewSize(String curriteItemText, AddressTextAdapter adapter) {
        ArrayList<View> arrayList = adapter.getTestViews();
        int size = arrayList.size();
        String currentText;
        for (int i = 0; i < size; i++) {
            TextView textvew = (TextView) arrayList.get(i);

            currentText = textvew.getText().toString();
            if (curriteItemText.equals(currentText)) {
                textvew.setTextSize(16);
            } else {
                textvew.setTextSize(16);
            }
        }
    }

    public void setTextviewClick(AddressTextAdapter adapter) {
        ArrayList<View> arrayList = adapter.getTestViews();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            final TextView textvew = (TextView) arrayList.get(i);
            textvew.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, textvew.getText().toString(), Toast.LENGTH_LONG).show();
                }
            });

        }
    }

    public void setAddresskListener(OnAddressCListener onAddressCListener) {
        this.onAddressCListener = onAddressCListener;
    }

    @Override
    public void onClick(View v) {
        if (v == btnSure) {
            if (onAddressCListener != null) {

                onAddressCListener.onClick(yiJiType_info);
            }
        } else if (v == btnCancel) {

        } else {
//			dismiss();
        }
        dismiss();
    }

    /**
     * 回调接口
     *
     * @author Administrator
     */
    public interface OnAddressCListener {
        void onClick(YiJiType_Info province);
    }


    /**
     * 初始化省会
     */
    public void initProvinces() {
        int length = TotalDataList.size();
        for (int i = 0; i < length; i++) {
            YiJiType_Info qrsType_info = TotalDataList.get(i);
            arrProvinces.add(qrsType_info.getName());
        }
    }

    /**
     * 初始化地点
     *
     * @param province
     * @param city
     */
    public void setAddress(String province, String city, String area, String sid) {
        if (province != null && province.length() > 0) {
            this.strYiJiValue = province;
        }
        wvYiJi.setCurrentItem(getProvinceItem(strYiJiValue));
    }

    /**
     * 返回省会索引，没有就返回默认“广东”
     *
     * @param province
     * @return
     */
    public int getProvinceItem(String province) {
        int size = arrProvinces.size();
        int provinceIndex = 0;
        boolean noprovince = true;
        for (int i = 0; i < size; i++) {
            if (province.equals(arrProvinces.get(i))) {
                noprovince = false;
                return provinceIndex;
            } else {
                provinceIndex++;
            }
        }
        if (noprovince) {
            strYiJiValue = "广东省";
            return 18;
        }
        return provinceIndex;
    }


}