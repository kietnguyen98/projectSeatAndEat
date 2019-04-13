package com.example.projectseatandeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.projectseatandeat.Common.Common;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        try {
            //set time in mili
            Thread.sleep(1500);

        }catch (Exception e){
            e.printStackTrace();
        }

        Intent homeIntent = new Intent(Welcome.this,Home.class);
        startActivity(homeIntent);
        finish();
    }
}
