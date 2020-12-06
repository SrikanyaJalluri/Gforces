
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(

        plugin = {"pretty:target/test.html"},
         monochrome = true
)
@RunWith(Cucumber.class)
public class TestRunner
{

}
