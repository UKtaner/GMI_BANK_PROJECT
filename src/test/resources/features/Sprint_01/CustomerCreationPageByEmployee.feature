@customer_creation_by_employee


Feature: Date_Creation_Functionality

@date_creation
    Scenario: TC_1101_date_cannot_be_typed_earlier
        When user enters the date respectively
        |day|month|year|hour|minute|
        |24|11   |2021 |00  | 00   |
        Then Than user verifies current time is displayed
        Then take the screenshot

    Scenario: TC_1102_date_cannot_be_typed_earlier
        When user enters "<year>" in the future
        Then user should see  an error "<outcome>" message

    Scenario: TC_1103_date_cannot_be_typed_earlier

        When user enters "<year>" in the past
        Then user should see  an error "<outcome>" message

    Scenario: TC_1104_date_should_be_created_respectively

    Scenario: TC_1105_date_should_be_created_respectively
        When user provides month,day,year,hour and minute from excel respectively.
        Then user verify Create Date Box should not give any error message.

