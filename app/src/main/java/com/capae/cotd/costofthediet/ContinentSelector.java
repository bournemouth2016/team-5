package com.capae.cotd.costofthediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContinentSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continent_selector);
        getSupportActionBar().setTitle("Continents");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
