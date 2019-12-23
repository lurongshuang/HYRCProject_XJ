package com.hyrc99.projectByL.activity.personSearch.Fragment;

import android.view.View;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.personSearch.adapter.PersonTypeAdapter;
import com.hyrc99.projectByL.activity.personSearch.bean.PersonComBean;
import com.hyrc99.projectByL.baseAll.BaseAdapter;
import com.hyrc99.projectByL.baseAll.ListBaseFragment;
import com.hyrc99.projectByL.utils.http.NetWorkUtils;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @description 作用:根据姓名 公司  人员类别查询
 * @date: 2019/11/15
 * @author: 卢融霜
 */
public class PersonTypeFragment extends ListBaseFragment {
    int page = 1;
    int pageSize = 20;
    private BaseAdapter adapter;
    private String name;
    private String compan;
    private String typename;

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
        adapter = new PersonTypeAdapter(R.layout.adapter_person_type_fragment_item, getContext());
        this.adapter = adapter;
        return adapter;
    }

    @Override
    protected void loadData(BaseAdapter adapter) {
        load(name, compan, typename, false);
    }
    public void load(String name, String compan, String typename, boolean state) {
        if (name == null || compan == null || typename == null) {
            return;
        }
        if (state) {
            page = 1;
            this.name = name;
            this.compan = compan;
            this.typename = typename;
            clearDatas();
        }

        Map<String, String> map = new HashMap<>();
        map.put("PNAME", "辽宁省");
        map.put("eNAME", name);
        map.put("UNITNAME", compan);
        map.put("JINDEX", getindex(typename));
        map.put("PAGE", page + "");
        map.put("PAGESIZE", pageSize + "");
        if (page == 1) {
            showLoading();
        }
        NetWorkUtils.getNetwork2().getPerbyJindex(map).enqueue(new Callback<PersonComBean>() {
            @Override
            public void onResponse(Call<PersonComBean> call, Response<PersonComBean> response) {
                if (response != null && response.body() != null && response.body().getData() != null && response.body().getData().size() > 0) {
                    showContent();
                    for (PersonComBean.DataBean item : response.body().getData()) {
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
            public void onFailure(Call<PersonComBean> call, Throwable t) {
                showError(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadData(adapter);
                    }
                });
            }
        });

    }

    List<String> list;

    private String getindex(String typename) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list.size() == 0) {
            list.add("总监");
            list.add("监理工程师");
            list.add("监理员");
            list.add("造价工程师师");
            list.add("质量检测员");
            list.add("建造师");
            list.add("安全工程师");
            list.add("造价员");
            list.add("五大员");
            list.add("三类人员");
            list.add("其它执业人员");
        }
        for (int i = 0; i < list.size(); i++) {
            if (typename.equals(list.get(i))) {
                return i + "";
            }
        }
        return "";
    }
}
