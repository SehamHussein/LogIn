package com.example.pc.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.pc.login.MainActivity.EXTRA_MESSAGE;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();

        String message = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.editText2);
        textView.setText(message);
    }
}
