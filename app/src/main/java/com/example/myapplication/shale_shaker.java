package com.example.myapplication;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class shale_shaker extends AppCompatActivity {
    EditText txt1, txt2;
    TextView txt3,txt4;
    Button btn;
RadioButton r1 ,r2 ,r3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shale_shaker);
        txt1 = findViewById(R.id.lots);
        txt2 = findViewById(R.id.rpm);
        txt3 = findViewById(R.id.gfors);
        txt4=findViewById(R.id.rost);
        btn = findViewById(R.id.btne);
        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        r3=findViewById(R.id.radio3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(txt1.getText().toString().trim());
                float b= Float.parseFloat(txt2.getText().toString().trim());
                if (r1.isChecked()) {
                    float m = (float) (39.3701 * a);

                    float z = ((m * b * b) / 70490);

                    float x = b * m ;
                    txt3.setText("" + z);
                    txt4.setText("" + x +" inch/s");
                }else
                    if (r2.isChecked()){
                        float z = ((a* b * b) / 70490);
                        float x = b * a ;
                        txt3.setText("" + z);
                        txt4.setText("" + x +" inch/s");
                    }else {
                        float ft = a*12 ;
                        float z = ((ft* b * b) / 70490);

                        float x = b * ft;
                        txt3.setText("" + z);
                        txt4.setText("" + x +" inch/s");

                    }

            }
        });


    }
}