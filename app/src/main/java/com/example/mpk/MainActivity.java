package com.example.mpk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.*;
import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFirst_Activity(View view) {
        Intent intent = new Intent(this, First_Activity.class);
        startActivity(intent);
    }

    public void goToMaps_Activity(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


}

