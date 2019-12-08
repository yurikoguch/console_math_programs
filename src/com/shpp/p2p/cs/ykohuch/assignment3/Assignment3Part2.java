package com.shpp.p2p.cs.ykohuch.assignment3;


import com.shpp.cs.a.console.ConsoleProgram;

public class Assignment3Part2 extends ConsoleProgram {

    //global variable
    public int num;

    //basic function
    public void run(){

            askTheNumber();
            checkTheNumber(num);
    }

    //we accept the number from the user
    private void askTheNumber(){
        num = readInt("Please, enter the integer");
    }

    //determined the type of number and perform mathematical operations until get 1
    private void checkTheNumber(int i){
        int number = i;
        while(number !=1)
        {
            if(number % 2 == 0) //even
            {
                println(number + " is even so I take half: " + number/2);
                number = number/2;
            }
            else //odd
            {
                println(number + " is odd so I make 3n + 1: " + (number*3 + 1));
                number = number*3 + 1;
            }

        }

    }

}
