package com.kitcenter.app.classwork.lesson6;

import com.kitcenter.app.homework.lesson6.Triangle;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class TriangleTest {
    @Test
    @Parameters({
            "3, 4, 5",
            "4, 5, 3",
            "5, 4, 3",
            "3, 5, 4",
            "5, 12, 13",
            "6, 8, 10",
    })
    public void checktestOK(double sideA, double sideB, double sideC) {
        boolean actResult = Triangle.checkSides(sideA, sideB, sideC);
        Assert.assertEquals(true, actResult);
    }

    @Test
    @Parameters({
            "4, 4, 4",
            "10, 15, 18",
            "20, 18, 15",
            "44, 58, 99",
    })
    public void checktestFail(double sideA, double sideB, double sideC) {
        boolean actResult = Triangle.checkSides(sideA, sideB, sideC);
        Assert.assertEquals(false, actResult);
    }
}
