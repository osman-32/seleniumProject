package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO2_Apple_FindElements {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");

        WebElement iphoneLink = driver.findElement(By.xpath("//span[.='iPhone']/.."));
        iphoneLink.click();

        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));
        int linksWithoutText=0;
        int linksWithText=0;

        for (WebElement link:allLinks){
            String textOfLinks=link.getText();
            System.out.println(textOfLinks);
            if(textOfLinks.isEmpty()){
                linksWithoutText++;
            }else {
                linksWithText++;
            }
        }

        System.out.println("Number of links without texts ===>"+linksWithoutText);
        System.out.println("Number of links with texts===>"+linksWithText);
        System.out.println("Number of total links ===>"+allLinks.size());

    }
}
