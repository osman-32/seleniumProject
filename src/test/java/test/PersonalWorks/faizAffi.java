package test.PersonalWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faizAffi {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://twitter.com/login");

        driver.findElement(By.name("session[username_or_email]")).sendKeys("ozy0003@auburn.edu");
        driver.findElement(By.name("session[password]")).sendKeys("t_0505256"+ Keys.ENTER);

        for(int i=0; i<10; i++) {
            driver.findElement(By.linkText("Tweet")).click();
            driver.findElement(By.cssSelector("div[class='notranslate public-DraftEditor-content']")).sendKeys("slm"+i);
            driver.findElement(By.cssSelector("div[class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("Tweet")).click();
            driver.findElement(By.cssSelector("div[class='notranslate public-DraftEditor-content']")).sendKeys("xts"+i);
            driver.findElement(By.cssSelector("div[class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")).click();
            Thread.sleep(3000);
        }
    }
}
