package com.kitcenter.runners.classwork.lesson6;

public class StringS1Runners {
    public void stringS1() {
        String s1 = "first string";
        String s2 = " and second string";
        s1 += s2;
        System.out.println("Concat string example: " + s1);
        String s3 = "1";
        String s4 = " and 2";
        s3 = s3.concat(s4);
        System.out.println("Another cancat string example: " + s3);
    }
}
