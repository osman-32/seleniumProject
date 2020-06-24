package test.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC3_SeleniumEasyCheckboxVerification {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkAllButton =driver.findElement(By.xpath("//input[@class='btn btn-primary']"));

        if (checkAllButton.getAttribute("value").equals("Check All")){
            System.out.println("\"Check All\" button text is Check All. VERIFIED!");
        }else {
            System.out.println("\"Check All\" button text is NOT Check All. FAILED!");
        }

        checkAllButton.click();

        List<WebElement> checkboxList= driver.findElements(By.xpath("//input[@class='cb1-element'] "));

        for(WebElement checkbox:checkboxList){
            if (checkbox.isSelected()){
                System.out.println("Checkbox is selected. PASS!");
            }else {
                System.out.println("Checkbox is NOT selected. FAILED!");
            }
        }
        if (checkAllButton.getAttribute("value").equals("Uncheck All")){
            System.out.println("Final verfirication PASSED!");
        }else {
            System.out.println("Final verification FAILED!");
        }

    }
}
