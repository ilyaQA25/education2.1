import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitsService;

import java.time.Duration;

public class Upload extends BaseTest{
    @Test
    public void upload(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));

        WebElement fileUpload = wait.waitForVisibilityLocatedBy(By.id("file-upload"));
        String pathToFile = Upload.class.getClassLoader().getResource("tst.png").getPath();
        System.out.println(pathToFile);
        fileUpload.sendKeys(pathToFile);
        wait.waitForExists(By.id("file-submit")).submit();

        WebElement fileName = waitsService.waitForExists(By.id("uploaded-files"));
        Assert.assertEquals(fileName.getText(),"tst.png");

    }
}
