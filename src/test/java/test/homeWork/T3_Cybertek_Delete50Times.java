package test.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class T3_Cybertek_Delete50Times {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement addElement=driver.findElement(By.xpath("//button[.='Add Element']"));

        for (int i=0; i<50; i++){
            addElement.click();
        }

        List<WebElement> listOfDeleteButtons=driver.findElements(By.xpath("//button[.='Delete']"));
        System.out.println("Number of delete buttons on the page: "+listOfDeleteButtons.size());

        WebElement deleteButton= driver.findElement(By.xpath("//button[.='Delete']"));

        for (WebElement button:listOfDeleteButtons){
            button.click();
        }

        try{
            if (!deleteButton.isDisplayed()){
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
