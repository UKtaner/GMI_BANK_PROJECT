@login_test
Feature: US_004_Login_Page_Should_Accessible_With_Valid_Credentials

  @user_login_test
  Scenario: TC0001_Sign_In_With_Valid_Credentials
    Given user is on the application page
    And user clicks on sign in button
    And user enters user id "<team3user>"
    And user enters user password "<Team3user.>"
    When user clicks on the Sign in button
    Then user goes to main page
    Then close the connection


  Scenario: TC_0002_Cancel_The_Login
    Given user is on the application page
    And user enters user id "<team3user>"
    And user enters user password "Team3user.>"
    Then user clicks on the Cancel button
    Then close the connection

