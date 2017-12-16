package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class EvenOrOdd {
    public static void check(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter number to check");
        double number = scanner.nextDouble();
        if (checkEven(number)){
            System.out.println("even");

        }else{
            System.out.println("Odd");

        }

    }
    public static boolean checkEven(double number){
        return (number % 2)==0;
    }
}
