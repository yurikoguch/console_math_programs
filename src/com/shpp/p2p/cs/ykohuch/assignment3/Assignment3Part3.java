package com.shpp.p2p.cs.ykohuch.assignment3;

import com.shpp.cs.a.console.ConsoleProgram;



public class Assignment3Part3 extends ConsoleProgram {

    //global variables
    public double num;
    public int pow;

    //basic function
    public void run(){

        askTheNumbers();
        raiseToPower(num, pow);
    }

    //we accept the numbers from the user
    private void askTheNumbers(){
        num = readDouble("Enter the base. Please, use a comma instead of a dot for float numbers");
        pow = readInt("Enter the exponent. Please, enter the integer");
    }

    //compute the value of the first parameter raised to the degree of parameter two.
    private double raiseToPower(double base, int exponent) {
        double res = 1;
        if (exponent != 0) {

           //if exponent is positive
            for (int i = 0; i <= exponent; i++) {
                res *= base;
                println("Result: " + (res *= base));
            }
            if (exponent < 0) {

                // For negative exponent, must invert
                res = 1.0 / res;
                println("Result: " + (1.0 / res));
            }
        } else {

            // if exponent is 0
            res = 1;
            println("Result: " +  res);
        }
        return res;
    }
}
