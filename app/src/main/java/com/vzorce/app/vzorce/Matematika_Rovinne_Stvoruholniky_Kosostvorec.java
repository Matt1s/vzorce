package com.vzorce.app.vzorce;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Matematika_Rovinne_Stvoruholniky_Kosostvorec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika__rovinne__stvoruholniky__kosostvorec);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Matematika_Geometria_Rovinne_Stvoruholniky.class);
                startActivity(intent);
            }


        });
        Button btn_Nacrt = (Button)findViewById(R.id.btn_Nacrt);
        btn_Nacrt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Geometria_Kosostvorec_Nacrt.class);
                startActivity(intent);
            }});
    }
}
