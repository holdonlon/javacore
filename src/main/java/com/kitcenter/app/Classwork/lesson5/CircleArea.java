package com.kitcenter.app.Classwork.lesson5;

import java.util.Scanner;

public class CircleArea {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area is " + circleArea);
        double radius2 = scanner.nextDouble();
        double circleArea2 = Math.PI * radius2 * radius2;
        System.out.println("Area is " + circleArea2);
    }
}
