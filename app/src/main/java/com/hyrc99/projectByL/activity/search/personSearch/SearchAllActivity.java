package com.hyrc99.projectByL.activity.search.personSearch;

import android.os.Bundle;
import android.view.View;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.badBehaviorDel.badBehaviorActivity;
import com.hyrc99.projectByL.activity.search.adapter.BadBehaviorAdapter;
import com.hyrc99.projectByL.activity.search.adapter.CompanyAdapter;
import com.hyrc99.projectByL.activity.search.adapter.EvaluateAdapter;
import com.hyrc99.projectByL.activity.search.adapter.ProjectAdapter;
import com.hyrc99.projectByL.activity.search.bean.BadBehavior;
import com.hyrc99.projectByL.activity.search.bean.BaseBean;
import com.hyrc99.projectByL.activity.search.bean.CompanyBean;
import com.hyrc99.projectByL.activity.search.bean.EvaluateBean;
import com.hyrc99.projectByL.activity.search.bean.ProjectBean;
import com.hyrc99.projectByL.activity.search.interfaceOnclick.OnAdapterOnclick;
import com.hyrc99.projectByL.activity.company.CompanyDelActivity;
import com.hyrc99.projectByL.application.AppLication;
import com.hyrc99.projectByL.baseAll.BaseAdapter;
import com.hyrc99.projectByL.baseAll.ListBaseActivity;
import com.hyrc99.projectByL.utils.http.NetWorkUtils;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

import java.util.HashMap;
import java.util.Map;

import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @description 作用: 查询功能
 * @date: 2019/10/30
 * @author: 卢融霜
 */
public class SearchAllActivity extends ListBaseActivity {
    //return R.layout.activity_search_all;
    //当前索引
    int page = 1;
    //每页条数
    int pageSize = 20;
    //记录 头部搜素框是否初始化
    boolean dataInit = false;
    //要搜索内容
    private String searchText;
    //单位类型Id
    private String ComId = null;

    @Override
    protected void listonRefresh(RefreshLayout refreshLayout, RecyclerView recyclerView) {
        page = 1;
        setNomoreData(false);
    }

    @Override
    protected void listOnLoadMore(RefreshLayout refreshLayout, RecyclerView recyclerView) {
        page += 1;
    }

