package com.capae.cotd.costofthediet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContinentSelector extends AppCompatActivity {

    public static String continent = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continent_selector);
        getSupportActionBar().setTitle("Continents");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void goAsia(View view){
        Intent intent = new Intent(this, AsiaSelector.class);
        startActivity(intent);
    }

    public void goAfrica(View view){
        Intent intent = new Intent(this, AfricaSelector.class);
        continent = "Africa";
        startActivity(intent);
    }
}
