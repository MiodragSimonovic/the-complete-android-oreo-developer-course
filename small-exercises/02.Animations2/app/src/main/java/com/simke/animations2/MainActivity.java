package com.simke.animations2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        bartImageView.setX(-1100);
    }

    public void clickImage(View view) {
        Log.i("Info", "Image is clicked");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        bartImageView.animate().translationXBy(1100).rotationBy(720).setDuration(2000);
    }

}