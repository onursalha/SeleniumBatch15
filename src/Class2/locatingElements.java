package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

//       open the Website facebook.com
        driver.get("https://www.facebook.com/");

        // send in username
        driver.findElement(By.id("email")).sendKeys("onon");

// send the password
        driver.findElement(By.name("pass")).sendKeys("abcdef123");

        // click on button Create an account

       // driver.findElement(By.linkText("Create new account")).click();

        //click on forgotten password

        driver.findElement(By.partialLinkText("password")).click();

        driver.quit();

    }
}
