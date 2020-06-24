package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P01_MerriamWebster_FindElements {
    public static void main(String[] args) {
        //TC #0: FINDELEMETNS
        // 1. Open Chrome browser
        // 2. Go to https://www.merriam-webster.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Implicit wait will wait UP TO given seconds. If page is loaded before it will continue
        driver.get("https://www.merriam-webster.com/");
        // 3. Print our the texts of all links
        // we are creating a List of WebElements and storing values returned
        List<WebElement> listOfLinks= driver.findElements(By.xpath("//body//a"));
        int linksWithoutText=0;
        int linksWithText=0;
        for (WebElement eachLink:listOfLinks){
            if (eachLink.getText().isEmpty()){
                linksWithoutText++;
            }else {
                linksWithText++;
                System.out.println(eachLink.getText());
            }
        }
        System.out.println("========================================================");
        //4. Print how many link is missing text
        System.out.println("The number of links which doesn't have text is "+linksWithoutText);
        // 5. Print out how many link has text
        System.out.println("The number links which has text is "+linksWithText);
        // 6. Print out how many total link
        System.out.println("The total number of links is "+listOfLinks.size());
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.quit();
    }
}
