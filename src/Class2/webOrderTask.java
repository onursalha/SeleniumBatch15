package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();


        // open up the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


        // send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        // click on the login button
        driver.findElement(By.className("button")).click();


    }
}
