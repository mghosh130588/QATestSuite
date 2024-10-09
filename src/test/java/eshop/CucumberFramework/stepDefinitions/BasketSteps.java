package eshop.CucumberFramework.stepDefinitions;

import PageObject.BasePages.BasketPage;
import PageObject.BasePages.CheckOutPage;
import PageObject.BasePages.SuccessPage;
import PageObject.BasePages.UpdatePage;
import eshop.CucumberFramework.Utils.TestComponent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class BasketSteps {

    public BasketPage bp;
    public UpdatePage updatepg;
    TestComponent tc;
    String productname;
    public CheckOutPage review;
    public SuccessPage sp;

    public BasketSteps(TestComponent tc) {
        this.tc = tc;
    }

    @Then("User select the product name as {string} from the catalog and click Add to Basket")
    public void user_select_the_product_name_as_from_the_catalog_and_click_add_to_basket(String productname1) throws InterruptedException {
        productname = productname1.trim();
        bp = tc.cp.AddItemToBasket(productname);
        System.out.println("user selects the product and navigated to basket");

    }
    @Then("User is navigated to Basket page")
    public void user_is_navigated_to_basket_page() {
        String title = tc.driver.getTitle();
        String ExpectedTitle = "Basket - Microsoft.eShopOnWeb";
        Assert.assertEquals(title,ExpectedTitle);
        System.out.println("user is in basket");
    }
    @Then("User is able to find the product name in the basket")
    public void user_is_able_to_find_the_product_name_in_the_basket() {
        List<String> basketItemsList =bp.getItemsinBasket();
        System.out.println(basketItemsList);
        Assert.assertTrue(basketItemsList.contains(productname));
        System.out.println(productname+ "is present in the basket");

    }
    @Then("User updates number of items as {int}")
    public void user_updates_number_of_items_as(Integer quantity) {
        bp.updateNumberOfItems(String.valueOf(quantity));
        System.out.println("quantity is updated");
    }
    @Then("User clicks on update button")
    public void user_clicks_on_update_button() throws InterruptedException {
        updatepg = bp.clickUpdate();
        System.out.println("User is on the update page");

    }
    @Then("User is navigated to update page")
    public void user_is_navigated_to_update_page() {
        String validation = updatepg.getValidation();
        System.out.println(validation);
        Assert.assertTrue(validation.equalsIgnoreCase("Basket is empty."));
        System.out.println("The items is removed from basket");
    }
    @Then("User gets the validation message")
    public void user_gets_the_validation_message() {
        System.out.println("User get the validation");
    }

    @And("User clicks on CheckOut button")
    public void userClicksOnCheckOutButton() throws InterruptedException {
       review= bp.clickCheckout();
       System.out.println("User clicks on Check out");



    }

    @And("User is navigated to the Review Page")
    public void userIsNavigatedToTheReviewPage() {
        String headervar = review.getHeaderItemmessage();
        Assert.assertTrue(headervar.equalsIgnoreCase("Review"));
        System.out.println("User is navigated to checkout page");
    }

    @And("User clicks on Paynow button")
    public void userClicksOnPaynowButton() throws InterruptedException {
        sp =review.clickPayNow();
        System.out.println("User clicks on Pay Now Button");
    }

    @And("User gets the success message as {string} for placing the order")
    public void userGetsTheSuccessMessageAsForPlacingTheOrder(String Confirmation) {
        String successMessage = sp.getSuccessMessage();
        Assert.assertTrue(successMessage.equalsIgnoreCase(Confirmation.trim()));
        System.out.println("User Is successful in placing the order");
    }
}
