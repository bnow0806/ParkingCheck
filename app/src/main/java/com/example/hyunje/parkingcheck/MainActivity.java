package com.example.hyunje.parkingcheck;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends FragmentActivity {
GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gMap=((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(37.541,126.986),15));
    }
}
