package test;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class ExampleForWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://www.google.com");

        Thread.sleep(15000);

        driver.quit();
    }
}
