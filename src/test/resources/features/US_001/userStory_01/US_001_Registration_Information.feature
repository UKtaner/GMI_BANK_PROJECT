#1-Given user navigate to webpage
#2-And user navigates to menu dropdown and click
#3-And user select  Register button
#4-And user goes to SSN box and enters  9 digits  number

Feature: US_001_Registration_Information

  @registration_info
  Scenario: TC_01_user_should_enter_own_information
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user select  Register button
    And user goes to SSN box and enters  9 digits  number
