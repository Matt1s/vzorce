package com.vzorce.app.vzorce;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Fyzika_Dynamika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__dynamika);

        ImageView img_Fma = (ImageView) findViewById(R.id.img_Fma);
        final Context context =this;
        img_Fma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_Dynamika_Info1.class);
                startActivity(intent);
            }


        });
        ImageView img_pFt = (ImageView) findViewById(R.id.img_pFt);
        final Context context1 =this;
        img_pFt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Dynamika_Info2.class);
                startActivity(intent);
            }


        });
        ImageView img_pmv = (ImageView) findViewById(R.id.img_pmv);
        final Context context2 =this;
        img_pmv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Dynamika_Info3.class);
                startActivity(intent);
            }


        });
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika.class);
                startActivity(intent);
            }


        });
    }
}
