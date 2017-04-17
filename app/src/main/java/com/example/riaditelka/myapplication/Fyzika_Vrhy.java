package com.example.riaditelka.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fyzika_Vrhy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyzika__vrhy);
        Button btn_VrhZvisloNahor = (Button)findViewById(R.id.btn_VrhZvisloNahor);
        btn_VrhZvisloNahor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Vrhy_VrhZvisloNahor.class);
                startActivity(intent);
            }});
        Button btn_VrhVodorovny = (Button)findViewById(R.id.btn_VrhVodorovny);
        btn_VrhVodorovny.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Vrhy_VrhVodorovny.class);
                startActivity(intent);
            }});
        Button btn_VrhSikmy = (Button)findViewById(R.id.btn_VrhSikmy);
        btn_VrhSikmy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Fyzika_Vrhy_VrhSikmy.class);
                startActivity(intent);
            }});

    }
}
