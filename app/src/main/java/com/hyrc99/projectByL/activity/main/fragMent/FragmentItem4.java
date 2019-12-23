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
                //请假
                openActivity(LeaveActivity.class);
                break;
            case R.id.llworkBK:
                //补卡
                break;
            case R.id.llworkJB:
                //加班
                break;
            case R.id.llworkYGWC:
                //因公外出
                break;
            case R.id.llworkCC:
                //出差
                break;
            case R.id.llworkHYS:
                //会议室
                break;
            case R.id.llworkYC:
                //用车
                break;
            case R.id.llworkTY:
                //通用
                break;
            case R.id.llworkRB:
                //日报
                break;
            case R.id.llwrokZB:
                //周报
                break;
            case R.id.llworkYB:
                //月报
                break;
            case R.id.llworkBQHZ:
                //便签 合作
                break;
        }
    }
}
