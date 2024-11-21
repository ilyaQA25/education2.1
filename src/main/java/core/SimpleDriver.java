package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriver {
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/ilya2.0/IdeaProjects/lesson7_hw/src/test/resources/chromedriver");
        return new ChromeDriver();
    }
}
