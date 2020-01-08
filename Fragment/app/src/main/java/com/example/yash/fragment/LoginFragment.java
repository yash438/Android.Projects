package com.example.yash.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment
{
    Button button;


    public LoginFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    //LAYOUT INFLATER stores the reference of layouts
    {
        View v=inflater.inflate(R.layout.fragment_login, container, false);
        button=(Button)v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fg=getFragmentManager();
                FragmentTransaction ft=fg.beginTransaction();
                ft.replace(R.id.activity_main,new SecondFragment());
                ft.commit();
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

}
