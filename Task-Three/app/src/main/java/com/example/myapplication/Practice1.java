package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Practice1 extends AppCompatActivity {

    TextView t1;
    ImageView v1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);

        Intent obj =getIntent();



        t1=findViewById(R.id.t1);
        t1.setText(obj.getStringExtra("value").toString());
        v1=findViewById(R.id.v1);
        b1=findViewById(R.id.button3);
        b2=findViewById(R.id.button4);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });


        String x=obj.getStringExtra("value1").toString();

        if(x.equals( "p1"))
        {
            v1.setImageResource(R.drawable.p1);

        }

        else if(x.equals("p2"))
        {
            v1.setImageResource(R.drawable.p2);
        }

        else if(x.equals("p3"))
        {
            v1.setImageResource(R.drawable.p3);
        }
        else if(x.equals("p4"))
        {
            v1.setImageResource(R.drawable.p4);
        }
        else if(x.equals("p5"))
        {
            v1.setImageResource(R.drawable.p5);
        }
        else if(x.equals("p6"))
        {
            v1.setImageResource(R.drawable.p6);
        }
        else if(x.equals("p7"))
        {
            v1.setImageResource(R.drawable.p7);
        }
        else if(x.equals("p8"))
        {
            v1.setImageResource(R.drawable.p8);
        }
        else if(x.equals("p9"))
        {
            v1.setImageResource(R.drawable.p9);
        }
        else if(x.equals("p10"))
        {
            v1.setImageResource(R.drawable.p10);
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Practice1.this, Practice.class);
                startActivity(obj);
            }
        });




    }
}