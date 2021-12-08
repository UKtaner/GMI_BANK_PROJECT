@login_test
Feature: US_004_Login_Page_Should_Accessible_With_Valid_Credentials

  Background: User_Is_On_The_GmiBank_Homepage
    Given user is on the main page
    And user clicks on sign in button
    And user enters user id "team3user"
    And user enters user password "Team3user."

  @user_login_test
  Scenario: TC0001_Sign_In_With_Valid_Credentials
    When user clicks on the Sign in button
    Then user goes to user login page
    Then close the connection

    @login_cancel_test
  Scenario: TC_0002_Cancel_The_Login
    Then user clicks on the Cancel button
    Then user is on the main page
    Then close the connection




