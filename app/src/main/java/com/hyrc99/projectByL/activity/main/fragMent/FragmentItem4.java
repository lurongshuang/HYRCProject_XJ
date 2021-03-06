package com.hyrc99.projectByL.activity.main.fragMent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.work.leave.LeaveActivity;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.baseAll.LazyLoadingFragment;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class FragmentItem4 extends LazyLoadingFragment {
    @BindView(R.id.llworkQJ)
    XUIAlphaLinearLayout llworkQJ;
    @BindView(R.id.llworkBK)
    XUIAlphaLinearLayout llworkBK;
    @BindView(R.id.llworkJB)
    XUIAlphaLinearLayout llworkJB;
    @BindView(R.id.llworkYGWC)
    XUIAlphaLinearLayout llworkYGWC;
    @BindView(R.id.llworkCC)
    XUIAlphaLinearLayout llworkCC;
    @BindView(R.id.llworkHYS)
    XUIAlphaLinearLayout llworkHYS;
    @BindView(R.id.llworkYC)
    XUIAlphaLinearLayout llworkYC;
    @BindView(R.id.llworkTY)
    XUIAlphaLinearLayout llworkTY;
    @BindView(R.id.llworkRB)
    XUIAlphaLinearLayout llworkRB;
    @BindView(R.id.llwrokZB)
    XUIAlphaLinearLayout llwrokZB;
    @BindView(R.id.llworkYB)
    XUIAlphaLinearLayout llworkYB;
    @BindView(R.id.llworkBQHZ)
    XUIAlphaLinearLayout llworkBQHZ;

    public FragmentItem4() {
    }

    public static FragmentItem4 newInstance() {
        Bundle args = new Bundle();
        FragmentItem4 fragment = new FragmentItem4();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected boolean onFirstVisibleToUser() {
        return true;
    }

    @Override
    protected void onVisibleToUser() {
        ((BaseActivity) getActivity()).setTitle(false, getString(R.string.tab5));
    }

    @Override
    protected void onInvisibleToUser() {
    }

    @Override
    protected int getLayRes() {
        return R.layout.fragment_4_layout;
    }

    @Override
    protected void init(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    }

    @OnClick({R.id.llworkQJ, R.id.llworkBK, R.id.llworkJB, R.id.llworkYGWC, R.id.llworkCC, R.id.llworkHYS, R.id.llworkYC, R.id.llworkTY, R.id.llworkRB, R.id.llwrokZB, R.id.llworkYB, R.id.llworkBQHZ})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.llworkQJ:
                //??????
                openActivity(LeaveActivity.class);
                break;
            case R.id.llworkBK:
                //??????
                break;
            case R.id.llworkJB:
                //??????
                break;
            case R.id.llworkYGWC:
                //????????????
                break;
            case R.id.llworkCC:
                //??????
                break;
            case R.id.llworkHYS:
                //?????????
                break;
            case R.id.llworkYC:
                //??????
                break;
            case R.id.llworkTY:
                //??????
                break;
            case R.id.llworkRB:
                //??????
                break;
            case R.id.llwrokZB:
                //??????
                break;
            case R.id.llworkYB:
                //??????
                break;
            case R.id.llworkBQHZ:
                //?????? ??????
                break;
        }
    }
}
