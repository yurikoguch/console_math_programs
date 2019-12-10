package com.shpp.p2p.cs.ykohuch.assignment3;


import acm.graphics.GOval;
import acm.util.RandomGenerator;
import com.shpp.cs.a.graphics.WindowProgram;

import javax.swing.*;
import java.awt.*;

public class Assignment3Part6 extends WindowProgram {
    /* The size of the ball. */
    private static final double BALL_SIZE = 50;

    /* The amount of time to pause between frames (24fps). */
    private static final double PAUSE_TIME = 1000.0 / 24;


    //basic function
    public  void run(){

        //This is start point for calculate 5 sec. for animation
        long start = System.currentTimeMillis();

        //cycle adds random oval for 5 seconds
        while (true){
            addRandomOvals();
            pause(PAUSE_TIME);

            //if current time is bigger then start on 5 sec. cycle will be break
            if(System.currentTimeMillis() > start + 5000){
                break;
            }
        }

    }

    //this function creates a basic oval
    private void addRandomOvals() {
        RandomGenerator rgen = RandomGenerator.getInstance();

        GOval object = new GOval(rgen.nextDouble(0, getWidth() - BALL_SIZE),
                rgen.nextDouble(0, getHeight() - BALL_SIZE), BALL_SIZE, BALL_SIZE);
        object.setFilled(true);
        object.setColor(rgen.nextColor());
        add(object);
    }
}




