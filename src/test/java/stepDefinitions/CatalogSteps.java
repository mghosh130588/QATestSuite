package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class CatalogSteps {

    public WebDriver driver;
    @Given("User opens  the landing page")
    public void user_opens_the_landing_page() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.get("http://localhost:5106/");
        System.out.println("User opened the Url");


    }
    @When("User is on landing page")
    public void user_is_on_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        WebElement brandimage = driver.findElement(By.xpath("//img[@src ='/images/brand.png']"));
        Assert.assertTrue(brandimage.isDisplayed());
        System.out.println("User is on the landing page");
        driver.quit();

    }
    @When("User verify the catalog page is listed")
    public void user_verify_the_catalog_page_is_listed() {

    }
    @Then("User should be able to find the list of products displayed.")
    public void user_should_be_able_to_find_the_list_of_products_displayed() {


    }
    @When("User clicks on login button.")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User is logged is successfully.")
    public void user_is_logged_is_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User is able to find the username on login.")
    public void user_is_able_to_find_the_username_on_login() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User moves on the username dropdown.")
    public void user_moves_on_the_username_dropdown() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("Logout button is displayed in the dropdown.")
    public void logout_button_is_displayed_in_the_dropdown() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User moves to LogOut option from the dropdown menu")
    public void user_moves_to_log_out_option_from_the_dropdown_menu() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User Clicks on LogOut button from menu.")
    public void user_clicks_on_log_out_button_from_menu() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User clicks on Add to Cart button")
    public void user_clicks_on_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("User is logged in the application.")
    public void user_is_logged_in_the_application() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User finds the product from catalog")
    public void user_finds_the_product_from_catalog() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User finds the product {string} from catalog")
    public void user_finds_the_product_from_catalog(String string) {

    }


}
