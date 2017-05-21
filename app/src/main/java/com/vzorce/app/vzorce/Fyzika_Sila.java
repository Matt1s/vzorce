package com.vzorce.app.vzorce;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Fyzika_Sila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__sila);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika.class);
                startActivity(intent);
            }


        });
        ImageView img_Fgmg = (ImageView) findViewById(R.id.img_Fgmg);
        final Context context2 =this;
        img_Fgmg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Sila_Info1.class);
                startActivity(intent);
            }
        });
        ImageView img_Fps = (ImageView) findViewById(R.id.img_Fps);
        final Context context3 =this;
        img_Fps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Sila_Info2.class);
                startActivity(intent);
            }
        });
    }
}