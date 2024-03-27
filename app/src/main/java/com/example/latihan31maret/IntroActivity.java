package com.example.latihan31maret;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import fragments.BangunDatar;


public class IntroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);

        AppCompatButton calculateButton = findViewById(R.id.button);

        calculateButton.setOnClickListener(v -> {
            Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }

}