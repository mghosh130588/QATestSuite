package eshop.CucumberFramework.stepDefinitions;

import PageObject.BasePages.CatalogPage;
import PageObject.BasePages.LogInPage;
import eshop.CucumberFramework.Utils.ConfiguratorManager;
import eshop.CucumberFramework.Utils.DriverManager;
import eshop.CucumberFramework.Utils.TestComponent;
import eshop.TestAutomation.TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CatalogSteps{

    //public CatalogPage cp;
    //public WebDriver driver;

    TestComponent tc;

    public CatalogSteps(TestComponent tc) {
       this.tc = tc;
    }

    @Given("User opens  the landing page")
    public void user_opens_landing_page(){
        tc.driver = new DriverManager().initilizeDriver();
        tc.driver.manage().window().maximize();
        tc.driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
        tc.cp = new CatalogPage(tc.driver);
        tc.cp.goToUrl(ConfiguratorManager.getConfiguration().getProperty("url"));
        System.out.println("Url is opened");
   }

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        //cp = new CatalogPage(driver);
        WebElement brandimage =tc.cp.getBrandImage();
        Assert.assertTrue(brandimage.isDisplayed());
        System.out.println("User is on the landing page");


    }
    @When("User verify the catalog page is listed")
    public void user_verify_the_catalog_page_is_listed() {
        // Write code here that turns the phrase above into concrete actions
        tc.cp.getCatalogList();
        System.out.println("Catalog is displayed");

    }
    @Then("User should be able to find the list of products displayed.")
    public void user_should_be_able_to_find_the_list_of_products_displayed() {
        int totalItems = tc.cp.getNumberOfItemsdisplayedinCatalog();
        if(totalItems == 0){
            System.out.println("No products are displayed");
        }
        System.out.println("The total number of items in the catalog are " +totalItems);
    }

    @Then("User closes the browser.")
    public void teardown(){
        tc.driver.quit();
        System.out.println("User closes the browser");
    }






}
