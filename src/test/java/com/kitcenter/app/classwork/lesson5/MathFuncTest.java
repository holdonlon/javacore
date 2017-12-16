package com.kitcenter.app.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void multiplyTest(){
        int a = 1, b = 3, expRes = 3;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.multiply (a,b);
        Assert.assertEquals(expRes, actRes);

    }

    @Test
    public void multiplyTest2(){
     int a = 2, b = 3,expRes = 6;
     MathFunc mathFunc = new MathFunc();
     int actRes = mathFunc.multiply(a,b);
     Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void multiplyTest3(){
        int a = 1073741824, b = 4, expRes = 0;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.multiply(a, b);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void multyplyTest4(){
        int a = - 1073741824, b = 4, expRes = 0;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.multiply(a,b);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void sumTest(){
        int a = 200, b = 300, expRes = 500;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.sum(a,b);
        Assert.assertEquals(expRes,actRes);

    }
    @Test
    public void slashTest(){
        int c = 8;
        int d = 3;
        double expRes = 2.666;
        MathFunc mathFunc = new MathFunc();
        double actRes = mathFunc.slash (c,d);
        Assert.assertEquals(expRes,actRes, 0.001);
    }
    @Test
    public void powerTest(){
        int a = 2, b =32;
        double expRes = 4294967296d;

        MathFunc mathFunc =new MathFunc();
        double actRes = mathFunc.power(a,b);
        Assert.assertEquals(expRes,actRes,0.001);
    }

}
