Feature: Catalog Page Test

  Background:
    Given User opens  the landing page

Scenario: Verify the user is able to retreive the catalog list


  Given User is on landing page
  When User verify the catalog page is listed
  Then User should be able to find the list of products displayed.

