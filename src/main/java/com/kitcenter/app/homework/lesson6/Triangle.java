package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class Triangle {
    public static void check(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter A,B,C");
        System.out.print("A:");
        double sideA = scanner.nextDouble();
        System.out.print("B:");
        double sideB = scanner.nextDouble();
        System.out.print("C:");
        double sideC = scanner.nextDouble();
        System.out.println("C^2:" +sideC*sideC);
        System.out.println("B^2:" +sideB*sideB);
        System.out.println("A^2:" +sideA*sideA);
        boolean result = checkSides(sideA,sideB,sideC);
        if (result){
            System.out.println("Right angled triangle");
        } else {
            System.out.println("Not right angled triangle") ;
        }

    }

    public static boolean checkSides(double sideA,double sideB,double sideC){
        return (sideC*sideC)==((sideA*sideA)+(sideB*sideB));

    }
}
