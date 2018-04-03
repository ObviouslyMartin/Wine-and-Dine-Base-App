package com.sp18.ssu370.baseprojectapp.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp18.ssu370.baseprojectapp.R;

public class FoodSearchActivity extends AppCompatActivity {

    private Button foodinfobutton;
    private Button profilebutton;
    private Button mainactivitybutton;
    private Button mapbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_search);

        foodinfobutton = (Button) findViewById(R.id.toFoodInfoActivity);                                   // Wine Search button  Red
        foodinfobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodSearchActivity.this, FoodInfoActivity.class));
            }
        });

        profilebutton = (Button) findViewById(R.id.toProfileActivity);                                          // Profile button
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodSearchActivity.this, ProfileActivity.class));
            }
        });

        mainactivitybutton = (Button) findViewById(R.id.toMainActivity);                                        // Home button
        mainactivitybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodSearchActivity.this, MainActivity.class));
            }
        });

        mapbutton = (Button) findViewById(R.id.FindLoc);                                                       // Map button
        mapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodSearchActivity.this, MapsActivity.class));
            }
        });

    }
}
