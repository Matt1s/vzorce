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


public class Fyzika_Vrhy_VrhSikmy extends AppCompatActivity {

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
        setContentView(R.layout.activity_fyzika__vrhy__vrh_sikmy);



        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_dvgsin2alfa = (ImageView) findViewById(R.id.img_dvgsin2alfa);
        final Context context =this;
        img_dvgsin2alfa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_Vrhy_VrhSikmy_Infodvgsin2alfa.class);
                startActivity(intent);
            }


        });
        ImageView img_xxvtcosalfa = (ImageView) findViewById(R.id.img_xxvtcosalfa);
        final Context context1 =this;
        img_xxvtcosalfa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Vrhy_VrhSikmy_Infoxxvtcosalfa.class);
                startActivity(intent);
            }


        });
        ImageView img_ymaxvsinalfa2g = (ImageView) findViewById(R.id.img_ymaxvsinalfa2g);
        final Context context2 =this;
        img_ymaxvsinalfa2g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Vrhy_VrhSikmy_Infoymaxvsinalfa2g.class);
                startActivity(intent);
            }


        });
        ImageView img_yyvtsinalfagt = (ImageView) findViewById(R.id.img_yyvtsinalfagt);
        final Context context3 =this;
        img_yyvtsinalfagt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Vrhy_VrhSikmy_Infoyyvtsinalfagt.class);
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
