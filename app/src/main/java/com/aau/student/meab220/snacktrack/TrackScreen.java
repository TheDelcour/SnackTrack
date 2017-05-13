package com.aau.student.meab220.snacktrack;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aau.student.meab220.snacktrack.Snack.DrawFromProcessing;

public class TrackScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_screen);
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = new DrawFromProcessing();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}
