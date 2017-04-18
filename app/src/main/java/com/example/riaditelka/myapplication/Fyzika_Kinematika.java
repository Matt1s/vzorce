package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Fyzika_Kinematika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__kinematika);

        ImageView img_vst = (ImageView) findViewById(R.id.img_vst);
        final Context context =this;
        img_vst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_Kinematika_Infovst.class);
                startActivity(intent);
            }


        });
        ImageView img_tva = (ImageView) findViewById(R.id.img_tva);
        final Context context1 =this;
        img_tva.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Kinematika_Infotva.class);
                startActivity(intent);
            }


        });
        ImageView img_sat2 = (ImageView) findViewById(R.id.img_sat2);
        final Context context2 =this;
        img_sat2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Kinematika_Infosat2.class);
                startActivity(intent);
            }


        });
        ImageView img_v2as = (ImageView) findViewById(R.id.img_v2as);
        final Context context3 =this;
        img_v2as.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Kinematika_Infov2as.class);
                startActivity(intent);
            }


        });
        ImageView img_a2sv = (ImageView) findViewById(R.id.img_a2sv);
        final Context context4 =this;
        img_a2sv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_Kinematika_Infoa2sv.class);
                startActivity(intent);
            }


        });
        ImageView img_svv2a = (ImageView) findViewById(R.id.img_svv2a);
        final Context context5 =this;
        img_svv2a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context5, Fyzika_Kinematika_Infosvv2a.class);
                startActivity(intent);
            }


        });
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context6 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika.class);
                startActivity(intent);
            }


        });


    }
}
