package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

/**
 * Created by flueky e-mail:zkf@yitong.com.cn
 * <p>
 * 2017/11/3 下午4:21
 */
public class PullToChangeTopActivity extends Activity implements PullToRefreshScrollView.ScrollStateListener {

    private PullToRefreshScrollView ptrContent;
    private LinearLayout llTitle;
    private ImageView ivHead;
    private ColorDrawable titleBackgroundDrawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptr_changetop);

        ptrContent = (PullToRefreshScrollView) findViewById(R.id.activity_ptr_changetop);
        llTitle = (LinearLayout) findViewById(R.id.activity_ptr_changetop_ll_title);
        ivHead = (ImageView) findViewById(R.id.activity_ptr_changetop_ll_head);

        ptrContent.setHeadView(ivHead);
        ptrContent.setTitleView(llTitle);
        titleBackgroundDrawable = new ColorDrawable(Color.parseColor("#cc0000"));
        ptrContent.setScrollStateListener(this);
    }

    @Override
    public void openPercent(float openPercent) {
        titleBackgroundDrawable.setAlpha((int) ((1 - Math.pow(openPercent, 2)) * 255));
        llTitle.setBackgroundDrawable(titleBackgroundDrawable);
    }

    @Override
    public void changed(boolean isOpen) {

    }
}
