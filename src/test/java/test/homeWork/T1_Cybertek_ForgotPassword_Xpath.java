package test.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T1_Cybertek_ForgotPassword_Xpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //a[@href='/']
        //a[.='Home']
        WebElement HomeLink=driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgotPasswordHeader=driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement emailLabel=driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailInput=driver.findElement(By.xpath("//input[@type='text']"));
        WebElement retrieveButton=driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement footerText=driver.findElement(By.xpath("//a[.='Cybertek School']"));

        if(HomeLink.isDisplayed() && forgotPasswordHeader.isDisplayed() && emailLabel.isDisplayed() && emailInput.isDisplayed() && retrieveButton.isDisplayed() && footerText.isDisplayed()  ){
            System.out.println("All of the webElements are displayed. PASS!");
        }else {
            System.out.println("One or more of the webElements are not displayed. FAIL!");
        }
    }
}
