package com.example.recyv;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class details_holder extends AppCompatActivity{

        TextView countryID, areaID, religionID, populationID, detailsID, animalsID, birdsID;
        ImageView flagID;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.details);
            setTitle("Details");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            countryID= findViewById(R.id.countryID);
            areaID = findViewById(R.id.areaID);
            religionID = findViewById(R.id.religionID);
            populationID = findViewById(R.id.populationID);
            detailsID = findViewById(R.id.desc);
            flagID = findViewById(R.id.flag);
            animalsID = findViewById(R.id.animalsID);
            birdsID = findViewById(R.id.birdsID);

            flagID.setImageResource(getIntent().getIntExtra("flag_key", 0));
            countryID.setText(getIntent().getStringExtra("country_key"));
            areaID.setText(getIntent().getStringExtra("area_key"));
            religionID.setText(getIntent().getStringExtra("religion_key"));
            populationID.setText(getIntent().getStringExtra("population_key"));
            detailsID.setText(getIntent().getStringExtra("details_area"));
            animalsID.setText(getIntent().getStringExtra("animals_key"));
            birdsID.setText(getIntent().getStringExtra("birds_key"));
        }
}

