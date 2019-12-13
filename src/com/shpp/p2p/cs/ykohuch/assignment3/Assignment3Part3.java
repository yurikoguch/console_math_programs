package com.shpp.p2p.cs.ykohuch.assignment3;

import com.shpp.cs.a.console.ConsoleProgram;



public class Assignment3Part3 extends ConsoleProgram {

    //basic function
    public void run(){

        double num = readDouble("Enter the base. Please, use a comma instead of a dot for float numbers");
        int pow = readInt("Enter the exponent. Please, enter the integer");

        raiseToPower(num, pow);
    }

    //compute the value of the first parameter raised to the degree of parameter two.
    private double raiseToPower(double num, int pow) {

        if (num == 0 || pow == 0) {
            println(1);
            return (1);
        }

        if (pow < 0) {
            pow *= -1;
            double res = 1/num * pow;
            println(res);
        }

        else {
            double n = num;
            for (int i = 1; i < pow; i++) {
                num *= n;
            }
            println(num);
        }
        return num;
    }
}
