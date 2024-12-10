import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsTest extends BaseTest{
    //doesnt work
    @Test
    public void actionsTest(){
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);

        List<WebElement> targetElement = waitsService.waitForAllVisibleElementsLocatedBy(By.className("figure"));
        actions.moveToElement(targetElement.get(0))
                .click(waitsService.waitForExists(By.cssSelector("[href='users/2']")))
                .build()
                .perform();
        Assert.assertTrue(waitsService.waitForVisibilityLocatedBy(By.xpath("//h1[text()='Not Found']")).isDisplayed());

    }

    //working fine
    @Test
    public void actionsTestCheckbox() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        Actions actions = new Actions(driver);

        List<WebElement> targetElement = waitsService.waitForAllVisibleElementsLocatedBy(By.cssSelector("#checkboxes input"));
        actions.moveToElement(targetElement.get(0))
                .click()
                .build()
                .perform();
        Thread.sleep(3000);
        Assert.assertTrue(targetElement.get(0).isSelected());

    }

    @Test
    public void dragNDrop() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        WebElement target = waitsService.waitForVisibilityLocatedBy(By.id("column-a"));
        WebElement source = waitsService.waitForVisibilityLocatedBy(By.id("column-b"));



        actions
                .dragAndDrop(target, source)

                .build()
                .perform();
        Thread.sleep(3000);
    }
}
