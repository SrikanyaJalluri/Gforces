package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverUtils
{

    public static void navigateToUrl(String url)
    {
      DriverFactory.driver.navigate().to(url);
    }

    public static void pageRefresh()
    {
        DriverFactory.driver.navigate().refresh();
    }

    public static String getPageTitle()
    {
        return DriverFactory.driver.getTitle();

    }

    public static void clickOnButton(String buttonName) {
        DriverFactory.getDriver().findElement(By.linkText(buttonName)).click();
    }
}
