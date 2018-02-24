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


public class Matematika_Geometria_Rovinne_Stvoruholniky extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Context backHard =this;
        Intent intent = new Intent(backHard, Matematika_Geometria_Rovinne.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika__geometria__rovinne__stvoruholniky);




        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Matematika_Geometria_Rovinne.class);
                startActivity(intent);
            }


        });
        Button btn_Stvorec = (Button)findViewById(R.id.btn_Stvorec);
        btn_Stvorec.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Geometria_Rovinne_Stvoruholniky_Stvorec.class);
                startActivity(intent);
            }});
        Button btn_Obdlznik = (Button)findViewById(R.id.btn_Obdlznik);
        btn_Obdlznik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Stvoruholniky_Obdlznik.class);
                startActivity(intent);
            }});
        Button btn_Kosostvorec = (Button)findViewById(R.id.btn_Kosostvorec);
        btn_Kosostvorec.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Stvoruholniky_Kosostvorec.class);
                startActivity(intent);
            }});
        Button btn_Kosodlznik = (Button)findViewById(R.id.btn_Kosodlznik);
        btn_Kosodlznik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Stvoruholniky_Kosodlznik.class);
                startActivity(intent);
            }});
        Button btn_Rovnobeznik = (Button)findViewById(R.id.btn_Rovnobeznik);
        btn_Rovnobeznik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Stvoruholniky_Rovnobeznik.class);
                startActivity(intent);
            }});
        Button btn_Lichobeznik = (Button)findViewById(R.id.btn_Lichobeznik);
        btn_Lichobeznik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Stvoruholniky_Lichobeznik.class);
                startActivity(intent);
            }});
    }
}