    @Override
    protected BaseAdapter initAdapter(BaseAdapter adapter) {
        switch (getIntent().getExtras().getInt(AppLication.searchType.searchType, -1)) {
            case AppLication.searchType.BadBehavior:
                //不良行为
                adapter = new BadBehaviorAdapter(R.layout.bad_behavior_item, getApplicationContext());
                adapter.setAdapterItemOnclick(new OnAdapterOnclick() {
                    @Override
                    public void OnClickListener(int position, BaseBean bean) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("badId", bean.getBeanId());
                        openAcitivty(badBehaviorActivity.class, bundle);
                    }
                });
                break;
            case AppLication.searchType.progectName:
                //项目查询
                adapter = new ProjectAdapter(R.layout.project_name_item, getApplicationContext());
                break;
            case AppLication.searchType.evaluateSearch:
                adapter = new EvaluateAdapter(R.layout.evaluate_search_item, getApplicationContext());
                break;
            case AppLication.searchType.companySearch:
                //单位查询
                ComId = getIntent().getExtras().getString("ComId");
                adapter = new CompanyAdapter(R.layout.bad_behavior_item, getApplicationContext());
                adapter.setAdapterItemOnclick(new OnAdapterOnclick() {
                    @Override
                    public void OnClickListener(int position, BaseBean bean) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("companyId", bean.getBeanId());
                        openAcitivty(CompanyDelActivity.class, bundle);
                    }
                });
                break;
            default:
                closeActivity();
                break;
        }
        return adapter;
    }

    @Override
    protected void loadData(BaseAdapter adapter) {
        //获取从哪里来  要搜索什么类型的数据
        int type = getIntent().getExtras().getInt(AppLication.searchType.searchType, -1);

        //只初始化一遍即可
        initSearchTitle(type, adapter);

        //无内容不进行查询
        if (ComId == null) {
            if (searchText == null || searchText.trim().length() == 0) {
                return;
            }
        }

        /**
         * 根据不同类型查询不同数据
         */
        switch (type) {
            case AppLication.searchType.BadBehavior:
                getBadBehaviorData(adapter);
                break;
            case AppLication.searchType.progectName:
                getProjectNameData(adapter);
                break;
            case AppLication.searchType.evaluateSearch:
                getEvaluateSearchData(adapter);
                break;
            case AppLication.searchType.companySearch:
                getCompanySearchData(adapter);
                break;
            default:
                closeActivity();
                break;
        }
        if (page == 1) {
            showLoading();
            if (adapter.getData().size() > 0) {
                adapter.getData().clear();
            }
        }
    }

    private void initSearchTitle(int type, BaseAdapter adapter) {
        //显示搜素头
        isShowSearchTitle(true);
        if (!dataInit) {
            String searNameDef = "请输入搜索的内容";
            /**
             * 根据不同类型提示不同数据
             */
            switch (type) {
                case AppLication.searchType.BadBehavior:
                case AppLication.searchType.evaluateSearch:
                case AppLication.searchType.companySearch:
                    searNameDef = "请输入单位名称";
                    break;
                case AppLication.searchType.progectName:
                    searNameDef = "请输入工程名称";
                    break;
                default:
                    closeActivity();
                    break;
            }
            setSearchTilte(true, searNameDef, new SearchOnclickListener() {
                @Override
                public void OnSearch(String text) {
                    if (text == null && text.trim().length() == 0) {
                        showToast(R.string.toastWarSearText);
                        return;
                    }
                    searchText = text;
                    page = 1;
                    loadData(adapter);
                }
                //当单位id不为Null的时候，不弹出键盘， 直接查询
            }, ComId == null ? true : false);
            dataInit = true;
        }
    }

    /**
     * 查询 项目
     */
    private void getProjectNameData(BaseAdapter adapter) {
        Map<String, String> map = new HashMap<>();
        map.put("PAGE", "" + page);
        map.put("PAGESIZE", "" + pageSize);
        map.put("PNAME", "辽宁省");
        map.put("PRJNM", "" + searchText);

        NetWorkUtils.getNetwork2().getProjectList(map).enqueue(new Callback<ProjectBean>() {
            @Override
            public void onResponse(Call<ProjectBean> call, Response<ProjectBean> response) {
                if (response.body() != null && response.body().getData() !=
                        null && response.body().getData().size() > 0) {
                    for (ProjectBean.DataBean bean : response.body().getData()) {
                        adapter.addData(bean);
                    }
                    showContent();
                } else {
                    if (adapter.getData().size() == 0) {
                        showEmpty();
                    } else {
                        showToast(R.string.toastNoMorData);
                        setNomoreData(true);
                    }
                }
            }

            @Override
            public void onFailure(Call<ProjectBean> call, Throwable t) {
                showError(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getProjectNameData(adapter);
                    }
                });
            }
        });
    }

    /**
     * 查询 不良行为
     */
    private void getBadBehaviorData(BaseAdapter adapter) {
        Map<String, String> map = new HashMap<>();
        map.put("pi", "" + page);
        map.put("ps", "" + pageSize);
        map.put("dn", "" + searchText);

        NetWorkUtils.getNetwork().getBadPubList(map).enqueue(new Callback<BadBehavior>() {
            @Override
            public void onResponse(Call<BadBehavior> call, Response<BadBehavior> response) {
                if (response.body() != null && response.body().getData().getRows().size() > 0) {
                    for (BadBehavior.DataBean.RowsBean bean : response.body().getData().getRows()) {
                        adapter.addData(bean);
                    }
                    showContent();
                } else {
                    if (adapter.getData().size() == 0) {
                        showEmpty();
                    } else {
                        showToast(R.string.toastNoMorData);
                        setNomoreData(true);
                    }
                }
            }

            @Override
            public void onFailure(Call<BadBehavior> call, Throwable t) {
                showError(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getBadBehaviorData(adapter);
                    }
                });
            }
        });
    }

    /**
     * 评价查询
     */
    private void getEvaluateSearchData(BaseAdapter adapter) {
        Map<String, String> map = new HashMap<>();
        map.put("PAGE", "" + page);
        map.put("PAGESIZE", pageSize + "");
        map.put("NAME", searchText);

        NetWorkUtils.getNetwork2().getJudgeslb(map).enqueue(new Callback<EvaluateBean>() {
            @Override
            public void onResponse(Call<EvaluateBean> call, Response<EvaluateBean> response) {
                if (response != null && response.body() != null && response.body().getData() != null && response.body().getData().size() > 0) {
                    for (EvaluateBean.DataBean bean : response.body().getData()) {
                        adapter.addData(bean);
                    }
                    showContent();
                } else {
                    if (adapter.getData().size() == 0) {
                        showEmpty();
                    } else {
                        showToast(R.string.toastNoMorData);
                        setNomoreData(true);
                    }
                }
            }

            @Override
            public void onFailure(Call<EvaluateBean> call, Throwable t) {
                showError(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        loadData(adapter);
                    }
                });
            }
        });
    }

    /**
     * 单位查询
     */
    private void getCompanySearchData(BaseAdapter adapter) {
        Map<String, String> map = new HashMap<>();
        map.put("pi", page + "");
        map.put("ps", pageSize + "");
        map.put("dn", searchText == null ? "" : searchText);
        if (ComId != null) {
            map.put("ty", ComId);
        }
        NetWorkUtils.getNetwork().getDeptlist(map).enqueue(new Callback<CompanyBean>() {
            @Override
            public void onResponse(Call<CompanyBean> call, Response<CompanyBean> response) {
                if (response != null && response.body() != null && response.body().getData() != null && response.body().getData().getRows() != null && response.body().getData().getRows().size() > 0) {
                    for (CompanyBean.DataBean.RowsBean bean : response.body().getData().getRows()) {
                        adapter.addData(bean);
                    }
                    showContent();
                } else {
                    if (adapter.getData().size() == 0) {
                        showEmpty();
                    } else {
                        showToast(R.string.toastNoMorData);
                        setNomoreData(true);
                    }
                }
            }

            @Override
            public void onFailure(Call<CompanyBean> call, Throwable t) {
                showError(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        loadData(adapter);
                    }
                });
            }
        });
    }

    /**
     * 关闭自身
     */
    private void closeActivity() {
        showToast(R.string.toastError);
        finish();
    }
}
