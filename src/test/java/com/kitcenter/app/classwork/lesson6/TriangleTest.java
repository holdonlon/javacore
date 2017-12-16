package com.kitcenter.app.classwork.lesson6;

import com.kitcenter.app.homework.lesson6.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void checktest1(){
        boolean actResult = Triangle.checkSides(3,4,5);
        Assert.assertEquals( true, actResult);
    }

    @Test
    public void checktest2() {
        boolean actResult = Triangle.checkSides(4, 4, 4);
        Assert.assertEquals(false, actResult);
    }
}
