package com.aau.student.meab220.snacktrack.Snack;

import android.os.Environment;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Tobias on 08-05-2017.
 */

public class SaveFavoriteToCSV {
    private static String button_name;

    public static void writeExternalStorage(){
        String state;
        state = Environment.getExternalStorageState();

        if(Environment.MEDIA_MOUNTED.equals(state)){


            File file = new File(Environment.getExternalStorageDirectory().getAbsoluteFile(), "SnackTrackFavorites.csv");
            String Message = button_name;

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(Message.getBytes());
                fileOutputStream.write(",".getBytes());
                fileOutputStream.write("\r\n".getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static String getButton_name() {
        return button_name;
    }

    public static void setButton_name(String button_name) {
        SaveFavoriteToCSV.button_name = button_name;
    }
}
