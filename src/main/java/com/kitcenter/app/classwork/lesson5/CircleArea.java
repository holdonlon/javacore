package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

public class CircleArea {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area is " + circleArea);
        System.out.println("Please enter circle radius");
        double radius2 = scanner.nextDouble();
        double circleArea2 = Math.PI * radius2 * radius2;
        System.out.println("Area is " + circleArea2);
        calculateBigger(circleArea,circleArea2);
    }

    public static void calculateBigger(double area1,double area2){
        if (area1 > area2)
            System.out.print("Area1 is bigger");
        else
            System.out.print("Area2 is bigger");
    }
}
