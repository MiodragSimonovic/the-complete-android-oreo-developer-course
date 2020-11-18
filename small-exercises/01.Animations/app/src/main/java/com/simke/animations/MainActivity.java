    package com.simke.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

    public class MainActivity extends AppCompatActivity {
        //aplication start with Bart showing so we create this flag as true
        boolean bartIsShowing = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        Log.i("Info", "Image is clicked");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        if (bartIsShowing) {
            bartImageView.animate().alpha(0).setDuration(10000);
            homerImageView.animate().alpha(1).setDuration(10000);
            bartIsShowing = false;
        } else {
            homerImageView.animate().alpha(0).setDuration(10000);
            bartImageView.animate().alpha(1).setDuration(10000);
            bartIsShowing = true;
        }

    }

}