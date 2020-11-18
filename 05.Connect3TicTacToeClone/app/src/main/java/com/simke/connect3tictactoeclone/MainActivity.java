package com.simke.connect3tictactoeclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean firstPlayerTurn = true;
    String theEndText;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView21;
    ImageView imageView22;
    ImageView imageView23;
    ImageView imageView31;
    ImageView imageView32;
    ImageView imageView33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createImageViews();
    }

    public void clickOnScreen(View view) {
        ImageView imageView = (ImageView) view;
        if (imageView.getDrawable() == null && !theEnd()) {
            imageView.setTranslationY(-1000);
            if (firstPlayerTurn) {
                imageView.setImageResource(R.drawable.red);
                imageView.setTag("red");
                theEndText = "Red is won!!!";
                firstPlayerTurn = false;
            } else {
                imageView.setImageResource(R.drawable.yellow);
                imageView.setTag("yellow");
                theEndText = "Yellow is won!!!";
                firstPlayerTurn = true;
            }
            imageView.animate().translationYBy(1000).rotationBy(360).setDuration(1000);
        }
        if (noOneWon()) {
            theEndText = "No one won!";
            Toast.makeText(this, theEndText, Toast.LENGTH_SHORT).show();
            Button button = (Button) findViewById(R.id.button);
            button.setVisibility(View.VISIBLE);
            firstPlayerTurn = true;
        }
        if (theEnd()) {
            Toast.makeText(this, theEndText, Toast.LENGTH_SHORT).show();
            Button button = (Button) findViewById(R.id.button);
            button.setVisibility(View.VISIBLE);
            firstPlayerTurn = true;
        }
    }

    public void createImageViews() {
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView31 = (ImageView) findViewById(R.id.imageView31);
        imageView32 = (ImageView) findViewById(R.id.imageView32);
        imageView33 = (ImageView) findViewById(R.id.imageView33);
    }

    public boolean sameRow(ImageView imageView1, ImageView imageView2, ImageView imageView3) {
        return imageView1.getTag() != null &&
               imageView1.getTag().equals(imageView2.getTag()) &&
               imageView2.getTag().equals(imageView3.getTag());
    }

    public boolean noOneWon() {
        return imageView11.getTag() != null &&
               imageView12.getTag() != null &&
               imageView13.getTag() != null &&
               imageView21.getTag() != null &&
               imageView22.getTag() != null &&
               imageView23.getTag() != null &&
               imageView31.getTag() != null &&
               imageView32.getTag() != null &&
               imageView33.getTag() != null;
    }

    public boolean theEnd() {
        return sameRow(imageView11, imageView12, imageView13) ||
               sameRow(imageView21, imageView22, imageView23) ||
               sameRow(imageView31, imageView32, imageView33) ||
               sameRow(imageView11, imageView21, imageView31) ||
               sameRow(imageView12, imageView22, imageView32) ||
               sameRow(imageView13, imageView23, imageView33) ||
               sameRow(imageView11, imageView22, imageView33) ||
               sameRow(imageView13, imageView22, imageView31);
    }

    public void playAgain(View view) {
        Button button = (Button) findViewById(R.id.button);
        button.setVisibility(View.INVISIBLE);
        imageView11.setImageDrawable(null);
        imageView12.setImageDrawable(null);
        imageView13.setImageDrawable(null);
        imageView21.setImageDrawable(null);
        imageView22.setImageDrawable(null);
        imageView23.setImageDrawable(null);
        imageView31.setImageDrawable(null);
        imageView32.setImageDrawable(null);
        imageView33.setImageDrawable(null);
        imageView11.setTag(null);
        imageView12.setTag(null);
        imageView13.setTag(null);
        imageView21.setTag(null);
        imageView22.setTag(null);
        imageView23.setTag(null);
        imageView31.setTag(null);
        imageView32.setTag(null);
        imageView33.setTag(null);
    }

}