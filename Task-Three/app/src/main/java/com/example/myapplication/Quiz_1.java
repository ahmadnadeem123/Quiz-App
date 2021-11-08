package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Quiz_1 extends AppCompatActivity {

    Button b1;
    Button b2, b3, b4, b5;
    ImageView v1;
    String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        b1 = findViewById(R.id.next1);
        b2 = findViewById(R.id.q1);
        b3 = findViewById(R.id.q2);
        b4 = findViewById(R.id.q3);
        b5 = findViewById(R.id.q4);
        v1 = findViewById(R.id.v1);
        ans = "";


        Intent obj = getIntent();
        String x = obj.getStringExtra("value").toString();
        if (x.equals("0")) {
            v1.setImageResource(R.drawable.pic1);
            b2.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Shajariyah-Haafiyah");
            b5.setText("Tarfiyah");

            ans = "Halqiyah";

        } else if (x.equals("1")) {
            v1.setImageResource(R.drawable.pic2);
            b3.setText("Halqiyah");
            b2.setText("Lahatiyah");
            b5.setText("Shajariyah-Haafiyah");
            b4.setText("Tarfiyah");

            ans = "Lahatiyah";


        } else if (x.equals("2")) {
            v1.setImageResource(R.drawable.pic3);
            b5.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Shajariyah-Haafiyah");
            b2.setText("Tarf iyah");
            ans = "Shajariyah-Haafiyah";


        } else if (x.equals("3")) {
            v1.setImageResource(R.drawable.pic4);

            b5.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Nit-eeyah");
            b2.setText("Tarfiyah");
            ans = "Tarfiyah";
        } else if (x.equals("4")) {
            v1.setImageResource(R.drawable.pic4);

            b2.setText("Halqiyah");
            b3.setText("Lahatiyah");
            b4.setText("Nit-eeyah");
            b5.setText("Tarfiyah");
            ans = "Nit-eeyah";


        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj2 = getIntent();
                String x = obj2.getStringExtra("value").toString();
                int value = Integer.parseInt(x);
                int ran = 0;


                do {
                    Random rand = new Random();
                    ran = rand.nextInt(4);
                } while (ran == value);


                Intent obj = new Intent(Quiz_1.this, Quiz_2.class);
                obj.putExtra("value1", String.valueOf(ran));
                startActivity(obj);
            }
        });

    }

    public void click(View v) {
        switch (v.getId()) {
            case R.id.q1:
                String x = b2.getText().toString();
                if (ans.equals(x)) {
                    b2.setBackgroundColor(Color.GREEN);
                } else {
                    b2.setBackgroundColor(Color.RED);
                }
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);

                break;

            case R.id.q2:
                String x2 = b3.getText().toString();
                if (ans.equals(x2)) {
                    b3.setBackgroundColor(Color.GREEN);
                } else {
                    b3.setBackgroundColor(Color.RED);
                }
                b2.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);

                break;

            case R.id.q3:
                String x3 = b4.getText().toString();
                if (ans.equals(x3)) {
                    b4.setBackgroundColor(Color.GREEN);
                } else {
                    b4.setBackgroundColor(Color.RED);
                }
                b3.setEnabled(false);
                b2.setEnabled(false);
                b5.setEnabled(false);

                break;

            case R.id.q4:
                String x4 = b5.getText().toString();
                if (ans.equals(x4)) {
                    b5.setBackgroundColor(Color.GREEN);
                } else {
                    b5.setBackgroundColor(Color.RED);
                }
                b3.setEnabled(false);
                b4.setEnabled(false);
                b2.setEnabled(false);

                break;

        }
    }
}

