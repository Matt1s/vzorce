package com.example.riaditelka.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fyzika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika);
        Button btn_Kinematika = (Button)findViewById(R.id.btn_Kinematika);
        btn_Kinematika.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Kinematika.class);
                startActivity(intent);
            }});
        Button btn_Dynamika = (Button)findViewById(R.id.btn_Dynamika);
        btn_Dynamika.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Dynamika.class);
                startActivity(intent);
            }});
        Button btn_Vrhy = (Button)findViewById(R.id.btn_Vrhy);
        btn_Vrhy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Vrhy.class);
                startActivity(intent);
            }});
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        final Context context4 =this;
        img_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context4, MainActivity.class);
                startActivity(intent);
            }


        });
    }
}
