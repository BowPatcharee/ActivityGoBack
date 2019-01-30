package com.example.patcharee.activitygoback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.time.Instant;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

   //     Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
  //      setSupportActionBar(toolbar);
   //     getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intant = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intant);
            }
        });

        findViewById(R.id.button_x).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
            }
        });

    }//void

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home) {
            onBackPressed();
            return true;
        }
         return super.onContextItemSelected(item);
    }

}//main
