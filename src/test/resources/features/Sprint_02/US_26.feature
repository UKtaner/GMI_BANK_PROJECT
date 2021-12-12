

Feature: country update

  @updateCountry
  Scenario Outline: update country
    Given user sets the response api "https://www.gmibank.com/api/tp-countries" and update country using "<id>" and "<name>"
    Then verify if country "<name>" is updated

    Examples:update country
      |id        |name|
      | 103800   |USA |
      | 113945   |Canada|