package com.learn.android.using.java.ui.splash.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.learn.android.using.java.AppConstants;
import com.learn.android.using.java.databinding.ActivitySplashBinding;
import com.learn.android.using.java.ui.loginregister.view.LoginRegisterActivity;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding viewBinding;

    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivitySplashBinding.inflate(getLayoutInflater());
        View view = viewBinding.getRoot();
        setContentView(view);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginRegisterActivity.class);
                startActivity(intent);
            }
        };
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (handler != null) {
            handler.postDelayed(runnable, AppConstants.Delay.SPLASH);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}