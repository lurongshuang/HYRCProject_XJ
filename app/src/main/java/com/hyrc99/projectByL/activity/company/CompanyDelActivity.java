package com.hyrc99.projectByL.activity.company;

import android.view.View;
import android.widget.TextView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.company.bean.ComPanyDelBean;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.utils.http.NetWorkUtils;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 单位详情
 */
public class CompanyDelActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.tvRegcap)
    TextView tvRegcap;
    @BindView(R.id.tvAddress)
    TextView tvAddress;
    @BindView(R.id.tvSetiem)
    TextView tvSetiem;
    @BindView(R.id.tvUnitName)
    TextView tvUnitName;
    @BindView(R.id.tvEnrId)
    TextView tvEnrId;
    @BindView(R.id.tvEnrJg)
    TextView tvEnrJg;
    @BindView(R.id.tvEnrAdd)
    TextView tvEnrAdd;
    @BindView(R.id.tvManRag)
    TextView tvManRag;
    private int companyId;


    @Override
    protected int loadView() {
        return R.layout.activity_company_del;
    }

    @Override
    protected void initData() {
        setTitle(true, "单位信息");
        companyId = getIntent().getExtras().getInt("companyId");
        findViewById(R.id.llQuali).setOnClickListener(this);
        getData();
    }

    private void getData() {
        showLoading(R.id.statelaVeiw);
        NetWorkUtils.getNetwork2().getBase(companyId).enqueue(new Callback<ComPanyDelBean>() {
            @Override
            public void onResponse(Call<ComPanyDelBean> call, Response<ComPanyDelBean> response) {
                if (response != null && response.body() != null && response.body().getData() != null) {
                    tvRegcap.setText(response.body().getData().getREGCAP());
                    tvAddress.setText(response.body().getData().getADDRESS());
                    tvSetiem.setText(response.body().getData().getSETIME());
                    tvUnitName.setText(response.body().getData().getUNITNAME());
                    tvEnrId.setText(response.body().getData().getENRID());
                    tvEnrJg.setText(response.body().getData().getENRJG());
                    tvEnrAdd.setText(response.body().getData().getADDRESS());
                    tvManRag.setText(response.body().getData().getMANRAG());
                    showContent(R.id.statelaVeiw);
                } else {
                    showEmpty(R.id.statelaVeiw);
                }
            }

            @Override
            public void onFailure(Call<ComPanyDelBean> call, Throwable t) {
                showError(R.id.statelaVeiw, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getData();
                    }
                });
            }
        });
    }

    @Override
    protected void clearData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llQuali:
                openAcitivty(QualificationsActivity.class, getIntent().getExtras());
                break;
            default:
                break;
        }
    }
}
