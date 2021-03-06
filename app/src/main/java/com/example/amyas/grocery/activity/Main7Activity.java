package com.example.amyas.grocery.activity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.example.amyas.grocery.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main7Activity extends AppCompatActivity {

    @BindView(R.id.rectangle)
    ImageView mRectangle;
    @BindView(R.id.start_animation)
    Button mStartAnimation;
    @BindView(R.id.root)
    ConstraintLayout mRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.start_animation)
    public void startAnim() {
        ((Animatable) mRectangle.getDrawable()).start();
        //        CustomTV customTV = new CustomTV();
        //        mRectangle.startAnimation(customTV);
        //        float camilaTop = mRectangle.getTop();
        //        ObjectAnimator animator = ObjectAnimator.ofFloat(mRectangle, "y", camilaTop,500)
        //                .setDuration(1000);
        //        animator.setInterpolator(new OvershootInterpolator());
        //        animator.start();
    }

    @OnClick(R.id.rectangle)
    public void camilaClick() {
        Snackbar.make(mRoot, "clicked camila..", Snackbar.LENGTH_LONG).show();
//        ToastUtil.showToast(Main7Activity.this, "clicked camila..");
    }


}
