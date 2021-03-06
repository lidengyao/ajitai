package com.hxsoft.ajitai.adapter;

import android.content.Context;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.ProjectInfo;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class ProjectAdapter extends CommonAdapter<ProjectInfo> {

    public ProjectAdapter(Context context, List<ProjectInfo> data, int itemLayoutId) {
        super(context, data, itemLayoutId);
    }

    @Override
    public void convert(int position, ViewHolder helper, ProjectInfo item) {
        helper.setText(R.id.GongdiNameTV, item.getPname());
    }
}
