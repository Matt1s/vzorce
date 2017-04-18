package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chemia_ChemickeMnozstvo_Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemia__chemicke_mnozstvo__info);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Chemia_ChemickeMnozstvo.class);
                startActivity(intent);
            }


        });
    }
}
