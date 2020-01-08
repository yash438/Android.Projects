package com.example.yash.spinnerassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity
{
    Spinner sp,sp2;
    Button btn;
    String data[]={"Select Country","India","United States","United Kingdom"};

    String India[]={"Select State","Uttar Pradesh","Maharashtra","Jammu & Kashmir","Madhya Pradesh","Bihar","Karnatak","Haryana","West Bengal","Andra Pradesh","Orissa","Uttrakhand","Punjab","Goa","Jharkhand","Rajasthan","Gujrat","Kerela","Himachal Pradesh"};
    String United_States[]={"Select State","California","Hawaii","Florida"};
    String United_Kingdom[]={"Select State","London","Elle","Nautingham"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp= (Spinner) findViewById(R.id.spinner);
        sp2= (Spinner) findViewById(R.id.spinner2);
        sp2.setEnabled(false);
        btn= (Button) findViewById(R.id.button);

        final ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        final ArrayAdapter<String> ad1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,India);
        final ArrayAdapter<String> ad2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,United_States);
        final ArrayAdapter<String> ad3=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,United_Kingdom);

        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String value=data[position];
                if (value.equals("India"))
                {
                    sp2.setEnabled(true);
                    sp2.setAdapter(ad1);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select country", Toast.LENGTH_SHORT).show();
                }
                if (value.equals("United States"))
                {
                    sp2.setEnabled(true);
                    sp2.setAdapter(ad2);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select country", Toast.LENGTH_SHORT).show();
                }
                if (value.equals("United Kingdom"))
                {
                    sp2.setEnabled(true);
                    sp2.setAdapter(ad3);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select country", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String data=sp.getSelectedItem().toString();
                String data1=sp2.getSelectedItem().toString();
                if (data.equals("Select Country")||data1.equals("Select State"))
                {
                    Toast.makeText(MainActivity.this, "Please Select the required entries", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, ""+data+""+data1, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
