Feature: User is able to Add to basket and checkout product

  Background:
    Given User opens  the landing page

    Scenario Outline: Verify that the user is able to add the products in the basket
      Given User is on landing page
      When User clicks on Login Button
      And User is navigated to Login Page
      And User enters email as "demouser@microsoft.com" and password as "Pass@word1"
      And User clicks on Log In
      Then User select the product name as "<ProductName>" from the catalog and click Add to Basket
      And User is navigated to Basket page
      And User is able to find the product name in the basket
      And User updates number of items as 0
      And User clicks on update button
      And User is navigated to update page
      And User gets the validation message



      Examples:
        | ProductName         |
        | Prism White T-Shirt |
        | Roslyn Red Sheet    |


Scenario: Verify that the user is able to add to cart and checkout for a product
  Given User is on landing page
  When User clicks on Login Button
  And User is navigated to Login Page
  And User enters email as "demouser@microsoft.com" and password as "Pass@word1"
  And User clicks on Log In
  Then User select the product name as "Roslyn Red Sheet" from the catalog and click Add to Basket
  And User is navigated to Basket page
  And User is able to find the product name in the basket
  And User updates number of items as 2
  And User clicks on CheckOut button
  And User is navigated to the Review Page
  And User clicks on Paynow button
  And User gets the success message as "Thanks for your Order!" for placing the order




