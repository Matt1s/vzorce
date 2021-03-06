package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Fyzika_Elektrina_Seriovo extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Context backHard =this;
        Intent intent = new Intent(backHard, Fyzika_Elektrina.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__elektrina__seriovo);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1=this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Elektrina.class);
                startActivity(intent);
            }


        });
        ImageView img_RRR = (ImageView) findViewById(R.id.img_RRR);
        final Context context2 =this;
        img_RRR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Elektrina_Seriovo_Info1.class);
                startActivity(intent);
            }


        });
        ImageView img_UUU = (ImageView) findViewById(R.id.img_UUU);
        final Context context3 =this;
        img_UUU.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Elektrina_Seriovo_Info2.class);
                startActivity(intent);
            }


        });
    }
}
