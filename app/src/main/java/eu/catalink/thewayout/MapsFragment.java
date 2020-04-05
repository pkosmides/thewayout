package eu.catalink.thewayout;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends SupportMapFragment {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {

        this.getMapAsync(new OnMapReadyCallback() {

                             @Override
                             public void onMapReady(GoogleMap googleMap) {
                                 LatLng point1 = new LatLng(35.176336, 33.383212);
                                 LatLng point2 = new LatLng(35.174337, 33.370683);
                                 LatLng point3 = new LatLng(35.169660, 33.364673);
                                 LatLng point4 = new LatLng(35.160781, 33.339684);
                                 LatLng point5 = new LatLng(35.152625, 33.358911);
                                 LatLng point6 = new LatLng(35.144584, 33.375727);
                                 LatLng point7 = new LatLng(35.143303, 33.366060);
                                 LatLng point8 = new LatLng(35.167200, 33.354833);
                                 LatLng point9 = new LatLng(35.169572, 33.349466);
                                 LatLng point10 = new LatLng(35.147945, 33.409651);
                                 googleMap.addMarker(new MarkerOptions().position(point1).title("Health Assistance By X"));
                                 googleMap.addMarker(new MarkerOptions().position(point2).title("Health Assistance By X"));
                                 googleMap.addMarker(new MarkerOptions().position(point3).title("Financial Assistance By X").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
                                 googleMap.addMarker(new MarkerOptions().position(point4).title("Health Assistance to Students"));
                                 googleMap.addMarker(new MarkerOptions().position(point5).title("Assistance to Children").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
                                 googleMap.addMarker(new MarkerOptions().position(point6).title("Health Assistance By Y"));
                                 googleMap.addMarker(new MarkerOptions().position(point7).title("Assistance for Elderly").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                                 googleMap.addMarker(new MarkerOptions().position(point8).title("Financial Assistance By Government").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
                                 googleMap.addMarker(new MarkerOptions().position(point9).title("Health Assistance By Government"));
                                 googleMap.addMarker(new MarkerOptions().position(point10).title("Health Assistance to Students"));

                                 // Set a preference for minimum and maximum zoom.
                                 googleMap.setMinZoomPreference(12.0f);
                                 googleMap.setMaxZoomPreference(28.0f);
                                 googleMap.moveCamera(CameraUpdateFactory.newLatLng(point2));
                             }
                         }
        );

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
