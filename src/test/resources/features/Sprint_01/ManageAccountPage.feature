@account_page
Feature: Employee_can_create_a_new_Account

  Background:
    Given user is on the main page
    And user enters employee username
    And user enters employee password
    When user clicks on the sign in button
    Then user goes to My Operations dropdown
    And clicks on Manage Accounts
    And user Click “+Create a new Account” button


  Scenario: TC_0001_User_should_create_a_description_for_the_new_account_and_it_cannot_be_blank
    When User should not fill “description” area.
    And user enter 5000 in “Balance” box
    And User click “Save” button.
    Then user verifies “This field is required.” message should show up under the Description box

  Scenario: TC_0002_User should create a description for the new account and it cannot be blank
    When User should fill “description” area.
    And user enter 5000 in “Balance” box
    And User click “Save” button.
    Then User verifies successfull pop up message on the page


  Scenario: TC_0003_User_should_provide_a_balance_for_the_first_time_account_creation_as_Dollar
    When user should not enter any value in “Balance” box
    And User click “Save” button.
    Then user verifies “This field is required.” message should show up under the “Balance” box

  Scenario: TC_0004_User_should_provide_a_balance_for_the_first_time_account_creation_as_Dollar
    When user should enter 5000 in “Balance” box
    And User click “Save” button.
    Then User verifies successfull pop up message on the page


  Scenario: TC_0005_User_can_select_an_account_type_as_CHECKING_SAVING_CREDIT_CARD_or_INVESTING
    When user Click “+Create a new Account” button
    And User should fill “description” area.
    And user enter 5000 in “Balance” box
    And User select account type as a “SAVING” from “account type” box
    And User click “Save” button.
    Then User verifies successfull pop up message on the page


  Scenario: TC_0006_Account_status_should_be_defined_as_ACTIVE_SUSPENDED_or_CLOSED
    When user Click “+Create a new Account” button
    And User should fill “description” area.
    And user enter 5000 in “Balance” box
    And User select  as “SUSPENDED” from “account status type” box
    And User click “Save” button.
    Then User verifies successfull pop up message on the page


  Scenario: TC_0007_User_can_select_an_employee_from_the_drop_down_Optional
    When user Click “+Create a new Account” button
    And User should fill “description” area.
    And user enter 5000 in “Balance” box
    And User select  as “ACTIVE” from “account status type” box
    And user click and select an employee from “Employee”dropdown
    And User click “Save” button.
    Then User verifies successfull pop up message on the page

