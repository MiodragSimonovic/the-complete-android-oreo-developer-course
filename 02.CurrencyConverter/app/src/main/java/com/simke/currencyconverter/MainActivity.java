package com.simke.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClick(View view) {
        EditText poundInput = (EditText) findViewById(R.id.poundInput);
        try {
            double pounds = Double.parseDouble(poundInput.getText().toString());
            double dollars = pounds * 1.3;
            String text = "£" + pounds + " is $" + dollars;
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this, "Enter amount in pounds", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}