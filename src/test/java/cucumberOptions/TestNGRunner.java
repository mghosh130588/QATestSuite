package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue =  "stepDefinitions",monochrome = true ,
        tags ="@Smoke and @Regression",
plugin = {"pretty", "html:reports/cucmberreports.html" ,"json:reports/cucmberreports.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
