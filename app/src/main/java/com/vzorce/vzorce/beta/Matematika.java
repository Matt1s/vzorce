package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Matematika extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Context backHard =this;
        Intent intent = new Intent(backHard, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, MainActivity.class);
                startActivity(intent);
            }


        });

        Button btn_Vyrazy = (Button)findViewById(R.id.btn_Vyrazy);
        btn_Vyrazy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Vyrazy.class);
                startActivity(intent);
        }});
        Button btn_Geometria = (Button)findViewById(R.id.btn_Geometria);
        btn_Geometria.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Geometria.class);
                startActivity(intent);
            }});
        Button btn_KvadratickeRovnice = (Button)findViewById(R.id.btn_KvadratickeRovnice);
        btn_KvadratickeRovnice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_KvadratickeRovnice.class);
                startActivity(intent);
        }});
        Button btn_Mocniny = (Button)findViewById(R.id.btn_Mocniny);
        btn_Mocniny.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Mocniny.class);
                startActivity(intent);
            }});
        Button btn_Odmocniny = (Button)findViewById(R.id.btn_Odmocniny);
        btn_Odmocniny.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Odmocniny.class);
                startActivity(intent);
            }});
        Button btn_Linearnafunkcia = (Button)findViewById(R.id.btn_Linearnafunkcia);
        btn_Linearnafunkcia.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_LinearnaFunkcia.class);
                startActivity(intent);
            }});


}}
