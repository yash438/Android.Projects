package com.example.yash.myradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton r1,r2;
    Button btn;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1= (RadioButton) findViewById(R.id.radio1);
        r2= (RadioButton) findViewById(R.id.radio2);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked())
                {
                    result=r1.getText().toString();
                }
                else
                {
                    result=r2.getText().toString();
                }
                Toast t=Toast.makeText(MainActivity.this, ""+result,Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP,0,0);
                t.show();
            }
        });
    }
}