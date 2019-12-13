package com.shpp.p2p.cs.ykohuch.assignment3;


import acm.util.RandomGenerator;
import com.shpp.cs.a.console.ConsoleProgram;

public class Assignment3Part5 extends ConsoleProgram {
    public static final int NUM = 20;

    public void run(){
            //money on the start of game
            int total = 0;
            int counter = 0;
            RandomGenerator rgen = RandomGenerator.getInstance();

            //until the number of less than 20 cycles is repeated
            while (total < NUM ) {
                int subtotal = 1;

                /*this cycle performs the functions of an eagle.
                 If a randomly generated integer from 0 to 1 is 0.
                 Then the sum is multiplied by 2*/
                while (rgen.nextBoolean()) {
                    subtotal *= 2;
                }
                total += subtotal;
                counter++;
                println("You earned $" + subtotal);
                println("Your total is $" + total);
            }
            println("It took " + counter + " games to earn $20" );
    }
}

