package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium  {
    public static void main(String[] args) throws InterruptedException {
        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
        //2-create the instance of the chromedriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //3-test if driver is working
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //BROWSER NAVIGATION
        Thread.sleep(2000); //this line adds 2000 milliseconds of wait=2seconds
        driver.navigate().back(); //this line will take the user to the previous page
        Thread.sleep(2000); //Thread.sleep is being added just to be able to see selenium movements
        driver.navigate().forward(); //this line will go to next step
        Thread.sleep(2000);

        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        Thread.sleep(10000);

        driver.close();


    }
}
