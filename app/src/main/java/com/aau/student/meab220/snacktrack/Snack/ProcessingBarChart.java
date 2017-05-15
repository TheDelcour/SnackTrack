package com.aau.student.meab220.snacktrack.Snack;

import android.os.Environment;

import org.gicentre.utils.stat.BarChart;
import java.io.File;
import java.util.Arrays;

import processing.core.PApplet;

/**
 * Created by Tobia on 15-05-2017.
 */

public class ProcessingBarChart extends PApplet {

    BarChart barChart;
    int fruit = 0;
    int drink = 0;
    int vegetables = 0;
    int baked = 0;
    int fastfood = 0;
    int nuts = 0;
    int sweets = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        File file = new File(Environment.getExternalStorageDirectory().getAbsoluteFile(), "SnackTrackData.csv");
        String[] data = loadStrings(file);
        String[] category = new String[data.length];
        for(int i=0;i<data.length;i++){
            String categoryS = split(data[i],',')[5];
            category[i]= categoryS;
        }

        for(int i=0; i<category.length; i++){
            if(category[i].equals("fruit")){
                fruit += 1;
            }
            if(category[i].equals("drink")){
                drink += 1;
            }
            if(category[i].equals("vegetables")){
                vegetables += 1;
            }
            if(category[i].equals("baked")){
                baked += 1;
            }
            if(category[i].equals("fastfood")){
                fastfood += 1;
            }
            if(category[i].equals("nuts")){
                nuts += 1;
            }
            if(category[i].equals("sweets")){
                sweets += 1;
            }

            barChart = new BarChart(this);
            barChart.setData(new float[] {fruit, drink, vegetables, baked, fastfood, nuts, sweets});

            barChart.setMinValue(0);
            barChart.showValueAxis(true);
            barChart.showCategoryAxis(true);
            barChart.setValueAxisLabel("Times snacked");
            barChart.setBarLabels(new String[] {"\nFruit", "\nDrinks", "\nVegetables", "\nBaked",
                    "\nFastfood", "\nNuts", "\nSweets"});

            barChart.setBarColour(color(255, 128, 0));
            barChart.setBarGap(7);
        }
    }

    public void draw() {
        background(255);
        textSize(35);
        barChart.draw(30,30,width,height-150);
    }

}

