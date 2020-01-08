package com.example.yash.autocompleteassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        autoCompleteTextView= (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        btn= (Button) findViewById(R.id.button);

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.add(autoCompleteTextView.getText().toString());
                autoCompleteTextView.setText("");
            }
        });
        }
}
