package com.hyrc99.projectByL.activity.userCenter.informationModification;


import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.utils.photo.FileProviderUtils;
import com.hyrc99.projectByL.utils.photo.PhotoUtils;
import com.hyrc99.projectByL.utils.view.FontIconView;
import com.xuexiang.xui.widget.imageview.RadiusImageView;

import java.io.File;

import androidx.appcompat.app.AlertDialog;
import butterknife.BindView;
import butterknife.OnClick;

public class InformationMActivity extends BaseActivity {
    @BindView(R.id.iv_leftIcon)
    FontIconView ivLeftIcon;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_rightText)
    FontIconView tvRightText;
    @BindView(R.id.tv_rightTextTitle)
    TextView tvRightTextTitle;
    @BindView(R.id.ll_toolbar_layout)
    LinearLayout llToolbarLayout;
    @BindView(R.id.riimage)
    RadiusImageView riimage;
    @BindView(R.id.rluserhead)
    RelativeLayout rluserhead;
    @BindView(R.id.rlusernc)
    RelativeLayout rlusernc;
    @BindView(R.id.tvname)
    TextView tvname;
    @BindView(R.id.rlusername)
    RelativeLayout rlusername;
    @BindView(R.id.rlusersex)
    RelativeLayout rlusersex;
    @BindView(R.id.rluserphone)
    RelativeLayout rluserphone;
    @BindView(R.id.rlusercom)
    RelativeLayout rlusercom;
    @BindView(R.id.tvusernc)
    TextView tvusernc;
    @BindView(R.id.tvusersex)
    TextView tvusersex;
    @BindView(R.id.tvuserphone)
    TextView tvuserphone;
    @BindView(R.id.tvusercom)
    TextView tvusercom;

    @Override
    protected int loadView() {
        return R.layout.activity_information_m;
    }

    @Override
    protected void initData() {
        setTitle(true, "个人信息");
        riimage.setImageResource(R.drawable.banner_4);
        tvusernc.setText("卢融霜");
        tvname.setText("卢融霜");
        tvusersex.setText("男");
        tvuserphone.setText("13718382321");
        tvusercom.setText("北京科技科技有限公司");
    }

    @Override
    protected void clearData() {

    }

    @OnClick({R.id.rluserhead, R.id.rlusernc, R.id.rlusername, R.id.rlusersex, R.id.rluserphone, R.id.rlusercom})
    public void onViewClicked(View view) {
        Bundle bundle = new Bundle();
        switch (view.getId()) {
            case R.id.rluserhead:
                //头像
                rluserhead();
                break;
            case R.id.rlusernc:
                //昵称
                bundle.putString("name", "昵称");
                bundle.putInt("key", 1);
                openAcitivty(ChangeUserActivity.class, bundle);
                break;
            case R.id.rlusername:
                //姓名
                bundle.putString("name", "姓名");
                bundle.putInt("key", 2);
                openAcitivty(ChangeUserActivity.class, bundle);
                break;
            case R.id.rlusersex:
                //性别
                bundle.putString("name", "性别");
                bundle.putInt("key", 3);
                openAcitivty(ChangeUserActivity.class, bundle);
                break;
            case R.id.rluserphone:
                //联系方式
                bundle.putString("name", "联系方式");
                bundle.putInt("key", 4);
                openAcitivty(ChangeUserActivity.class, bundle);
                break;
            case R.id.rlusercom:
                //公司
                bundle.putString("name", "公司");
                bundle.putInt("key", 5);
                openAcitivty(ChangeUserActivity.class, bundle);
                break;
        }
    }

    //更换头像
    private void rluserhead() {
        String[] per = {Manifest.permission.CAMERA};
        requetPermission(per, new onPermissionCallBack() {
            @Override
            public void onSuccess() {
                new AlertDialog.Builder(InformationMActivity.this).setTitle(R.string.change_header).setItems(
                        new String[]{"拍摄照片", "相册选择照片"},
                        (dialog, which) -> {
                            switch (which) {
                                case 0:
                                    PhotoUtils.takePicture(InformationMActivity.this, new File("/mnt/sdcard/tupian.jpg"));
                                    break;
                                case 1:
                                    PhotoUtils.takePhotoAlbum(InformationMActivity.this);
                                    break;
                                default:
                                    break;
                            }
                        }).show();
            }

            @Override
            public void choiceProhibit() {

            }

            @Override
            public void choiceProhibitNotAsking() {

            }
        });
    }

    private Uri uri;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) {
            return;
        }
        Uri filtUri;
        File outputFile = new File("/mnt/sdcard/tupian_out.jpg");//裁切后输出的图片
        switch (requestCode) {
            case PhotoUtils.REQUEST_CODE_PAIZHAO:
                //拍照完成，进行图片裁切
                File file = new File("/mnt/sdcard/tupian.jpg");
                filtUri = FileProviderUtils.uriFromFile(this, file);
                PhotoUtils.cropPicture(this, filtUri, outputFile);
                break;
            case PhotoUtils.REQUEST_CODE_ZHAOPIAN:
                //相册选择图片完毕，进行图片裁切
                if (data == null || data.getData() == null) {
                    return;
                }
                filtUri = data.getData();
                PhotoUtils.cropPicture(this, filtUri, outputFile);
                break;
            case PhotoUtils.REQUEST_CODE_CAIQIE:
                //图片裁切完成，显示裁切后的图片
                try {
                    uri = Uri.fromFile(outputFile);
                    Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri));
                    riimage.setImageBitmap(bitmap);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
        }
    }
}
