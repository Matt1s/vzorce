package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Chemia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemia);

        Button btn_LatkoveMnozstvo = (Button)findViewById(R.id.btn_LatkoveMnozstvo);
        btn_LatkoveMnozstvo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chemia_LatkoveMnozstvo.class);
                startActivity(intent);
            }
        });

        Button btn_MolarnyObjem = (Button)findViewById(R.id.btn_MolarnyObjem);
        btn_MolarnyObjem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chemia_MolarnyObjem.class);
                startActivity(intent);
            }
        });

        Button btn_ChemickeMnozstvo = (Button)findViewById(R.id. btn_ChemickeMnozstvo);
        btn_ChemickeMnozstvo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chemia_ChemickeMnozstvo.class);
                startActivity(intent);
            }
        });
        Button btn_MolarnaHmotnost = (Button)findViewById(R.id. btn_MolarnaHmotnost);
        btn_MolarnaHmotnost.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chemia_MolarnaHmotnost.class);
                startActivity(intent);
            }
        });
        Button btn_Roztoky = (Button)findViewById(R.id.btn_Roztoky);
        btn_Roztoky.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chemia_Roztoky.class);
                startActivity(intent);
            }
        });
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, MainActivity.class);
                startActivity(intent);
            }


        });
    }
}