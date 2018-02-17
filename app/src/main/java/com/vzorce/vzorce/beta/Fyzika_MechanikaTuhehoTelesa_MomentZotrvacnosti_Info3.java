package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti_Info3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__mechanika_tuheho_telesa__moment_zotrvacnosti__info3);



        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_MechanikaTuhehoTelesa_MomentZotrvacnosti.class);
                startActivity(intent);
            }
        });
    }
}
