package com.aau.student.meab220.snacktrack;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aau.student.meab220.snacktrack.Snack.SaveFavoriteToCSV;

public class MainActivity extends AppCompatActivity {
    static MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity = this;
        if (shouldAskPermissions()) {
            askPermissions();
        }
    }

    public void on_click_snack(View view) {
        Intent intent = new Intent(MainActivity.this, SnackScreen.class);
        startActivity(intent);
    }

    public void on_click_track(View view) {
        Intent intent = new Intent(MainActivity.this, TrackScreen.class);
        startActivity(intent);
    }

    public static MainActivity getInstance(){
        return mainActivity;
    }
    protected boolean shouldAskPermissions() {
        return (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1);
    }

    @TargetApi(23)
    protected void askPermissions() {
        String[] permissions = {
                "android.permission.READ_EXTERNAL_STORAGE",
                "android.permission.WRITE_EXTERNAL_STORAGE"
        };
        int requestCode = 200;
        requestPermissions(permissions, requestCode);
    }
}
