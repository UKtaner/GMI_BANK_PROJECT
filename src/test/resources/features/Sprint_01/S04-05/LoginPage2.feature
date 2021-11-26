@login_test2
Feature: US_005_Login_Page_Should_Not_Be_Accessible_With_Invalid_Credentials

  Background: User_Is_On_The_GmiBank_Homepage
    Given user is on the main page
    And user clicks on sign in button


    @invalid_username
    Scenario:TC_0001_Sign_In_With_Invalid_Username
      And user enters user id "team"
      And user enters user password "Team3user."
      When user clicks on the Sign in button
      Then user see error message
      Then close the connection


      @invalid_password
  Scenario:TC_0002_Sign_In_With_Invalid_Password
        And user enters user id "team3user"
        And user enters user password "Team3"
        When user clicks on the Sign in button
    Then user see error message
    Then close the connection


        @invalid_credentials
  Scenario:TC_0003_Sign_In_With_Invalid_Username_And_Password
          And user enters user id "team"
          And user enters user password "Team3"
          When user clicks on the Sign in button
    Then user see error message
    Then close the connection


          @reset_password
  Scenario:TC_0004_Reset_Password
    When user clicks on "Did you forget your password?" button
    Then user enter a valid email
    When user clicks "Reset password" button
    Then close the connection


            @navigate_registration
  Scenario:TC_0005_Navigate_Registration_Page
    When user click on "You don't have an account yet? Register a new account" button
    Then user navigate to registration page
    Then close the connection

