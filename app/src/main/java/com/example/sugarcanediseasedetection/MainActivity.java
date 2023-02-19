package com.example.sugarcanediseasedetection;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.dhaval2404.imagepicker.ImagePicker;

public class MainActivity extends AppCompatActivity {
    static final String USER_IMG_KEY = "UserImgKey";
    static final int REQ_CODE = 100 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void addImg(View view) {
        ImagePicker.with(MainActivity.this)
                   .crop()                    //Crop image(Optional), Check Customization for more option
                   .maxResultSize(1080, 1080)    //Final image resolution will be less than 1080 x 1080(Optional)
                   .start();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri uri = data.getData(); // User selected image will be in data and it will return the
        // data in URI format

        if (resultCode == Activity.RESULT_OK) {
            //Image Uri will not be null for RESULT_OK
            // Passing Data
            Intent iPassData = new Intent(MainActivity.this , ResultActivity.class);
            iPassData.putExtra(USER_IMG_KEY , uri);
            startActivity(iPassData);
        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(this, ImagePicker.getError(data), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Pls Select Image", Toast.LENGTH_SHORT).show();
        }
    }
}