package com.example.yash.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edittext;
    private Button button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_0,button_E,button_A,button_S,button_M,button_C,button_D,button_P,button_log,button_R,button_p,button_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddListenerOnButton();
    }

    private void AddListenerOnButton() {
        edittext=(EditText)findViewById(R.id.edittext);
        button_1=(Button)findViewById(R.id.button_1);
        button_2=(Button)findViewById(R.id.button_2);
        button_3=(Button)findViewById(R.id.button_3);
        button_4=(Button)findViewById(R.id.button_4);
        button_5=(Button)findViewById(R.id.button_5);
        button_6=(Button)findViewById(R.id.button_6);
        button_7=(Button)findViewById(R.id.button_7);
        button_8=(Button)findViewById(R.id.button_8);
        button_9=(Button)findViewById(R.id.button_9);
        button_0=(Button)findViewById(R.id.button_0);
        button_d=(Button)findViewById(R.id.button_d);
        button_E=(Button)findViewById(R.id.button_E);
        button_A=(Button)findViewById(R.id.button_A);
        button_S=(Button)findViewById(R.id.button_S);
        button_M=(Button)findViewById(R.id.button_M);
        button_D=(Button)findViewById(R.id.button_D);
        button_R=(Button)findViewById(R.id.button_R);
        button_p=(Button)findViewById(R.id.button_p);
        button_P=(Button)findViewById(R.id.button_P);
        button_log=(Button)findViewById(R.id.button_log);
        button_C=(Button)findViewById(R.id.button_C);

    }
}
