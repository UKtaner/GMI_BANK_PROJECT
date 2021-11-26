@Customer's_Account_Management
Feature: Customer's_Account_Management
  Background: Navigation_To_Customer_My_Account_Page
    Given user is on the main page
    And user enters customer username
    And user enters customer password
    And user clicks on the Sign in button
    And user goes to My Operations dropdown
    And User goes to my accounts
  Scenario:User_should_see_all_accounttypes_and_balace_populated
    Then verify that user can see all account types and balance
    Then close the application

    Scenario: User_can_view_transaction
      And user open view transaction
      Then verify that user can see transaction details
      Then close the application


