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

    EditText e1;
    Button btn;
    ListView listView;

    ArrayList<String> a1=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listview);
        btn= (Button) findViewById(R.id.button);
        e1= (EditText) findViewById(R.id.editText);

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,a1);

        listView.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=e1.getText().toString();
                a1.add(data);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
