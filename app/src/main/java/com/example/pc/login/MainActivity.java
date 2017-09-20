package com.example.pc.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText user;
    EditText pass;
    Button log;
    Button sign;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=(EditText) findViewById(R.id.editText);
        pass=(EditText) findViewById(R.id.editText2);
        log=(Button) findViewById(R.id.button);
        sign=(Button) findViewById(R.id.button2);
        log.setOnClickListener(this);
        sign.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id)
        {
            case R.id.button:
                Intent i=new Intent(this,Main3Activity.class);
                String mess="Hello\n"+user.getText().toString();
                i.putExtra(EXTRA_MESSAGE, mess);
                startActivity(i);
                break;
            case R.id.button2:
                Intent intent=new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;
        }

    }
}
