package com.kitcenter.app.classwork.lesson2;

public class Bicycle {
    public int cadence(int x) {
        while (x < 10) {
            x = x+1;
            System.out.println("Bicycle" + x);
        }
        return x;
    }
}
