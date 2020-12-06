package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.BasePage;


public class DriverFactory
{
   public static WebDriver driver;



   public static WebDriver getDriver()
   {
       if (driver == null) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.manage().window().maximize();
       }


       return driver;
   }

   public static void closeDriver()
   {
       driver.quit();
       driver = null;
   }
}
