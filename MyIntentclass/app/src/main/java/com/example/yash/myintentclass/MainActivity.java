package com.example.yash.myintentclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed,ed1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed= (EditText) findViewById(R.id.Name);
        ed1= (EditText) findViewById(R.id.pass);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=ed.getText().toString();
                String pass=ed1.getText().toString();
                if (name.equals("RAMUKAKA")&&pass.equals("12345"))
                {
                    Intent ramukaka=new Intent(MainActivity.this,SecondActivity.class);
                    //putextra is a function which takes takes the data from 1 activity to another
                    //key represent value and value represent data
                    ramukaka.putExtra("name_key",name);
                    ramukaka.putExtra("pass_key",pass);
                    startActivity(ramukaka);

                    MainActivity.this.finish();
                }
                else
                {
                    ed.setText("");
                    ed1.setText("");
                    Toast.makeText(MainActivity.this, "Beta Ghar Jaoo.......", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}