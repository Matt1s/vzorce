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


public class Matematika_Geometria_Rovinne_Trojuholniky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika__geometria__rovinne__trojuholniky);



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
        Button btn_Pravouhly = (Button)findViewById(R.id.btn_Pravouhly);
        btn_Pravouhly.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Trojuholniky_Pravouhly.class);
                startActivity(intent);
            }});
        Button btn_Rovnoramenny = (Button)findViewById(R.id.btn_Rovnoramenny);
        btn_Rovnoramenny.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Trojuholniky_Rovnoramenny.class);
                startActivity(intent);
            }});
        Button btn_Rovnostranny = (Button)findViewById(R.id.btn_Rovnostranny);
        btn_Rovnostranny.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Trojuholniky_Rovnostranny.class);
                startActivity(intent);
            }});
        Button btn_Vseobecny = (Button)findViewById(R.id.btn_Vseobecny);
        btn_Vseobecny.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Rovinne_Trojuholniky_Vseobecny.class);
                startActivity(intent);
            }});
    }
}
