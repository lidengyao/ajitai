package com.hxsoft.ajitai.widget;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class Normal implements Serializable {
    private String Key;
    private String Value;
    private Integer IntegerValue;
    private EditText normalEditText;
    private String Type;
    private Boolean IsNull = false;
    private ArrayList<CheckBox> checkBoxArrayList;
    private ArrayList<TextView> textViewArrayList;
    private LinearLayout linearLayout;
    private ImageView imageViewAdd;
    private ImageView MoreDataIV;
    private Boolean IsTime = false;
    private View rootView;
    private Boolean IsBaseCode = false;
    private Boolean IsUser = false;
    private Boolean IsUnit = false;
    private PullLoadMoreListView pullLoadMoreListView;
    private PullLoadMoreListView LinearLayoutPullLoadMoreListView;
    private LinearLayout qingkongLL;
    private Boolean IsIDS = false;
    private ArrayList<Integer> IDSData;
    private Boolean IsIntValue = false;
    private Integer ColorID;
    private TextView textView;
    private Boolean Status = false;
    private Integer Weight;
    private String StatusName;
    private boolean IsLong;
    private Long longValue;
    private boolean IsOpinion;
    private boolean OkCheckList;


    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public boolean isOkCheckList() {
        return OkCheckList;
    }

    public void setOkCheckList(boolean okCheckList) {
        OkCheckList = okCheckList;
    }

    public boolean isOpinion() {
        return IsOpinion;
    }

    public void setOpinion(boolean opinion) {
        IsOpinion = opinion;
    }

    public PullLoadMoreListView getLinearLayoutPullLoadMoreListView() {
        return LinearLayoutPullLoadMoreListView;
    }

    public void setLinearLayoutPullLoadMoreListView(PullLoadMoreListView linearLayoutPullLoadMoreListView) {
        LinearLayoutPullLoadMoreListView = linearLayoutPullLoadMoreListView;
    }

    public boolean isLong() {
        return IsLong;
    }

    public void setLong(boolean aLong) {
        IsLong = aLong;
    }

    public String getStatusName() {
        return StatusName;
    }

    public void setStatusName(String statusName) {
        StatusName = statusName;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public Integer getColorID() {
        return ColorID;
    }

    public void setColorID(Integer colorID) {
        ColorID = colorID;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public Integer getIntegerValue() {
        return IntegerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        IntegerValue = integerValue;
    }

    public EditText getNormalEditText() {
        return normalEditText;
    }

    public void setNormalEditText(EditText normalEditText) {
        this.normalEditText = normalEditText;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public ArrayList<CheckBox> getCheckBoxArrayList() {
        return checkBoxArrayList;
    }

    public void setCheckBoxArrayList(ArrayList<CheckBox> checkBoxArrayList) {
        this.checkBoxArrayList = checkBoxArrayList;
    }

    public ArrayList<TextView> getTextViewArrayList() {
        return textViewArrayList;
    }

    public void setTextViewArrayList(ArrayList<TextView> textViewArrayList) {
        this.textViewArrayList = textViewArrayList;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public void setLinearLayout(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }

    public ImageView getImageViewAdd() {
        return imageViewAdd;
    }

    public void setImageViewAdd(ImageView imageViewAdd) {
        this.imageViewAdd = imageViewAdd;
    }

    public ImageView getMoreDataIV() {
        return MoreDataIV;
    }

    public void setMoreDataIV(ImageView moreDataIV) {
        MoreDataIV = moreDataIV;
    }


    public View getRootView() {
        return rootView;
    }

    public void setRootView(View rootView) {
        this.rootView = rootView;
    }


    public PullLoadMoreListView getPullLoadMoreListView() {
        return pullLoadMoreListView;
    }

    public void setPullLoadMoreListView(PullLoadMoreListView pullLoadMoreListView) {
        this.pullLoadMoreListView = pullLoadMoreListView;
    }

    public LinearLayout getQingkongLL() {
        return qingkongLL;
    }

    public void setQingkongLL(LinearLayout qingkongLL) {
        this.qingkongLL = qingkongLL;
    }


    public ArrayList<Integer> getIDSData() {
        return IDSData;
    }

    public void setIDSData(ArrayList<Integer> IDSData) {
        this.IDSData = IDSData;
    }

    public Boolean getNull() {
        return IsNull;
    }

    public void setNull(Boolean aNull) {
        IsNull = aNull;
    }

    public Boolean getTime() {
        return IsTime;
    }

    public void setTime(Boolean time) {
        IsTime = time;
    }

    public Boolean getBaseCode() {
        return IsBaseCode;
    }

    public void setBaseCode(Boolean baseCode) {
        IsBaseCode = baseCode;
    }

    public Boolean getUser() {
        return IsUser;
    }

    public void setUser(Boolean user) {
        IsUser = user;
    }

    public Boolean getUnit() {
        return IsUnit;
    }

    public void setUnit(Boolean unit) {
        IsUnit = unit;
    }

    public Boolean getIDS() {
        return IsIDS;
    }

    public void setIDS(Boolean IDS) {
        IsIDS = IDS;
    }

    public Boolean getIntValue() {
        return IsIntValue;
    }

    public void setIntValue(Boolean intValue) {
        IsIntValue = intValue;
    }
}
