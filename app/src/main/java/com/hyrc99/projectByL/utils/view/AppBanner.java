package com.hyrc99.projectByL.utils.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;

import java.lang.ref.WeakReference;

public class AppBanner extends BaseIndicatorBanner<Integer, AppBanner> {
    /**
     * 默认加载图片
     */
    private ColorDrawable mColorDrawable;
    /**
     * 高／宽比率
     */
    private double mScale = 0.5625D;
    /**
     * 是否允许进行缓存
     */
    private boolean mEnableCache = true;


    public AppBanner(Context context) {
        super(context);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }


    public AppBanner(Context context, AttributeSet attrs) {
        super(context, attrs);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    public AppBanner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    @Override
    public View onCreateItemView(int position) {
        View inflate = View.inflate(mContext, R.layout.xui_adapter_simple_image, null);
        ImageView iv = inflate.findViewById(R.id.iv);

        //解决Glide资源释放的问题，详细见http://blog.csdn.net/shangmingchao/article/details/51125554
        WeakReference<ImageView> imageViewWeakReference = new WeakReference<>(iv);
        ImageView target = imageViewWeakReference.get();

        Integer item = getItem(position);
        if (item != null && target != null) {
            loadingImageView(target, item);
        }
        return inflate;
    }

    /**
     * 加载图片
     */
    protected void loadingImageView(ImageView iv, Integer item) {
//        int itemWidth = mDisplayMetrics.widthPixels;
//        int itemHeight = (int) (itemWidth * mScale);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        iv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        if (item != null) {
            Glide.with(this).load(item).diskCacheStrategy(mEnableCache ?DiskCacheStrategy.RESOURCE:DiskCacheStrategy.NONE).into(iv);
        } else {
            iv.setImageDrawable(mColorDrawable);
        }
    }
    /**
     * 设置是否允许缓存
     *
     * @param enableCache
     * @return
     */
    public AppBanner enableCache(boolean enableCache) {
        mEnableCache = enableCache;
        return this;
    }

    /**
     * 获取是否允许缓存
     *
     * @return
     */
    public boolean getEnableCache() {
        return mEnableCache;
    }

    public ColorDrawable getColorDrawable() {
        return mColorDrawable;
    }

    public AppBanner setColorDrawable(ColorDrawable colorDrawable) {
        mColorDrawable = colorDrawable;
        return this;
    }

    public double getScale() {
        return mScale;
    }

    public AppBanner setScale(double scale) {
        mScale = scale;
        return this;
    }

    @Override
    protected void onDetachedFromWindow() {
        //解决内存泄漏的问题
        pauseScroll();
        super.onDetachedFromWindow();
    }

}
