package eshop.CucumberFramework.cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/eshop/CucumberFramework/Features/",
        glue= "eshop/CucumberFramework/stepDefinitions",monochrome = true,
plugin = {"pretty", "html:reports/cucmberreports.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

   @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return  super.scenarios();
    }


}
