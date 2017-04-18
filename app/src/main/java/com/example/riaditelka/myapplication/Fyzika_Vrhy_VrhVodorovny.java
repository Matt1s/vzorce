package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Fyzika_Vrhy_VrhVodorovny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__vrhy__vrh_vodorovny);

        ImageView img_xvt = (ImageView) findViewById(R.id.img_xvt);
        final Context context =this;
        img_xvt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_Vrhy_VrhVodorovny_Infoxvt.class);
                startActivity(intent);
            }
        });
        ImageView img_dv2hg = (ImageView) findViewById(R.id.img_dv2hg);
        final Context context1 =this;
        img_dv2hg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context1, Fyzika_Vrhy_VrhVodorovny_Infodv2hg.class);
                startActivity(intent);
            }
        });
        ImageView img_t2hg = (ImageView) findViewById(R.id.img_t2hg);
        final Context context2 =this;
        img_t2hg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context2, Fyzika_Vrhy_VrhVodorovny_Infot2hg.class);
                startActivity(intent);
            }
        });
        ImageView img_v2ghv = (ImageView) findViewById(R.id.img_v2ghv);
        final Context context3 =this;
        img_v2ghv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context3, Fyzika_Vrhy_VrhVodorovny_Infov2ghv.class);
                startActivity(intent);
            }
        });
        ImageView img_yvtgt2 = (ImageView) findViewById(R.id.img_yvtgt2);
        final Context context4 =this;
        img_yvtgt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, Fyzika_Vrhy_VrhVodorovny_Infoyvtgt2.class);
                startActivity(intent);
            }
        });

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context5 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, Fyzika_Vrhy.class);
                startActivity(intent);
            }


        });
    }
}
