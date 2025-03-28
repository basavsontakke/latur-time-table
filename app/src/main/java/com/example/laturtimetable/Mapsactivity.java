package com.example.laturtimetable;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapsactivity extends AppCompatActivity implements OnMapReadyCallback
{
    private com.google.android.gms.maps.GoogleMap gmap;
    double l1,l2;
    String title="";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mapsactivity);

        Bundle b=getIntent().getExtras();
        l1= Double.parseDouble(b.getString("l1").toString());
        l2= Double.parseDouble(b.getString("l2").toString());
        title=b.getString("title").toString();

        Toast.makeText(this, "😍_Welcome to the Google Map_😍", Toast.LENGTH_SHORT).show();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment1);

        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull com.google.android.gms.maps.GoogleMap googleMap)
    {
        Log.d("Mapsactivity","onMapReady called");
        gmap = googleMap;

        LatLng location = new LatLng(l1, l2);
        gmap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        gmap.addMarker(new MarkerOptions().position(location).title(title));
        gmap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,10));

    }
}