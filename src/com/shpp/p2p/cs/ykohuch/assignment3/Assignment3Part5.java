package com.shpp.p2p.cs.ykohuch.assignment3;


import com.shpp.cs.a.console.ConsoleProgram;

public class Assignment3Part5 extends ConsoleProgram {
    public static final int NUM = 20;

    public void run(){
            //money on the start of game
            int total = 0;
            int counter = 0;

            //until the number of less than 20 cycles is repeated
            for (int i = 0; i < NUM; i++) {
                int subtotal = 1;

                /*this cycle performs the functions of an eagle.
                 If a randomly generated integer from 0 to 1 is 0.
                 Then the sum is multiplied by 2*/
                while ((int) (Math.random() * 2) == 0) {
                    subtotal *= 2;
                    println("You earned $" + subtotal);
                    counter++;
                    println("Your total is $" + (total + subtotal));
                    total += subtotal;
                }

            }

            println("It took " + counter + " games to earn $" + total);
    }
}

