package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chemia_LatkoveMnozstvo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemia__latkovemnozstvo);

        ImageView img_nNN = (ImageView) findViewById(R.id.img_nNN);
        final Context context =this;
        img_nNN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Chemia_LatkoveMnozstvo_Info.class);
                startActivity(intent);
                }


            });
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Chemia.class);
                startActivity(intent);
            }


        });

    }}