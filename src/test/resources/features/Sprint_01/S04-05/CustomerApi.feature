@CustomerApi
Feature: Api data reading

  Background: set the api data into response
    Given user uses api end point "https://www.gmibank.com/api/tp-customers?=size=2000" to get all customer data


    Scenario: get api data and validate

      Given user should get all customer data and deserialized the data to java
      And user saves the customer data to correspondent files
      Then user needs to validate all customer api data