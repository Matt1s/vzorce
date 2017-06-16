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

public class Fyzika_MechanikaTuhehoTelesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__mechanika_tuheho_telesa);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika.class);
                startActivity(intent);
            }


        });
        Button btn_J = (Button)findViewById(R.id.btn_J);
        btn_J.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti.class);
                startActivity(intent);
            }});
        ImageView img_MFa = (ImageView) findViewById(R.id.img_MFa);
        final Context context =this;
        img_MFa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_MechanikaTuhehoTelesa_infomfa.class);
                startActivity(intent);
            }


        });
        ImageView img_ekpmv = (ImageView) findViewById(R.id.img_ekpmv);
        final Context context1 =this;
        img_ekpmv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_MechanikeTuhehoTelesa_infoekp.class);
                startActivity(intent);
            }


        });
        ImageView img_ekojomega = (ImageView) findViewById(R.id.img_ekojomega);
        final Context context2 =this;
        img_ekojomega.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_MechanikeTuhehoTelesa_infoeko.class);
                startActivity(intent);
            }


        });
        ImageView img_omegavr = (ImageView) findViewById(R.id.img_omegavr);
        final Context context3 =this;
        img_omegavr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_MechanikeTuhehoTelesa_infoomegavr.class);
                startActivity(intent);
            }


        });
        ImageView img_omegapit = (ImageView) findViewById(R.id.img_omegapit);
        final Context context5 =this;
        img_omegapit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context5, Fyzika_MechanikeTuhehoTelesa_infoomegapit.class);
                startActivity(intent);
            }


        });
        ImageView img_vpirt = (ImageView) findViewById(R.id.img_vpirt);
        final Context context6 =this;
        img_vpirt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context6, Fyzika_MechanikeTuhehoTelesa_infovpirt.class);
                startActivity(intent);
            }


        });
        ImageView img_FaFa = (ImageView) findViewById(R.id.img_FaFa);
        final Context context7 =this;
        img_FaFa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context7, Fyzika_MechanikeTuhehoTelesa_infofafa.class);
                startActivity(intent);
            }
        });
    }
}
