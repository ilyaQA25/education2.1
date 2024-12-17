import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ContextMenu extends BaseTest{
    @Test
    public void rightClick() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions action = new Actions(driver);

        WebElement elementForClick = waitsService.waitForVisibilityLocatedBy(By.id("hot-spot"));
        action.contextClick(elementForClick).perform();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"You selected a context menu");
        driver.switchTo().alert().accept();
    }
}
