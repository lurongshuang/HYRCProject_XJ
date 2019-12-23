package com.hyrc99.projectByL.activity.news;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.utils.http.URL;
import com.hyrc99.projectByL.utils.view.FontIconView;

import butterknife.BindView;

public class NewsDelActivity extends BaseActivity {
    @BindView(R.id.iv_leftIcon)
    FontIconView iv_leftIcon;
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.webView_creditDetailInfo)
    WebView webView;

    @Override
    protected int loadView() {
        return R.layout.activity_news;
    }

    @Override
    protected void initData() {
        iv_leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        tv_title.setText("资讯详情");
        initUI();
    }

    private void initUI() {
        Bundle bundle = getIntent().getExtras();
        int newsId = bundle.getInt("newsId");
        webView.clearCache(true);
        String url = URL.NEWSINFO_ROOT + "nid=" + newsId;
        webView.loadUrl(url);
        webView.clearCache(false);
        LinearLayout.LayoutParams mWebViewLP = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        webView.setLayoutParams(mWebViewLP);
        webView.setInitialScale(70);
        WebSettings webSettings = webView.getSettings();
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setSupportZoom(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);//存在就用缓存，不存在就通过网络获取
        // 添加js交互接口类，并起别名 imagelistner
//        webView.addJavascriptInterface(new JavascriptInterface(this), "imagelistner");
        webView.setWebViewClient(new MyWebViewClient());
    }

    @Override
    protected void clearData() {

    }

    // 注入js函数监听
    private void addImageClickListner() {
        // 这段js函数的功能就是，遍历所有的img几点，并添加onclick函数，在还是执行的时候调用本地接口传递url过去
        webView.loadUrl("javascript:(function(){" +
                "var objs = document.getElementsByTagName(\"img\"); " +
                "for(var i=0;i<objs.length;i++)  " +
                "{"
                + "    objs[i].onclick=function()  " +
                "    {  "
                + "        window.imagelistner.openImage(this.src);  " +
                "    }  " +
                "}" +
                "})()");
    }

    // 监听
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            loadBaseDialog.dismiss();
            view.getSettings().setJavaScriptEnabled(true);
            super.onPageFinished(view, url);
            // html加载完成之后，添加监听图片的点击js函数
            addImageClickListner();
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            loadBaseDialog.show();
            view.getSettings().setJavaScriptEnabled(true);
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
        }
    }
}
