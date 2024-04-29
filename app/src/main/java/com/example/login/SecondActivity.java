package com.example.login;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView tv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_show=(TextView) findViewById(R.id.show);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String pswd=intent.getStringExtra("pswd");
        tv_show.setText("姓名："+name+"\n"+"密码："+pswd);
    }
}