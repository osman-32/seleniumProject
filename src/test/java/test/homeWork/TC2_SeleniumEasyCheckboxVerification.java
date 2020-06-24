package test.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TC2_SeleniumEasyCheckboxVerification {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        if (driver.findElement(By.id("txtAge")).isDisplayed()){
            System.out.println(" \"Success - Check box is checked \" message is displayed. FAILED! ");
        }else {
            System.out.println(" \"Success - Check box is checked \" message is NOT displayed. PASSED! ");
        }

        driver.findElement(By.id("isAgeSelected")).click();

        if (driver.findElement(By.id("txtAge")).isDisplayed()){
            System.out.println(" \"Success - Check box is checked \" message is displayed. PASSED! ");
        }else {
            System.out.println(" \"Success - Check box is checked \" message is NOT displayed. FAILED! ");
        }


    }
}
