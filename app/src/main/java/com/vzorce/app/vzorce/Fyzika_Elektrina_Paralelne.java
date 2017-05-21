package com.vzorce.app.vzorce;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Fyzika_Elektrina_Paralelne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__elektrina__paralelne);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Elektrina.class);
                startActivity(intent);
            }


        });
        ImageView img_RRR = (ImageView) findViewById(R.id.img_RRR);
        final Context context2 =this;
        img_RRR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Elektrina_Paralelne_Info1.class);
                startActivity(intent);
            }


        });
        ImageView img_III = (ImageView) findViewById(R.id.img_III);
        final Context context3 =this;
        img_III.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Elektrina_Paralelne_Info2.class);
                startActivity(intent);
            }


        });
    }
}
