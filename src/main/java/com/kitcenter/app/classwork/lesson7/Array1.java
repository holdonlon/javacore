package com.kitcenter.app.classwork.lesson7;

import java.util.Arrays;

public class Array1 {
    public static void print() {
        char[] charArray = new char[255];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) i;
        }
        System.out.println("Char array: " +
                Arrays.toString(charArray));

    }
}
