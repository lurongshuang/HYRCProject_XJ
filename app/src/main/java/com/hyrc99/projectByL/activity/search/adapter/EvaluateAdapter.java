package com.hyrc99.projectByL.activity.search.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseViewHolder;
import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.search.bean.EvaluateBean;
import com.hyrc99.projectByL.baseAll.BaseAdapter;

/**
 * @description 作用:
 * @date: 2019/11/4
 * @author: 卢融霜
 */
public class EvaluateAdapter extends BaseAdapter<EvaluateBean.DataBean> {
    public EvaluateAdapter(int layoutResId, Context context) {
        super(layoutResId, context);
    }

    @Override
    protected void itemInit(BaseViewHolder helper, EvaluateBean.DataBean item) {
        helper.setText(R.id.tvUnitName, item.getUNITNAME());
        helper.setText(R.id.tvYear, "评价年度 : "+item.getYEAR());
        helper.setText(R.id.tvJstext, "类别 : "+item.getJTEXT());
        helper.setText(R.id.tvResult, "结果 : "+item.getRESULT());
        helper.setText(R.id.tvVtime, "有效期 : "+item.getVTIME());
    }
}
