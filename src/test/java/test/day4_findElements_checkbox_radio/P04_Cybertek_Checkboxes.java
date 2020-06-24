package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class P04_Cybertek_Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        if (!checkbox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 is selecetd. Verification FAILED!");
        }

        WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        if (checkbox2.isSelected()){
            System.out.println("Checkbox 2 is not selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is selecetd. Verification FAILED!");
        }
Thread.sleep(3000);
        checkbox1.click();
        checkbox2.click();

        if (checkbox1.isSelected()){
            System.out.println("Checkbox 1 is selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 is not selecetd. Verification FAILED!");
        }


        if (!checkbox2.isSelected()){
            System.out.println("Checkbox 2 is selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is not selecetd. Verification FAILED!");
        }



    }
}
