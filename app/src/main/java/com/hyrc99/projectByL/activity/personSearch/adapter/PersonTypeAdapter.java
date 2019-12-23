package com.hyrc99.projectByL.activity.personSearch.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseViewHolder;
import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.personSearch.bean.PersonComBean;
import com.hyrc99.projectByL.baseAll.BaseAdapter;

/**
 * @description 作用:
 * @date: 2019/11/15
 * @author: 卢融霜
 */
public class PersonTypeAdapter extends BaseAdapter<PersonComBean.DataBean> {
    public PersonTypeAdapter(int layoutResId, Context context) {
        super(layoutResId, context);
    }

    @Override
    protected void itemInit(BaseViewHolder helper, PersonComBean.DataBean item) {
        helper.setText(R.id.tvName, item.getNAME());
//        helper.setText(R.id.tvjtext, item.getJTEXT());
        helper.setText(R.id.tvgTitle, item.getTITLE());
        helper.setText(R.id.tvUID, item.getIDENTITYID());
        helper.setText(R.id.tvcompan, item.getUNITNAME());
        helper.setText(R.id.tvspecty,item.getSPECTY());
        helper.setText(R.id.tvCertId,item.getCERTID());
        helper.setText(R.id.tvRegId,item.getREGID());
        helper.setText(R.id.tvTime, item.getVTIME());
    }
}
