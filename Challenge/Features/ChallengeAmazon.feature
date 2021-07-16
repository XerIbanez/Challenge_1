Feature:Amazon Testing for Challenge
  Scenario: Search, Add and Delete Item
    Given a user goes to Amazon
    Given a User searches for a Samsung Galaxy Note
    When results are displayed, user stores the first item's price
    Then opens the first result and stores the price displayed
    And adds item to cart
    And goes to Cart and verifies the price of the phone
    But Deletes Item

  Scenario: Search elements in Echo Support
    Given a user goes to Amazon
    And goes to Sign in page
    And fills form with Customer information
    When clicks on Conditions of Use
    Then Searches Echo support
    And opens Echos support and verifies elements 