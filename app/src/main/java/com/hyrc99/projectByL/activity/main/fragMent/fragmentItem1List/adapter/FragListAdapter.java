package com.hyrc99.projectByL.activity.main.fragMent.fragmentItem1List.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;
import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.main.fragMent.fragmentItem1List.bean.NewsBean;
import com.hyrc99.projectByL.activity.news.NewsDelActivity;
import com.hyrc99.projectByL.baseAll.BaseAdapter;

public class FragListAdapter extends BaseAdapter<NewsBean.DataBean.RowsBean> {
    Context context;

    public FragListAdapter(int layoutResId, Context context) {
        super(layoutResId, context);
        this.context = context;
    }

    @Override
    protected void itemInit(BaseViewHolder helper, NewsBean.DataBean.RowsBean item) {
        helper.setText(R.id.tvtttitle2, item.getTitle());
        helper.setText(R.id.tvttauthor2, item.getPublishTime());
        helper.setTag(R.id.llttItem, item.getNewsID());

        helper.setOnClickListener(R.id.llttItem, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (context != null) {
                    Intent intent = new Intent(context, NewsDelActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("newsId", (Integer) view.getTag());
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            }
        });
    }
}
