package com.kitcenter.app.classwork.lesson8;

import java.util.Scanner;

public class Loop {
    public static void decreaseab() {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        double numbera = scanner.nextDouble();
        double numberb = scanner.nextDouble();
        System.out.println("a: "+numbera);
        System.out.println("b: "+numberb);
        if(numbera>numberb){
            System.out.println("decreaseab");

            while (numbera>numberb){
                numbera=numbera-1;
                System.out.println("a: "+numbera);
                System.out.println("b: "+numberb);
            }

            if(numbera==numberb){
                System.out.println("equal");
            }
        }
    }
}
