package com.example.hyunje.parkingcheck;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

GoogleMap gMap;
double lat=37.541;
double lng=126.986;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SupportMapFragment gMap = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        gMap.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lng), 15));
        MarkerOptions marker = new MarkerOptions();
        marker.position(new LatLng(lat, lng));
        googleMap.addMarker(marker).showInfoWindow();

        Uri uri=Uri.parse("geo:"+lat+","+lng);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
}
