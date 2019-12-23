package com.hyrc99.projectByL.activity.personSearch;

import android.view.View;
import android.widget.LinearLayout;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.personSearch.Fragment.PersonFragment;
import com.hyrc99.projectByL.activity.personSearch.Fragment.PersonTypeFragment;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.utils.view.PersonScreenView;

import butterknife.BindView;

public class PersonActivity extends BaseActivity {
    @BindView(R.id.psView)
    PersonScreenView psView;
    PersonFragment personFragment;
    PersonTypeFragment personTypeFragment;
    @BindView(R.id.lltype1)
    LinearLayout lltype1;
    @BindView(R.id.lltype2)
    LinearLayout lltype2;

    @Override
    protected int loadView() {
        return R.layout.activity_person;
    }

    @Override
    protected void initData() {
        setTitle(true, "人员查询");
        personFragment = (PersonFragment) getSupportFragmentManager().findFragmentById(R.id.fgper);
        personTypeFragment = (PersonTypeFragment) getSupportFragmentManager().findFragmentById(R.id.fgperType);
        psView.SetOnSearchListener(new PersonScreenView.onSearchButtonClickListener() {
            @Override
            public void onSearch(int searchType, String name, String UID, String comName, String PerType) {
                if (name == null && name.trim().length() == 0) {
                    showToast("请输入人员姓名");
                    return;
                }
                if (searchType == 1) {
                    lltype1.setVisibility(View.VISIBLE);
                    lltype2.setVisibility(View.GONE);
                    if (UID == null || UID.trim().length() == 0) {
                        showToast("请输入身份证号");
                        return;
                    }
                    //根据人员姓名  身份证号查询
                    personFragment.load(name, UID, true);
                } else {
                    lltype1.setVisibility(View.GONE);
                    lltype2.setVisibility(View.VISIBLE);
                    if (comName == null && comName.trim().length() == 0) {
                        showToast("请输入单位名称");
                        return;
                    }
                    //根据人员姓名 单位名称 人员分类查询
                    personTypeFragment.load(name, comName, PerType, true);
                }
                //收起筛选条件
                psView.autoShowSearch();
                //隐藏键盘
                hideKeyboard(psView);
            }
        });
    }

    @Override
    protected void clearData() {

    }


}
