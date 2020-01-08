package com.example.yash.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView at;

    String data[]={"Ram","Ramesh","Ramu kaka","Abhi","Abhishek","Arjun","Bunty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        at= (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        at.setAdapter(ad);
        at.setThreshold(1);
        //it is used to search from very first letter
    }
}
