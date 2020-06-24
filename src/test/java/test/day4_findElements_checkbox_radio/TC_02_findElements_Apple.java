package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC_02_findElements_Apple {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com");
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
        List<WebElement> listLinks=driver.findElements(By.xpath("//body//a"));

        int linkWithText=0;
        int linkWithOutText=0;

        for (WebElement eachLink:listLinks){
            if(!eachLink.getText().isEmpty()) {
                linkWithText++;
                System.out.println(eachLink.getText());
            }else {
                linkWithOutText++;
            }
        }

        System.out.println("The number of links with text is "+linkWithText);
        System.out.println("The number of links without text is "+linkWithOutText);
        System.out.println("The number of total links is "+listLinks.size());

        Thread.sleep(15000);

        driver.quit();

    }
}
