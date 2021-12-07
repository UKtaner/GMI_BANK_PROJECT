Feature: Money should be available

  Background: The user must be logged in with a valid username and password
    Given user is on the main page
    Then user is logged-in as an employee with valid credentials
      | username | password |
      | Asimbul  | Asi432!  |
    And  user goes to My Operations dropdown

Scenario: User should have at least two accounts

  Then user goes to My Accounts
  And checks if has two or more accounts
Then user Sign out
  Scenario: User can select the first account  dropdown where they receive their money from

    Then click on Transfer Money button
  Then from dropdown menu select saving
    And  To dropdown box select a saving account
  Then send a balance amount
    And write description text box
   Then click make transfer button
    And validate the message
   #Then user Sign out
