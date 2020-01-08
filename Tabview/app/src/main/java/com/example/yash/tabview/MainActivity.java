package com.example.yash.tabview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabWidget;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost= (TabHost) findViewById(R.id.mytab);
        tabHost.setup();

        TabHost.TabSpec tabSpec=tabHost.newTabSpec("Tab one");
        tabSpec.setIndicator("Date");
        tabSpec.setContent(R.id.tab1);
        //to get content for tab 1
        tabHost.addTab(tabSpec);

        tabSpec=tabHost.newTabSpec("Tab Two");
        tabSpec.setIndicator("Time");
        tabSpec.setContent(R.id.tab2);
        //to get content for tab 2
        tabHost.addTab(tabSpec);

        tabSpec=tabHost.newTabSpec("Tab Three");
        tabSpec.setIndicator("Web");
        tabSpec.setContent(R.id.tab3);
        //to get content for tab 3
        tabHost.addTab(tabSpec);
    }
}
