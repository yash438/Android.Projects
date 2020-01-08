package com.example.yash.myintentclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv= (TextView) findViewById(R.id.textView);
        Bundle b= getIntent().getExtras();
        String name= b.getString("name_key");
        tv.setText(name);
        tv.append("\n*********************\n"+b.getString("pass_key"));
    }
}
