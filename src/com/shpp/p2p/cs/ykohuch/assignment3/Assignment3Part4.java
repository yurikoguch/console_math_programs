package com.shpp.p2p.cs.ykohuch.assignment3;

import acm.graphics.GFillable;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part4 extends WindowProgram {

    public static final int BRICK_HEIGHT = 30;
    public static final int BRICK_WIDTH = 20;
    public static final int BRICKS_IN_BASE = 10;

    //size of screen
    public static final int APPLICATION_WIDTH = 350;
    public static final int APPLICATION_HEIGHT = 410;

    //basic function
    public void run() {
        int base = BRICKS_IN_BASE;

        //calculate size of pyramid
        int pyramidWidth = base * BRICK_WIDTH;
        int pyramidHeight = base * BRICK_HEIGHT;

        //calculate the offset along the axis x and y for centering blocks
        int xOffset = (APPLICATION_WIDTH-pyramidWidth)/2;
        int yOffset = (APPLICATION_HEIGHT-pyramidHeight)+(BRICKS_IN_BASE-BRICK_HEIGHT);


        //cycle that creates pyramid
        for (int i = 0; i < base +1; i++) {
            for (int j = 0; j < i; j++) {

                //for each level we have to increase x_offset for centering
                int x = xOffset + (base - i) * BRICK_WIDTH/2 + (BRICK_WIDTH * j);
                int y = yOffset + (BRICK_HEIGHT * i) - BRICK_HEIGHT;

                GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
                add(brick);
            }
        }
    }
}