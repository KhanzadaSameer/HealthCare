package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctors extends AppCompatActivity {

    CardView card1,card2,card3,card4,card5,card6;
    Button back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);

        back = findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Doctors.this,Dashboard.class);
                startActivity(i);
            }
        });

        card1 = findViewById(R.id.Drcard1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Doctors.this, Dr1.class);
                startActivity(i);
            }
        });
        card2 = findViewById(R.id.Drcard2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Doctors.this, Dr2.class);
                startActivity(i);
            }
        });
        card3 = findViewById(R.id.Drcard3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Doctors.this,Dr3.class);
                startActivity(i);
            }
        });
        card4 = findViewById(R.id.Drcard4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Doctors.this, Dr4.class);
                startActivity(i);
            }
        });
        card5 = findViewById(R.id.Drcard5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Doctors.this, Dr5.class);
                startActivity(i);
            }
        });
        card6 = findViewById(R.id.Drcard6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Doctors.this, Dr6.class);
                startActivity(i);
            }
        });


    }
}