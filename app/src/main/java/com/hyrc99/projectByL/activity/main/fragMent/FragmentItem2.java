package com.hyrc99.projectByL.activity.main.fragMent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.personSearch.PersonActivity;
import com.hyrc99.projectByL.activity.search.personSearch.SearchAllActivity;
import com.hyrc99.projectByL.activity.company.CompanyTypeActivity;
import com.hyrc99.projectByL.application.AppLication;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.baseAll.LazyLoadingFragment;
import com.hyrc99.projectByL.utils.sharedpreferences.SharedPreferencesHelper;
import com.hyrc99.projectByL.utils.view.AppBanner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class FragmentItem2 extends LazyLoadingFragment implements View.OnClickListener {
    @BindView(R.id.ll_fg_query)
    ListView listView;
    ArrayAdapter arrayAdapter;
    private LinearLayout ll_quality;
    private LinearLayout ll_evidence;
    private LinearLayout ll_record;
    View listBannnerIcons = null;
    View listHeaderIcons = null;
    View listCenterIcons = null;
    View listAdminIcons = null;

    private List<Integer> mData;

    public FragmentItem2() {
    }

    public static FragmentItem2 newInstance() {
        Bundle args = new Bundle();
        FragmentItem2 fragment = new FragmentItem2();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected boolean onFirstVisibleToUser() {
        return true;
    }

    @Override
    protected void onVisibleToUser() {
//        ((BaseActivity) getActivity()).setTilte(false, getString(R.string.tab2), getString(R.string.iconicon_search), new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //项目查询
//                Bundle bundle = new Bundle();
//                bundle.putInt(AppLication.searchType.searchType, AppLication.searchType.progectName);
//                openActivity(SearchAllActivity.class, bundle);
//            }
//        });
        ((BaseActivity) getActivity()).setTitle(false, getString(R.string.tab2));
    }

    @Override
    protected void onInvisibleToUser() {

    }

    @Override
    protected int getLayRes() {
        return R.layout.fragment_2_layout;
    }

    @Override
    public void onResume() {
        super.onResume();
        initUI();
    }


    @Override
    protected void init(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    }

    private void initUI() {
        if (listView.getChildCount() == 0) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            listBannnerIcons = inflater.inflate(R.layout.banner_layout, listView, false);
            listHeaderIcons = inflater.inflate(R.layout.inflate_queryfg_item01_layout, listView, false);
            listCenterIcons = inflater.inflate(R.layout.include_query_cardview_evidence, listView, false);
            listAdminIcons = inflater.inflate(R.layout.include_admin_query_project_item, listView, false);
            listView.addHeaderView(listBannnerIcons);
            listView.addHeaderView(listHeaderIcons);
            listView.addHeaderView(listCenterIcons);
            listView.addHeaderView(listAdminIcons);
            arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.activity_list_item);
            listView.setAdapter(arrayAdapter);
        }

        mData = new ArrayList<>();
        mData.add(R.drawable.banner_1);
        mData.add(R.drawable.banner_2);
        mData.add(R.drawable.banner_3);
        mData.add(R.drawable.banner_4);
        AppBanner sib_indicator_left_with_text = listBannnerIcons.findViewById(R.id.sib_indicator_left_with_text);
        sib_indicator_left_with_text.setSource(mData).startScroll();

        LinearLayout lL_legalLayout = listCenterIcons.findViewById(R.id.ll_legal_layout);
        LinearLayout ll_AdminLayout = listAdminIcons.findViewById(R.id.admin_project);
        LinearLayout ll_AdminQueryPro = listAdminIcons.findViewById(R.id.ll_admin_query_project);
        LinearLayout ll_AdminRecord = listAdminIcons.findViewById(R.id.ll_admin_record);
        int type = SharedPreferencesHelper.getPrefInt(getActivity(), "type", 1);
        if (type == 2) {
            lL_legalLayout.setVisibility(View.VISIBLE);
            ll_AdminLayout.setVisibility(View.GONE);
            ll_quality = listCenterIcons.findViewById(R.id.ll_quality);
            ll_evidence = listCenterIcons.findViewById(R.id.ll_left_queryPic);
            ll_record = listCenterIcons.findViewById(R.id.ll_query_check_record);
            ll_quality.setOnClickListener(this);
            ll_evidence.setOnClickListener(this);
            ll_record.setOnClickListener(this);
        } else if (type == 3) {
            lL_legalLayout.setVisibility(View.GONE);
            ll_AdminLayout.setVisibility(View.VISIBLE);
            ll_AdminLayout.setOnClickListener(this);
        } else {
            lL_legalLayout.setVisibility(View.GONE);
            ll_AdminLayout.setVisibility(View.GONE);
        }

//        ll_AdminLayout.setVisibility(View.VISIBLE);
        lL_legalLayout.setVisibility(View.VISIBLE);
        LinearLayout ivCompany = listHeaderIcons.findViewById(R.id.ll_item01_company);
        LinearLayout ivPerson = listHeaderIcons.findViewById(R.id.ll_item02_person);
        LinearLayout ivProject = listHeaderIcons.findViewById(R.id.ll_item03_project);
        LinearLayout ivEvaluate = listHeaderIcons.findViewById(R.id.ll_item04_evaluate);
        LinearLayout ivAchieve = listHeaderIcons.findViewById(R.id.ll_item05_achieve);
        LinearLayout ivMisconduct = listHeaderIcons.findViewById(R.id.ll_item06_misconduct);
        ll_AdminQueryPro.setOnClickListener(this);
        ll_AdminRecord.setOnClickListener(this);
        ivCompany.setOnClickListener(this);
        ivPerson.setOnClickListener(this);
        ivProject.setOnClickListener(this);
        ivEvaluate.setOnClickListener(this);
        ivAchieve.setOnClickListener(this);
        ivMisconduct.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_item01_company:
                //单位查询
                openActivity(CompanyTypeActivity.class);
                break;
            case R.id.ll_item02_person:
                //人员查询
                openActivity(PersonActivity.class);
                break;
            case R.id.ll_item03_project:
                //项目查询
                Bundle bundle_p = new Bundle();
                bundle_p.putInt(AppLication.searchType.searchType, AppLication.searchType.progectName);
                openActivity(SearchAllActivity.class, bundle_p);
                break;
            case R.id.ll_item04_evaluate:
                //评价查询
                Bundle bundle_e = new Bundle();
                bundle_e.putInt(AppLication.searchType.searchType, AppLication.searchType.evaluateSearch);
                openActivity(SearchAllActivity.class, bundle_e);
                break;
            case R.id.ll_item05_achieve:
                //   openActivity(AchieveSearchActivity.class);
                break;
            case R.id.ll_item06_misconduct:
                //不良行为
                Bundle bundle_b = new Bundle();
                bundle_b.putInt(AppLication.searchType.searchType, AppLication.searchType.BadBehavior);
                openActivity(SearchAllActivity.class, bundle_b);
                break;
            //考勤位置设置
            case R.id.ll_quality:
                //  openActivity(CheckLegalActivity.class);
                break;
            //法人项目
            case R.id.ll_left_queryPic:
                //  openActivity(EvidenceActivity.class);
                break;
            case R.id.ll_admin_query_project:
                //  openActivity(AdminProjectActivity.class);
                break;
            case R.id.ll_query_check_record:
                //   openActivity(ManageRecordActivity.class);
                break;
            case R.id.ll_admin_record:
                //   openActivity(ManageRecordActivity.class);
                break;
        }
    }
}
