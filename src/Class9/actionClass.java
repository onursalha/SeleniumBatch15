package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) {


        //        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        //go to amazon
        driver.get("http://amazon.com");

        WebElement en=driver.findElement(By.xpath("//div[text()='EN']"));
        //action class

        Actions action=new Actions(driver);

        action.moveToElement(en).perform();

    }
}
