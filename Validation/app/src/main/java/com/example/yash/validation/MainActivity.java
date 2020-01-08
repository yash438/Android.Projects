package com.example.yash.validation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.editText2);
        b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String name = e1.getText().toString();
                if (name.equals(""))
                {
                    e1.setError("Please Enter Name");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Name:- "+name, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}