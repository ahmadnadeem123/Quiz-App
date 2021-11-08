package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Quiz_2 extends AppCompatActivity {

    Button b1;
    Button b2,b3,b4,b5;
    ImageView v1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);


        b1=findViewById(R.id.next1);
        b2=findViewById(R.id.q1);
        b3=findViewById(R.id.q2);
        b4=findViewById(R.id.q3);
        b5=findViewById(R.id.q4);
        v1=findViewById(R.id.v1);

        Intent obj=getIntent();
        String x=obj.getStringExtra("value1").toString();



        if(x.equals("0"))
        {
            v1.setImageResource(R.drawable.pic1);
            b2.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Shajariyah-Haafiyah");
            b5.setText("Tarfiyah");

        }
        else if(x.equals("1"))
        {
            v1.setImageResource(R.drawable.pic2);
            b3.setText("Halqiyah");
            b2.setText("Lahatiyah");
            b5.setText("Shajariyah-Haafiyah");
            b4.setText("Tarfiyah");


        }
        else if(x.equals("2"))
        {
            v1.setImageResource(R.drawable.pic3);
            b5.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Shajariyah-Haafiyah");
            b2.setText("Tarf iyah");


        }
        else if(x.equals("3"))
        {
            v1.setImageResource(R.drawable.pic4);

            b5.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Nit-eeyah");
            b2.setText("Tarfiyah");

        }
        else if(x.equals("4"))
        {
            v1.setImageResource(R.drawable.pic4);

            b2.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Nit-eeyah");
            b5.setText("Tarfiyah");

        }



    }
}