package com.aau.student.meab220.snacktrack;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aau.student.meab220.snacktrack.Snack.ProcessingBarChart;
import com.aau.student.meab220.snacktrack.Snack.ProcessingCaloriesXTimeChart;

public class TrackScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_screen);
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = new ProcessingCaloriesXTimeChart();
        Fragment fragment1 = new ProcessingBarChart();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .replace(R.id.container1, fragment1)
                .commit();
    }
}
