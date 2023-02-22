package com.example.sugarcanediseasedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Rust extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rust);

        ImageView HomeIcon = findViewById(R.id.HomeIcon);

        HomeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToHome = new Intent(Rust.this , MainActivity.class);
                startActivity(goToHome);
                finish();
            }
        });
    }
}