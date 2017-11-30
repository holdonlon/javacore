package kitcenter.app.app.classwork.lesson5;

import com.kitcenter.app.classwork.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expresult = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        Assert.assertEquals(actualResult, expresult);
    }
}
