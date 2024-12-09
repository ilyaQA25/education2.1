import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class LaminateTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }

    @Test
    public void laminateCalc() throws InterruptedException {
        driver.get("https://home-ex.ru/calculation/");


        //WebElement collection = driver.findElement(By.xpath("//label[text()= 'Home Expert Parquet']"));
        WebElement collection = driver.findElement(By.xpath("//label[@for = 'calc-content-collection-item-2']"));
        collection.click();
        Thread.sleep(2000);
        WebElement  inputCalcRoomLength = driver.findElement(By.id("inputCalcRoomLength"));
        inputCalcRoomLength.clear();

        inputCalcRoomLength.sendKeys("400");

        WebElement  inputCalcRoomWidth = driver.findElement(By.id("inputCalcRoomWidth"));
        inputCalcRoomWidth.clear();
        inputCalcRoomWidth.sendKeys("500");
        WebElement laydownDirections = driver.findElement(By.xpath("//div[@class = 'trigger']"));
        laydownDirections.click();
        WebElement diagonal45 = driver.findElement(By.xpath("//li[@data-value = '45']"));
        diagonal45.click();

        WebElement  spaceFromWall = driver.findElement(By.id("inputCalcIndentatWalls"));
        spaceFromWall.clear();
        spaceFromWall.sendKeys("9");
        WebElement button = driver.findElement(By.xpath("//span[text() = 'Рассчитать']"));
        button.click();
        Thread.sleep(3000);






    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
