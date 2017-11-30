package com.kitcenter.runners.classwork.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "бутылка"; //в единственном числе ОДНА бутылка
            }
            System.out.println(beerNum + "" + word +" пива на стене");
            System.out.println(beerNum + "" +word +"пива.");
            System.out.println("Возьми одну.");
            System.out.println ("Пусти по кругу.");
            beerNum = beerNum -1;
            if (beerNum >0) {
                System.out.println(beerNum + " " + word + "пива на стене");
            }else {
                System.out.println("нет бутылок пива на стене");
            }
        }
    /*
        System.out.println ("Я управляю" ); ;
        System.out.println  ( "миром " );

        int x = 3 ;
        String name = "кинжал" ;
        x = x + 17 ;
        System.out.println("х равен " + x);
        double d = Math.random() ;
// это комментарий
        while (x > 12) {
            x = x - 4 ;
        }
        System.out.println ("x равен " +x);
        for ( x = 0; x < 10; x = x+ 1) {
            System.out.print ("теперь х равен " + x );
        }
if (x == 10) {
    System.out.print("x должен быть равен 10 ");
} else {
    System.out.print("x не равен 10 ");
}
if ((x >3) & (name.equals("кинжал"))) {
    System.out.println("осторожно");

} */

        int x = 3;
        if (x == 3) {
            System.out.println("x должен равнятся 3");
        }
        System.out.println("эта строка выполняется в любом сдучае");

    }
}