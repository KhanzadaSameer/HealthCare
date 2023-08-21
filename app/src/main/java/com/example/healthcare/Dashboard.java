package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView minicard1,getMinicard2,getMinicard3,getMinicard4,getMinicard5,getMinicard6,getMinicard7,getMinicard8,getMinicard9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getMinicard2 = findViewById(R.id.dashcard2);
        getMinicard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this,Doctors.class);
                startActivity(i);
            }
        });
        getMinicard3 = findViewById(R.id.dashcard3);
        getMinicard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this,Staff.class);
                startActivity(i);
            }
        });
        getMinicard4 = findViewById(R.id.dashcard4);
        getMinicard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, Appoinments.class);
                startActivity(i);
            }
        });
        getMinicard5 = findViewById(R.id.dashcard5);
        getMinicard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, Timing.class);
                startActivity(i);
            }
        });
        getMinicard6 = findViewById(R.id.dashcard6);
        getMinicard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, OPD.class);
                startActivity(i);
            }
        });
        getMinicard7 = findViewById(R.id.dashcard7);
        getMinicard8 = findViewById(R.id.dashcard8);
        getMinicard9 = findViewById(R.id.dashcard9);

        minicard1 = findViewById(R.id.dashcard1);
        minicard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, Hospital.class);
                startActivity(i);
            }
        });
    }
}