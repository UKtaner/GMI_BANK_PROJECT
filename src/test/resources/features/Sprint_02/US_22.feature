@read_and_validate_states
  Feature: Read all states you created and validate them from your data set
    Scenario Outline:
      Given User read the state from "<endpoint>" and extension "<id>"
      Then User validates the "<state>"
      Examples:
      |endpoint|id|state|
      |https://www.gmibank.com/api/tp-states|/103694|xxxxxxxVirginiaxxxxx|