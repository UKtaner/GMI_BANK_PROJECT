@US_06_UserInfo
Feature:User Info Functionality

  Background: User goes to login page
    Given user is on the main page
    And user enters user_id and user_password
      | username | password  |
      | gkcn_user  | gkcnuser. |

    And User click Sign in button


  Scenario: TC_01 There should be user info being populated when navigating to
  user info "firstname, lastname email and language"

    Given user open account menu
    And user click User Info
    Then Verify  the name in the First Name textbox is "gokcen"
    Then Verify  the  last name in the Last Name textbox is   "oz"
    Then Verify  the  email in the Email textbox is  "gkcn@xxx.com"
    Then Verify  the  selected language is "English"
   # Then user Sign out

  Scenario: TC_02 There should be 2 languages available "English and Turkish"
    Given user open account menu
    And user click User Info
    Then  Verify languages are available English and Turkish
    Then user Sign out


  Scenario: TC_03 There should be an option to update firstname
    Given user open account menu
    And user click User Info
    And  Click in the firstname box and type a new firstname
    And  user click save in button
    Then  Verify that firstname have been updated
    Then user Sign out


    Scenario: TC_04 There should be an option to update lastname
      Given user open account menu
      And user click User Info
      And  Click in the lastname box and type a new lastname
      And  user click save in button
      Then  Verify that lastname have been updated
      Then user Sign out

      Scenario: TC_05 There should be an option to update email id adding
      "@" sign and "." extension
        Given user open account menu
        And user click User Info
        And Click in the email box and type a new email
        And  user click save in button
        Then verify update by adding  "@" sign and "." extension to your email
        Then user Sign out