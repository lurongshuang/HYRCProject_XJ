package com.hyrc99.projectByL.activity.main.fragMent.fragmentItem1List;

import android.view.View;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.main.fragMent.fragmentItem1List.adapter.FragListAdapter;
import com.hyrc99.projectByL.activity.main.fragMent.fragmentItem1List.bean.NewsBean;
import com.hyrc99.projectByL.baseAll.BaseAdapter;
import com.hyrc99.projectByL.baseAll.ListBaseFragment;
import com.hyrc99.projectByL.utils.http.NetWorkUtils;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

import java.util.HashMap;
import java.util.Map;

import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentListItem extends ListBaseFragment {
    //请求地址
    private int type;
    //当前页码
    private int page = 1;
    private int pageSize = 20;

    public FragmentListItem(int type) {
        this.type = type;
    }

    @Override
    protected void listonRefresh(RefreshLayout refreshLayout, RecyclerView recyclerView) {
        page = 1;
    }

    @Override
    protected void listOnLoadMore(RefreshLayout refreshLayout, RecyclerView recyclerView) {
        page += 1;
    }

    @Override
    protected BaseAdapter initAdapter(BaseAdapter adapter) {
        adapter = new FragListAdapter(R.layout.frag_list_adapter_item, getActivity());
        return adapter;
    }

    @Override
    protected void loadData(BaseAdapter adapter) {
        Map<String, String> map = new HashMap<>();
        map.put("pi", page + "");
        map.put("ps", "" + pageSize);
        map.put("ty", "" + type);
        if (page == 1) {
            showLoading();
        }
        NetWorkUtils.getNetwork().getNews(map).enqueue(new Callback<NewsBean>() {
            @Override
            public void onResponse(Call<NewsBean> call, Response<NewsBean> response) {
                if (response.body() != null && response.body().getData().getRows().size() > 0) {
                    showContent();
                    for (NewsBean.DataBean.RowsBean newsBean : response.body().getData().getRows()) {
                        adapter.addData(newsBean);
                    }
                } else {
                    if (adapter.getData().size() == 0) {
                        showEmpty();
                    } else {
                        showToast(R.string.toastNoMorData);
                        showContent();
                    }
                }
            }

            @Override
            public void onFailure(Call<NewsBean> call, Throwable t) {
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
