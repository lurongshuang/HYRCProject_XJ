package com.hyrc99.projectByL.activity.personSearch.Fragment;

import android.view.View;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.personSearch.adapter.PersonAdapter;
import com.hyrc99.projectByL.activity.personSearch.bean.PersonBean;
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

/**
 * @description 作用:根据姓名 身份证号查询
 * @date: 2019/11/15
 * @author: 卢融霜
 */
public class PersonFragment extends ListBaseFragment {
    int page = 1;
    int pageSize = 20;
    private BaseAdapter adapter;
    private String name;
    private String UID;

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
        adapter = new PersonAdapter(R.layout.adapter_person_fragment_item, getContext());
        this.adapter = adapter;
        return adapter;
    }

    @Override
    protected void loadData(BaseAdapter adapter) {
        load(name, UID, false);
    }

    public void load(String name, String UID, boolean state) {
        if (name == null || UID == null) {
            return;
        }
        if (state) {
            page = 1;
            this.name = name;
            this.UID = UID;
            clearDatas();
        }

        Map<String, String> map = new HashMap<>();
        map.put("PNAME", "辽宁省");
        map.put("NAME", name);
        map.put("IDENTITYID", UID);
        map.put("PAGE", page + "");
        map.put("PAGESIZE", pageSize + "");
        if (page == 1) {
            showLoading();
        }
        NetWorkUtils.getNetwork2().getPerbyNameAndIdentityid(map).enqueue(new Callback<PersonBean>() {
            @Override
            public void onResponse(Call<PersonBean> call, Response<PersonBean> response) {
                if (response != null && response.body() != null && response.body().getData() != null && response.body().getData().size() > 0) {
                    showContent();
                    for (PersonBean.DataBean item : response.body().getData()) {
                        adapter.addData(item);
                    }
                } else {
                    if (adapter.getData().size() == 0) {
                        showEmpty();
                    } else {
                        finishRefreshWithNoMoreData();
                        showToast(getString(R.string.toastNoMorData));
                    }
                }
            }

            @Override
            public void onFailure(Call<PersonBean> call, Throwable t) {
                showError(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadData(adapter);
                    }
                });
            }
        });

    }
}
