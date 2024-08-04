package com.naeem.europetourplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread th = new Thread(){
            @Override
            public void run() {
                super.run();

                try {
                    sleep(3000);
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}