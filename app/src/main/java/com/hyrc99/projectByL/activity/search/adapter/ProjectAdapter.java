package com.hyrc99.projectByL.activity.search.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseViewHolder;
import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.search.bean.ProjectBean;
import com.hyrc99.projectByL.baseAll.BaseAdapter;

/**
 * @description 作用:
 * @date: 2019/10/31
 * @author: 卢融霜
 */
public class ProjectAdapter extends BaseAdapter<ProjectBean.DataBean> {
    public ProjectAdapter(int layoutResId, Context context) {
        super(layoutResId, context);
    }

    @Override
    protected void itemInit(BaseViewHolder helper, ProjectBean.DataBean item) {
        helper.setText(R.id.tvPrjnm, item.getPRJNM());
        helper.setText(R.id.tvJtext, "类别 : "+item.getJTEXT());
        helper.setText(R.id.tvStext, "状态 : "+item.getSTEXT());
    }
}
