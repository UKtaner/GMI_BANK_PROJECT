@Registration-API
  Feature: Api data reading
    Background: set the api data into response
    Given user uses end point "https://www.gmibank.com/api/tp-account-registrations" to get all customer data

      Scenario: get api data end validate
        Given user should get all register data and deserialize the data to java
        And user saves the register data to correspondent files
        Then user needs to validate all register api data
