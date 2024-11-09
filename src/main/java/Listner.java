import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

    public void onTestFailure(ITestResult result) {
        System.out.println("making screenshot...");
    }




}
