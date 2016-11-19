package com.capae.cotd.costofthediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ChildIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_ingredients);
    }

    public void ShowTable(View view) {

        View vTbl = (ImageView) findViewById(R.id.imageView3);
        View vCh = (ImageView) findViewById(R.id.imageView5);
        vCh.setVisibility(View.INVISIBLE);
        vTbl.setVisibility(View.VISIBLE);
    }

    public void ShowChart(View view) {

        View vTbl = (ImageView) findViewById(R.id.imageView5);
        View vCh = (ImageView) findViewById(R.id.imageView3);
        vCh.setVisibility(view.INVISIBLE);
        vTbl.setVisibility(View.VISIBLE);
    }
}
