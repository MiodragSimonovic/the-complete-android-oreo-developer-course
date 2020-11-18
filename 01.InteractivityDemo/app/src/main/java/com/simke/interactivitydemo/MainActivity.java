package com.simke.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText usernameEditText = (EditText) findViewById(R.id.userNameEditText);
        EditText paswordEditText = (EditText) findViewById(R.id.paswordEditText);
        //next 3 lines give infroamtaion what happened when we click button in Logcut
        Log.i("Info", "Button clicked.");
        Log.i("UserName", usernameEditText.getText().toString());
        Log.i("Password", paswordEditText.getText().toString());
        //gives Hello + username in bottom little time after we click button
        Toast.makeText(this, "Hello " + usernameEditText.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}