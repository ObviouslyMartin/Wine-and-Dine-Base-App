package com.sp18.ssu370.baseprojectapp.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp18.ssu370.baseprojectapp.R;

public class WineTypeActivity extends AppCompatActivity {

    private Button winesearchbutton1;
    private Button winesearchbutton2;
    private Button winesearchbutton3;
    private Button profilebutton;
    private Button mainactivitybutton;
    private Button mapbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_type);

        winesearchbutton1 = (Button) findViewById(R.id.toWineSearchActivity1);                                   // Wine Search button  Red
        winesearchbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WineTypeActivity.this, WineSearchActivity.class));
            }
        });

        winesearchbutton2 = (Button) findViewById(R.id.toWineSearchActivity2);                                   // Wine Search button  White
        winesearchbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WineTypeActivity.this, WineSearchActivity.class));
            }
        });

        winesearchbutton3 = (Button) findViewById(R.id.toWineSearchActivity3);                                   // Wine Search button  Pink
        winesearchbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WineTypeActivity.this, WineSearchActivity.class));
            }
        });

        profilebutton = (Button) findViewById(R.id.toProfileActivity);                                          // Profile button
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WineTypeActivity.this, ProfileActivity.class));
            }
        });

        mainactivitybutton = (Button) findViewById(R.id.toMainActivity);                                        // Home button
        mainactivitybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WineTypeActivity.this, MainActivity.class));
            }
        });

        mapbutton = (Button) findViewById(R.id.FindLoc);                                                       // Map button
        mapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WineTypeActivity.this, MapsActivity.class));
            }
        });

    }
}
