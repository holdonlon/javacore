package com.kitcenter.app.classwork.lesson6;

import com.kitcenter.app.homework.lesson6.EvenOrOdd;
import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {
    @Test
    public void evenoroddTest(){
        boolean actResult = EvenOrOdd.checkEven(2);
        Assert.assertEquals(true,actResult);
    }

}
