import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls extends BaseTest {
    @Test
    public void dynamic() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        Actions action = new Actions(driver);

        WebElement removeCheckbox = waitsService.waitForElementClickable(By.xpath("//*[@onclick='swapCheckbox()']"));

        //first part of the task; working fine sdfsd
        action.click(removeCheckbox).perform();
        WebElement messageCheckboxAndInput = waitsService.waitForVisibilityLocatedBy(By.id("message"));
        messageCheckboxAndInput.isDisplayed();
        waitsService.waitForElementGone(By.id("checkbox"));

        //second part
        WebElement input = waitsService.waitForVisibilityLocatedBy(By.xpath("//input[@type='text']"));
        Assert.assertFalse(input.isEnabled());
        WebElement runInput = waitsService.waitForVisibilityLocatedBy(By.xpath("//*[@onclick='swapInput()']"));
        runInput.click();
        WebElement messageInput = waitsService.waitForVisibilityLocatedBy(By.id("message"));
        messageInput.isDisplayed();
        Assert.assertTrue(input.isEnabled());
    }
}
