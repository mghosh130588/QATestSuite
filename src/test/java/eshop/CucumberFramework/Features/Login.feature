Feature: Login and LogOut Functionality
  Background:
    Given User opens  the landing page

    Scenario: Verify that the user is able to login and log out successfully
      Given User is on landing page
      When User clicks on Login Button
      And User is navigated to Login Page
      And User enters email as "demouser@microsoft.com" and password as "Pass@word1"
      And User clicks on Log In
      Then User is successfully logged in the application
      And User navigates to Logout menu
      And User clicks on Logout
      And User is logged out successfully

