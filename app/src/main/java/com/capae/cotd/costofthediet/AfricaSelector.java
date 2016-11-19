package com.capae.cotd.costofthediet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AfricaSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa_selector);
    }

    public void goArea(View view){
        Intent intent = new Intent(this, ModelSelector.class);
        startActivity(intent);
    }
}
