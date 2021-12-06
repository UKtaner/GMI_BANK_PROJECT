@StateAPI

Feature: User can Just create each state 1 by 1

  Background: Set the api url
    Given the url is "https://www.gmibank.com/api/tp-states"

    Scenario: Creating state data and validation
      Given the user can create new state data
      And  all state data will be saved to file
      Then verify all state data newly created