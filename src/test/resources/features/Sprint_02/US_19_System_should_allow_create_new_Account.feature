@US_19_createAccount
Feature:User creation

  Background: User goes to login page
    Given user is on the main page
    And user enters user_id and user_password
      | username | password |
      | adminG   | adminG.  |

    And User click Sign in button

  Scenario Outline:
    And admin click manage accounts
    And admin creates a new account
    And admin types a des."<description>"
    And admin types the balance "<balance>"
    And admin select an account type "<type>"
    And admin select an account status "<status>"
    And admin select an employee "<employee>"
    And admin save account



    Examples:
      | description | balance | type        | status   | employee |
      | helloooo    | 200     | CREDIT_CARD | CHECKING | employee  |