package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Fyzika_Elektrina_Paralelne_Info2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__elektrina__paralelne__info2);



        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context6 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context6, Fyzika_Elektrina_Paralelne.class);
                startActivity(intent);
            }


        });
    }
}
