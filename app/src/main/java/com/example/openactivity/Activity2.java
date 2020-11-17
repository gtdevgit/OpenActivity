package com.example.openactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textview1 = (TextView) findViewById(R.id.textview1);
        textview1.setText(text);

        TextView textview2 = (TextView) findViewById(R.id.textview2);
        int number = 0;
        if (intent.hasExtra(MainActivity.EXTRA_NUMBER)) {
            number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);
            textview2.setText("" + number);
        } else {
            textview2.setText( "" );
        }




    }
}