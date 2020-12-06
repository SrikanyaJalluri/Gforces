package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage
{
    WebDriver driver;

    @FindBy(id="gender-male") public WebElement  maleRadioBtn;

    @FindBy(id="gender-female") public WebElement   femaleRadioBtn;

    @FindBy(id="FirstName") public WebElement  firstNameTextBox;

    @FindBy(name = "LastName") public WebElement  lastNameTextBox;

    @FindBy(id="Email") public WebElement  emailTextBox;

    @FindBy(id="Password") public WebElement  passwordTextBox;

    @FindBy(id="ConfirmPassword") public WebElement  confPasswordTextBox;

    @FindBy(id="register-button") public WebElement  registerBtn;

    @FindBy(name="DateOfBirthDay") public WebElement  dobDropdown;

    @FindBy(name="DateOfBirthMonth") public WebElement  monthDropdown;

    @FindBy(name="DateOfBirthYear") public WebElement  yearDropdown;

    @FindBy(css = "div.result") public WebElement resultText;



    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickMaleRadioBtn()
    {
        maleRadioBtn.click();
    }

    public void clickFemaleRadioBtn()
    {
       femaleRadioBtn.click();
    }

    public void enterFirstName(String enterFN)
    {
        firstNameTextBox.sendKeys(enterFN);
    }

    public void enterLastName(String enterLN)
    {
        lastNameTextBox.sendKeys(enterLN);
    }

    public void enterEmail(String enterEmail)
    {
        emailTextBox.sendKeys(enterEmail);
    }
    public void enterPassword (String enterPW)
    {
        passwordTextBox.sendKeys(enterPW);

    }
    public void enterConfirmPassword(String enterConfPW)
    {
        confPasswordTextBox.sendKeys(enterConfPW);

    }
    public void clickRegisterBtn()
    {
        registerBtn.click();

    }


    public void selectDate()
    {
        Select date = new Select(dobDropdown);
        date.selectByIndex(18);
    }

    public void selectMonth()
    {
        Select month = new Select(monthDropdown);
        month.selectByValue("1");
    }

    public void selectYear()
    {
        Select year = new Select(yearDropdown);
        year.selectByValue("1987");
    }


    public String getRegisterConfMsg()
    {
        return resultText.getText();
    }









}
