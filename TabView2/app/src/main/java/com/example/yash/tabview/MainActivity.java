package com.example.yash.tabview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost= (TabHost) findViewById(R.id.mytab);
        tabHost.setup();

        //tabHost is a outer class whereas tabspec is a inner class.
        //tabspec runs sequentially to the tabs

        //TAB-1
        TabHost.TabSpec tabSpec=tabHost.newTabSpec("Tab One");

        tabSpec.setIndicator("Date");
        tabSpec.setContent(R.id.tab1);
        tabHost.addTab(tabSpec);

        //TAB-2
        tabSpec=tabHost.newTabSpec("Tab Two");

        tabSpec.setIndicator("Image");
        tabSpec.setContent(R.id.tab2);
        tabHost.addTab(tabSpec);

        //TAB-3
        tabSpec=tabHost.newTabSpec("Tab Three");

        tabSpec.setIndicator("Button");
        tabSpec.setContent(R.id.tab3);
        tabHost.addTab(tabSpec);
    }
}