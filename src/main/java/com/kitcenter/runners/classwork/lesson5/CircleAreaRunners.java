package com.kitcenter.runners.classwork.lesson5;

public class CircleAreaRunners {
    public static void main(String[] args) {
        //CircleArea.calculate();
        CircleAreaRunners ruunner = new CircleAreaRunners();
        ruunner.run();
    }

    int calcArea(int height, int width) {
        return height * width;
    }

    public void run() {
        int a = calcArea(7, 12);
        short c = 7;
        calcArea(c, 15);
        //int d = calcArea (57);
        calcArea(2, 3);
        long t = 42;
        //int f = calcArea((t, 17);

    }
}
