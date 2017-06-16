package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Fyzika_Elektrina_Striedavy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__elektrina__striedavy);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Elektrina.class);
                startActivity(intent);
            }


        });

        ImageView img_fT = (ImageView) findViewById(R.id.img_fT);
        final Context context3 =this;
        img_fT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Elektrina_Striedavy_Info1.class);
                startActivity(intent);
            }


        });
        ImageView img_IIm = (ImageView) findViewById(R.id.img_IIm);
        final Context context4 =this;
        img_IIm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_Elektrina_Striedavy_Info2.class);
                startActivity(intent);
            }


        });
        ImageView img_UUm = (ImageView) findViewById(R.id.img_UUm);
        final Context context5 =this;
        img_UUm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context5, Fyzika_Elektrina_Striedavy_Info3.class);
                startActivity(intent);
            }


        });
        ImageView img_pNNUU = (ImageView) findViewById(R.id.img_pNNUU);
        final Context context6 =this;
        img_pNNUU.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context6, Fyzika_Elektrina_Striedavy_Info4.class);
                startActivity(intent);
            }


        });
    }
}
