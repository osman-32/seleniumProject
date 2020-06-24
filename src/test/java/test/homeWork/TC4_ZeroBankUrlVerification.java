package test.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_ZeroBankUrlVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        if(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href").contains("/forgot-password.html")){
            System.out.println("Attribute value is EXPECTED");
        }else {
            System.out.println("Attribute value is NOT expected");
        }


        Thread.sleep(150000);

        driver.quit();
    }
}
