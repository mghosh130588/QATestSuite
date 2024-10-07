Feature: Catalog Page Test



Scenario: Verify the user is able to retreive the catalog list
  Given User opens  the landing page
  When User is on landing page
  And User verify the catalog page is listed
  Then User should be able to find the list of products displayed.
