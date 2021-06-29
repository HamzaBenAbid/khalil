package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Desander extends AppCompatActivity {
    Button b1, b2 , b3 ,b4 ,b5 ,b6 ,b7 ,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desander);
        b1 = findViewById(R.id.prob1);
        b2 = findViewById(R.id.prob2);
        b3 =findViewById(R.id.prob3);
        b4 = findViewById(R.id.prob4);
        b5 = findViewById(R.id.prob5);
        b6 =findViewById(R.id.prob6);
        b7 = findViewById(R.id.prob7);
        b8 =findViewById(R.id.prob8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, Motor_will_not_start.class);
                startActivity(shelli);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, Motoroverheating.class);
                startActivity(shelli);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, Noisyoperation.class);
                startActivity(shelli);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, Cuttingsmovingerraticallyonshakerscreen.class);
                startActivity(shelli);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, Mudoverflowingshaleshakerscreen.class);
                startActivity(shelli);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, Oversizedcuttingseturnedtoactivesystem.class);
                startActivity(shelli);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, Nodrillingfluidflowingtoshaleshake.class);
                startActivity(shelli);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(Desander.this, ShakerScreenfailure.class);
                startActivity(shelli);
            }
        });


    }
}