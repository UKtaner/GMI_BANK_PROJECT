
Feature: Date_Creation_Functionality

  Background: Navigating_to_the_customer_creation_page
    Given user provides  prerequisite  valid  credentials
    |ssn|middleName|phoneNumber|zipCode|city|country|state|
    |234-56-7890 |  Dain  |     123-456-7677| 2312      | london   |  UK       |   Abc  |
    And user clicks on the search button
    Then take the screenshot

  @date_creation
    Scenario: TC_1101_Date_Creation
    Then Than user verifies current time is displayed
    Then take the screenshot






