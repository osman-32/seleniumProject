package test.v1_different_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {
    public static void main(String[] args) {
        // NOT FOR WINDWOS USERS!

        //1-We do not need to set Safari driver, becasue Saferi already comes with it
        //We just need to enable it from preferences
            /*
                 1- Open Safari
                 2- Preferences > Advanced > Show develop menu in menu bar
                 3- Go to Develop menu
                 4- Select: Allow remote automation
             */

        //2- Instantiating the driver
        // This line also opens the browser as well
        WebDriver driver=new SafariDriver();

        //3-Getting the URL we want to go
        driver.get("https://www.google.com");
    }
}
