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


public class Fyzika_Magnetizmus extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Context backHard =this;
        Intent intent = new Intent(backHard, Fyzika.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__magnetizmus);



        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context Back =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Back, Fyzika.class);
                startActivity(intent);
            }


        });

        ImageView img_uilit = (ImageView) findViewById(R.id.img_uilit);
        final Context context =this;
        img_uilit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_Magnetizmus_Infouilit.class);
                startActivity(intent);
            }
        });
        ImageView img_fili = (ImageView) findViewById(R.id.img_fili);
        final Context context2 =this;
        img_fili.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Magnetizmus_Infofili.class);
                startActivity(intent);
            }
        });
        ImageView img_finbscosalfa = (ImageView) findViewById(R.id.img_finbscosalfa);
        final Context context3 =this;
        img_finbscosalfa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Magnetizmus_Infofinbscosalfa.class);
                startActivity(intent);
            }
        });
        ImageView img_fibscosalfa = (ImageView) findViewById(R.id.img_fibscosalfa);
        final Context context4 =this;
        img_fibscosalfa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_Magnetizmus_Infofibscosalfa.class);
                startActivity(intent);
            }
        });
        ImageView img_uifit = (ImageView) findViewById(R.id.img_uifit);
        final Context context5 =this;
        img_uifit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context5, Fyzika_Magnetizmus_Infouifit.class);
                startActivity(intent);
            }
        });
        ImageView img_emli = (ImageView) findViewById(R.id.img_emli);
        final Context context6 =this;
        img_emli.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context6, Fyzika_Magnetizmus_Infoemli.class);
                startActivity(intent);
            }
        });
        ImageView img_fmbilsinalfa = (ImageView) findViewById(R.id.img_fmbilsinalfa);
        final Context context7 =this;
        img_fmbilsinalfa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context7, Fyzika_Magnetizmus_Infofmbilsinalfa.class);
                startActivity(intent);
            }
        });
    }
}
