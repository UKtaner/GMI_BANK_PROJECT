Feature: read app

  Scenario: read all applications
    Given Given  user go to api end point registrations "https://www.gmibank.com/api/tp-account-registrations"
    And user get all registrations data and De-Serialization the data to java
    Then user validates 3.th registrations info
