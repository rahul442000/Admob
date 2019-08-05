package com.apkglobal.admob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView=(AdView)findViewById(R.id.adView);

        MobileAds.initialize(this);

        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);


    }
}
