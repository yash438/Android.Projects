package com.example.yash.intentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Spinner spinner;
    RadioButton rb1,rb2;
    Button btn1,btn2;

    String Course[]={"Select Course","B.TECH","B.B.A","B.C.A","M.TECH","M.B.A","M.C.A"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= (EditText) findViewById(R.id.editText1);
        ed2= (EditText) findViewById(R.id.editText2);
        spinner= (Spinner) findViewById(R.id.spinner);
        rb1= (RadioButton) findViewById(R.id.radio1);
        rb2= (RadioButton) findViewById(R.id.radio2);
        btn1= (Button) findViewById(R.id.button1);
        btn2= (Button) findViewById(R.id.button2);

        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Course);
        spinner.setAdapter(ad);

        String name=ed1.getText().toString();
        String phone=ed2.getText().toString();

        if (rb1.isChecked())
        {
            String gender=rb1.getText().toString();
        }
        else
        {
            String gender=rb2.getText().toString();
        }

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String course=Course[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent data=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(data);
                MainActivity.this.finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
            }
        });
    }
}
