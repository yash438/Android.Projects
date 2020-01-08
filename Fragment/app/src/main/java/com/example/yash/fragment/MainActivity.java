package com.example.yash.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fg=getSupportFragmentManager();
        FragmentTransaction ft= fg.beginTransaction();
        ft.replace(R.id.activity_main,new LoginFragment());
        ft.commit();
        //commit is a confirmation tool

    }
}
