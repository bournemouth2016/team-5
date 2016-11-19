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
        String childFoodWeight = "";
        String womanFoodWeight = "";
        String manFoodWeight = "";
        String childFoodCost = "";
        String womanFoodCost = "";
        String manFoodCost = "";

        if (continent == "Africa" && country == "Kenya")
        {
            childFoodWeight = "4985";
            womanFoodWeight = "6942";
            manFoodWeight = "5752";

            childFoodCost = "185.40";
            womanFoodCost = "867.71";
            manFoodCost = "421.95";
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
