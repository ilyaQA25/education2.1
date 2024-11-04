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

    @Test
    public void testSum(){
        Assert.assertEquals(calc.sum(2,3), 5, "wrong sum");
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
