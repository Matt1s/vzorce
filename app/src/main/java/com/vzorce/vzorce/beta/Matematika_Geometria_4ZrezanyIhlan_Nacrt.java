package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Matematika_Geometria_4ZrezanyIhlan_Nacrt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika__geometria_4_zrezany_ihlan__nacrt);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context1 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Matematika_Geometria_Hranate_4ZrezanyIhlan.class);
                startActivity(intent);
            }


        });
    }
}
