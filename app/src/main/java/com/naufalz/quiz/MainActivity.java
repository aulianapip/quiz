package com.naufalz.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.Window;

public class MainActivity extends ActionBarActivity {
    int aa=0;  //skor dimulai dari 0
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ImageView jawabA = (ImageView) findViewById(R.id.a);
        ImageView jawabB = (ImageView) findViewById(R.id.b);
        ImageView jawabC = (ImageView) findViewById(R.id.c);
        ImageView jawabD = (ImageView) findViewById(R.id.d);
        jawabA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(getApplicationContext(), page2.class);
                p2.putExtra("hasil", aa);
                startActivity(p2);
            }
        });
        jawabB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(getApplicationContext(), page2.class);
                p2.putExtra("hasil", (aa + 10)); //pilihan yang benar Imageview dengan id "b"
                startActivity(p2);                  //dan akan ditambah skor 10
            }
        });
        jawabC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(getApplicationContext(), page2.class);
                p2.putExtra("hasil", (aa ));
                startActivity(p2);
            }
        });
        jawabD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(getApplicationContext(), page2.class);
                p2.putExtra("hasil", (aa));
                startActivity(p2);
            }
        });

    }

}
