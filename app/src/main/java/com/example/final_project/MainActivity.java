package com.example.final_project;

import android.os.Bundle;

import com.example.final_project.fragments.BuyDmsFragment;
import com.example.final_project.fragments.CompaniesFragment;
import com.example.final_project.fragments.ProfileFragment;
import com.example.final_project.fragments.VzrFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.final_project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        // Get the FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Begin a transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the container with the fragment
        fragmentTransaction.replace(R.id.container, new VzrFragment());

        // Commit the transaction
        fragmentTransaction.commit();
    }

}