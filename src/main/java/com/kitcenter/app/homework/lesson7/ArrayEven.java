package com.kitcenter.app.homework.lesson7;

import com.kitcenter.app.homework.lesson6.EvenOrOdd;

public class ArrayEven {
    public static void print() {
        int[] evenNumbers = new int[10];
        for (int i = 2; i <= 20; i++) {
            if (EvenOrOdd.checkEven(i)) {
                evenNumbers[(i / 2) - 1] = i;
            }
        }
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]);
        }
    }
}