import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = "smoke")
    public void stepB(){
        System.out.println("stepB");
    }

    @Test(groups = "regress")
    public void step2(){
        System.out.println("step 2");
    }

    @Test(groups = "regress")
    public void step11(){
        System.out.println("step 11");
    }

    @Test(groups = {"regress","smoke"})
    public void stepD(){
        System.out.println("step D");
    }

    @Test(groups = "smoke")
    public void stepC(){
        System.out.println("step C");
    }
}
