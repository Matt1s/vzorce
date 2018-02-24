package com.vzorce.vzorce.beta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Fyzika_Vrhy_VrhSikmy_Infoyyvtsinalfagt extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Context backHard =this;
        Intent intent = new Intent(backHard, Fyzika_Vrhy_VrhSikmy.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__vrhy__vrh_sikmy__infoyyvtsinalfagt);

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_Vrhy_VrhSikmy.class);
                startActivity(intent);
            }


        });
    }
}
