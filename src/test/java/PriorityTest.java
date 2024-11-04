import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    public void stepB(){
        System.out.println("stepB");
    }

    @Test(priority = 5)
    public void step2(){
        System.out.println("step 2");
    }

    @Test
    public void step11(){
        System.out.println("step 11");
    }

    @Test
    public void stepD(){
        System.out.println("step D");
    }

    @Test
    public void stepC(){
        System.out.println("step C");
    }

}
