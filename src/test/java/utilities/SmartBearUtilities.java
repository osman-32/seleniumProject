package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtilities {
    public static void login(WebDriver driver){
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        // 3.Enter username: “Tester”
        inputUsername.sendKeys("Tester");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        // 4.Enter password: “test”
        inputPassword.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        // 5.Click to Login button
        loginButton.click();
    }
}
