@Email_Language
  Feature: Email and Language Check
    Background: User goes to login page
      Given user is on the main page
      And User provide valid username
      And  User provide valid password
      And User click Sign in button


    Scenario:  TC_01 Email id cannot contain just digits or chars without "@" sign or "." extension

      Given user open account menu
      And user click User Info
      And Click in the email box and type a new email not adding @ sign and . extension to your email
      And  user click save in button
      Then verify that user account can not update with invalid email address
      Then user Sign out

      Scenario: TC_02 There should not be an option of any other language other than English or Turkish

        Given user open account menu
        And user click User Info
        And user give an option language dropdown
        Then verify that there is no option other than English and Turkish


