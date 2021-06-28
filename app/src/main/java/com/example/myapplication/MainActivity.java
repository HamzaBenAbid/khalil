package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button shell, mud, des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shell = findViewById(R.id.btn1);
        des = findViewById(R.id.btn2);

        shell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelli = new Intent(MainActivity.this, shale_shaker.class);
                startActivity(shelli);
            }
        });
        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desi = new Intent(MainActivity.this, Desander.class);
                startActivity(desi);
            }
        });



    }
}