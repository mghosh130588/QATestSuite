Feature: Login functionality

  Background:
    Given User setup the browser configuration
    And User opens browser

@Smoke @Regression
  Scenario: Verify that the user is able to login successfully
    Given User opens  the landing page
    When User clicks on login button.
    And User enters the username and password.
    And User clicks on Log In.
    Then User is logged is successfully.
    And User is able to find the username on login.

@Regression
    Scenario: Verify that the user is able to logout successfully
      Given User is logged in the application.
      When User moves on the username dropdown.
      And Logout button is displayed in the dropdown.
      And User moves to LogOut option from the dropdown menu
      And User Clicks on LogOut button from menu.
      Then User is logged out from application
      And User comes to the landing page
      And User is able to find the Login Button



