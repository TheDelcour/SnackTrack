package com.aau.student.meab220.snacktrack.Snack;

/**
 * Created by Tobias on 01-05-2017.
 */

public class dataInputSnackType {

    String typeOfSnack; //based on what button was clicked
    String time; //from phone
    String day; //from phone
    String location; //user input
    float calories; //in kCal, hardcoded
    float weight; //in grams, hardcoded

    public dataInputSnackType(String typeOfSnack, String time, String day, String location, float calories, float weight){
        this.typeOfSnack = typeOfSnack;
        this.time = time;
        this.day = day;
        this.location = location;
        this.calories = calories;
        this.weight = weight;
    }
}
