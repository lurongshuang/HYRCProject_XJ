package com.hyrc99.projectByL.activity.search.adapter;

import android.content.Context;
import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;
import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.search.bean.BadBehavior;
import com.hyrc99.projectByL.activity.search.bean.BaseBean;
import com.hyrc99.projectByL.baseAll.BaseAdapter;

/**
 * 不良行为 adapter
 */
public class BadBehaviorAdapter extends BaseAdapter<BadBehavior.DataBean.RowsBean> {

    public BadBehaviorAdapter(int layoutResId, Context context) {
        super(layoutResId, context);
    }

    @Override
    protected void itemInit(BaseViewHolder helper, BadBehavior.DataBean.RowsBean item) {
        helper.setText(R.id.stTile, item.getNAME());
        helper.setTag(R.id.llitemView,R.id.adapterId, helper.getLayoutPosition());
        helper.setTag(R.id.llitemView,R.id.adapterItem, item);
        helper.setOnClickListener(R.id.llitemView, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (iadapterOnclick != null) {
                    iadapterOnclick.OnClickListener((Integer) view.getTag(R.id.adapterId), (BaseBean) view.getTag(R.id.adapterItem));
                }
            }
        });
    }
}
