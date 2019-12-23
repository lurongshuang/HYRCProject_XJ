package com.hyrc99.projectByL.activity.company;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.search.personSearch.SearchAllActivity;
import com.hyrc99.projectByL.activity.search.adapter.BadBehaviorAdapter;
import com.hyrc99.projectByL.activity.search.bean.BadBehavior;
import com.hyrc99.projectByL.activity.search.bean.BaseBean;
import com.hyrc99.projectByL.activity.search.interfaceOnclick.OnAdapterOnclick;
import com.hyrc99.projectByL.application.AppLication;
import com.hyrc99.projectByL.baseAll.BaseActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

/**
 * 单位查询首页
 */
public class CompanyTypeActivity extends BaseActivity {
    @BindView(R.id.rvlist)
    RecyclerView recyclerView;
    private String[] listID = {"100000000000", "010000000000", "001000000000", "000100000000", "000010000000", "000001000000", "000000100000", "000000010000", "000000001000", "000000000100", "000000000010", "000000000001"};
    private String[] listName = {"建设单位", "勘察单位", "设计单位", "咨询单位", "施工单位", "监理单位", "质量检测单位", "招标代理单位", "供货单位", "安全评价单位", "移民监督单位", "机械制造单位"};

    @Override
    protected int loadView() {
        return R.layout.activity_company_type;
    }

    @Override
    protected void initData() {
        setSearchTilte(true, "请输入单位名称", new SearchOnclickListener() {
            @Override
            public void OnSearch(String text) {

            }
        }, false);
        //禁用获取焦点事件，得到点击事件  点击跳转搜索页面
        EditText etSearch = findViewById(R.id.etSearch_search);
        etSearch.setFocusable(false);
        etSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt(AppLication.searchType.searchType, AppLication.searchType.companySearch);
                bundle.putString("ComId", null);
                openAcitivty(SearchAllActivity.class, bundle);
            }
        });


        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        BadBehaviorAdapter adapter = new BadBehaviorAdapter(R.layout.bad_behavior_item, getApplicationContext());
        recyclerView.setAdapter(adapter);
        addData(adapter);

    }
    //初始化
    private void addData(BadBehaviorAdapter adapter) {
        for (int i = 1; i < listID.length; i++) {
            BadBehavior.DataBean.RowsBean bean = new BadBehavior.DataBean.RowsBean();
            bean.setCOMID(listID[i]);
            bean.setNAME(listName[i]);
            adapter.addData(bean);
        }

        adapter.setAdapterItemOnclick(new OnAdapterOnclick() {
            @Override
            public void OnClickListener(int position, BaseBean bean) {
                Bundle bundle = new Bundle();
                bundle.putInt(AppLication.searchType.searchType, AppLication.searchType.companySearch);
                bundle.putString("ComId", (String) ((BadBehavior.DataBean.RowsBean) bean).getCOMID());
                openAcitivty(SearchAllActivity.class, bundle);
            }
        });
    }

    @Override
    protected void clearData() {

    }
}
