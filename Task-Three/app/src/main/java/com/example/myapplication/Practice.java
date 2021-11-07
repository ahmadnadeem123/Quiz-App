package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practice extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.button6);
        b12=findViewById(R.id.button7);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Practice.this, MainActivity.class);
                startActivity(obj);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });



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
                break;

            case R.id.b2:
                Intent obj1=new Intent(Practice.this, Practice1.class);
                obj1.putExtra("value", "Lahatiyah");
                obj1.putExtra("value1","p2");
                startActivity(obj1);
                break;

            case R.id.b3:
                Intent obj2=new Intent(Practice.this, Practice1.class);
                obj2.putExtra("value", "Shajariyah-Haafiyah");
                obj2.putExtra("value1","p3");
                startActivity(obj2);
                break;

            case R.id.b4:
                Intent obj3=new Intent(Practice.this, Practice1.class);
                obj3.putExtra("value", "Tarfiyah");
                obj3.putExtra("value1","p4");
                startActivity(obj3);
                break;

            case R.id.b5:
                Intent obj4=new Intent(Practice.this, Practice1.class);
                obj4.putExtra("value", "Nit-eeyah");
                obj4.putExtra("value1","p5");
                startActivity(obj4);
                break;

            case R.id.b6:
                Intent obj5=new Intent(Practice.this, Practice1.class);
                obj5.putExtra("value", "Lisaveyah");
                obj5.putExtra("value1","p6");
                startActivity(obj5);
                break;

            case R.id.b7:
                Intent obj6=new Intent(Practice.this, Practice1.class);
                obj6.putExtra("value", "MAKHARIJ 13");
                obj6.putExtra("value1","p7");
                startActivity(obj6);
                break;

            case R.id.b8:
                Intent obj7=new Intent(Practice.this, Practice1.class);
                obj7.putExtra("value", "Ghunna");
                obj7.putExtra("value1","p8");
                startActivity(obj7);
                break;

            case R.id.b9:
                Intent obj8=new Intent(Practice.this, Practice1.class);
                obj8.putExtra("value", "MAKHARIJ 15,16");
                obj8.putExtra("value1","p9");
                startActivity(obj8);
                break;

            case R.id.b10:
                Intent obj9=new Intent(Practice.this, Practice1.class);
                obj9.putExtra("value", "MAKHARIJ 17");
                obj9.putExtra("value1","p10");
                startActivity(obj9);
                break;

        }
    }

}