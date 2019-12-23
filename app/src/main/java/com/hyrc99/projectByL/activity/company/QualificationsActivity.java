package com.hyrc99.projectByL.activity.company;

import android.view.View;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.company.adapter.QualificationsAdapter;
import com.hyrc99.projectByL.activity.company.bean.QualificationsBase;
import com.hyrc99.projectByL.baseAll.BaseAdapter;
import com.hyrc99.projectByL.baseAll.ListBaseActivity;
import com.hyrc99.projectByL.utils.http.NetWorkUtils;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 单位资质信息
 */
public class QualificationsActivity extends ListBaseActivity {
    private int companyId;

    @Override
    protected void listonRefresh(RefreshLayout refreshLayout, RecyclerView recyclerView) {

    }

    @Override
    protected void listOnLoadMore(RefreshLayout refreshLayout, RecyclerView recyclerView) {

    }

    public void setRefreshData() {
        Refresh(true);
        LoadMore(false);
    }

    @Override
    protected BaseAdapter initAdapter(BaseAdapter adapter) {
        setTitle(true, "资质信息");
        adapter = new QualificationsAdapter(R.layout.adapter_qualifications_item, getApplicationContext());
        return adapter;
    }

    @Override
    protected void loadData(BaseAdapter adapter) {
        companyId = getIntent().getExtras().getInt("companyId");
        showLoading();
        NetWorkUtils.getNetwork2().getAptm(companyId).enqueue(new Callback<QualificationsBase>() {
            @Override
            public void onResponse(Call<QualificationsBase> call, Response<QualificationsBase> response) {
                if (response != null && response.body() != null && response.body().getData() != null && response.body().getData().size() > 0) {
                    for (QualificationsBase.DataBean bean : response.body().getData()) {
                        adapter.addData(bean);
                    }
                    showContent();
                } else {
                    showEmpty();
                }
            }

            @Override
            public void onFailure(Call<QualificationsBase> call, Throwable t) {
                showError(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        loadData(adapter);
                    }
                });
            }
        });
    }
}
