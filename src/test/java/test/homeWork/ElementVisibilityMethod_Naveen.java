package test.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ElementVisibilityMethod_Naveen {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://register.freecrm.com/register/");
        //
        boolean b1= driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        System.out.println(b1);

        boolean b2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        System.out.println(b2);

        boolean b3=driver.findElement(By.id("terms")).isSelected();
        System.out.println(b3);

        driver.findElement(By.id("terms")).click();

        boolean b4= driver.findElement(By.id("terms")).isSelected();

        System.out.println(b4);


    }
}
