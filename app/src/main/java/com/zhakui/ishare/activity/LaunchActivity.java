package com.zhakui.ishare.activity;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.zhakui.ishare.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class LaunchActivity extends AppCompatActivity implements AnimatorListener{
    @BindView(R.id.launchImage)
    ImageView launchImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        ButterKnife.bind(this);
        startAnimator(launchImageView);
    }

    public void startAnimator(View view){
        ObjectAnimator launchAnimator = ObjectAnimator.ofFloat(null, "alpha", 1.0F,  1.0F);
        launchAnimator.setStartDelay(1000);
        launchAnimator.addListener(this);
        launchAnimator.start();
    }

    public void onAnimationStart(Animator animation){}


    public void onAnimationEnd(Animator animation){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onAnimationCancel(Animator animation){}

    public void onAnimationRepeat(Animator animation){}
}
