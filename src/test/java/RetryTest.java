import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest extends BaseTest{

    private int attempt =2;

    @Test(retryAnalyzer = Retry.class)
    public void flackyTest(){
        if (attempt ==3){
            Assert.assertTrue(true);
        }else {
            attempt++;
            System.out.println("Attempt is: " + attempt);
            attempt++;
            throw new NullPointerException();
        }
    }
}
