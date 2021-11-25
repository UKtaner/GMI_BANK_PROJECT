@creation_by_employee_functionality
Feature: Date_Creation_Functionality

  Background: Navigating_to_the_customer_creation_page
    Given user is on the main page
    And user enters employee username
    And user enters employee password
    And user clicks on the sign in button
    And user goes to My Operations dropdown
    And clicks on Manage Customers
    And user clicks the create a new customer button
    And user enters SSN
    And user clicks Search button

    @create_a_new_customer
  Scenario: Create_a_new_customer
   Then verify firstname, lastname, email,phone number, address is not blank
#    Given user provides  prerequisite  valid  credentials
#    |ssn|middleName|phoneNumber|zipCode|city|country|state|
#    |234-56-7890 |  Dain  |     123-456-7677| 2312      | london   |  UK       |   Abc  |
#    And user clicks on the search button
#    Then take the screenshot
#
#  @date_creation
#    Scenario: TC_1101_Date_Creation
#    Then Than user verifies current time is displayed
#    Then take the screenshot
#
#




