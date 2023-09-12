package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    public Button mca_button;
    public  Button mba_button;
    public  Button mtech_button;
    public  Button btech_button;
    public  Button bba_button;
    public  Button biotech_button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // drawer layout instance to toggle the menu icon to open
        // drawer and back button to close drawer
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // MCA button Action
        mca_button.findViewById(R.id.mca_button);
        mca_button.setOnClickListener(this);

        // MBA button Action
        mba_button.findViewById(R.id.mba_button);
        mba_button.setOnClickListener(this);

        // MTECH button Action
        mtech_button.findViewById(R.id.mtech_button);
        mtech_button.setOnClickListener(this);

        // BTECH button Action
        btech_button.findViewById(R.id.betch_button);
        btech_button.setOnClickListener(this);

        // BBA button Action
        bba_button.findViewById(R.id.bba_button);
        bba_button.setOnClickListener(this);

        // BIOTECH button Action
        biotech_button.findViewById(R.id.biotech_button);
        biotech_button.setOnClickListener(this);



    }

    // override the onOptionsItemSelected()
    // function to implement
    // the item click listener callback
    // to open and close the navigation
    // drawer when the icon is clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, MCA_ACTIVITY.class);
        startActivity(i);
    }
}