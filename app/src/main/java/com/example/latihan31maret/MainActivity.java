package com.example.latihan31maret;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import fragments.BangunDatar;
import fragments.BangunRuang;
import fragments.Profile;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    BangunDatar bangunDatar = new BangunDatar();
    BangunRuang bangunRuang = new BangunRuang();
    Profile profile = new Profile();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, bangunDatar).commit();
        bottomNavigationView.setOnItemSelectedListener(navListener);

    }

    private NavigationBarView.OnItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            if (menuItem.getItemId() == R.id.bangunDatar) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, bangunDatar ).commit();
                return true;
            } else if (menuItem.getItemId() == R.id.bangunRuang) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, bangunRuang).commit();
                return true;
            } else if (menuItem.getItemId() == R.id.profile) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, profile).commit();
                return true;
            }
            return false;
        }
    };
}