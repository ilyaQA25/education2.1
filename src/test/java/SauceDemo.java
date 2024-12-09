import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class SauceDemo {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void basicLocatorsCheck() throws InterruptedException {
        //BrowsersService browsersService = new BrowsersService();
        driver.get(ReadProperties.getUrl());
        Assert.assertTrue(driver.findElement(By.className("login_credentials")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.tagName("h4")).isDisplayed());

        WebElement button = driver.findElement(By.id("login-button"));
        WebElement username = driver.findElement(By.name("user-name"));
        WebElement password = driver.findElement(By.name("password"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        button.click();

        Assert.assertTrue(driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.partialLinkText("Bike Light")).isDisplayed());
        Thread.sleep(3000);

        //xpath
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='inventory_item_description']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Swag Labs']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'shopping')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(), 'superhero on with the Sauce Labs')]")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//footer/ancestor::div")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//footer/ancestor::div")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='header_container']/following::button")).isDisplayed());

    }

    @Test
    public void cssSelectorsTest() {
        driver.get(ReadProperties.getUrl());

        WebElement passw = driver.findElement(By.cssSelector("#password"));
        passw.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.cssSelector("[placeholder=Username]"));
        login.sendKeys("standard_user");
        WebElement buttton = driver.findElement(By.cssSelector(".submit-button.btn_action"));
        buttton.click();

    }
}