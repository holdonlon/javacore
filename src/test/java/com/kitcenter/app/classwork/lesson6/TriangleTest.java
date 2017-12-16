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
    @Test
    public void checktest3(){
        boolean actResult = Triangle.checkSides(4,5,3);
        Assert.assertEquals(true,actResult);
    }

    @Test
    public void checktest4(){
        boolean actResult = Triangle.checkSides(5,4,3);
        Assert.assertEquals(true,actResult);
    }

    @Test
    public void checktest5(){
        boolean actResult = Triangle.checkSides(3,5,4);
        Assert.assertEquals(true,actResult);
    }
    @Test
    public void checktest6(){
        boolean actResult = Triangle.checkSides(5,12,13);
        Assert.assertEquals(true,actResult);
    }
    @Test
    public void checktest7(){
        boolean actResult = Triangle.checkSides(6,8,10);
        Assert.assertEquals(true,actResult);
    }
    @Test
    public void checktest8(){
        boolean actResult = Triangle.checkSides(10,15,18);
        Assert.assertEquals(false,actResult);
    }
    @Test
    public void checktest9(){
        boolean actResult = Triangle.checkSides(20,18,15);
        Assert.assertEquals(false,actResult);
    }
    @Test
    public void checktest10(){
        boolean actResult = Triangle.checkSides(44,58,99);
        Assert.assertEquals(false,actResult);
    }
}
