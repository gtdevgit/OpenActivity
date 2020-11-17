package com.example.openactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);

        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        String text = editText1.getText().toString();
        intent.putExtra(EXTRA_TEXT, text);

        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        try {
            int number = Integer.parseInt(editText2.getText().toString());
            intent.putExtra(EXTRA_NUMBER, number);
        } catch (NumberFormatException e) {
        }

        startActivity(intent);
    }
}