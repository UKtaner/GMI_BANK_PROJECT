@StateAPI

Feature: User can Just create each state 1 by 1

  @CreateState
  Scenario Outline: create a state
    Given user sets the response api "https://www.gmibank.com/api/tp-states" and create state using "<id>" and "<name>"
    Then verify if "<name>" is created

    Examples:create state
    |id          |name|
    | 113914     |BC  |
    |   113806   |Alberta|
    |   113806   |Ontario|


