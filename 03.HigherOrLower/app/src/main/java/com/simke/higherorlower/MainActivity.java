package com.simke.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // do more when learn more Android developement and find time:
    // High score list
    // timer and High score listu with fastest players

    int number;
    String message;
    int count = 0;
    int randomInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }

    public void generateRandomNumber() {
        Random random = new Random();
        randomInt = random.nextInt(1000) + 1;
    }

    public void buttonClick(View view) {
        count++;
        EditText editNumber = (EditText) findViewById(R.id.editNumber);
        try {
            number = Integer.parseInt(editNumber.getText().toString());
            if (number >= 1 && number <= 1000) {
                ImageView image = (ImageView) findViewById(R.id.imageView);
                image.setImageResource(R.drawable.image);
                image.setVisibility(View.INVISIBLE);
                if (number > randomInt) {
                   message = "Lower!";
                   editNumber.setText("");
                } else if (number < randomInt) {
                    message = "Higher";
                    editNumber.setText("");
                } else {
                    Toast.makeText(this, "Great, you guessed it from " + count + " times!", Toast.LENGTH_LONG).show();
                    message = "Try again if you want";
                    image.setVisibility(View.VISIBLE);
                    generateRandomNumber();
                    count = 0;
                }
            } else {
                message = "Wrong input";
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Enter some number", Toast.LENGTH_SHORT).show();
        }
    }

}