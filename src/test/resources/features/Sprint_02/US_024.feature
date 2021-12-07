@StateAPI

Feature: User can Just create each state 1 by 1

  @CreateState
  Scenario Outline: create a state
    Given user sets the response api "https://www.gmibank.com/api/tp-states" and create state using "<id>" and "<name>"

    Examples:create state
    |id     |name|
    | 113914     |BC|

      @updateCountry
      Scenario Outline: update country
      Given user sets the response api "https://www.gmibank.com/api/tp-countries" and update country using "<id>" and "<name>"

        Examples:update country
          |id       |name|
          | 103800   |USA|
