@CountryApi

Feature: System should allow new countries to be added to the country list

    Scenario Outline: Add new country name to the countries list
      Given user has the endpoint "<endpoint>" and create "<country>" "<name>"
      Then verify "<country>" has been added to the list, status code 201

      Examples:
        | name | country | endpoint |
        | name | Bosxna   | https://www.gmibank.com/api/tp-countries |