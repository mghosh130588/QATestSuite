Feature:  Checkout functionality

  Scenario: Verify that the user is able to checkout a product from catalog
    Given User is logged in the application.
    When User finds the product from catalog
    And User is navigated to Basket page
    And User updates the number of Quantity
    And User clicks on CheckOut button
    Then User is navigated to Review page
    And User clicks on paynow button
    And User receives the confirmation message

    Scenario Outline: Verify that the user is able to add multiple products in the basket
      Given User is logged in the application with "<Username>" and "<Password>"
      When User finds the product "<ProductName>" from catalog
      And User clicks on Add to Cart button
      And User is navigated to Basket page
      Then User verifies that the Product is present in the basket
      And User updates the quantity to 0
      And User clicks on Update button
      And User is navigated to Basket is Empty screen

      Examples:
         | Username               | Password   | ProductName               |
         | demouser@microsoft.com | Pass@word1 | Sheet                     |
         | demouser@microsoft.com | Pass@word1 | Prism White T-Shirt       |
         | demouser@microsoft.com | Pass@word1 | .NET Bot Black Sweatshirt |



