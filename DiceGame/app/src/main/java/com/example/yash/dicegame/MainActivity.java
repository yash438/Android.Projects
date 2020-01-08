package com.example.yash.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Integer picture[]={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six  };

    ImageView img1,img2;
    Button btn1,btn2,btn3,btn4;

    Integer data1,data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1= (ImageView) findViewById(R.id.img1);
        img1.setImageResource(picture[1]);
        img1.setEnabled(false);
        img2= (ImageView) findViewById(R.id.img2);
        img2.setImageResource(picture[4]);
        img2.setEnabled(false);

        btn1= (Button) findViewById(R.id.roll1);
        btn1.setEnabled(false);
        btn2= (Button) findViewById(R.id.roll2);
        btn2.setEnabled(false);
        btn3= (Button) findViewById(R.id.reset);
        btn4= (Button) findViewById(R.id.end);
        btn4.setEnabled(false);

        do {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (img1.equals(picture[0])) {
                        data1 = data1 + 1;
                        img1.setImageResource(picture[3]);
                    } else {
                        img1.setImageResource(picture[1]);
                    }

                    if (img1.equals(picture[1])) {
                        data1 = data1 + 2;
                        img1.setImageResource(picture[4]);
                    } else {
                        img1.setImageResource(picture[2]);
                    }
                    if (img1.equals(picture[2])) {
                        data1 = data1 + 3;
                        img1.setImageResource(picture[5]);
                    } else {
                        img1.setImageResource(picture[3]);
                    }
                    if (img1.equals(picture[3])) {
                        data1 = data1 + 4;
                        img1.setImageResource(picture[0]);
                    } else {
                        img1.setImageResource(picture[4]);
                    }
                    if (img1.equals(picture[4])) {
                        data1 = data1 + 5;
                        img1.setImageResource(picture[4]);
                    } else {
                        img1.setImageResource(picture[5]);
                    }
                    if (img1.equals(picture[5])) {
                        data1 = data1 + 6;
                        img1.setImageResource(picture[2]);
                    } else {
                        img1.setImageResource(picture[0]);
                    }
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (img2.equals(picture[0])) {
                        data2 = data2 + 1;
                        img2.setImageResource(picture[3]);
                    } else {
                        img2.setImageResource(picture[1]);
                    }

                    if (img2.equals(picture[1])) {
                        data2 = data2 + 2;
                        img2.setImageResource(picture[4]);
                    } else {
                        img2.setImageResource(picture[2]);
                    }
                    if (img2.equals(picture[2])) {
                        data2 = data2 + 3;
                        img2.setImageResource(picture[5]);
                    } else {
                        img2.setImageResource(picture[3]);
                    }
                    if (img2.equals(picture[3])) {
                        data2 = data2 + 4;
                        img2.setImageResource(picture[0]);
                    } else {
                        img2.setImageResource(picture[4]);
                    }
                    if (img2.equals(picture[4])) {
                        data2 = data2 + 5;
                        img2.setImageResource(picture[1]);
                    } else {
                        img2.setImageResource(picture[5]);
                    }
                    if (img2.equals(picture[5])) {
                        data2 = data2 + 6;
                        img2.setImageResource(picture[3]);
                    } else {
                        img2.setImageResource(picture[0]);
                    }
                }
            });

        }while (btn4.callOnClick());
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    img1.setEnabled(true);
                    img2.setEnabled(true);
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn4.setEnabled(true);
                    data1 = 0;
                    data2 = 0;
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "" + data1 + ":" + data2 + "", Toast.LENGTH_SHORT).show();
                    if (data1 > data2) {
                        Toast.makeText(MainActivity.this, "PLAYER1 IS THE WINNER", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "PLAYER2 IS THE WINNER", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }
}
