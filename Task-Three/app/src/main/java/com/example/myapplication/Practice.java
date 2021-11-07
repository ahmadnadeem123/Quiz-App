package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practice extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);




    }

    public void click(View v)
    {
        switch (v.getId())
        {
            case R.id.b1:
                Intent obj=new Intent(Practice.this, Practice1.class);
                obj.putExtra("value", "Halqiyah");
                obj.putExtra("value1","p1");
                startActivity(obj);

        }
    }

}