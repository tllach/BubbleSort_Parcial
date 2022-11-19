package com.tabata;

public class Time_Managment {

    private double elapsedTime;
    private long start;
    private long end;

    public Time_Managment() {
    }

    public void startTime(){
        this.start = System.nanoTime();
    }

    public void stopTime(){
        this.end = System.nanoTime();
    }

    public double getElapsedTime(){
        elapsedTime = end - start;
        return elapsedTime;
    }

}
