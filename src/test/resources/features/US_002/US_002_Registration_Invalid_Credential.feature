#1-Given user navigate to webpage
#2-And user navigates to menu dropdown and click
#3-And user selects  Register button
#4-And user selects to SSN box and be left blank
#5-Then user should see "Please enter your social security number." error message

Feature: US_002_System should not allow anyone to register with invalid credentials

  Background: User is on the registration page
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user selects  Register button



  Scenario: TC_01_user_select_SSN_box_and_be_left_blank
  And user selects to SSN box and be left blank
  Then user should see "Please enter your social security number." error message

  @ssn_test
  Scenario: TC_02_user_enters_invalid_SSN
    Given user enters invalid SSN that contains character or space
    Then user  should see error message

  Scenario: TC_02_user_enters_invalid_phone_number

    When user enters Phone Number that contains character or space
    Then user should see "Your mobile phone number is invalid." error message

