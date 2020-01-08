package com.example.yash.substitution;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //it is use to view the content of UI
        setContentView(R.layout.activity_main);
        //R creates the ref. ID of the component in java
        //location of r(java) file
        //C:\Users\Yash\AndroidStudioProjects\Substitution\app\build\generated\source\r\debug\com\example\yash\substitution

        Toast.makeText(this,"On Create Running...",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "On Start Running...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "On Resume Running...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "On Pause Running...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "On Stop Running...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "On Restart Running...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "On Destroy Running...", Toast.LENGTH_SHORT).show();
        //when we press back destroy executes
    }
}