package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_LinkTextLocator {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        // 1-Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // 2-Go to: https://google.com
        driver.findElement(By.linkText("Gmail")).click();
        // 3-Click to Gmail from top right.
        // 4-Verify title contains:Expected: Gmail
        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail title verification passed!");
        }else{
            System.out.println("Gmail title verification failed!");
        }
        // 5-Go back to Google by using the .back();
        driver.navigate().back();
        // 6-Verify title equals:Expected: Google
        if(driver.getTitle().equals("Google")){
            System.out.println("Google title verification passed!");
        }else{
            System.out.println("Google title verification failed!");
        }

    }
}
