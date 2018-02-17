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


public class Fyzika_Elektrina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__elektrina);



        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika.class);
                startActivity(intent);
            }


        });

        Button btn_Seriovo = (Button)findViewById(R.id.btn_Seriovo);
        btn_Seriovo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Elektrina_Seriovo.class);
                startActivity(intent);
            }});
        Button btn_Paralelne = (Button)findViewById(R.id.btn_Paralelne);
        btn_Paralelne.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Elektrina_Paralelne.class);
                startActivity(intent);
            }});
        Button btn_StriedavyPrud = (Button)findViewById(R.id.btn_StriedavyPrud);
        btn_StriedavyPrud.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Elektrina_Striedavy.class);
                startActivity(intent);
            }});
        ImageView img_PRI = (ImageView) findViewById(R.id.img_PRI);
        final Context context2 =this;
        img_PRI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Elektrina_InfoPRI.class);
                startActivity(intent);
            }


        });
        ImageView img_PUI = (ImageView) findViewById(R.id.img_PUI);
        final Context context3 =this;
        img_PUI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Elektrina_InfoPUI.class);
                startActivity(intent);
            }


        });
        ImageView img_RUI = (ImageView) findViewById(R.id.img_RUI);
        final Context context4 =this;
        img_RUI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_Elektrina_InfoRUI.class);
                startActivity(intent);
            }


        });
        ImageView img_WUIt = (ImageView) findViewById(R.id.img_WUIt);
        final Context context5 =this;
        img_WUIt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context5, Fyzika_Elektrina_InfoWUIt.class);
                startActivity(intent);
            }


        });
    }
}
