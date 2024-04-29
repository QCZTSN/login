package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText username,password;
    private Button login,cancel;
    private TextView bianse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.name);
        password=(EditText) findViewById(R.id.pswd);
        login=(Button) findViewById(R.id.login);
        cancel=(Button) findViewById(R.id.cancel);
        bianse=(TextView) findViewById(R.id.bianse);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=username.getText().toString();
                String pswd=password.getText().toString();
                Intent it=new Intent(MainActivity.this,SecondActivity.class);
                it.putExtra("name",name);
                it.putExtra("pswd",pswd);
                startActivity(it);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bianse.setTextColor(Color.parseColor("green"));
            }
        });
    }
}