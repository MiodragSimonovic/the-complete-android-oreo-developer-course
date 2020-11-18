package com.simke.numbershapesisnumbertriangularandsquare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Number number;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        EditText editNumber = (EditText) findViewById(R.id.editNumber);
        String numberString = editNumber.getText().toString();
        try {
            int inputNumber = Integer.parseInt(numberString);
            number = new Number(inputNumber);
            if (number.isTriangular() && number.isSquare()) {
                text = numberString + " is triangular and square";
            } else if (number.isTriangular()) {
                text = numberString + " is only triangular";
            } else if (number.isSquare()) {
                text = numberString + " is only square";
            } else {
                text = numberString + " is neither triangular nor square";
            }
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
        }

    }

}