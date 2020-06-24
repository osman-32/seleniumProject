package test.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_forgotPasswordUrlVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("ararat_32@hotmail.com");
        driver.findElement(By.tagName("i")).click();

       if( driver.getCurrentUrl().contains("email_sent")){
           System.out.println("Verification \"email_sent\" is PASSED!");
       }else {
           System.out.println("Verification \"email_sent\" is FAILED!");
       }

       if (driver.findElement(By.tagName("h4")).getText().equals("Your e-mail's been sent!")){
           System.out.println("The textbox displayed content IS as expected");
       }else{
           System.out.println("The textbox displayed content is NOT as expected");
       }




        Thread.sleep(15000);

        driver.quit();
    }
}
