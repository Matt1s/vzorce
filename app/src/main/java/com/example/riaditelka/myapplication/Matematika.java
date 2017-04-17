package com.example.riaditelka.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Matematika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika);

        Button btn_Vyrazy = (Button)findViewById(R.id.btn_Vyrazy);
        btn_Vyrazy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_Vyrazy.class);
                startActivity(intent);
        }});

        Button btn_KvadratickeRovnice = (Button)findViewById(R.id.btn_KvadratickeRovnice);
        btn_KvadratickeRovnice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika_KvadratickeRovnice.class);
                startActivity(intent);
            }});

}}
