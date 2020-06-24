package test.day3_cssSelector_xpath;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {
    public static void main(String[] args) {
        // Search Amazon
        //1. Open browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        //3 Enter any search  term (use cssSelector to locate serach box)

        WebElement amazonSarch=driver.findElement(By.cssSelector("input[tabindex='19']"));
        amazonSarch.sendKeys("wooden spoon");


    }
}
