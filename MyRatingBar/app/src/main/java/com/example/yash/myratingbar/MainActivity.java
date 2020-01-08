package com.example.yash.myratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar rt;
    Button btn;
    double rating1;//for storing rating
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rt= (RatingBar) findViewById(R.id.ratingBar);
        btn= (Button) findViewById(R.id.button);
        rt.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //here 3 variables are used b'coz ratingbar is to take rate, float is used to have rating in points also, boolean tells whether the user has rated or not(By default it is false)
                rating1=rating;
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+rating1, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
