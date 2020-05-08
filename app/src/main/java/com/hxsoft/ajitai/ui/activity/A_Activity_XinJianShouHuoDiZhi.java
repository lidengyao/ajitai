package com.hxsoft.ajitai.ui.activity;

import android.app.Activity;
import android.content.Context;
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
import com.hxsoft.ajitai.utils.CheckControl_Dialog_SysArea;
import com.hxsoft.ajitai.utils.MStringUtils;

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
    private String type;
    private Cuseraddress_Info.RecordsBean recordsBean;
    private Boolean IsCheckArea = false;
    private ArrayList<Sysarea_Info> sheng_sysarea_infoArrayList;
    private Integer AreaIndexOne = 1;
    private Integer AreaIndexTwo = 2;
    private Integer AreaIndexThree = 3;
    private Integer AreaIndexFour = 4;

    private View bottomView;
    private LinearLayout NameListLL;
    private LinearLayout DataLL;

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
            recordsBean = (Cuseraddress_Info.RecordsBean) getIntent().getSerializableExtra("RecordsBean");
            isdefault = recordsBean.getIsdefault();
            usernameET.setText(recordsBean.getUsername());
            phoneET.setText(recordsBean.getPhone());
            addressET.setText(recordsBean.getAddress());
            addrcodeET.setText(recordsBean.getAddrcode() + "");

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
                String addrcode = addrcodeET.getText().toString();
                String address = addressET.getText().toString();
                if (MStringUtils.IsNullOrEmpty(username)) {
                    showMessage("请填写收货人");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(phone)) {
                    showMessage("请填写手机号码");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(addrcode)) {
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
                    a_cuseraddress_bean.setAddrcode(20);//写死
                    a_cuseraddress_bean.setAddress(address);
                    a_cuseraddress_bean.setIsdefault(isdefault);
                    mPresenter.adminCuseraddressAdd(a_cuseraddress_bean, getContext());
                }

                if (type.equals("1")) {
                    A_Cuseraddress_Bean a_cuseraddress_bean = new A_Cuseraddress_Bean();
                    a_cuseraddress_bean.setAid(recordsBean.getAid());
                    a_cuseraddress_bean.setUsername(username);
                    a_cuseraddress_bean.setPhone(phone);
                    a_cuseraddress_bean.setAddrcode(20);//写死
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

        NameListLL = bottomView.findViewById(R.id.NameListLL);
        DataLL = bottomView.findViewById(R.id.DataLL);

    }


    private void ShowDialog() {

        PopupWindow pop = new PopupWindow(bottomView, -1, -2);
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
        pop.setAnimationStyle(R.style.main_menu_photo_anim);
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
    public void dictSysareaegettreelistbyupidSuccess(ArrayList<Sysarea_Info> model) {


    }

    @Override
    public void dictSysareaettreelistSuccess(ArrayList<Sysarea_Info> model) {
        if (model == null)
            return;
        sheng_sysarea_infoArrayList = model;
        //省份


        if (sheng_sysarea_infoArrayList.size() > 0) {
            for (int i = 0; i < sheng_sysarea_infoArrayList.size(); i++) {
                Sysarea_Info sysarea_info = sheng_sysarea_infoArrayList.get(i);
                View AreaView = View.inflate(getContext(), R.layout.a_item_area, null);
                ImageView Check_IV = (ImageView) AreaView.findViewById(R.id.Check_IV);
                TextView AreaTV = (TextView) AreaView.findViewById(R.id.AreaTV);
                AreaTV.setText(sysarea_info.getAreaname());
                DataLL.addView(AreaView);
                AreaView.setTag(sysarea_info);
                AreaView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Sysarea_Info sysarea_info1 = (Sysarea_Info) v.getTag();
                        mPresenter.dictSysareaegettreelistbyupid(sysarea_info1.getAid(), getContext());
                    }
                });
            }

        }

    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }

    public class SysAreaC {

    }

}
