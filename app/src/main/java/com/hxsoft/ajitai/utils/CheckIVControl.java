package com.hxsoft.ajitai.utils;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckIVControl {
    private ImageView checkImageView;
    private TextView checkTextView;
    private CheckIVControl parentCheckIVControl;

    private ArrayList<CheckIVControl> childCheckIVControlArrayList = new ArrayList<>();

    public TextView getCheckTextView() {
        return checkTextView;
    }

    public void setCheckTextView(TextView checkTextView) {
        this.checkTextView = checkTextView;
    }

    public ImageView getCheckImageView() {
        return checkImageView;
    }

    public void setCheckImageView(ImageView checkImageView) {
        this.checkImageView = checkImageView;
    }

    public CheckIVControl getParentCheckIVControl() {
        return parentCheckIVControl;
    }

    public void setParentCheckIVControl(CheckIVControl parentCheckIVControl) {
        this.parentCheckIVControl = parentCheckIVControl;
    }

    public ArrayList<CheckIVControl> getChildCheckIVControlArrayList() {
        return childCheckIVControlArrayList;
    }

    public void setChildCheckIVControlArrayList(ArrayList<CheckIVControl> childCheckIVControlArrayList) {
        this.childCheckIVControlArrayList = childCheckIVControlArrayList;
    }
}
