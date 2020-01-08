package com.example.yash.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public Integer picture[]={
                    R.drawable.t,
                    R.drawable.u,
                    R.drawable.v,
                    R.drawable.w,
                    R.drawable.x };
              public String data[];
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=getResources().getStringArray(R.array.data);
        listView= (ListView) findViewById(R.id.listview);
        Myadapter adapter=new Myadapter(this,data,picture);
        listView.setAdapter(adapter);}
}