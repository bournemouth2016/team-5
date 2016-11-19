package com.capae.cotd.costofthediet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DietKenya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_kenya);
    }
    public void goFamily(View view){
        Intent intent = new Intent(this, FamilySize.class);
        startActivity(intent);

    }
}
