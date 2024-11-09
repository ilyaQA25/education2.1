import data.StaticProvider;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.beans.ExceptionListener;
import java.util.List;
import java.util.Random;

public class CalcTest extends BaseTest{
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("calcTest started");
    }

    @Test(testName = "fdgаdsdf")
    public void testSum(){
        Assert.assertEquals(calc.sum(2,3), 5, "wrong sum");
    }
    @Test()
    public void testDivInt() {
        try {
            Assert.assertEquals(calc.division(10, 0), 10, "wrong div");
        } catch (ArithmeticException e) {
            System.out.println("b == 0");
        }
    }

    @Test(testName = "test for division to 0")
    public void testDivToZero(){
        try {
            Assert.assertEquals(calc.division(21.0, 0), 7.0, "wrong div");
        } catch (AssertionError error) {
            System.out.println(error);
        }
    }

    @Test(testName = "division")
    public void testDiv(){
        Assert.assertEquals(calc.division(8.0,0),2.0);
    }

    @Test(description = "test with descript")
    public void testDescript(){
        Assert.assertEquals(calc.sum(2,3), 5, "wrong sum");
    }

    @Test(testName = "RENAMED TEST")
    public void testName(){
        Assert.assertEquals(calc.sum(2,3), 5, "wrong sum");
    }

    @Test(timeOut = 1000)
    public void testTimeOut() throws InterruptedException{
        Thread.sleep(500);
    }

    @Test(invocationCount = 3, threadPoolSize = 3)
    public void testInvocation() throws InterruptedException{
        Thread.sleep(new Random().nextInt(500));

    }


    @Test(dataProvider = "data for Sum", dataProviderClass = StaticProvider.class)
    public void testDataProvider(int a, int b, int expectedRes){
        Assert.assertEquals(calc.sum(a,b),expectedRes, "wrong sum");

    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExeption(){
        List list = null;
        int siz = list.size();

    }

}
