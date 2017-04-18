package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Matematika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika);

        Button btn_Vyrazy = (Button)findViewById(R.id.btn_Vyrazy);
        btn_Vyrazy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Vyrazy.class);
                startActivity(intent);
        }});

        Button btn_KvadratickeRovnice = (Button)findViewById(R.id.btn_KvadratickeRovnice);
        btn_KvadratickeRovnice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_KvadratickeRovnice.class);
                startActivity(intent);
            }});
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, MainActivity.class);
                startActivity(intent);
            }


        });
}}
