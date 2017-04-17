package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chemia_ChemickeMnozstvo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemia__chemicke_mnozstvo);

        ImageView img_Armm = (ImageView) findViewById(R.id.img_Armm);
        final Context context =this;
        img_Armm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Chemia_ChemickeMnozstvo_Info.class);
                startActivity(intent);
            }


        });
        ImageView img_Mrmm = (ImageView) findViewById(R.id.img_Mrmm);
        final Context context1 =this;
        img_Mrmm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Chemia_ChemickeMnozstvo_Info2.class);
                startActivity(intent);
            }


        });
    }
}
