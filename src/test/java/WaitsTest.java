import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsTest extends BaseTest{

    @Test
    public void presencseOfElement(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement botton = waitsService.waitForElementClickable(By.tagName("button"));
        botton.click();
        Assert.assertTrue(waitsService.waitForElementInvisible(botton));

        WebElement loading = waitsService.waitForVisibilityLocatedBy(By.id("loading"));
        Assert.assertTrue(loading.isDisplayed());

        Assert.assertTrue(waitsService.waitForElementInvisible(loading));

        Assert.assertEquals(waitsService.waitForVisibilityLocatedBy(By.id("finish")).getText(), "Hello World!");
    }
}
