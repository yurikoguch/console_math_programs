package com.shpp.p2p.cs.ykohuch.assignment3;

import com.shpp.cs.a.console.ConsoleProgram;


public class Assignment3Part1 extends ConsoleProgram{

    //daily norm training for good cardio
    public static final int DAILY_CARDIO_RATE = 30;

    //daily norm training for good blood pressure
    public static final int DAILY_BLOOD_RATE = 40;

    //weekly norm of training days
    public static final int DAYS_CARDIO_TRAINIG_AT_WEEK = 5;

    //weekly norm of training days
    public static final int DAYS_PRESSURE_TRAINIG_AT_WEEK = 3;

    //counters for completed days
    public int cardioCompleatedDays;
    public int bloodCompleatedDays;

    //basic function
    public void run() {

        askTheQuestions();
        checkCardio(cardioCompleatedDays);
        checkBlood(bloodCompleatedDays);

    }

    /*Seven times we ask the user time spent on aerobics, and if result is bigger or equal to daily norm,
    we  are increasing the number of actions taken*/
    private void askTheQuestions(){
        for (int i = 1; i <= 7; i++){
            int a = readInt("How many minutes of aerobic exercise did you do on day " + i + "?");

            if(a >= DAILY_CARDIO_RATE){
                cardioCompleatedDays++;
            }
            if(a >= DAILY_BLOOD_RATE){
                bloodCompleatedDays++;
            }
        }
    }

    //check the number of minutes for Cardio
    private void checkCardio(int number) {
        if (cardioCompleatedDays >= DAYS_CARDIO_TRAINIG_AT_WEEK) {
            println("Cardiovacular health:\n" +
                    "Great job! You've done enough exercise for cardiovacular health.\n");
        }
            else {
            println("Cardiovacular health:\n" +
                    " You needed to train hard for at least " + (DAYS_CARDIO_TRAINIG_AT_WEEK - cardioCompleatedDays) + " more day(s) a week!" );
        }
    }

    //check the number of minutes for Blood
    private void checkBlood(int number) {
        if (bloodCompleatedDays >= DAYS_PRESSURE_TRAINIG_AT_WEEK) {
            println("Blood pressure:\n" +
                    "Great job! You've done enough exercise to keep a low blood pressure.\n");
        }
        else {
            println("Blood pressure:\n" +
                    " You needed to train hard for at least " + (DAYS_PRESSURE_TRAINIG_AT_WEEK - bloodCompleatedDays) + " more day(s) a week!" );
        }
    }
}

