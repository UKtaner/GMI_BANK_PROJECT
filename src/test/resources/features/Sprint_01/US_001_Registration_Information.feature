

@background
Feature: US_001_Registration_Information

Background: user_goes_to GMI_bank_webpage_and_goes_dropdown_menu_and_select_register_button
Given user goes to webpage
And user navigates to menu dropdown and click
And user select  Register button

  Scenario: TC_01_user_should_enter_SSN_number

    And user goes to SSN text box and enters SSN number


  Scenario: TC_02_user_should_enter_the_firstname
    Given user enters first name
    Then user should not see any error message at firstname box


  Scenario: TC_03_user_should_enter_the_lastname
    Given user enters last name
    Then user should not see any error message at lastname box


  Scenario: TC_04_user_should_enter_the_address
    Given user enters a valid address
    Then user should see an error message at address box


  Scenario: TC_05_user_should_enter_phone_number
    Given user enters phone number
    Then user should see an error message at Phone Number box


  Scenario: TC_06_user_should_enter_username
    Given user enters Username
    Then user should see an error message at Username box


  Scenario: TC_07_user_should_enter_email
    Given user enters Email
    Then user should not see an error message

