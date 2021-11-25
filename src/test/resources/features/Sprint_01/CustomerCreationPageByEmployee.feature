<<<<<<< HEAD
@customer_creation_by_employee


Feature: Date_Creation_Functionality

@date_creation
    Scenario: TC_1101_date_cannot_be_typed_earlier
        When user enters the date respectively
        |day|month|year|hour|minute|
        |24|11   |2021 |00  | 00   |
        Then Than user verifies current time is displayed
        Then take the screenshot
=======
@creation_by_employee_functionality
Feature: Date_Creation_Functionality

  Background: Navigating_to_the_customer_creation_page
    Given user is on the main page
    And user enters employee username
    And user enters employee password
    And user clicks on the sign in button
    And user goes to My Operations dropdown
    And clicks on Manage Customers
    And user clicks the create a new customer button
    And user enters SSN
    And user clicks Search button

    @US_09_TC_01_create_a_new_customer
  Scenario: Create_a_new_customer
   Then verify firstname, lastname, email,phone number, address is not blank

      @US_10_TC_01_address_cannot_be_left_blank
  Scenario: Address_cannot_be_left_blank
        Then verify address box is not blank

  @US_10_TC_02_Address_as_street_and_number_should_be_provided
  Scenario: Address_as_street_and_number_should_be_provided
    Then verify address box has letters and digits

  @US_10_TC_03_City_should_be_provided_and_cannot_be_left_as_blank
  Scenario: City_should_be_provided_and_cannot_be_left_as_blank
    Then verify city box is not blank

  @US_10_TC_04_Country_should_be_typed_and_cannot_be_blank
  Scenario: Country_should_be_typed_and_cannot_be_blank
    Then verify country box is not blank

  @US_10_TC_05_State_cannot_be_blank
  Scenario: State_cannot_be_blank
    Then verify state box is not blank

  @US_10_TC_06_State_should_be_provided_as_US_state
  Scenario: State_should_be_provided_as_US_state
    Then verify state box is provided as US state
  |Alabama|  Alaska|  Arizona|  Arkansas|  California|Colorado|  Connecticut|Delaware|  Florida|  Georgia|Hawaii|  Idaho|  IllinoisIndiana|Iowa|  Kansas|Kentucky|  Louisiana|  Maine|  Maryland|  Massachusetts|  Michigan|Minnesota|  Mississippi|  Missouri|  MontanaNebraska|  Nevada|New Hampshire|  New Jersey|  New Mexico|  New York|  North Carolina|  North Dakota|Ohio|  Oklahoma|  Oregon|  Pennsylvania|Rhode Island|  South Carolina|  South Dakota|  Tennessee|Texas|  Utah|Vermont|  Virginia|  Washington|  West Virginia|  Wisconsin|  Wyoming|




>>>>>>> master

    Scenario: TC_1102_date_cannot_be_typed_earlier
        When user enters "<year>" in the future
        Then user should see  an error "<outcome>" message

<<<<<<< HEAD
    Scenario: TC_1103_date_cannot_be_typed_earlier
=======
#    Given user provides  prerequisite  valid  credentials
#    |ssn|middleName|phoneNumber|zipCode|city|country|state|
#    |234-56-7890 |  Dain  |     123-456-7677| 2312      | london   |  UK       |   Abc  |
#    And user clicks on the search button
#    Then take the screenshot
#
#  @date_creation
#    Scenario: TC_1101_Date_Creation
#    Then Than user verifies current time is displayed
#    Then take the screenshot
#
#
>>>>>>> master

        When user enters "<year>" in the past
        Then user should see  an error "<outcome>" message

    Scenario: TC_1104_date_should_be_created_respectively

    Scenario: TC_1105_date_should_be_created_respectively
        When user provides month,day,year,hour and minute from excel respectively.
        Then user verify Create Date Box should not give any error message.

