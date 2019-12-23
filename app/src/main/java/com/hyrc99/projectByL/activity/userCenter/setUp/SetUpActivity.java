package com.hyrc99.projectByL.activity.userCenter.setUp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.changePassWord.ChangePwdActivity;
import com.hyrc99.projectByL.activity.login.LoginActivity;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.xuexiang.xui.widget.alpha.XUIAlphaRelativeLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class SetUpActivity extends BaseActivity {
    @BindView(R.id.rlupPwd)
    XUIAlphaRelativeLayout rlupPwd;
    @BindView(R.id.rlclearData)
    XUIAlphaRelativeLayout rlclearData;
    @BindView(R.id.rlchangeId)
    XUIAlphaRelativeLayout rlchangeId;
    @BindView(R.id.rlOver)
    XUIAlphaRelativeLayout rlOver;
    @BindView(R.id.tvClearData)
    TextView tvClearData;

    @Override
    protected int loadView() {
        return R.layout.activity_set_up;
    }

    @Override
    protected void initData() {
        setTitle(true, "设置");
    }

    @Override
    protected void clearData() {
        tvClearData.setText("6.5M");
    }

    @OnClick({R.id.rlupPwd, R.id.rlclearData, R.id.rlchangeId, R.id.rlOver})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rlupPwd:
                //修改密码
                openAcitivty(ChangePwdActivity.class);
                break;
            case R.id.rlclearData:
                //清理缓存
                tvClearData.setText("");
                showToast("清理完成");
                break;
            case R.id.rlchangeId:
                //切换账号
                new AlertDialog.Builder(this).setTitle(R.string.changeUser).setMessage(R.string.changeMessage).setNegativeButton(R.string.exitNegative, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setPositiveButton(R.string.exitPositive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        exitApp();
                        openAcitivty(LoginActivity.class);
                    }
                }).show();
                break;
            case R.id.rlOver:
                //退出登录
                new AlertDialog.Builder(this).setTitle(R.string.exitTitle).setMessage(R.string.exitMessage).setNegativeButton(R.string.exitNegative, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setPositiveButton(R.string.exitPositive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        exitApp();
                    }
                }).show();
                break;
        }
    }
}
