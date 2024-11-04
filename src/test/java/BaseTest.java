import org.testng.annotations.*;

public class BaseTest {
    protected Calc calc;
    int counter = 0;

    @BeforeSuite
    public void beforeSuite(){
        calc = new Calc();
        counter++;
        System.out.println("before suite"+" "+counter);

    }
    @BeforeTest
    public void beforeTest(){
        counter++;
        System.out.println("before Test"+" "+counter);
    }

    @BeforeClass
    public void beforeClass(){
        counter++;
        System.out.println("before Class"+" "+counter);
    }

    @BeforeMethod
    public void beforeMethod(){
        counter++;
        System.out.println("before Method"+" "+counter);
    }

    @BeforeGroups
    public void beforeGroups(){
        counter++;
        System.out.println("before Groups"+" "+counter);
    }




    @AfterSuite
    public void afterSuite(){
        counter++;
        System.out.println("after suite"+" "+counter);

    }
    @AfterTest
    public void afterTest(){
        counter++;
        System.out.println("after Test"+" "+counter);
    }

    @AfterClass
    public void afterClass(){
        counter++;
        System.out.println("after Class"+" "+counter);
    }

    @AfterMethod
    public void afterMethod(){
        counter++;
        System.out.println("after Method"+" "+counter);
    }

    @AfterGroups
    public void afterGroups(){
        counter++;
        System.out.println("after Groups"+" "+counter);
    }

    @Test
    public void archTest1(){
        System.out.println("test"+" "+counter);
    }

    @Test
    public void archTest2(){
        System.out.println("test"+" "+counter);
    }
}
