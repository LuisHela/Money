package com.expance.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import vocsy.ads.AppUtil;
import vocsy.ads.CustomAdsListener;


public class GetStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start);

        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_DARK);
        ImageView gifView;
        gifView = findViewById(R.id.gifView);
        Glide.with(this).asGif().load(R.drawable.gif11).into(gifView);
        findViewById(R.id.start).setOnClickListener(v -> {

                    startActivity(new Intent(GetStart.this, MainActivity.class));



        });


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(GetStart.this, GetStart2.class));
    }
}