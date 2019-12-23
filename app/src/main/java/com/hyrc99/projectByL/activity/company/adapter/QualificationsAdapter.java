package com.hyrc99.projectByL.activity.company.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseViewHolder;
import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.company.bean.QualificationsBase;
import com.hyrc99.projectByL.baseAll.BaseAdapter;

/**
 * @description 作用:
 * @date: 2019/11/6
 * @author: 卢融霜
 */
public class QualificationsAdapter extends BaseAdapter<QualificationsBase.DataBean> {
    public QualificationsAdapter(int layoutResId, Context context) {
        super(layoutResId, context);
    }

    @Override
    protected void itemInit(BaseViewHolder helper, QualificationsBase.DataBean item) {
        helper.setText(R.id.tvSpecty, item.getSPECTY());
        helper.setText(R.id.tvGrade, "等级 : " + item.getGRADE());
        helper.setText(R.id.tvApvm, "类别 : " + item.getAPVM());
        helper.setText(R.id.tvCertId, "证书号 : " + item.getCERTID());
        helper.setText(R.id.tvVtime, "有效期 : " + item.getVTIME());
    }
}
