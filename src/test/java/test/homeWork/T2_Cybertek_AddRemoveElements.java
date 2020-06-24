package test.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T2_Cybertek_AddRemoveElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        WebElement deleteButton=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete Button is displayed. PASS!");
        }else {
            System.out.println("Delete Button is NOT displayed. FAIL");
        }

        try{
            deleteButton.click();
            if (deleteButton.isDisplayed()){
                System.out.println("Delete Button is NOT displayed afterclicking. PASS!");
            }else {
                System.out.println("Delete Button  is displayed after clicking. FAILED");
            }

        }catch (StaleElementReferenceException exception){
            System.out.println("StaleElementReferenceException has been thrown");
            System.out.println("It means element has been completely deleted from the HTML.");
            System.out.println("Delete button is not displayed. Verification PASSED!");
        }


    }
}
