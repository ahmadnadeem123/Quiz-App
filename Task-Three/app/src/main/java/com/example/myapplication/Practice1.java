package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

public class Practice1 extends AppCompatActivity {

    TextView t1;
    ImageView v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);

        Intent obj =getIntent();



        t1=findViewById(R.id.t1);
        t1.setText(obj.getStringExtra("value").toString());
        v1=findViewById(R.id.v1);

        String x=obj.getStringExtra("value1").toString();
        if(x=="p1")
        {
            v1.setImageResource(R.drawable.p1);

        }

        else if(x=="p2")
        {
            v1.setImageResource(R.drawable.p2);
        }

        else if(x=="p3")
        {
            v1.setImageResource(R.drawable.p3);
        }
        else if(x=="p4")
        {
            v1.setImageResource(R.drawable.p4);
        }
        else if(x=="p5")
        {
            v1.setImageResource(R.drawable.p5);
        }
        else if(x=="p6")
        {
            v1.setImageResource(R.drawable.p6);
        }
        else if(x=="p7")
        {
            v1.setImageResource(R.drawable.p7);
        }
        else if(x=="p8")
        {
            v1.setImageResource(R.drawable.p8);
        }
        else if(x=="p9")
        {
            v1.setImageResource(R.drawable.p9);
        }
        else if(x=="p10")
        {
            v1.setImageResource(R.drawable.p10);
        }




    }
}