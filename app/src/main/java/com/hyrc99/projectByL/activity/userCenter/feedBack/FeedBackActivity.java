package com.hyrc99.projectByL.activity.userCenter.feedBack;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.utils.photo.PhotoUtils;
import com.hyrc99.projectByL.utils.view.FontIconView;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class FeedBackActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.rlimages)
    GridLayout rlimages;

    @Override
    protected int loadView() {
        return R.layout.activity_feed_back;
    }

    @Override
    protected void initData() {
        initGridlayout();
        setTitle(true, "意见反馈", null, null, "提交", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("提交成功，感谢您的反馈。");
                FeedBackActivity.this.finish();
            }
        });
    }

    List<Uri> imgList = new ArrayList<>();

    private void initGridlayout() {
        rlimages.removeAllViews();
        if (imgList != null && imgList.size() > 0) {
            for (int i = 0; i < imgList.size(); i++) {
                rlimages.addView(getAddView(urlToBitmap(imgList.get(i)), i));
            }
        }
        if (imgList != null && imgList.size() < 4) {
            rlimages.addView(getAddView());
        }
    }

    private View getAddView() {
        View view = this.getLayoutInflater().inflate(R.layout.include_feed_back_img, null);
        if (view != null) {
            int w = getResources().getDimensionPixelSize(R.dimen.dp_75);
            int m = getResources().getDimensionPixelSize(R.dimen.dp_3);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(w, w);
            params.setMargins(m, m, m, m);
            params.gravity = Gravity.CENTER;
            view.setLayoutParams(params);
            RelativeLayout rlimgadd = view.findViewById(R.id.rlimgadd);
            if (rlimgadd != null) {
                rlimgadd.setOnClickListener(this);
            }
        }
        return view;
    }

    @SuppressLint("ResourceAsColor")
    private View getAddView(Bitmap bitmap, int index) {
        View view = View.inflate(this, R.layout.include_feed_back_img, null);
        if (view != null) {
            int w = getResources().getDimensionPixelSize(R.dimen.dp_75);
            int m = getResources().getDimensionPixelSize(R.dimen.dp_3);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(w, w);
            params.setMargins(m, m, m, m);
            params.gravity = Gravity.CENTER;
            view.setLayoutParams(params);
            ImageView ivimage = view.findViewById(R.id.ivimage);
            if (ivimage != null) {
                ivimage.setImageBitmap(bitmap);
                ivimage.setTag(index);
                ivimage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      ImageBuilder.from(FeedBackActivity.this).setImage(imgList).start();
                    }
                });
            }
            FontIconView ivdelete = view.findViewById(R.id.ivdelete);
            ivdelete.setTag(index);
            ivdelete.setVisibility(View.VISIBLE);
            ivdelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    delImgList((Integer) view.getTag());
                }
            });
        }
        return view;
    }

    private void delImgList(int index) {
        if (imgList != null && imgList.size() - 1 >= index) {
            imgList.remove(index);
            initGridlayout();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) {
            return;
        }
        Uri filtUri;
        switch (requestCode) {
            case PhotoUtils.REQUEST_CODE_ZHAOPIAN:
                //相册选择图片完毕，进行图片裁切
                if (data == null || data.getData() == null) {
                    return;
                }
                filtUri = data.getData();
                Bitmap bitmap = null;
                String bit = null;
                try {
                    bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(filtUri));
                    bit = filtUri.toString();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                imgList.add(filtUri);
                initGridlayout();
                break;
        }
    }

    private Bitmap urlToBitmap(Uri filtUri) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(filtUri));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    @Override
    protected void clearData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.adapterId:
                PhotoUtils.takePhotoAlbum(FeedBackActivity.this);
                break;
            case R.id.rlimgadd:
                PhotoUtils.takePhotoAlbum(FeedBackActivity.this);
                break;
        }
    }
}
