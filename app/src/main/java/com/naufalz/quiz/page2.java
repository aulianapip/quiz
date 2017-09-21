package com.naufalz.quiz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class page2 extends ActionBarActivity {
    int aa=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button a2=(Button) findViewById(R.id.a2);
        Button b2=(Button) findViewById(R.id.b2);
        Button c2=(Button) findViewById(R.id.c2);
        aa=getIntent().getExtras().getInt("hasil");
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3=new Intent(getApplicationContext(),Page3.class);
                p3.putExtra("hasil",aa);
                startActivity(p3);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3=new Intent(getApplicationContext(),Page3.class);
                p3.putExtra("hasil",(aa+10)); //jawaban B yang benar dan akan ditambah skor 10 lagi
                startActivity(p3);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3=new Intent(getApplicationContext(),Page3.class);
                p3.putExtra("hasil",aa);
                startActivity(p3);
            }
        });
    }




}
