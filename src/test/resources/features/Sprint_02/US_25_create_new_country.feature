Feature: System should allow new countries to be added to the country list

  Scenario Outline: Check if country is not already added to the list
    Given user has the "<API_endpoint>" for getting the country names list
    When user send a GET request to the API to get the names
    Then verifies "<country>" name is not on the list
    And content type is JSON
    And status code is 200

    Examples:
      | API_endpoint                          | country |
      | https://www.gmibank.com/api/tp-states | Bosna   |


    Scenario Outline: Add new country name to the countries list
      Given user has the "<API_endpoint>" for adding a new country
      When user send a POST request with new country name
      Then verify "<country>" has been added to the list
      And status code is 201

      Examples:
        | API_endpoint                          | country |
        | https://www.gmibank.com/api/tp-states | Bosna   |