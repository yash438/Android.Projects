package com.example.yash.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
        btn2= (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3= (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4= (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5= (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        btn6= (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(this);
        btn7= (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(this);
        btn8= (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(this);
        btn9= (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(this);
        btn10= (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(this);
        btn11= (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(this);
        btn12= (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(this);
        btn13= (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(this);
        btn14= (Button) findViewById(R.id.button14);
        btn14.setOnClickListener(this);
        btn15= (Button) findViewById(R.id.button15);
        btn15.setOnClickListener(this);
        btn16= (Button) findViewById(R.id.button16);
        btn16.setOnClickListener(this);
        btn17= (Button) findViewById(R.id.button17);
        btn17.setOnClickListener(this);
        edt= (EditText) findViewById(R.id.editText);
    }

    public void onClick(View v)
    {
        String x=edt.getText().toString();

        Double a=Double.parseDouble(x);
        Double b=Double.parseDouble(x);


        double result=a+b;

        Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_LONG).show();
    }
}
