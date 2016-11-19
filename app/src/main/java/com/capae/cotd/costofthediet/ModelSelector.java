package com.capae.cotd.costofthediet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ModelSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_selector_africa);
    }

    public void goDiet(View view){
        Intent intent = new Intent(this, DietKenya.class);
        startActivity(intent);
    }
}
