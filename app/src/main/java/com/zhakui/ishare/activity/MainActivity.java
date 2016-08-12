package com.zhakui.ishare.activity;

import android.graphics.Color;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.zhkui.MyClass;

import com.zhakui.ishare.R;
import com.zhakui.ishare.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS|WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_main);
        MyClass myClass = new MyClass("zhang");
        String name = myClass.getName();
        System.out.print(name);
        //showHomePage();
    }
    private void showHomePage(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        HomeFragment homeFragment = HomeFragment.newInstance("hello","word");
        FragmentTransaction transition = fragmentManager.beginTransaction();
        transition.replace(R.id.content,homeFragment);
        transition.commit();
    }

}
