package com.kitcenter.app.classwork.lesson5;

public class MathFunc {
  public static int counter = 10;
  public static int speed = 10;

  public int multiply(int a, int b) {

    return a * b;
  }
  public int sum(int a, int b){
    return a + b;
  }

  public double slash(int c, int d ) {
    double result = (double) c/ d;
    System.out.print( "Slash result:" + result);
    return result;
  }
  public double power(int a, int b){
     return Math.pow(a,b);

  }

}



