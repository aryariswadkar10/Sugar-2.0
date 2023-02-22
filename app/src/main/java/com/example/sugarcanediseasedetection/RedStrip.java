package com.example.sugarcanediseasedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RedStrip extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_strip);

        ImageView HomeIcon = findViewById(R.id.HomeIcon);

        HomeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToHome = new Intent(RedStrip.this , MainActivity.class);
                startActivity(goToHome);
                finish();
            }
        });
    }
}