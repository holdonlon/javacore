package com.kitcenter.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {
    public void floatToChar(float float1 ){
        char char1 = (char) float1;
        System.out.println("Input float value is" + float1 +" . Output char value is " + char1);

    }
    public void intToChar(int int1){
        char char1 = (char) int1;
        System.out.println("Input int1 value is" + int1 +" . Output char value is " + char1);

    }
    public void charTolnt (char char1){
        int int1 = char1;
        System.out.println("Input char value is" + char1 +" . Output int value is " + int1);

    }
}

