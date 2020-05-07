package com.hxsoft.ajitai.ui.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.A_Cuseraddress_Bean;
import com.hxsoft.ajitai.model.bean.A_Cuserreceipt_Bean;
import com.hxsoft.ajitai.model.info.Cuserreceipt_Info;
import com.hxsoft.ajitai.present.A_XinJianShouHuoDiZhi_Present;
import com.hxsoft.ajitai.present.A_ZengPiaoZiZhi_Add_Present;
import com.hxsoft.ajitai.ui.view.A_XinJianShouHuoDiZhi_View;
import com.hxsoft.ajitai.ui.view.A_ZengPiaoZiZhi_Add_View;
import com.hxsoft.ajitai.utils.MStringUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ZengPiaoZiZhi_Add extends MvpActivity<A_ZengPiaoZiZhi_Add_Present> implements A_ZengPiaoZiZhi_Add_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.Delete_RL)
    RelativeLayout DeleteRL;
    @Bind(R.id.Check_IV)
    ImageView CheckIV;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.unitnameET)
    EditText unitnameET;
    @Bind(R.id.identifynoET)
    EditText identifynoET;
    @Bind(R.id.addressET)
    EditText addressET;
    @Bind(R.id.phoneET)
    EditText phoneET;
    @Bind(R.id.banknameET)
    EditText banknameET;
    @Bind(R.id.bankaccountET)
    EditText bankaccountET;
    private boolean check = true;


    private String type;
    private Cuserreceipt_Info.RecordsBean recordsBean;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_zengpiaozizhi_add;
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
            recordsBean = (Cuserreceipt_Info.RecordsBean) getIntent().getSerializableExtra("RecordsBean");
            unitnameET.setText(recordsBean.getUnitname());
            identifynoET.setText(recordsBean.getIdentifyno());
            addressET.setText(recordsBean.getAddress());
            phoneET.setText(recordsBean.getPhone());
            banknameET.setText(recordsBean.getBankname());
            bankaccountET.setText(recordsBean.getBankaccount());
        }

        CheckIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) {
                    CheckIV.setImageResource(R.mipmap.a_weixuanzhong);
                    check = false;

                } else {
                    CheckIV.setImageResource(R.mipmap.a_xuanzhong);
                    check = true;
                }
            }
        });


        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unitname = unitnameET.getText().toString();
                String identifyno = identifynoET.getText().toString();
                String address = addressET.getText().toString();
                String phone = phoneET.getText().toString();
                String bankname = banknameET.getText().toString();
                String bankaccount = bankaccountET.getText().toString();
                if (MStringUtils.IsNullOrEmpty(unitname)) {
                    showMessage("请填写单位名称");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(identifyno)) {
                    showMessage("请填写纳税人识别号");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(address)) {
                    showMessage("请填写注册地址");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(phone)) {
                    showMessage("请填写注册电话");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(bankname)) {
                    showMessage("请填写开户银行");
                    return;
                }
                if (MStringUtils.IsNullOrEmpty(bankaccount)) {
                    showMessage("请填写银行账户");
                    return;
                }
                if (check==false) {
                    showMessage("请勾选《增票资质确认书》");
                    return;
                }

                if (type.equals("0")) {
                    A_Cuserreceipt_Bean a_cuserreceipt_bean = new A_Cuserreceipt_Bean();
                    a_cuserreceipt_bean.setUnitname(unitname);
                    a_cuserreceipt_bean.setIdentifyno(identifyno);
                    a_cuserreceipt_bean.setAddress(address);
                    a_cuserreceipt_bean.setPhone(phone);
                    a_cuserreceipt_bean.setBankname(bankname);
                    a_cuserreceipt_bean.setBankaccount(bankaccount);
                    mPresenter.adminCuserreceiptAdd(a_cuserreceipt_bean, getContext());
                }

                if (type.equals("1")) {
                    A_Cuserreceipt_Bean a_cuserreceipt_bean = new A_Cuserreceipt_Bean();
                    a_cuserreceipt_bean.setRid(recordsBean.getRid());
                    a_cuserreceipt_bean.setUnitname(unitname);
                    a_cuserreceipt_bean.setIdentifyno(identifyno);
                    a_cuserreceipt_bean.setAddress(address);
                    a_cuserreceipt_bean.setPhone(phone);
                    a_cuserreceipt_bean.setBankname(bankname);
                    a_cuserreceipt_bean.setBankaccount(bankaccount);
                    mPresenter.adminCuserreceiptUpdate(a_cuserreceipt_bean, getContext());
                }
            }
        });

        DeleteRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("提示").setMessage("确定删除该发票吗").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        mPresenter.adminCuserreceiptDelete(recordsBean.getRid(), getContext());
                    }
                }).show();

            }
        });
    }

    @Override
    protected A_ZengPiaoZiZhi_Add_Present createPresenter() {
        return new A_ZengPiaoZiZhi_Add_Present();
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
    public void adminCuserreceiptAddSuccess(Boolean model) {
        if (model) {
            showMessage("保存成功");
            finish();
        } else {
            showMessage("保存失败");
        }
    }

    @Override
    public void adminCuserreceiptDeleteSuccess(Boolean model) {
        if (model) {
            showMessage("删除成功");
            finish();
        } else {
            showMessage("删除失败");
        }
    }

    @Override
    public void adminCuserreceiptUpdateSuccess(Boolean model) {
        if (model) {
            showMessage("修改成功");
            finish();
        } else {
            showMessage("修改失败");
        }
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
