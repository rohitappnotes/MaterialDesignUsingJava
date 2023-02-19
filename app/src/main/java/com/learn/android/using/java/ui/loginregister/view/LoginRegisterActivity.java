package com.learn.android.using.java.ui.loginregister.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.android.using.java.R;
import com.learn.android.using.java.databinding.ActivityLoginRegisterBinding;
import com.learn.android.using.java.ui.loginregister.introduction.Intro;
import com.learn.android.using.java.ui.loginregister.introduction.IntroPagerAdapter;

import java.util.ArrayList;

public class LoginRegisterActivity extends AppCompatActivity {

    private ActivityLoginRegisterBinding viewBinding;

    private IntroPagerAdapter introPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityLoginRegisterBinding.inflate(getLayoutInflater());
        View view = viewBinding.getRoot();
        setContentView(view);

        viewBinding.scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                viewBinding.scrollView.post(new Runnable() {
                    public void run() {
                        viewBinding.scrollView.scrollTo(0, viewBinding.scrollView.getBottom() + viewBinding.scrollView.getScrollY());
                    }
                });
            }
        });

        introPagerAdapter = new IntroPagerAdapter(getApplicationContext(), getIntro(getApplicationContext()));
        viewBinding.viewPager.setAdapter(introPagerAdapter);
        viewBinding.circleIndicator.setViewPager(viewBinding.viewPager);
    }

    public ArrayList<Intro> getIntro(Context context) {
        ArrayList<Intro> introSliderArrayList = new ArrayList<>();

        introSliderArrayList.add(
                new Intro(
                        R.color.white,
                        R.drawable.intro_one,
                        context.getString(R.string.login_register_title_intro_one),
                        context.getString(R.string.login_register_desc_intro_one))
        );

        introSliderArrayList.add(
                new Intro(
                        R.color.white,
                        R.drawable.intro_two,
                        context.getString(R.string.login_register_title_intro_two),
                        context.getString(R.string.login_register_desc_intro_two))
        );

        introSliderArrayList.add(
                new Intro(
                        R.color.white,
                        R.drawable.intro_three,
                        context.getString(R.string.login_register_title_intro_three),
                        context.getString(R.string.login_register_desc_intro_three))
        );

        return introSliderArrayList;
    }
}