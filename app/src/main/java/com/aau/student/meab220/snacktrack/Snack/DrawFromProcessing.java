package com.aau.student.meab220.snacktrack.Snack;

import processing.core.PApplet;

/**
 * Created by Tobia on 13-05-2017.
 */

public class DrawFromProcessing extends PApplet {

        public void settings() {
        fullScreen();
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            fill(255,255,000);
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
