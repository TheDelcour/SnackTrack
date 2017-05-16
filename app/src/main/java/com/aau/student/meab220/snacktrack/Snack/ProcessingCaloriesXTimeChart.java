package com.aau.student.meab220.snacktrack.Snack;

import android.os.Environment;

import org.gicentre.utils.stat.XYChart;
import java.io.File;
import java.util.Arrays;

import processing.core.PApplet;

/**
 * Created by Tobias on 13-05-2017.
 */

public class ProcessingCaloriesXTimeChart extends PApplet {
    XYChart calorieChart;
    XYChart averageChart;
        public void settings() {
        fullScreen();
    }

    public void setup() {
        int sum = 0;
        int average;
        calorieChart = new XYChart(this);
        averageChart = new XYChart(this);
        File file = new File(Environment.getExternalStorageDirectory().getAbsoluteFile(), "SnackTrackData.csv");
        System.out.println(file);
        String[] data = loadStrings(file);
        System.out.println(data);
    //Getting the time row
    float[] time = new float[data.length];
    for(int i=0;i<data.length;i++){
        String timeS = split(data[i],',')[1];
        float timeF = parseFloat(timeS);
        time[i]= timeF;
}
    Arrays.sort(time);
        float maxTime = time[0];
        float minTime = time[0];

        for (int i = 0; i < time.length; i++) {
            if (time[i] > maxTime) {
                maxTime = time[i];
            }
            if (time[i] < minTime) {
                minTime = time[i];
            }
        }


float[] calories = new float[data.length];
for(int i=0;i<data.length;i++){
  String calorieS = split(data[i],',')[2];
  float calorieF = parseFloat(calorieS);
  calories[i] = calorieF;
}
        float maxCal = calories[0];

        for (int i = 0; i < calories.length; i++) {
            if (calories[i] > maxCal) {
                maxCal = calories[i];
            }
        }

        for (float i : calories) {
            sum += i;
        }

        average = sum/calories.length;
        float[] averageCal = new float[]{average,average};
        float[] timeCal = new float[]{minTime,maxTime};

//Setting the data
        calorieChart.setData(time,calories);
        averageChart.setData(timeCal,averageCal);

//Formatting the axis and the labels.
        calorieChart.showXAxis(true);
        calorieChart.showYAxis(true);
        calorieChart.setLineWidth(8);
        calorieChart.setMaxX(maxTime);
        calorieChart.setLineColour(color(0,0,204));
        calorieChart.setYAxisLabel("Calories");
        calorieChart.setXAxisLabel("\n\nTime");
        calorieChart.setXFormat("\nkl: ##");
        calorieChart.setYFormat("  ####");
        averageChart.setMinY(0);
        averageChart.setMinX(minTime);
        averageChart.setMaxY(maxCal);
        averageChart.setLineWidth(14);
        averageChart.setLineColour(color(255,0,0));

    }

    public void draw() {
            background(255);
            textSize(35);
        calorieChart.draw(15,15,width-30,height-230);
        averageChart.draw(100,15,width-30,height-230);
        fill(color(0,0,204));
        ellipse(width-500,height-70,30,30);
        text("Calory intake at time",width-450,height-60);
        fill(color(255,0,0));
        ellipse(width-1000,height-70,30,30);
        text("Average calory intake",width-950,height-60);
        strokeWeight(10);
        stroke(192,192,192);
        line(0,height,width,height);
    }
}
