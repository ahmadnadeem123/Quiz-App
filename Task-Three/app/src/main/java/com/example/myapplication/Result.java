package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class Result extends AppCompatActivity {

    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        t1=findViewById(R.id.score);
        t2=findViewById(R.id.answer);

        Intent obj=getIntent();
        String count=obj.getStringExtra("correction").toString();
        String ans=obj.getStringExtra("result");

        t1.setText(count);
        t2.setText(ans);

    }
}