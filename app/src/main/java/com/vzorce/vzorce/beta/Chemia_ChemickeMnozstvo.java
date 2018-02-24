package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class Chemia_ChemickeMnozstvo extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Context backHard =this;
        Intent intent = new Intent(backHard, Chemia.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemia__chemicke_mnozstvo);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context backSoft =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(backSoft, Chemia.class);
                startActivity(intent);
            }


        });

        ImageView img_Armm = (ImageView) findViewById(R.id.img_Armm);
        final Context context =this;
        img_Armm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Chemia_ChemickeMnozstvo_Info.class);
                startActivity(intent);
            }


        });
        ImageView img_Mrmm = (ImageView) findViewById(R.id.img_Mrmm);
        final Context context1 =this;
        img_Mrmm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Chemia_ChemickeMnozstvo_Info2.class);
                startActivity(intent);
            }


        });
    }
}
