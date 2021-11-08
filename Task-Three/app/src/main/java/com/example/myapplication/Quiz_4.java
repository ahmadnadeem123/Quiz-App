package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Quiz_4 extends AppCompatActivity {

    Button b1;
    Button b2, b3, b4, b5;
    TextView v1;
    String ans;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);


        b2 = findViewById(R.id.bt1);
        b3 = findViewById(R.id.bt2);
        b4 = findViewById(R.id.bt3);
        b5 = findViewById(R.id.bt4);
        b1 = findViewById(R.id.next2);
        v1 = findViewById(R.id.question3);

        Intent obj = getIntent();
        String x = obj.getStringExtra("value3").toString();
        v1.setText(x);

        if (x.equals("0")) {

            v1.setText("أ ة  –  Sound produced from the");
            b2.setText("End of Throat");
            b3.setText("Middle of Throat");
            b4.setText("Start of the Throat");
            b5.setText("None");

            ans = "End of Throat";


        } else if (x.equals("1")) {
            v1.setText("Sound produced from the - ک");
            b3.setText("Middle of Throat");
            b2.setText("End of Throat");
            b5.setText("Base of Tongue which is near Uvula touching the mouth roof");
            b4.setText("Portion of Tongue near its base touching the roof of mouth");
            ans = "Portion of Tongue near its base touching the roof of mouth";


        } else if (x.equals("2")) {
            v1.setText("Sound produced from the -  ض");
            b5.setText("One side of the tongue touching the molar teeth");
            b3.setText("Middle of Throat");
            b4.setText("Tongue touching the center of the mouth roof");
            b2.setText("Portion of Tongue near its base touching the roof of mouth");
            ans = "One side of the tongue touching the molar teeth";


        } else if (x.equals("3")) {
            v1.setText("Sound produced from the  -  ت د ط");

            b5.setText("One side of the tongue touching the molar teeth");
            b3.setText("Middle of Throat");
            b4.setText("Base of Tongue which is near Uvula touching the mouth roof");
            b2.setText("Tip of the tongue touching the base of the front 2 teeth");
            ans = "Tip of the tongue touching the base of the front 2 teeth";

        } else if (x.equals("4")) {
            v1.setText("Sound produced from the  -  ظ  ذ  ث");

            b2.setText("Middle of Throat");
            b3.setText("Tongue touching the center of the mouth roof");
            b4.setText("Tip of the tongue touching the tip of the frontal 2 teeth");
            b5.setText("Start of the Throat");
            ans = "Tip of the tongue touching the tip of the frontal 2 teeth";

        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent obj = getIntent();
                String answer = obj.getStringExtra("answered").toString();
                int counter = Integer.parseInt(obj.getStringExtra("countered"));
                counter = counter + count;

                answer = answer + "  4) " + ans;

                Intent obj2 = new Intent(Quiz_4.this, Result.class);
                obj2.putExtra("result", answer);
                obj2.putExtra("correctcount", String.valueOf(counter));


                startActivity(obj2);


            }
        });


    }

    public void click(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                String x = b2.getText().toString();
                if (ans.equals(x)) {
                    b2.setBackgroundColor(Color.GREEN);
                    count = 1;

                } else {
                    b2.setBackgroundColor(Color.RED);
                    count = 0;
                }
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);

                break;

            case R.id.bt2:
                String x2 = b3.getText().toString();
                if (ans.equals(x2)) {
                    b3.setBackgroundColor(Color.GREEN);
                    count = 1;
                } else {
                    b3.setBackgroundColor(Color.RED);
                    count = 0;
                }
                b2.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);

                break;

            case R.id.bt3:
                String x3 = b4.getText().toString();
                if (ans.equals(x3)) {
                    b4.setBackgroundColor(Color.GREEN);
                    count = 1;
                } else {
                    b4.setBackgroundColor(Color.RED);
                    count = 0;
                }
                b3.setEnabled(false);
                b2.setEnabled(false);
                b5.setEnabled(false);

                break;

            case R.id.bt4:
                String x4 = b5.getText().toString();
                if (ans.equals(x4)) {
                    b5.setBackgroundColor(Color.GREEN);
                    count = 1;
                } else {
                    b5.setBackgroundColor(Color.RED);
                    count = 0;
                }
                b3.setEnabled(false);
                b4.setEnabled(false);
                b2.setEnabled(false);

                break;
        }

    }
}