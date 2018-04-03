package com.sp18.ssu370.baseprojectapp.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp18.ssu370.baseprojectapp.R;

public class FoodTypeActivity extends AppCompatActivity {

    private Button foodsearchbutton1;
    private Button foodsearchbutton2;
    private Button foodsearchbutton3;
    private Button foodsearchbutton4;
    private Button foodsearchbutton5;
    private Button profilebutton;
    private Button mainactivitybutton;
    private Button mapbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_type);

        foodsearchbutton1 = (Button) findViewById(R.id.toFoodSearchActivity1);                                   // Wine Search button  Breakfast
        foodsearchbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, FoodSearchActivity.class));
            }
        });

        foodsearchbutton2 = (Button) findViewById(R.id.toFoodSearchActivity2);                                   // Wine Search button  Lunch
        foodsearchbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, FoodSearchActivity.class));
            }
        });

        foodsearchbutton3 = (Button) findViewById(R.id.toFoodSearchActivity3);                                   // Wine Search button  Dinner
        foodsearchbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, FoodSearchActivity.class));
            }
        });

        foodsearchbutton4 = (Button) findViewById(R.id.toFoodSearchActivity4);                                   // Wine Search button  Dessert
        foodsearchbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, FoodSearchActivity.class));
            }
        });

        foodsearchbutton5 = (Button) findViewById(R.id.toFoodSearchActivity5);                                   // Wine Search button  Snack
        foodsearchbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, FoodSearchActivity.class));
            }
        });

        profilebutton = (Button) findViewById(R.id.toProfileActivity);                                          // Profile button
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, ProfileActivity.class));
            }
        });

        mainactivitybutton = (Button) findViewById(R.id.toMainActivity);                                        // Home button
        mainactivitybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, MainActivity.class));
            }
        });

        mapbutton = (Button) findViewById(R.id.FindLoc);                                                       // Map button
        mapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodTypeActivity.this, MapsActivity.class));
            }
        });

    }
}
