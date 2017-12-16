package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class Menu {
    public static void start(){
        System.out.println("Pls select programm to start");
        System.out.println("To run triangle check input 1");
        System.out.println("To run Even or Odd input 2");
        System.out.println("To run What number bigger input 3");
        Scanner scanner = new Scanner(System.in);
        double selection = scanner.nextDouble();
        if (selection ==1){
            Triangle.check();
        }else if (selection==2){
            EvenOrOdd.check();

        }else if (selection==3){
            WhatBiggerNumber.check();
        }else{
            System.out.println("Nothing to do here");
        }

    }
}
