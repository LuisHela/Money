package com.expance.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import vocsy.ads.CustomAdsListener;
import vocsy.ads.ExitScreen;


public class GetStart2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start2);

        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_DARK);
        findViewById(R.id.getStartedButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        startActivity(new Intent(GetStart2.this, GetStart.class));


            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(GetStart2.this, ExitScreen.class));
    }
}