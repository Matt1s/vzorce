package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__mechanika_tuheho_telesa__moment_zotrvacnosti);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_MechanikaTuhehoTelesa.class);
                startActivity(intent);
            }
        });
        ImageView img_jmr = (ImageView) findViewById(R.id.img_jmr);
        final Context context =this;
        img_jmr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti_Info1.class);
                startActivity(intent);
            }


        });
        ImageView img_jmr2 = (ImageView) findViewById(R.id.img_jmr2);
        final Context context2 =this;
        img_jmr2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti_Info2.class);
                startActivity(intent);
            }


        });
        ImageView img_jmr3 = (ImageView) findViewById(R.id.img_jmr3);
        final Context context3 =this;
        img_jmr3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti_Info3.class);
                startActivity(intent);
            }


        });
        ImageView img_jmr4 = (ImageView) findViewById(R.id.img_jmr4);
        final Context context5 =this;
        img_jmr4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context5, Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti_Info4.class);
                startActivity(intent);
            }


        });
    }
}
