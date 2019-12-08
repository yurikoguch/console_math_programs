package com.shpp.p2p.cs.ykohuch.assignment3;

import com.shpp.cs.a.console.ConsoleProgram;


public class Assignment3Part1 extends ConsoleProgram{

    //global variable
    public float sum;


    //basic function
    public void run() {

        askTheQuestions();

        /*we check that enough time has been allocated for cardiovascular health exercises and, if not,
        it shows how many days of a proper life (with lessons over 30 minutes)
         are not enough for the recommended schedule.*/
        boolean isCardioOk = checkCardio(sum);
        if (isCardioOk) {
            println("Cardiovacular health:\n" +
                    "  Great job! You've done enough exercise for cardiovacular health.\n");
        } else {

            //calculate the number of days required for success
            float b = (210- sum)/30;
            println("Cardiovacular health:\n" +
                    "  You needed to train hard for at least " + b + " more day(s) a week!" );
        }

       /* we check that there are enough exercises to reduce
        blood pressure and cholesterol, and if not, it shows
        how many days the user is short of 40 minutes a day.*/
        boolean isBloodOk = checkBlood(sum);
        if (isBloodOk) {
            println("Blood pressure:\n" +
                    "Great job! You've done enough exercise to keep a low blood pressure.\n");
        } else {

            //calculate the number of days required for success
            float c = (280- sum)/40;
            println("Blood pressure:\n" +
                    " You needed to train hard for at least " + c + " more day(s) a week!" );
        }
    }

    //check the number of minutes for Cardio
    private boolean checkCardio(float number) {
        if (number >= 210) {
            return true;
        }
            else {
                return false;
        }
    }

    //check the number of minutes for Blood
    private boolean checkBlood(float number) {
        if (number >= 280) {
            return true;
        }
        else {
            return false;
        }
    }

    //Seven times we ask the user time spent on aerobics
    private void askTheQuestions(){
        for (int i = 1; i <= 7; i++){
            float a = readInt("How many minutes of aerobic exercise did you do on day " + i + "?");

            //total of results from every day
            sum = a + a + a + a + a + a + a;
        }
    }
}

