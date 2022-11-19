package com.tabata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BubbleSort {

    Time_Managment time;
    long comp;

    public BubbleSort() {

    }

    public void run(ArrayList<Integer> list, int n) {
        time = new Time_Managment();
        boolean swapped = true;
        time.startTime();
        long comp = 0;

        while (swapped) {
            n--;
            swapped = false;
            for (int i = 0; i < n; i++) {
                int n1 = list.get(i), n2 = list.get(i + 1);
                comp++;
                if (n1 > n2) {
                    Collections.swap(list, n1, n2);
                    swapped = true;
                }
            }
        }
        time.stopTime();
    }


    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n);
            list.add(num);
        }
        return list;
    }

    public double getTime(){
        return time.getElapsedTime();
    }

    public long getComp(){
        return comp;
    }

}
