package com.aau.student.meab220.snacktrack.Snack;

import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Tobia on 09-05-2017.
 */

public class SaveDataInputToCSV {
    private static String typeOfSnack; //based on what button was clicked
    private static String calories; //in kCal, hardcoded
    private static String amount; //in grams, hardcoded

    public static void writeExternalStorage(){
        String state;
        state = Environment.getExternalStorageState();
        Date curDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        String dateToStr = formatDate.format(curDate);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+1:00"));
        Date currentLocalTime = cal.getTime();
        DateFormat date = new SimpleDateFormat("HH:mm:ss");
        date.setTimeZone(TimeZone.getTimeZone("GMT+1:00"));

        String localTime = date.format(currentLocalTime);

        if(Environment.MEDIA_MOUNTED.equals(state)){


            File file = new File(Environment.getExternalStorageDirectory().getAbsoluteFile(), "SnackTrackData.csv");

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(typeOfSnack.getBytes());
                fileOutputStream.write(",".getBytes());
                fileOutputStream.write(calories.getBytes());
                fileOutputStream.write(",".getBytes());
                fileOutputStream.write(amount.getBytes());
                fileOutputStream.write(",".getBytes());
                fileOutputStream.write(dateToStr.getBytes());
                fileOutputStream.write(",".getBytes());
                fileOutputStream.write(localTime.getBytes());
                fileOutputStream.write("\r\n".getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getTypeOfSnack() {
        return typeOfSnack;
    }

    public static void setTypeOfSnack(String typeOfSnack) {
        SaveDataInputToCSV.typeOfSnack = typeOfSnack;
    }

    public static String getCalories() {
        return calories;
    }

    public static void setCalories(String calories) {
        SaveDataInputToCSV.calories = calories;
    }

    public static String getAmount() {
        return amount;
    }

    public static void setAmount(String amount) {
        SaveDataInputToCSV.amount = amount;
    }
}
