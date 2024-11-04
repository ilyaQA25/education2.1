import org.testng.annotations.Test;

public class DependencyTest {

    @Test()
    public void stepB(){
        System.out.println("stepB");
    }

    @Test(dependsOnMethods = "stepB")
    public void step2(){
        System.out.println("step 2");
    }

    @Test(dependsOnMethods = "step2")
    public void step11(){
        System.out.println("step 11");
    }

    @Test
    public void stepD(){
        System.out.println("step D");
    }

    @Test(dependsOnMethods = {"step11", "stepD"})
    public void stepC(){
        System.out.println("step C");
    }
}
