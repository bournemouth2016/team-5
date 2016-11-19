package com.capae.cotd.costofthediet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FamilySize extends AppCompatActivity {
    public String TotalCost, TotalNutrients;
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

            TotalCost = "Total Cost for food for family: " + String.valueOf(Double.parseDouble(childFoodCost) + Double.parseDouble(womanFoodCost) + Double.parseDouble(manFoodCost));
            TotalNutrients = "Total Weight needed to meet energy requirements for family: " +String.valueOf(Double.parseDouble(childFoodWeight) + Double.parseDouble(womanFoodWeight) + Double.parseDouble(manFoodWeight)) +"g";
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
    public void ShowData(View view) {

                TextView tvCost = (TextView)findViewById(R.id.CostText);
                TextView tvNutrients = (TextView)findViewById(R.id.NutrientsText);
                tvCost.setText(TotalCost);
                tvNutrients.setText(TotalNutrients);

                View vCostText = (TextView) findViewById(R.id.CostText);
                View vNutrientsText = (TextView) findViewById(R.id.NutrientsText);
                View vCalc = (Button) findViewById(R.id.calculate);
                View vMem = (ImageButton) findViewById(R.id.addMember);

                vCostText.setVisibility(View.VISIBLE);
                vNutrientsText.setVisibility(View.VISIBLE);
                vCalc.setVisibility(View.INVISIBLE);
                vMem.setVisibility(View.INVISIBLE);
            }

    public void goIngredients(View view){
        Intent intent = new Intent(this, ChildIngredients.class);
        startActivity(intent);
    }

}
