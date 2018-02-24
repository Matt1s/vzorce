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


public class Fyzika extends AppCompatActivity {

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
        setContentView(R.layout.activity_fyzika);



        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button btn_Sila = (Button)findViewById(R.id.btn_Sila);
        btn_Sila.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Sila.class);
                startActivity(intent);

            }});
        Button btn_Teplo = (Button)findViewById(R.id.btn_Teplo);
        btn_Teplo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Teplo.class);
                startActivity(intent);
            }});
        Button btn_Elektrina = (Button)findViewById(R.id.btn_Elektrina);
        btn_Elektrina.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Elektrina.class);
                startActivity(intent);
            }});

        Button btn_Kinematika = (Button)findViewById(R.id.btn_Kinematika);
        btn_Kinematika.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Kinematika.class);
                startActivity(intent);
            }});
        Button btn_Magnetizmus = (Button)findViewById(R.id.btn_Magnetizmus);
        btn_Magnetizmus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Magnetizmus.class);
                startActivity(intent);
            }});
        Button btn_Dynamika = (Button)findViewById(R.id.btn_Dynamika);
        btn_Dynamika.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Dynamika.class);
                startActivity(intent);
            }});
        Button btn_Vrhy = (Button)findViewById(R.id.btn_Vrhy);
        btn_Vrhy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Vrhy.class);
                startActivity(intent);
            }});
        Button btn_TuheTeleso = (Button)findViewById(R.id.btn_TuheTeleso);
        btn_TuheTeleso.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_MechanikaTuhehoTelesa.class);
                startActivity(intent);
            }});
        Button btn_Hustota = (Button)findViewById(R.id.btn_Hustota);
        btn_Hustota.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Hustota.class);
                startActivity(intent);
            }});
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, MainActivity.class);
                startActivity(intent);
            }


        });
    }
}
