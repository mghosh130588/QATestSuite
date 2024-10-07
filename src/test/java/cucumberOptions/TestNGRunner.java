package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue="stepDefinitions",monochrome = true ,
plugin = {"pretty", "html:reports/cucmberreports.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
