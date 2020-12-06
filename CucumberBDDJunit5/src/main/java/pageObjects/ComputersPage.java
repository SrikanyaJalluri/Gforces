package pageObjects;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.DriverFactory;
import utils.DriverUtils;

import java.util.List;

public class ComputersPage
{
    WebDriver driver;




    @FindBy(linkText = "Log out") public WebElement logoutLink;

    @FindBy(tagName = "h1") public List<WebElement> header;
    @FindBy(id = "name") public WebElement name;
    @FindBy(id = "introduced") public WebElement introduced;
    @FindBy(id = "discontinued") public WebElement discontinued;
    @FindBy(id = "company") public WebElement company;
    @FindBy(xpath = "//input[@value='Create this computer']") public WebElement submit;



    public ComputersPage()
    {

        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
        Assert.assertEquals("Checking the page title", "Add a computer", header.get(1).getText());
    }




    public void clickLogoutLink()
    {
        logoutLink.click();
    }

    public boolean verifyLogin()
    {
        return logoutLink.isDisplayed();
    }



    public void enterData(String computerName, String introDate, String disDate, String manu) {
        name.sendKeys(computerName);
        introduced.sendKeys(introDate);
        discontinued.sendKeys(disDate);
        (new Select(company)).selectByVisibleText(manu);
    }

    public void submitData() {
        submit.click();
    }
}
