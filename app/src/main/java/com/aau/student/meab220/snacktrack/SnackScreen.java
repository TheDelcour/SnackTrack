package com.aau.student.meab220.snacktrack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SnackScreen extends AppCompatActivity {
    static SnackScreen snackScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_screen);
        snackScreen = this;
    }

    public void on_click_fav(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("favorites");
        startActivity(intent);
    }

    public void on_click_drink(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("drink");
        startActivity(intent);
    }

    public void on_click_baked(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("baked");
        startActivity(intent);
    }

    public void on_click_fastfood(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("fastfood");
        startActivity(intent);
    }

    public void on_click_fruit(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("fruit");
        startActivity(intent);
    }

    public void on_click_sweets(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("sweets");
        startActivity(intent);
    }

    public void on_click_vegetables(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("vegetables");
        startActivity(intent);
    }

    public void on_click_nuts(View view) {
        Intent intent = new Intent(SnackScreen.this, SnackSubCategory.class);
        SnackSubCategory.setSnackScreenChosen("nuts");
        startActivity(intent);
    }



    public static SnackScreen getInstance(){
        return snackScreen;
    }
}
