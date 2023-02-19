package com.example.sugarcanediseasedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    ImageView diseaseImg ;
    TextView diseaseName ;
    Button infoBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        diseaseImg = findViewById(R.id.diseaseImg);
        diseaseName = findViewById(R.id.diseaseName);
        infoBtn = findViewById(R.id.infoBtn);

        // Receiving User Img
        Intent iGetData = getIntent();
        Uri userImg = (Uri) iGetData.getParcelableExtra(MainActivity.USER_IMG_KEY);
        diseaseImg.setImageURI(userImg);

        // Edge Case : If inappropriate disease is

        // InfoBtn Logic
        // We'll extract the text from diseaseName and apply onClick on InfoBtn and
        // using switch case we'll show particular detected disease info

        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}