package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Result extends AppCompatActivity {

    TextView t1,t2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        t1=findViewById(R.id.score);
        t2=findViewById(R.id.answer);

        Intent obj=getIntent();
        String count=obj.getStringExtra("correction").toString();
        String ans=obj.getStringExtra("result");

        b1=findViewById(R.id.button8);



        t1.setText(count);
        t2.setText(ans);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message ="You got "  + t1.getText().toString() + " out of 4";
                Intent obj = new Intent();
                obj.setAction(Intent.ACTION_SEND);
                obj.setType("text/plain");
                obj.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(obj);

            }
        });

    }
}