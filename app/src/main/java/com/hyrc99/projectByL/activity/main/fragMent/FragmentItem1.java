package com.hyrc99.projectByL.activity.main.fragMent;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.main.fragMent.fragmentItem1List.FragmentListItem;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.baseAll.LazyLoadingFragment;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

public class FragmentItem1 extends LazyLoadingFragment {
    @BindView(R.id.creditfg_viewpager)
    ViewPager mViewPager;
    @BindView(R.id.magic_indicator)
    MagicIndicator magicIndicator;
    private List<Fragment> mList;
    private String[] titles = {"通知公告", "信用动态", "表彰奖励", "政策法规", "失信曝光"};

    public FragmentItem1() {
    }

    public static FragmentItem1 newInstance() {
        Bundle args = new Bundle();
        FragmentItem1 fragment = new FragmentItem1();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected boolean onFirstVisibleToUser() {
        return true;
    }

    @Override
    protected void onVisibleToUser() {
        ((BaseActivity) getActivity()).setTitle(false, getString(R.string.tab1));
    }

    @Override
    protected void onInvisibleToUser() {

    }

    @Override
    protected int getLayRes() {
        return R.layout.fragment_1_layout;
    }

    @Override
    protected void init(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initViewPage();
        initMagicIndicator();

    }

    /**
     * 初始化fragment
     */
    private void initViewPage() {
        mList = new ArrayList<>();
        mList.add(new FragmentListItem(0));
        mList.add(new FragmentListItem(1));
        mList.add(new FragmentListItem(2));
        mList.add(new FragmentListItem(3));
        mList.add(new FragmentListItem(6));
        mViewPager.setAdapter(new MyAdapter(this.getChildFragmentManager()));
    }

    /**
     * 初始化指示器
     */
    private void initMagicIndicator() {
        magicIndicator.setBackgroundColor(Color.parseColor("#fafafa"));
        CommonNavigator commonNavigator = new CommonNavigator(getActivity());
        commonNavigator.setScrollPivotX(0.65f);
        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return titles == null ? 0 : titles.length;
            }

            @Override
            public IPagerTitleView getTitleView(Context context, final int index) {
                SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
                int TextSize = getResources().getDimensionPixelSize(R.dimen.sp_4);
                simplePagerTitleView.setTextSize(TextSize);
                simplePagerTitleView.setText(titles[index]);
                simplePagerTitleView.setAlpha(1.0f);
                simplePagerTitleView.setNormalColor(getResources().getColor(R.color.black));
                simplePagerTitleView.setSelectedColor(getResources().getColor(R.color.colorPrimary));
                simplePagerTitleView.setOnClickListener(v -> mViewPager.setCurrentItem(index));
                return simplePagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                LinePagerIndicator indicator = new LinePagerIndicator(context);
                indicator.setMode(LinePagerIndicator.MODE_EXACTLY);
//                indicator.setYOffset(8.0f);//指示器与文字间距
                indicator.setLineHeight(UIUtil.dip2px(context, 2));
                indicator.setLineWidth(UIUtil.dip2px(context, 50));
                indicator.setRoundRadius(UIUtil.dip2px(context, 3));
                indicator.setStartInterpolator(new AccelerateInterpolator());
                indicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
                indicator.setColors(getResources().getColor(R.color.colorPrimary));
                return indicator;
            }
        });
        magicIndicator.setNavigator(commonNavigator);
        ViewPagerHelper.bind(magicIndicator, mViewPager);
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mList.get(position);
        }

        @Override
        public int getCount() {
            return mList.size();
        }

        //重写这个方法，将设置每个Tab的标题
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

}
