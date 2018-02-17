package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Matematika_Geometria_Hranate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika__geometria__hranate);



        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Matematika_Geometria.class);
                startActivity(intent);
            }


        });
        Button btn_Kocka = (Button)findViewById(R.id.btn_Kocka);
        btn_Kocka.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Geometria_Hranate_Kocka.class);
                startActivity(intent);
            }});
        Button btn_Kvader = (Button)findViewById(R.id.btn_Kvader);
        btn_Kvader.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Geometria_Hranate_Kvader.class);
                startActivity(intent);
            }});
        Button btn_4Ihlan = (Button)findViewById(R.id.btn_4Ihlan);
        btn_4Ihlan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Geometria_Hranate_4Ihlan.class);
                startActivity(intent);
            }});
        Button btn_4ZrezanyIhlan = (Button)findViewById(R.id.btn_4ZrezanyIhlan);
        btn_4ZrezanyIhlan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Geometria_Hranate_4ZrezanyIhlan.class);
                startActivity(intent);
            }});
    }
}
