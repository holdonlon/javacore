package com.kitcenter.app.homework.runners.lesson4;

import com.kitcenter.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class PrimitiveConvertorRunner {
    public static void main(String[] arg){
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.intToChar(64);
        convertor.floatToChar(64.5f);
        convertor.charToInt('@');

    }
}