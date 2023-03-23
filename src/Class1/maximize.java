package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {
        // connect to the WebDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instace of WebDriver
        WebDriver driver=new ChromeDriver();


        //go to google.com
        driver.get("https://www.google.com");

        //maximize the window
        driver.manage().window().maximize();

        //full screen
        driver.manage().window().fullscreen();
        

    }
}
