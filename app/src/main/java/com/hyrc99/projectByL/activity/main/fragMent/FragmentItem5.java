package com.hyrc99.projectByL.activity.main.fragMent;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.login.LoginActivity;
import com.hyrc99.projectByL.activity.userCenter.aboutUs.AboutUsActivity;
import com.hyrc99.projectByL.activity.userCenter.feedBack.FeedBackActivity;
import com.hyrc99.projectByL.activity.userCenter.help.HelpActivity;
import com.hyrc99.projectByL.activity.userCenter.informationModification.InformationMActivity;
import com.hyrc99.projectByL.activity.userCenter.setUp.SetUpActivity;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.baseAll.LazyLoadingFragment;
import com.xuexiang.xui.widget.imageview.RadiusImageView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.OnClick;

public class FragmentItem5 extends LazyLoadingFragment {
    @BindView(R.id.ivriimage)
    RadiusImageView ivriimage;
    @BindView(R.id.lltvUser)
    LinearLayout lltvUser;
    @BindView(R.id.llhelp)
    LinearLayout llhelp;
    @BindView(R.id.llcallback)
    LinearLayout llcallback;
    @BindView(R.id.llabout)
    LinearLayout llabout;
    @BindView(R.id.llseting)
    LinearLayout llseting;

    public FragmentItem5() {
    }

    public static FragmentItem5 newInstance() {
        Bundle args = new Bundle();
        FragmentItem5 fragment = new FragmentItem5();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected boolean onFirstVisibleToUser() {
        return true;
    }

    @Override
    protected void onVisibleToUser() {
        ((BaseActivity) getActivity()).setTitle(false, getString(R.string.tab4));
    }

    @Override
    protected void onInvisibleToUser() {
    }

    @Override
    protected int getLayRes() {
        return R.layout.fragment_5_layout;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    final int headCode = 200;

    @Subscribe
    public void headChange(HeaddMessage headMessage) {
        switch (headMessage.getId()) {
            case headCode:
                ivriimage.setImageBitmap(headMessage.getBitmap());
                break;
        }
    }

    @Override
    protected void init(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
    }

    @OnClick({R.id.ivriimage, R.id.lltvUser, R.id.llhelp, R.id.llcallback, R.id.llabout, R.id.llseting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivriimage:
                //切换头像
                openActivity(InformationMActivity.class);
                break;
            case R.id.lltvUser:
                //用户信息
                openActivity(InformationMActivity.class);
                break;
            case R.id.llhelp:
                //帮助中心
                openActivity(HelpActivity.class);
                break;
            case R.id.llcallback:
                //意见反馈
                openActivity(FeedBackActivity.class);
                break;
            case R.id.llabout:
                //关于我们
                openActivity(AboutUsActivity.class);
                break;
            case R.id.llseting:
                //设置
                openActivity(SetUpActivity.class);
                break;
        }
    }

    public static class HeaddMessage {
        private int id;
        private Bitmap bitmap;

        public HeaddMessage(int id, Bitmap bitmap) {
            setId(id);
            setBitmap(bitmap);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Bitmap getBitmap() {
            return bitmap;
        }

        public void setBitmap(Bitmap bitmap) {
            this.bitmap = bitmap;
        }
    }
}
