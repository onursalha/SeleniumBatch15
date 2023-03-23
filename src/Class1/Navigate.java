package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
// connect to WebDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // iniiate the instace of Webdriver
        WebDriver driver=new ChromeDriver();

        // open google.com
        driver.get("https://www.google.com");
// slow down
        Thread.sleep(2000);

        // navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        // go back
        driver.navigate().back();
// slow down
        Thread.sleep(2000);

        // goto facebook
        driver.navigate().forward();

        //close the browser
        driver.close();
        driver.quit();



       Thread.sleep(2000);
        // refresh the page
        driver.navigate().refresh();


    }
}
