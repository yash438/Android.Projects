package com.example.yash.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Spinner spinner;
    Button btn;
    //array componenets for spinner
    String data[]={"Select Course","B.Tech(CS)","B.Tech(IT)","B.Tech(EN)","B.Tech(EC)","B.Tech(ME)","B.Tech(CE)","B.Tech(BT)","B.Tech(AERONAUTICAL)"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        spinner= (Spinner) findViewById(R.id.spinner2);
        //adding Array components into spinner
        //By using array Adapter
        //Adaptor is a class which has a constructor
        /*class ArrayAdapter
        {
        public array adapter(context(current class reference),layout,array)
        }
        */
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        //for showing a heading
        //spinner.setPrompt("Select Course");
        //it would only work when spinner is in dialog form
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value=data[position];
                if(value.equals("B.Tech(EC)"))
                {
                    Toast.makeText(MainActivity.this, "Kaam ho gya tera....", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Select Course", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=spinner.getSelectedItem().toString();
                if (data.equals("Select Course"))
                {
                    Toast.makeText(MainActivity.this, "Please Select course", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
