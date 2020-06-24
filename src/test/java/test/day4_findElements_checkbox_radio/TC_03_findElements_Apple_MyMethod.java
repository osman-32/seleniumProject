package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC_03_findElements_Apple_MyMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");

        ArrayList<WebElement> listOfHeaders=new ArrayList<>();
            listOfHeaders.add(driver.findElement(By.xpath("//body//a[@class='ac-gn-link ac-gn-link-mac']")));
            listOfHeaders.add(driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-ipad']")));
            listOfHeaders.add(driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")));
            listOfHeaders.add(driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']")));
            listOfHeaders.add(driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']")));
            listOfHeaders.add(driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-music']")));
            listOfHeaders.add(driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-support']")));
        ArrayList<String> nameOfTabs=new ArrayList<>(Arrays.asList("Mac", "iPad", "iPhone", "Watch","TV","Music", "Support"));

            int totalText=0;
            int totalWithoutText=0;
            int totalLink=0;
            int i=0;

         for (WebElement eachElement:listOfHeaders) {

             int linkWithText=0;
             int linkWithOutText=0;
            eachElement.click();
             List<WebElement> listOfLinks=driver.findElements(By.xpath("//body//a"));
             totalLink+=listOfLinks.size();
             for (WebElement each:listOfLinks){
                 if(!each.getText().isEmpty()){
                     linkWithText++;
                 }else {
                     linkWithOutText++;
                 }
             }
             System.out.println(nameOfTabs.get(i)+" header has "+ linkWithText +" links with text." );
             System.out.println(nameOfTabs.get(i)+" header has "+ linkWithOutText +" links without text." );
             totalText+=linkWithText;
             totalWithoutText+=linkWithOutText;
             i++;

         }

        System.out.println("The number of link that doesn't have text is "+totalWithoutText);
        System.out.println("The number of link that has text is "+totalText);
        System.out.println("The number of link is "+totalLink);
    }
}
