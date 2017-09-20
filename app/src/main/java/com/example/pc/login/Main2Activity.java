package com.example.pc.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    static final String SHARED_PREF_NAME="current_user";
    EditText name = (EditText) findViewById(R.id.editText3);
    EditText email = (EditText) findViewById(R.id.editText4);
    EditText pass = (EditText) findViewById(R.id.editText5);
    Button sign = (Button) findViewById(R.id.button3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User(name.getText().toString(), Integer.parseInt(pass.getText().toString()));

                SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
//                JSONObject jsonObject=new JSONObject();
//                try {
//                jsonObject.accumulate("name",user.getName());
//
//                    jsonObject.accumulate("pass",user.getPass());
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }


//                Gson gson=new Gson();
//                String theUser=gson.toJson(user);
//                //Toast.makeText(Main2Activity.this, theUser, Toast.LENGTH_LONG).show();
//                editor.putString("currentU",theUser);
//                editor.apply();
            }
        });




    }
}
