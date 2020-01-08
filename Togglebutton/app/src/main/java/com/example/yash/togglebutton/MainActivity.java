package com.example.yash.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    ToggleButton tb;
    EditText ed1,ed2;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= (EditText) findViewById(R.id.editText);
        ed1.setVisibility(View.INVISIBLE);
        ed2= (EditText) findViewById(R.id.editText2);
        ed2.setVisibility(View.INVISIBLE);
        b1= (Button) findViewById(R.id.button);
        b1.setVisibility(View.INVISIBLE);
        b2= (Button) findViewById(R.id.button2);
        b2.setVisibility(View.INVISIBLE);
        b3= (Button) findViewById(R.id.button3);
        b3.setVisibility(View.INVISIBLE);
        b4= (Button) findViewById(R.id.button4);
        b4.setVisibility(View.INVISIBLE);
        tb= (ToggleButton) findViewById(R.id.toggleButton);

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==false)
                {
                    ed1= (EditText) findViewById(R.id.editText);
                    ed1.setVisibility(View.INVISIBLE);
                    ed2= (EditText) findViewById(R.id.editText2);
                    ed2.setVisibility(View.INVISIBLE);
                    b1= (Button) findViewById(R.id.button);
                    b1.setVisibility(View.INVISIBLE);
                    b2= (Button) findViewById(R.id.button2);
                    b2.setVisibility(View.INVISIBLE);
                    b3= (Button) findViewById(R.id.button3);
                    b3.setVisibility(View.INVISIBLE);
                    b4= (Button) findViewById(R.id.button4);
                    b4.setVisibility(View.INVISIBLE);
                }
                else
                {
                    ed1= (EditText) findViewById(R.id.editText);
                    ed1.setVisibility(View.VISIBLE);
                    ed2= (EditText) findViewById(R.id.editText2);
                    ed2.setVisibility(View.VISIBLE);
                    b1= (Button) findViewById(R.id.button);
                    b1.setVisibility(View.VISIBLE);
                    b2= (Button) findViewById(R.id.button2);
                    b2.setVisibility(View.VISIBLE);
                    b3= (Button) findViewById(R.id.button3);
                    b3.setVisibility(View.VISIBLE);
                    b4= (Button) findViewById(R.id.button4);
                    b4.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
