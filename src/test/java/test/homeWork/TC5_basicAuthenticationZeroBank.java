package test.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_basicAuthenticationZeroBank {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();

        if(driver.getPageSource().contains("username")){
            System.out.println("username is present");
        }else {
            System.out.println("username is absent");

        }

        if(driver.getTitle().equals("Zero - Account Summary")){
            System.out.println("The page's title is \"Zero - Account Summary\" ");
        }else {
            System.out.println("The page's title is NOT \"Zero - Account Summary\" ");
        }
        if(driver.findElement(By.linkText("Account Summary")).getAttribute("href").contains("account-summary")){
            System.out.println("PASSED!");
        }else {
            System.out.println("FAILED!");
        }


        Thread.sleep(150000);

        driver.quit();
    }
}
