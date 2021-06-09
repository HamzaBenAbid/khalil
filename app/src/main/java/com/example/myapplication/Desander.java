package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Desander extends AppCompatActivity {
    Button frictional, mud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desander);

        frictional=findViewById(R.id.Frictional);
        frictional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desi = new Intent(Desander.this, Frictional.class);
                startActivity(desi);
            }
        });
    }
}