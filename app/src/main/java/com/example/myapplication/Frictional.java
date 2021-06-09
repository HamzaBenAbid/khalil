package com.example.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Frictional extends AppCompatActivity {
EditText pump ,d1,d2,l1,l2,dn,vis;
Button btn ;
Float a ,s1 ,s2,b,c,v1,v2,w,re1,re2,f1,f2,ress,h1,h2;
TextView res ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frictional);
        pump =findViewById(R.id.pump);
        d1 =findViewById(R.id.piped);
        d2 =findViewById(R.id.piped2);
        l1 =findViewById(R.id.pipel1);
        l2 =findViewById(R.id.pipel2);
        dn =findViewById(R.id.density);
        vis =findViewById(R.id.dynamique);
        btn =findViewById(R.id.res2);
        res =findViewById(R.id.math2);


         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 float a = Float.parseFloat(d1.getText().toString().trim());
                 float b = Float.parseFloat(d2.getText().toString().trim());
                 float c = Float.parseFloat(pump.getText().toString().trim());
                 float d = Float.parseFloat(vis.getText().toString().trim());
                 float e= Float.parseFloat(dn.getText().toString().trim());
                 float f= Float.parseFloat(l1.getText().toString().trim());
                 float s= Float.parseFloat(l2.getText().toString().trim());

                 float s1= (float) ((a* a * 3.14) /4);
                 float s2= (float) ((b* b* 3.14) /4);
                 float v2 = (float)   (c/s2) ;
                 float v1 = (float)   (c/s1) ;
                 float w = (float)  (d/e) ;
                 float re1 = (float)  ((v1* a)/w );
                 float re2 = (float)  ((v2* b)/w );

                 float f1 = (float)  Math.pow ((-2 * ( Math.log( (0.1/a)/3.7 )+(5.74/Math.pow(re1,0.9) )) ),-2);
                 float f2 = (float)  Math.pow ((-2 *  ( Math.log( (0.1/b)/3.7 )+(5.74/Math.pow(re2,0.9)) )),-2);

                 float h1 =(float) ( (f/a) *( (v1*v1)/(2*9.81) ))* f1 ;
                 float h2 =(float) ( (f/b) *( (v2*v2)/(2*9.81) ))* f2 ;
                 float ress = h1 + h2 ;
                 res.setText("" + ress +" m");
             }
         });

    }
}