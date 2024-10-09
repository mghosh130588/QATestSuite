package eshop.CucumberFramework.stepDefinitions;

import PageObject.BasePages.LogInPage;
import eshop.CucumberFramework.Utils.TestComponent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps {



    TestComponent tc;

    public LoginSteps(TestComponent tc) {
        this.tc = tc;
    }



    @When("User clicks on Login Button")
    public void user_clicks_on_login_button() {
        tc.lp = tc.cp.clickloginButton();
        System.out.println("User has clicked on Login Button");

    }
    @When("User is navigated to Login Page")
    public void user_is_navigated_to_login_page() {
        WebElement headerIcon = tc.lp.getHeaderIcon();
        String headeertext = headerIcon.getText();
        Assert.assertEquals(headeertext,"Log in");
        System.out.println("User has been navigated to login Page");

    }
    @When("User enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String Username, String password) {
        tc.lp.enterEmail(Username);
        tc.lp.enterPassword(password);
        System.out.println("User entered Username and password");

    }
    @When("User clicks on Log In")
    public void user_clicks_on_log_in() {
       tc.lp.clickOnLogin();
        System.out.println("User clicked on Login");

    }
    @Then("User is successfully logged in the application")
    public void user_is_successfully_logged_in_the_application() {
        WebElement username = tc.cp.getIdentityUsername();
        String usernametext = username.getText();
        //Assert.assertEquals(usernametext,);
        System.out.println("login successful" +usernametext);

    }
    @Then("User navigates to Logout menu")
    public void user_navigates_to_logout_menu() {
        tc.driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        tc.cp.moveToLogoutMenu();
        WebElement logout = tc.cp.displayLogoutButton();
        Assert.assertTrue(logout.isDisplayed());
        System.out.println("logout button is displayed");

    }
    @Then("User clicks on Logout")
    public void user_clicks_on_logout() {
        tc.cp.clickLogoutButton();
        System.out.println("User clicked on Logout");
    }
    @Then("User is logged out successfully")
    public void user_is_logged_out_successfully() {
        Assert.assertTrue(tc.cp.getIdentityUsername().isDisplayed());
        System.out.println("logout button is Successful");

    }

}
