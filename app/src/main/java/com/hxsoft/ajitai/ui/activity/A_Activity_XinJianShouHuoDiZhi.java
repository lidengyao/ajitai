package com.hxsoft.ajitai.ui.activity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.A_Cuseraddress_Bean;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.Sysarea_Info;
import com.hxsoft.ajitai.present.A_XinJianShouHuoDiZhi_Present;
import com.hxsoft.ajitai.ui.view.A_XinJianShouHuoDiZhi_View;
import com.hxsoft.ajitai.utils.MStringUtils;

import java.io.Serializable;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XinJianShouHuoDiZhi extends MvpActivity<A_XinJianShouHuoDiZhi_Present> implements A_XinJianShouHuoDiZhi_View {


    @Bind(R.id.Back_LL)
    LinearLayout BackLL;
    @Bind(R.id.Delete_RL)
    RelativeLayout DeleteRL;
    @Bind(R.id.username_ET)
    EditText usernameET;
    @Bind(R.id.phone_ET)
    EditText phoneET;
    @Bind(R.id.addrcode_ET)
    TextView addrcodeET;
    @Bind(R.id.AreaRL)
    RelativeLayout AreaRL;
    @Bind(R.id.address_ET)
    EditText addressET;
    @Bind(R.id.isdefault_IV)
    ImageView isdefaultIV;
    @Bind(R.id.isdefault_LL)
    LinearLayout isdefaultLL;
    @Bind(R.id.ShouHuoDiZhi_RL)
    RelativeLayout ShouHuoDiZhiRL;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    private Integer isdefault = 0;
    private String type;//0:新增1：详情：2：修改
    private Cuseraddress_Info recordsBean;
    private ArrayList<Sysarea_Info> sheng_sysarea_infoArrayList;
    private ArrayList<Sysarea_Info> One_sysarea_infoArrayList;
    private ArrayList<Sysarea_Info> Two_sysarea_infoArrayList;
    private ArrayList<Sysarea_Info> Three_sysarea_infoArrayList;

    private View bottomView;
    private LinearLayout Data_Sheng_LL;
    private LinearLayout DataOneLL;
    private LinearLayout DataTwoLL;
    private LinearLayout DataThreeLL;

    private LinearLayout ShengTitleLL;
    private LinearLayout OneTitleLL;
    private LinearLayout TwoTitleLL;
    private LinearLayout ThreeTitleLL;

    private TextView ShengTitleTV;
    private TextView OneTitleTV;
    private TextView TwoTitleTV;
    private TextView ThreeTitleTV;


    private ImageView ShengLine;
    private ImageView OneLine;
    private ImageView TwoLine;
    private ImageView ThreeLine;


    private View CheckShengView;
    private View CheckOneView;
    private View CheckTwoView;
    private View CheckThreeView;

    private SysAreaC shengSysAreaC;
    private SysAreaC OneSysAreaC;
    private SysAreaC TwoSysAreaC;
    private SysAreaC ThreeSysAreaC;

    private String shengName;
    private String oneName;
    private String twoName;
    private String threeName;


    private Integer shengCode;
    private Integer oneCode;
    private Integer twoCode;
    private Integer threeCode;


    private Integer addrcode;
    private Boolean IsLastAddCode = false;
    private PopupWindow pop;

    private ArrayList<SysAreaC> sysAreaCArrayList = new ArrayList<>();


    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinjianshouhuodizhi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        //0:新增；1：修改。
        type = getIntent().getStringExtra("type");

        if (type.equals("0")) {
            DeleteRL.setVisibility(View.INVISIBLE);
        }
        if (type.equals("1")) {

            recordsBean = (Cuseraddress_Info) getIntent().getSerializableExtra("RecordsBean");

            shengCode = recordsBean.getProvinceid();
            oneCode = recordsBean.getCityid();
            twoCode = recordsBean.getDistrictid();
            threeCode = recordsBean.getStreetid();

            shengName = recordsBean.getProvincename();
            oneName = recordsBean.getCityname();
            twoName = recordsBean.getDistrictname();
            threeName = recordsBean.getStreetname();
            isdefault = recordsBean.getIsdefault();
            usernameET.setText(recordsBean.getUsername());
            phoneET.setText(recordsBean.getPhone());
            addressET.setText(recordsBean.getAddress());
            addrcodeET.setText(shengName + oneName + twoName + threeName);
            addrcode = recordsBean.getAddrcode();

            if (isdefault == 0) {
                isdefaultIV.setImageResource(R.mipmap.a_moren_hui);
            }

            if (isdefault == 1) {
                isdefaultIV.setImageResource(R.mipmap.a_moren_huang);
            }
        }


        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameET.getText().toString();
                String phone = phoneET.getText().toString();
                String address = addressET.getText().toString();
                if (MStringUtils.IsNullOrEmpty(username)) {
                    showMessage("请填写收货人");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(phone)) {
                    showMessage("请填写手机号码");
                    return;
                }
                if (IsLastAddCode == false) {
                    showMessage("请选择所在地区");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(address)) {
                    showMessage("请填写详细地址");
                    return;
                }

                if (type.equals("0")) {
                    A_Cuseraddress_Bean a_cuseraddress_bean = new A_Cuseraddress_Bean();
                    a_cuseraddress_bean.setUsername(username);
                    a_cuseraddress_bean.setPhone(phone);
                    a_cuseraddress_bean.setAddrcode(addrcode);
                    a_cuseraddress_bean.setAddress(address);
                    a_cuseraddress_bean.setIsdefault(isdefault);
                    mPresenter.adminCuseraddressAdd(a_cuseraddress_bean, getContext());
                }

                if (type.equals("1") || type.equals("2")) {
                    A_Cuseraddress_Bean a_cuseraddress_bean = new A_Cuseraddress_Bean();
                    a_cuseraddress_bean.setAid(recordsBean.getAid());
                    a_cuseraddress_bean.setUsername(username);
                    a_cuseraddress_bean.setPhone(phone);
                    a_cuseraddress_bean.setAddrcode(addrcode);
                    a_cuseraddress_bean.setAddress(address);
                    a_cuseraddress_bean.setIsdefault(isdefault);
                    mPresenter.adminCuseraddressUpdate(a_cuseraddress_bean, getContext());
                }
            }
        });

        isdefaultLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isdefault == 0) {
                    isdefaultIV.setImageResource(R.mipmap.a_moren_huang);
                    isdefault = 1;
                    return;
                }

                if (isdefault == 1) {
                    isdefaultIV.setImageResource(R.mipmap.a_moren_hui);
                    isdefault = 0;
                    return;
                }
            }
        });

        DeleteRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("提示").setMessage("确定删除该地址吗").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        mPresenter.adminCuseraddressDelete(recordsBean.getAid(), getContext());
                    }
                }).show();


            }
        });

        AreaRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        mPresenter.dictSysareaGettreelist(getContext());

        bottomView = View.inflate(getContext(), R.layout.actionsheet_dialog_sysarea, null);

        Data_Sheng_LL = bottomView.findViewById(R.id.Data_Sheng_LL);
        DataOneLL = bottomView.findViewById(R.id.Data_One_LL);
        DataTwoLL = bottomView.findViewById(R.id.Data_Two_LL);
        DataThreeLL = bottomView.findViewById(R.id.Data_Three_LL);

        ShengTitleLL = bottomView.findViewById(R.id.ShengTitleLL);
        OneTitleLL = bottomView.findViewById(R.id.OneTitleLL);
        TwoTitleLL = bottomView.findViewById(R.id.TwoTitleLL);
        ThreeTitleLL = bottomView.findViewById(R.id.ThreeTitleLL);

        ShengTitleTV = bottomView.findViewById(R.id.ShengTitleTV);
        OneTitleTV = bottomView.findViewById(R.id.OneTitleTV);
        TwoTitleTV = bottomView.findViewById(R.id.TwoTitleTV);
        ThreeTitleTV = bottomView.findViewById(R.id.ThreeTitleTV);

        ShengLine = bottomView.findViewById(R.id.ShengLine);
        OneLine = bottomView.findViewById(R.id.OneLine);
        TwoLine = bottomView.findViewById(R.id.TwoLine);
        ThreeLine = bottomView.findViewById(R.id.ThreeLine);

        shengSysAreaC = new SysAreaC();
        shengSysAreaC.setTip("sheng");
        shengSysAreaC.setDataLL(Data_Sheng_LL);
        shengSysAreaC.setTitleLL(ShengTitleLL);
        shengSysAreaC.setTitle(ShengTitleTV);
        shengSysAreaC.setLine(ShengLine);
        sysAreaCArrayList.add(shengSysAreaC);


        OneSysAreaC = new SysAreaC();
        OneSysAreaC.setTip("one");
        OneSysAreaC.setDataLL(DataOneLL);
        OneSysAreaC.setTitleLL(OneTitleLL);
        OneSysAreaC.setTitle(OneTitleTV);
        OneSysAreaC.setLine(OneLine);
        sysAreaCArrayList.add(OneSysAreaC);


        TwoSysAreaC = new SysAreaC();
        TwoSysAreaC.setTip("two");
        TwoSysAreaC.setDataLL(DataTwoLL);
        TwoSysAreaC.setTitleLL(TwoTitleLL);
        TwoSysAreaC.setTitle(TwoTitleTV);
        TwoSysAreaC.setLine(TwoLine);
        sysAreaCArrayList.add(TwoSysAreaC);


        ThreeSysAreaC = new SysAreaC();
        ThreeSysAreaC.setTip("three");
        ThreeSysAreaC.setDataLL(DataThreeLL);
        ThreeSysAreaC.setTitleLL(ThreeTitleLL);
        ThreeSysAreaC.setTitle(ThreeTitleTV);
        ThreeSysAreaC.setLine(ThreeLine);
        sysAreaCArrayList.add(ThreeSysAreaC);


        ShengTitleLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetClickTitle("sheng");
            }
        });

        OneTitleLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetClickTitle("one");
            }
        });

        TwoTitleLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetClickTitle("two");
            }
        });

        ThreeTitleLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetClickTitle("three");
            }
        });
    }

    private void SetClickTitle(String tip) {
        for (int i = 0; i < sysAreaCArrayList.size(); i++) {
            SysAreaC sysAreaC = sysAreaCArrayList.get(i);
            if (sysAreaC.getTip().equals(tip)) {
                sysAreaC.getDataLL().setVisibility(View.VISIBLE);
                sysAreaC.getLine().setVisibility(View.VISIBLE);
            } else {

                sysAreaC.getDataLL().setVisibility(View.GONE);
                sysAreaC.getLine().setVisibility(View.INVISIBLE);
            }
        }
    }

    private void SetCheckArea(String currentTip, String nextTip, String currentTitleVlaue) {

        for (int i = 0; i < sysAreaCArrayList.size(); i++) {
            SysAreaC sysAreaC = sysAreaCArrayList.get(i);
            if (sysAreaC.getTip().equals(currentTip)) {
                sysAreaC.getTitle().setText(currentTitleVlaue);
                sysAreaC.getDataLL().setVisibility(View.GONE);
                sysAreaC.getTitleLL().setVisibility(View.VISIBLE);
                sysAreaC.getLine().setVisibility(View.INVISIBLE);
            } else if (sysAreaC.getTip().equals(nextTip)) {
                sysAreaC.getTitle().setText("请选择");
                sysAreaC.getTitleLL().setVisibility(View.VISIBLE);
                sysAreaC.getDataLL().setVisibility(View.VISIBLE);
                sysAreaC.getLine().setVisibility(View.VISIBLE);
            } else if (!sysAreaC.getTip().equals(currentTip) && !sysAreaC.getTip().equals(nextTip) && sysAreaC.getCheck() == false) {
                sysAreaC.getTitleLL().setVisibility(View.GONE);
                sysAreaC.getDataLL().setVisibility(View.GONE);
            }
        }
    }


    private void ShowDialog() {

        pop = new PopupWindow(bottomView, -1, -2);
        pop.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pop.setOutsideTouchable(true);
        pop.setFocusable(true);
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 0.5f;
        getWindow().setAttributes(lp);
        pop.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 1f;
                getWindow().setAttributes(lp);
            }
        });
        pop.setAnimationStyle(R.style.bottom_dialog_anim);
        pop.showAtLocation(getWindow().getDecorView(), Gravity.BOTTOM, 0, 0);


    }


    @Override
    protected A_XinJianShouHuoDiZhi_Present createPresenter() {
        return new A_XinJianShouHuoDiZhi_Present();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initView() {
        super.initView();
    }


    @Override
    public void adminCuseraddressAddSuccess(Boolean model) {
        if (model) {
            showMessage("保存成功");
            finish();
        } else {
            showMessage("保存失败");
        }
    }


    @Override
    public void adminCuseraddressDeleteSuccess(Boolean model) {
        if (model) {
            showMessage("删除成功");
            finish();
        } else {
            showMessage("删除失败");
        }
    }

    @Override
    public void adminCuseraddressUpdateSuccess(Boolean model) {
        if (model) {
            showMessage("修改成功");
            finish();
        } else {
            showMessage("修改失败");
        }
    }

    @Override
    public void dictSysareaettreelistSuccess(ArrayList<Sysarea_Info> model) {
        Data_Sheng_LL.removeAllViews();
        if (model == null)
            return;
        sheng_sysarea_infoArrayList = model;

        ShengTitleLL.setVisibility(View.VISIBLE);
        ShengTitleTV.setText("请选择");
        ShengLine.setVisibility(View.VISIBLE);

        Data_Sheng_LL.setVisibility(View.VISIBLE);
        DataOneLL.setVisibility(View.GONE);
        DataTwoLL.setVisibility(View.GONE);
        DataThreeLL.setVisibility(View.GONE);
        //省份

        if (sheng_sysarea_infoArrayList.size() > 0) {
            for (int i = 0; i < sheng_sysarea_infoArrayList.size(); i++) {
                Sysarea_Info sysarea_info = sheng_sysarea_infoArrayList.get(i);
                View AreaView = View.inflate(getContext(), R.layout.a_item_area, null);
                ImageView Check_IV = (ImageView) AreaView.findViewById(R.id.Check_IV);
                TextView AreaTV = (TextView) AreaView.findViewById(R.id.AreaTV);
                AreaTV.setText(sysarea_info.getAreaname());
                Data_Sheng_LL.addView(AreaView);

                if (type.equals("1")) {
                    if (shengCode.equals(sysarea_info.getAid())) {
                        ShengCheck(AreaView, sysarea_info);
                    }
                }
                AreaView.setTag(sysarea_info);
                AreaView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (type.equals("1")) {
                            type = "2";
                        }
                        Sysarea_Info sysarea_info1 = (Sysarea_Info) v.getTag();
                        shengCode = sysarea_info1.getAid();
                        ShengCheck(v, sysarea_info1);
                    }
                });
            }

        }

    }

    private void ShengCheck(View v, Sysarea_Info sysarea_info) {
        if (CheckShengView != null) {
            ImageView Check_IV = (ImageView) CheckShengView.findViewById(R.id.Check_IV);
            Check_IV.setVisibility(View.GONE);
        }
        ImageView Check_IV = (ImageView) v.findViewById(R.id.Check_IV);
        Check_IV.setVisibility(View.VISIBLE);

        CheckShengView = v;
        addrcodeET.setText("");
        IsLastAddCode = false;
        shengSysAreaC.setCheck(true);
        OneSysAreaC.setCheck(false);
        TwoSysAreaC.setCheck(false);
        ThreeSysAreaC.setCheck(false);

        addrcode = sysarea_info.getAid();
        shengName = sysarea_info.getAreaname();
        oneName = "";
        twoName = "";
        threeName = "";
        SetCheckArea("sheng", "one", sysarea_info.getAreaname());
        mPresenter.dictSysareaegettreelistbyupidOne(sysarea_info.getAid(), getContext());
    }

    @Override
    public void dictSysareaegettreelistbyupidOneSuccess(ArrayList<Sysarea_Info> model) {
        DataOneLL.removeAllViews();
        if (model == null)
            return;

        One_sysarea_infoArrayList = model;
        if (One_sysarea_infoArrayList.size() > 0) {
            for (int i = 0; i < One_sysarea_infoArrayList.size(); i++) {
                Sysarea_Info sysarea_info = One_sysarea_infoArrayList.get(i);
                View AreaView = View.inflate(getContext(), R.layout.a_item_area, null);
                ImageView Check_IV = (ImageView) AreaView.findViewById(R.id.Check_IV);
                TextView AreaTV = (TextView) AreaView.findViewById(R.id.AreaTV);
                AreaTV.setText(sysarea_info.getAreaname());
                DataOneLL.addView(AreaView);
                if (type.equals("1")) {
                    if (oneCode.equals(sysarea_info.getAid())) {
                        OneCheck(AreaView, sysarea_info);
                    }
                }

                AreaView.setTag(sysarea_info);
                AreaView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (type.equals("1")) {
                            type = "2";
                        }
                        Sysarea_Info sysarea_info1 = (Sysarea_Info) v.getTag();
                        oneCode = sysarea_info1.getAid();
                        OneCheck(v, sysarea_info1);
                    }
                });
            }

        }
    }

    private void OneCheck(View v, Sysarea_Info sysarea_info) {
        if (CheckOneView != null) {
            ImageView Check_IV = (ImageView) CheckOneView.findViewById(R.id.Check_IV);
            Check_IV.setVisibility(View.GONE);
        }
        ImageView Check_IV = (ImageView) v.findViewById(R.id.Check_IV);
        Check_IV.setVisibility(View.VISIBLE);

        CheckOneView = v;
        addrcodeET.setText("");
        IsLastAddCode = false;
        shengSysAreaC.setCheck(true);
        OneSysAreaC.setCheck(true);
        TwoSysAreaC.setCheck(false);
        ThreeSysAreaC.setCheck(false);

        addrcode = sysarea_info.getAid();
        oneName = sysarea_info.getAreaname();
        twoName = "";
        threeName = "";
        SetCheckArea("one", "two", sysarea_info.getAreaname());
        mPresenter.dictSysareaegettreelistbyupidTwo(sysarea_info.getAid(), getContext());
    }

    @Override
    public void dictSysareaegettreelistbyupidTwoSuccess(ArrayList<Sysarea_Info> model) {
        DataTwoLL.removeAllViews();
        if (model == null)
            return;
        Two_sysarea_infoArrayList = model;
        if (Two_sysarea_infoArrayList.size() > 0) {
            for (int i = 0; i < Two_sysarea_infoArrayList.size(); i++) {
                Sysarea_Info sysarea_info = Two_sysarea_infoArrayList.get(i);
                View AreaView = View.inflate(getContext(), R.layout.a_item_area, null);
                ImageView Check_IV = (ImageView) AreaView.findViewById(R.id.Check_IV);
                TextView AreaTV = (TextView) AreaView.findViewById(R.id.AreaTV);
                AreaTV.setText(sysarea_info.getAreaname());
                DataTwoLL.addView(AreaView);

                if (type.equals("1")) {
                    if (twoCode.equals(sysarea_info.getAid())) {
                        TwoCheck(AreaView, sysarea_info);
                    }
                }

                AreaView.setTag(sysarea_info);
                AreaView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (type.equals("1")) {
                            type = "2";
                        }
                        Sysarea_Info sysarea_info1 = (Sysarea_Info) v.getTag();
                        twoCode = sysarea_info1.getAid();
                        TwoCheck(v, sysarea_info1);
                    }
                });
            }

        }
    }

    private void TwoCheck(View v, Sysarea_Info sysarea_info) {
        if (CheckTwoView != null) {
            ImageView Check_IV = (ImageView) CheckTwoView.findViewById(R.id.Check_IV);
            Check_IV.setVisibility(View.GONE);
        }
        ImageView Check_IV = (ImageView) v.findViewById(R.id.Check_IV);
        Check_IV.setVisibility(View.VISIBLE);

        CheckTwoView = v;
        addrcodeET.setText("");
        IsLastAddCode = false;
        shengSysAreaC.setCheck(true);
        OneSysAreaC.setCheck(true);
        TwoSysAreaC.setCheck(true);
        ThreeSysAreaC.setCheck(false);


        addrcode = sysarea_info.getAid();
        twoName = sysarea_info.getAreaname();
        threeName = "";
        SetCheckArea("two", "three", sysarea_info.getAreaname());
        mPresenter.dictSysareaegettreelistbyupidThree(sysarea_info.getAid(), getContext());
    }

    @Override
    public void dictSysareaegettreelistbyupidThreeSuccess(ArrayList<Sysarea_Info> model) {
        DataThreeLL.removeAllViews();
        if (model == null)
            return;
        Three_sysarea_infoArrayList = model;
        if (Three_sysarea_infoArrayList.size() > 0) {
            for (int i = 0; i < Three_sysarea_infoArrayList.size(); i++) {
                Sysarea_Info sysarea_info = Three_sysarea_infoArrayList.get(i);
                View AreaView = View.inflate(getContext(), R.layout.a_item_area, null);
                ImageView Check_IV = (ImageView) AreaView.findViewById(R.id.Check_IV);
                TextView AreaTV = (TextView) AreaView.findViewById(R.id.AreaTV);
                AreaTV.setText(sysarea_info.getAreaname());
                DataThreeLL.addView(AreaView);

                if (type.equals("1")) {
                    if (threeCode.equals(sysarea_info.getAid())) {
                        ThreeCheck(AreaView, sysarea_info);
                    }
                }


                AreaView.setTag(sysarea_info);
                AreaView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (type.equals("1")) {
                            type = "2";
                        }
                        Sysarea_Info sysarea_info1 = (Sysarea_Info) v.getTag();
                        threeCode = sysarea_info1.getAid();
                        ThreeCheck(v, sysarea_info1);
                    }
                });
            }

        }
    }

    private void ThreeCheck(View v, Sysarea_Info sysarea_info) {
        if (CheckThreeView != null) {
            ImageView Check_IV = (ImageView) CheckThreeView.findViewById(R.id.Check_IV);
            Check_IV.setVisibility(View.GONE);
        }
        ImageView Check_IV = (ImageView) v.findViewById(R.id.Check_IV);
        Check_IV.setVisibility(View.VISIBLE);

        CheckThreeView = v;
        addrcodeET.setText("");
        IsLastAddCode = false;
        shengSysAreaC.setCheck(true);
        OneSysAreaC.setCheck(true);
        TwoSysAreaC.setCheck(true);
        ThreeSysAreaC.setCheck(true);


        addrcode = sysarea_info.getAid();
        threeName = sysarea_info.getAreaname();
        SetCheckArea("three", "four", sysarea_info.getAreaname());
        mPresenter.dictSysareaegettreelistbyupidFour(sysarea_info.getAid(), getContext());
    }

    @Override
    public void dictSysareaegettreelistbyupidFourSuccess(ArrayList<Sysarea_Info> model) {
        if (model == null)
            return;
    }

    @Override
    public void onFailure(int code, String msg) {
        IsLastAddCode = true;

        //查询不到省级数据
        if (code == 0) {

        }
        //查询不到one级数据
        if (code == 1) {
            shengSysAreaC.getTitleLL().setVisibility(View.VISIBLE);
            shengSysAreaC.getLine().setVisibility(View.VISIBLE);
            shengSysAreaC.getDataLL().setVisibility(View.VISIBLE);

            OneSysAreaC.getTitleLL().setVisibility(View.GONE);
            TwoSysAreaC.getTitleLL().setVisibility(View.GONE);
            ThreeSysAreaC.getTitleLL().setVisibility(View.GONE);
        }
        //查询不到two级数据
        if (code == 2) {
            OneSysAreaC.getTitleLL().setVisibility(View.VISIBLE);
            OneSysAreaC.getLine().setVisibility(View.VISIBLE);
            OneSysAreaC.getDataLL().setVisibility(View.VISIBLE);

            TwoSysAreaC.getTitleLL().setVisibility(View.GONE);
            ThreeSysAreaC.getTitleLL().setVisibility(View.GONE);
        }
        //查询不到three级数据
        if (code == 3) {
            TwoSysAreaC.getTitleLL().setVisibility(View.VISIBLE);
            TwoSysAreaC.getLine().setVisibility(View.VISIBLE);
            TwoSysAreaC.getDataLL().setVisibility(View.VISIBLE);

            ThreeSysAreaC.getTitleLL().setVisibility(View.GONE);
        }
        //查询不到four级数据
        if (code == 4) {
            ThreeSysAreaC.getTitleLL().setVisibility(View.VISIBLE);
            ThreeSysAreaC.getLine().setVisibility(View.VISIBLE);
            ThreeSysAreaC.getDataLL().setVisibility(View.VISIBLE);

        }

        if (pop != null) {
            pop.dismiss();

        }
        addrcodeET.setText(shengName + oneName + twoName + threeName);

    }

    public class SysAreaC implements Serializable {
        private ImageView Line;
        private TextView Title;
        private LinearLayout TitleLL;
        private LinearLayout DataLL;
        private String tip;
        private Boolean IsCheck;


        public Boolean getCheck() {
            return IsCheck;
        }

        public void setCheck(Boolean check) {
            IsCheck = check;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }

        public ImageView getLine() {
            return Line;
        }

        public void setLine(ImageView line) {
            Line = line;
        }

        public TextView getTitle() {
            return Title;
        }

        public void setTitle(TextView title) {
            Title = title;
        }

        public LinearLayout getTitleLL() {
            return TitleLL;
        }

        public void setTitleLL(LinearLayout titleLL) {
            TitleLL = titleLL;
        }

        public LinearLayout getDataLL() {
            return DataLL;
        }

        public void setDataLL(LinearLayout dataLL) {
            DataLL = dataLL;
        }
    }

}
