import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

import javax.sql.rowset.BaseRowSet;

public class BasicLocatorTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void basicLocators() throws InterruptedException {
        driver.get(ReadProperties.getUrl());
        driver.findElement(By.id("name")).sendKeys("iprez4031@gmail.com");
        driver.findElement(By.id("password")).sendKeys("2111999Przz#@!");
        driver.findElement(By.id("button_primary")).click();
        Thread.sleep(5000);
    }

    @Test
    public void basicLocatorsTest_2() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        // Find webElement by linkText
        driver.findElement(By.linkText("Forgot your password?")).click();

        // Find webElement by className
        driver.findElement(By.className("forgot_passwordpage-request-cancel")).click();

        // Find webElement by linkText
        driver.findElement(By.partialLinkText("your password?")).click();
    }

}
