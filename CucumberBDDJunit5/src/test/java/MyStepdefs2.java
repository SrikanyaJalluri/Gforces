

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ComputersPage;
import utils.DriverFactory;
import utils.DriverUtils;

public class MyStepdefs2 {


    String URL = "http://computer-database.herokuapp.com/computers";
    ComputersPage computersPage;


    @Before
    public void setUp()
    {
        DriverFactory.getDriver();

    }

    @After
    public void tearDown()
    {

        DriverFactory.closeDriver();

    }

    @Given("I navigate to the computer database app")
    public void iNavigateToTheComputerDatabaseApp() {
        DriverUtils.navigateToUrl(URL);
    }

    @When("I select \"([^\"]*)\"")
    public void iSelect(String buttonName) {
        DriverUtils.clickOnButton(buttonName);
    }

    @Then("I land in page with heading \"([^\"]*)\"")
    public void iLandInPageWithHeading(String heading) {
        computersPage = new ComputersPage();
    }


    @And("select to submit the data to add new computer")
    public void selectToSubmitTheDataToAddNewComputer() {
        computersPage.submitData();

    }

    @Then("I should see the \"([^\"]*)\"")
    public void iShouldSeeTheMessage(String message) {

    }




    @And("^add new computer with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void addNewComputerWithAnd(String computerName, String introDate, String disDate, String manu) throws Throwable {
       computersPage.enterData(computerName,introDate,disDate,manu);

    }
}
