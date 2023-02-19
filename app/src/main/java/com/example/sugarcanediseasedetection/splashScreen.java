package com.example.sugarcanediseasedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent iHome = new Intent(splashScreen.this, MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iHome);
                finish();
            }
        }, 2000);


    }
}

// This process of taking users from one application
// to another is achieved by passing the Intent to the system.
// Intents, in general, are used for navigating among various activities within the same
// application
// Where you're , where you've to go