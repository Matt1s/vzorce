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


public class Fyzika_Vrhy_VrhZvisloNahor extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Context backHard =this;
        Intent intent = new Intent(backHard, Fyzika_Vrhy.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__vrhy__vrh_zvislo_nahor);



        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_hv2g = (ImageView) findViewById(R.id.img_hv2g);
        final Context context1 =this;
        img_hv2g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Vrhy_VrhZvisloNahor_Info1.class);
                startActivity(intent);
            }


        });
        ImageView img_tvg = (ImageView) findViewById(R.id.img_tvg);
        final Context context2 =this;
        img_tvg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Vrhy_VrhZvisloNahor_Info2.class);
                startActivity(intent);
            }
        });

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_Vrhy.class);
                startActivity(intent);
            }


        });
    }
}
