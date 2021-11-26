
@ssn_test_invalid
Feature: US_002_System should not allow anyone to register with invalid credentials

  Background: User is on the registration page
    Given user goes the GMI-bank webpage
    And user goes to menu dropdown and click
    And user clicks  Register button



  Scenario: TC_01_user_select_SSN_box_and_be_left_blank
  And user selects to SSN box and be left blank
  Then user should see "Please enter your social security number." error message


  Scenario: TC_02_user_enters_invalid_SSN
    Given user enters invalid SSN that contains character or space
    Then user should see "Please enter your social security number." error message

  Scenario: TC_03_user_enters_invalid_phone_number

    Given user enters Phone Number that contains character or space
    Then user should be able to see "Your mobile phone number is invalid." error message

  Scenario: TC_04_user_enter_invalid_email
    When user enters email without "@" and "."
    Then user should see  "Your email is invalid." this error message.