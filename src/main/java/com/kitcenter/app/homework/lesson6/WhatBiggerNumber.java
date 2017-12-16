package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class WhatBiggerNumber {
    public static void check(){
        System.out.println("Plz enter two numbers");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        if(number1>number2){
            System.out.println("Bigger number1: "+ number1);
        } else if (number1 < number2) {
            System.out.println("Bigger number2: "+ number2);
        } else {
            System.out.println("Numbers are equals");

        }



    }
}
