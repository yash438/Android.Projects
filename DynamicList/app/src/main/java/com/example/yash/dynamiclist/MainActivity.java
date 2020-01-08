package com.example.yash.dynamiclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button btn;
    ListView listView;

    ArrayList<String> dynamicArray=new ArrayList<>();
    ArrayAdapter<String> ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed= (EditText) findViewById(R.id.editText);
        btn= (Button) findViewById(R.id.button);
        listView= (ListView) findViewById(R.id.mylist);

        ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dynamicArray);
        listView.setAdapter(ad);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=ed.getText().toString();
                dynamicArray.add(data);
                ad.notifyDataSetChanged();


            }
        });
    }
}
