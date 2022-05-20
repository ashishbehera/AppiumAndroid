package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features"
,glue = "stepDefinitions"
,tags ="@smokeTest"
,   plugin = {"pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"
},
monochrome = true
)

public class TestRunnerCucumber extends AbstractTestNGCucumberTests {

}
