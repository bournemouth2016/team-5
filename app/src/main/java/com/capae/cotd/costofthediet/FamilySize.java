package com.capae.cotd.costofthediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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

            String childFoodCost = "185.40";
            String womanFoodCost = "867.71";
            String manFoodCost = "421.95";
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
