package com.naufalz.quiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Page3 extends ActionBarActivity {
    int aa=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        TextView provola=(TextView) findViewById(R.id.hasil);
        aa=getIntent().getExtras().getInt("hasil");
        provola.setText(" total jawaban "+aa+" ya");
    }

}
