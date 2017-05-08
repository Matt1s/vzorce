package com.vzorce.app.vzorce;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chemia_Roztoky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemia__roztoky);

        ImageView img_wmm = (ImageView) findViewById(R.id.img_wmm);
        final Context context =this;
        img_wmm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Chemia_Roztoky_Info1.class);
                startActivity(intent);
            }


        });

        ImageView img_fiVV = (ImageView) findViewById(R.id.img_fiVV);
        final Context context1 =this;
        img_fiVV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Chemia_Roztoky_Info2.class);
                startActivity(intent);
            }


        });
        ImageView img_mwmwmw = (ImageView) findViewById(R.id.img_mwmwmw);
        final Context context2 =this;
        img_mwmwmw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Chemia_Roztoky_Info3.class);
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
    }
}
