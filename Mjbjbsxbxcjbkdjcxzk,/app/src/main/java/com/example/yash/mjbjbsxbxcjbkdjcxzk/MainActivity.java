package com.example.yash.mjbjbsxbxcjbkdjcxzk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String data[]={"Noida","Delhi","Jaipur","Agra","Mathura","Patna"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.mylist);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=data[position];
                if (value.equals("Noida"))
                {
                    Intent noida=new Intent(MainActivity.this,Noida.class);
                    startActivity(noida);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select", Toast.LENGTH_SHORT).show();
                }

                if (value.equals("Delhi"))
                {
                    Intent delhi=new Intent(MainActivity.this,Delhi.class);
                    startActivity(delhi);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select", Toast.LENGTH_SHORT).show();
                }
                if (value.equals("Jaipur"))
                {
                    Intent jaipur=new Intent(MainActivity.this,Jaipur.class);
                    startActivity(jaipur);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select", Toast.LENGTH_SHORT).show();
                }
                if (value.equals("Agra"))
                {
                    Intent agra=new Intent(MainActivity.this,Agra.class);
                    startActivity(agra);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select", Toast.LENGTH_SHORT).show();
                }
                if (value.equals("Mathura"))
                {
                    Intent mathura=new Intent(MainActivity.this,Mathura.class);
                    startActivity(mathura);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select", Toast.LENGTH_SHORT).show();
                }
                if (value.equals("Patna"))
                {
                    Intent patna=new Intent(MainActivity.this,Patna.class);
                    startActivity(patna);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
