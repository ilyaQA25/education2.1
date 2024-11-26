import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import services.AdvancedDriver;
import services.BrowsersService;
import services.SimpleDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void test() {
        SimpleDriver simpleDriver = new SimpleDriver();
        WebDriver driver = simpleDriver.getDriver();
        driver.quit();

    }


    @Test
    public void advancedDriverTest() throws InterruptedException {
        AdvancedDriver simpleDriver = new AdvancedDriver();
        WebDriver driver = simpleDriver.getDriver();

        driver.get("http://onliner.by");
        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void browserServiceTest() throws InterruptedException {
        BrowsersService browsersService = new BrowsersService();
        WebDriver driver = browsersService.getDriver();

        driver.get(ReadProperties.getUrl());

        WebElement search = driver.findElement(By.name("query"));
        //WebElement article = driver.findElement(By.name("b-tile-excerpt line-clamp-2"));
        WebElement honor = driver.findElement(By.className("project-navigation__honor"));
        //search.click();
        honor.click();
        //search.sendKeys("велосипед");
        //article.click();
        Thread.sleep(3000);


        driver.quit();
    }
}
