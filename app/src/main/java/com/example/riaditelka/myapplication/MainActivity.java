package com.example.riaditelka.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Matematika =(Button)findViewById(R.id.btn_Matematika);
        btn_Matematika.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Matematika.class);
                startActivity(intent);
            }
        });

        Button btn_Fyzika =(Button)findViewById(R.id.btn_Fyzika);
        btn_Fyzika.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika.class);
                startActivity(intent);
            }
        });
        Button btn_Chemia =(Button)findViewById(R.id.btn_Chemia);
        btn_Chemia.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chemia.class);
                startActivity(intent);
            }
        });
    }}