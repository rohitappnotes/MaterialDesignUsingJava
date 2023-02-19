package com.learn.android.using.java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        System.out.println("applicationContext "+BaseApplication.baseApplication);
        System.out.println("applicationContext "+getApplicationContext());
    }
}