package com.daily_coding.bottomnavigationview;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bottomNavigationView = findViewById(R.id.bottom_nav);

        NavController navController = Navigation.findNavController(MainActivity.this, R.id.fragment_container);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);



//        bottomNavigationView = findViewById(R.id.bottom_nav);
//
//        bottomNavigationView.setSelectedItemId(R.id.menu_search);
//
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                Fragment selected_fragment = null;
//
//                int id = item.getItemId();
//
//                if (id == R.id.menu_home) {
//                    selected_fragment = new HomeFragment();
//                } else if (id == R.id.menu_search) {
//                    selected_fragment = new SearchFragment();
//                } else if (id == R.id.menu_notifications) {
//                    selected_fragment = new NotificationFragment();
//                }
//
//                if (selected_fragment != null) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.fragment_container, selected_fragment).commit();
//                }
//
//                return true;
//            }
//        });
//
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragment_container, new SearchFragment()).commit();
//        }


    }
}