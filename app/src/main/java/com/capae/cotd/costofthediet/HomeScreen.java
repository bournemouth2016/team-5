package com.capae.cotd.costofthediet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void goArea(View view){
        Intent intent = new Intent(this, ContinentSelector.class);
        startActivity(intent);
    }

    public void goNutrition(View view){
        Intent intent = new Intent(this, NutritionGenderChoice.class);
        startActivity(intent);
    }

    public void goFood(View view){
        Intent intent = new Intent(this, FoodGroupDir.class);
        startActivity(intent);
    }
}
