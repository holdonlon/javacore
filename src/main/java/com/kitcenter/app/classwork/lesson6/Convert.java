package com.kitcenter.app.classwork.lesson6;

public class Convert {
    public void convert() {
        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < charArrayToString.length; i++) {
            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);
    }
}
