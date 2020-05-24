package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.bean.AreaBean;
import com.hxsoft.ajitai.model.info.A_Area;
import com.hxsoft.ajitai.model.info.A_Bean;
import com.hxsoft.ajitai.model.info.BaseCodeInfo;
import com.hxsoft.ajitai.model.info.C_Bean;
import com.hxsoft.ajitai.model.info.P_Bean;
import com.hxsoft.ajitai.timepaker.wheelview.OnWheelChangedListener;
import com.hxsoft.ajitai.timepaker.wheelview.OnWheelScrollListener;
import com.hxsoft.ajitai.timepaker.wheelview.WheelView;
import com.hxsoft.ajitai.timepaker.wheelview.adapter.AbstractWheelTextAdapter1;
import com.hxsoft.ajitai.timepaker.wheelview.adapter.WheelViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PCA_Popwindow implements View.OnClickListener {

    private WheelView wvProvince;
    private WheelView wvCitys;
    private WheelView wvArea;
    private View lyChangeAddress;
    private View lyChangeAddressChild;
    private TextView btnSure;
    private TextView btnCancel;

    private Context context;
    /**
     * 所有省
     */
    private String[] mProvinceDatas;
    /**
     * key - 省 value - 市s
     */
    private Map<String, String[]> mCitisDatasMap = new HashMap<String, String[]>();
    /**
     * key - 市 values - 区s
     */
//	private Map<String, String[]> mAreaDatasMap = new HashMap<String, String[]>();
    private Map<String, ArrayList<AreaBean>> mAreaDatasMap = new HashMap<>();


    private ArrayList<String> arrProvinces = new ArrayList<String>();
    private ArrayList<String> arrCitys = new ArrayList<String>();
    private ArrayList<String> arrAreas = new ArrayList<String>();
    private AddressTextAdapter provinceAdapter;
    private AddressTextAdapter cityAdapter;
    private AddressTextAdapter areaAdapter;


    private String strProvince = "江苏省";
    private String strCity = "无锡市";
    private String strArea = "滨湖区";
    private String strSid = "320211";
    private OnAddressCListener _onAddressCListener;
    private int maxsize = 14;
    private int minsize = 12;
    private ArrayList<A_Area> TotalDataList = new ArrayList<>();

    private A_Area current_P_Bean = new A_Area();
    private A_Area current_C_Bean = new A_Area();
    private A_Area current_A_Bean = new A_Area();
    private DialogFromBottom dialogFromBottom;

    public void ShowDialog(final Context context, OnAddressCListener onAddressCListener) {

        _onAddressCListener = onAddressCListener;

        Gson gson = new Gson();
        String gsonData = SpUtils.getSettingNote(context, DbKeyS.area);

        if (!MStringUtils.IsNullOrEmpty(gsonData)) {
            ArrayList<A_Area> tempGList = gson.fromJson(gsonData, new TypeToken<List<A_Area>>() {
            }.getType());
            TotalDataList.addAll(tempGList);
        } else {
            Toast.makeText(context, "没有获取到省市区数据", Toast.LENGTH_SHORT).show();
            return;
        }

        this.context = context;


        dialogFromBottom = new DialogFromBottom(context);
        View view = LayoutInflater.from(context).inflate(R.layout.city_pop_layout, null, false);


        wvProvince = (WheelView) view.findViewById(R.id.wv_address_province);
        wvCitys = (WheelView) view.findViewById(R.id.wv_address_city);
        wvArea = (WheelView) view.findViewById(R.id.wv_address_area);
        lyChangeAddress = view.findViewById(R.id.ly_myinfo_changeaddress);
        lyChangeAddressChild = view.findViewById(R.id.ly_myinfo_changeaddress_child);
        btnSure = (TextView) view.findViewById(R.id.btn_myinfo_sure);
        btnCancel = (TextView) view.findViewById(R.id.btn_myinfo_cancel);


        lyChangeAddressChild.setOnClickListener(this);
        btnSure.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

//        initDatas_new();

        A_Area p_bean = TotalDataList.get(0);
        current_P_Bean = p_bean;
        strProvince = p_bean.getAreaname();
        if (p_bean.getChildren().size() > 0) {
            A_Area c_bean = p_bean.getChildren().get(0);
            strCity = c_bean.getAreaname();

            if (c_bean.getChildren().size() > 0) {
                A_Area a_bean = c_bean.getChildren().get(0);
                strArea = a_bean.getAreaname();
            }

        }


        initProvinces();
        provinceAdapter = new AddressTextAdapter(context, arrProvinces, getProvinceItem(strProvince), maxsize, minsize);

        wvProvince.setVisibleItems(5);
        wvProvince.setViewAdapter((WheelViewAdapter) provinceAdapter);
        wvProvince.setCurrentItem(getProvinceItem(strProvince));
        initCitys(current_P_Bean);
        cityAdapter = new AddressTextAdapter(context, arrCitys, getCityItem(strCity), maxsize, minsize);

        wvCitys.setVisibleItems(5);
        wvCitys.setViewAdapter((WheelViewAdapter) cityAdapter);
        wvCitys.setCurrentItem(getCityItem(strCity));

        if (current_P_Bean.getChildren() != null) {
            current_C_Bean = current_P_Bean.getChildren().get(0);
        }
        if (current_C_Bean.getChildren() != null) {
            current_A_Bean = current_C_Bean.getChildren().get(0);
        }

        initAreas(current_C_Bean);
        areaAdapter = new AddressTextAdapter(context, arrAreas, getAreaItem(strArea), maxsize, minsize);

        wvArea.setVisibleItems(5);
        wvArea.setViewAdapter((WheelViewAdapter) areaAdapter);
        wvArea.setCurrentItem(getAreaItem(strArea));

        wvProvince.addChangingListener(new OnWheelChangedListener() {

            @Override
            public void onChanged(WheelView wheel, int oldValue, int newValue) {
                current_P_Bean = TotalDataList.get(newValue);
                strProvince = current_P_Bean.getAreaname();
                setTextviewSize(strProvince, provinceAdapter);

                if (current_P_Bean.getChildren() != null) {
                    initCitys(current_P_Bean);
                    if (current_P_Bean.getChildren().size() > 0) {
                        current_C_Bean = current_P_Bean.getChildren().get(0);
                    } else {
                        current_C_Bean = new A_Area();
                    }
                    cityAdapter = new AddressTextAdapter(context, arrCitys, 0, maxsize, minsize);
                    wvCitys.setVisibleItems(5);
                    wvCitys.setViewAdapter((WheelViewAdapter) cityAdapter);
                    wvCitys.setCurrentItem(0);
                    setTextviewSize("0", cityAdapter);

                    //根据市，地区联动
                    if (current_C_Bean.getChildren() != null) {
                        initAreas(current_C_Bean);
                        if (current_C_Bean.getChildren().size() > 0) {
                            current_A_Bean = current_C_Bean.getChildren().get(0);
                        } else {
                            current_A_Bean = new A_Area();
                        }
                        areaAdapter = new AddressTextAdapter(context, arrAreas, 0, maxsize, minsize);
                        wvArea.setVisibleItems(5);
                        wvArea.setViewAdapter((WheelViewAdapter) areaAdapter);
                        wvArea.setCurrentItem(0);
                        setTextviewSize("0", areaAdapter);


                    }
                }


            }
        });

        wvProvince.addScrollingListener(new OnWheelScrollListener() {

            @Override
            public void onScrollingStarted(WheelView wheel) {

            }

            @Override
            public void onScrollingFinished(WheelView wheel) {
                String currentText = (String) provinceAdapter.getItemText(wheel.getCurrentItem());
                setTextviewSize(currentText, provinceAdapter);
            }
        });

        wvCitys.addChangingListener(new OnWheelChangedListener() {

            @Override
            public void onChanged(WheelView wheel, int oldValue, int newValue) {

                current_C_Bean = current_P_Bean.getChildren().get(newValue);
                strCity = current_C_Bean.getAreaname();
                setTextviewSize(strCity, cityAdapter);
                //根据市，地区联动
                if (current_C_Bean.getChildren() != null) {
                    initAreas(current_C_Bean);
                    if (current_C_Bean.getChildren().size() > 0) {
                        current_A_Bean = current_C_Bean.getChildren().get(0);
                    } else {
                        current_A_Bean = new A_Area();
                    }
                    areaAdapter = new AddressTextAdapter(context, arrAreas, 0, maxsize, minsize);
                    wvArea.setVisibleItems(5);
                    wvArea.setViewAdapter((WheelViewAdapter) areaAdapter);
                    wvArea.setCurrentItem(0);
                    setTextviewSize("0", areaAdapter);
                }


            }
        });


        wvCitys.addScrollingListener(new OnWheelScrollListener() {

            @Override
            public void onScrollingStarted(WheelView wheel) {

            }

            @Override
            public void onScrollingFinished(WheelView wheel) {
                String currentText = (String) cityAdapter.getItemText(wheel.getCurrentItem());
                setTextviewSize(currentText, cityAdapter);
            }
        });

//        wvArea.addClickingListener(new OnWheelClickedListener() {
//            @Override
//            public void onItemClicked(WheelView wheel, int itemIndex) {
//                Toast.makeText(context,itemIndex+"",Toast.LENGTH_LONG).show();
//            }
//        });
        wvArea.addChangingListener(new OnWheelChangedListener() {

            @Override
            public void onChanged(WheelView wheel, int oldValue, int newValue) {

                if (current_C_Bean.getChildren() != null && current_C_Bean.getChildren().size() != 0) {
                    current_A_Bean = current_C_Bean.getChildren().get(newValue);
                    strArea = current_A_Bean.getAreaname();
                    setTextviewSize(strArea, cityAdapter);
                }
            }
        });
//        Toast.makeText(context,"dddd",Toast.LENGTH_LONG).show();
        wvArea.addScrollingListener(new OnWheelScrollListener() {

            @Override
            public void onScrollingStarted(WheelView wheel) {

            }

            @Override
            public void onScrollingFinished(WheelView wheel) {
                String currentText = (String) areaAdapter.getItemText(wheel.getCurrentItem());
                setTextviewSize(currentText, areaAdapter);
                setTextviewClick(areaAdapter);
            }
        });


        dialogFromBottom.setContentView(view);
        dialogFromBottom.show();
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
                textvew.setTextSize(14);
            } else {
                textvew.setTextSize(12);
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
        this._onAddressCListener = onAddressCListener;
    }

    @Override
    public void onClick(View v) {
        if (v == btnSure) {
            if (_onAddressCListener != null) {

                _onAddressCListener.onClick(current_P_Bean, current_C_Bean, current_A_Bean);
            }
        }
        dialogFromBottom.dismiss();
    }

    /**
     * 回调接口
     *
     * @author Administrator
     */
    public interface OnAddressCListener {
        void onClick(A_Area province, A_Area city, A_Area area);
    }


    /**
     * 初始化省会
     */
    public void initProvinces() {
        int length = TotalDataList.size();
        for (int i = 0; i < length; i++) {
            A_Area p_bean = TotalDataList.get(i);
            arrProvinces.add(p_bean.getAreaname());
        }
    }

    /**
     * 根据省会，生成该省会的所有城市
     *
     * @param
     */
    public void initCitys(A_Area p_bean) {
        if (p_bean != null && p_bean.getChildren().size() > 0) {
            arrCitys.clear();
            int length = p_bean.getChildren().size();
            for (int i = 0; i < length; i++) {
                A_Area c_bean = p_bean.getChildren().get(i);
                arrCitys.add(c_bean.getAreaname());
            }
        } else {

            arrCitys.clear();
            arrCitys.add("");
        }
        if (arrCitys != null && arrCitys.size() > 0
                && !arrCitys.contains(strCity)) {
            strCity = arrCitys.get(0);
        }
    }

    public void initAreas(A_Area c_bean) {
        if (c_bean != null && c_bean.getChildren().size() > 0) {
            arrAreas.clear();
            int length = c_bean.getChildren().size();
            for (int i = 0; i < length; i++) {
                A_Area a_bean = c_bean.getChildren().get(i);
                arrAreas.add(a_bean.getAreaname());
            }
        } else {
            arrAreas.clear();
            arrAreas.add("");
        }
        if (arrAreas != null && arrAreas.size() > 0
                && !arrAreas.contains(strArea)) {
            strArea = arrAreas.get(0);
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
            this.strProvince = province;
        }
        wvProvince.setCurrentItem(getProvinceItem(strProvince));
        if (city != null && city.length() > 0) {
            this.strCity = city;
        }
        wvCitys.setCurrentItem(getCityItem(strCity));
        if (area != null && area.length() > 0) {
            this.strArea = area;
        }
        wvArea.setCurrentItem(getAreaItem(strArea));
        if (sid != null && sid.length() > 0) {
            this.strSid = sid;
        }
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
            strProvince = "广东省";
            return 18;
        }
        return provinceIndex;
    }

    /**
     * 得到城市索引，没有返回默认“深圳”
     *
     * @param city
     * @return
     */
    public int getCityItem(String city) {
        int size = arrCitys.size();
        int cityIndex = 0;
        boolean nocity = true;
        for (int i = 0; i < size; i++) {
            if (city.equals(arrCitys.get(i))) {
                nocity = false;
                return cityIndex;
            } else {
                cityIndex++;
            }
        }
        if (nocity) {
            strCity = "深圳";
            return 2;
        }
        return cityIndex;
    }

    /**
     * 得到地区索引，没有返回默认“福田区”
     *
     * @param area
     * @return
     */
    public int getAreaItem(String area) {
        int size = arrAreas.size();
        int areaIndex = 0;
        boolean noarea = true;
        for (int i = 0; i < size; i++) {
            if (area.equals(arrAreas.get(i))) {
                noarea = false;
                return areaIndex;
            } else {
                areaIndex++;
            }
        }
        if (noarea) {
            strArea = "福田区";
            return 1;
        }
        return areaIndex;
    }


}