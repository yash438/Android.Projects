package com.example.yash.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1,edittext2;
    private Button buttonsum,buttonsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        edittext1=(EditText)findViewById(R.id.edittext1);
        edittext2=(EditText)findViewById(R.id.edittext2);
        buttonsum=(Button)findViewById(R.id.buttonsum);
        buttonsub=(Button)findViewById(R.id.buttonsub);
        buttonsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                int sub=a-b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),String.valueOf(sub), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
