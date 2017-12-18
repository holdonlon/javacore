package com.kitcenter.app.homework.lesson7;

import com.kitcenter.app.homework.lesson6.EvenOrOdd;

public class ArrayOdd {
    public static void print() {
        int[] oddNumbers = new int[50];
        for (int i = 1; i <= 99;i ++) {
            if (EvenOrOdd.checkEven(i) == false) {
                oddNumbers[i / 2] = i;
            }
        }
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        for (int i = oddNumbers.length-1;i >=0; i--){
            System.out.print(oddNumbers[i]+ " ");
        }
    }
}