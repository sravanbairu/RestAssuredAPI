Feature: Fetch Bitcoin value in GBP from Coinbase

  As a user
  I want to make a GET call to the Coinbase API
  To get the current price for Bitcoin and print the Bitcoin rate in GBP


  Scenario: Get Bitcoin value in GBP
    Given the Coinbase API endpoint for GBP value is available
    When I request the Bitcoin value in GBP
    Then the response status code should be 200
    And the Bitcoin value should be fetched successfully


