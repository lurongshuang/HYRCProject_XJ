package com.hyrc99.projectByL.activity.badBehaviorDel;

import android.widget.TextView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.badBehaviorDel.bean.BadBean;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.utils.http.NetWorkUtils;
import com.xuexiang.xui.widget.statelayout.StatefulLayout;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 不良行为详情
 */
public class badBehaviorActivity extends BaseActivity {
    @BindView(R.id.sfView)
    StatefulLayout sfView;
    @BindView(R.id.tvName) //公司名称
            TextView tvName;
    @BindView(R.id.tvBhbad) //  处罚原因
            TextView tvBhbad;
    @BindView(R.id.tvDscrpt)
    TextView tvDscrpt;//处罚决定
    @BindView(R.id.tvDorgan)
    TextView tvDorgan;//处理机关
    @BindView(R.id.tvDate)
    TextView tvDate;//处理日期
    @BindView(R.id.tvVtime)
    TextView tvVtime;//有效日期

    private int badId;

    @Override
    protected int loadView() {
        return R.layout.activity_bad_behavior;
    }

    @Override
    protected void initData() {
        setTitle(true, "不良行为详情");
        badId = getIntent().getExtras().getInt("badId");
        getData();
    }

    private void getData() {
        sfView.showLoading();
        Map<String, String> map = new HashMap<>();
        map.put("bid", badId + "");
        NetWorkUtils.getNetwork().getBadInfo(map).enqueue(new Callback<BadBean>() {
            @Override
            public void onResponse(Call<BadBean> call, Response<BadBean> response) {
                if (response != null && response.body() != null && response.body().getData() != null) {
                    tvName.setText(response.body().getData().getNAME());
                    tvBhbad.setText(response.body().getData().getBHBAD());
                    tvDscrpt.setText(response.body().getData().getDSCRPT());
                    tvDorgan.setText(response.body().getData().getDORGAN());
                    tvDate.setText(response.body().getData().getPTIME());
                    tvVtime.setText(response.body().getData().getVTIME());
                    sfView.showContent();
                } else {
                    sfView.showEmpty();
                }
            }

            @Override
            public void onFailure(Call<BadBean> call, Throwable t) {
                sfView.showEmpty();
            }
        });
    }

    @Override
    protected void clearData() {

    }
}
