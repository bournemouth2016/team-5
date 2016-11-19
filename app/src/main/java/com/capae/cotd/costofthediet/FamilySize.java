package com.capae.cotd.costofthediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FamilySize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_size);
        String continent = ContinentSelector.continent;
        String country = AfricaSelector.country;
        if (continent == "Africa" && country == "Kenya")
        {
            String childFoodWeight = "4985";
            String womanFoodWeight = "6942";
            String manFoodWeight = "5752";
        }
        else if (continent == "" && country == "")
        {
            //Nothing
        }
        else
        {
            //Shouldn't be here
        }
    }
}
