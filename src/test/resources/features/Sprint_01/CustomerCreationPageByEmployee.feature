
@customer_creation_by_employee
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

#taner==>start
  @US_11_TC_01_Date_cannot_be_typed_earlier_in_the_past_at_the_time_of_creation_a_customer
  Scenario: Date_cannot_be_typed_at_the_time_of_creation_a_customer
    When user enters the date respectively
      |day|month|year|hour|minute|
      |25|11   |2021 |00  | 00   |
    Then Than user verifies current time is displayed
    Then take the screenshot

  @US_11_TC_02_Date_cannot_be_typed_earlier_in_the_past_at_the_time_of_creation_a_customer
    Scenario: Date_cannot_be_typed_earlier_in_the_future
        When user enters "<year>" in the future
        Then user should see  an error "<outcome>" message

  @US_11_TC_03_Date_cannot_be_typed_earlier_in_the_past_at_the_time_of_creation_a_customer
    Scenario: Date_cannot_be_typed_earlier_in_the_past
        When user enters "<year>" in the past
        Then user should see  an error "<outcome>" message

  @US_11_TC_04_Date_should_be_created_as_month_day_year_hour_and_minute.
    Scenario: Date_should_be_created_as_day_month_year_hour_and_minute.
      When user provides the date as day,month,year,hour and minute respectively.
      Then user should see  an error "<outcome>" message

  @US_11_TC_05_Date_should_be_created_as_month_day_year_hour_and_minute.
    Scenario: TC_1105_date_should_be_created_respectively
        When user provides date as month,day,year,hour and minute respectively.
#        Then user verify Create Date Box should not give any error message.

  @US_11_TC_06_User_can_choose_a_user_from_the_registration_and_it_cannot_be_blank
  Scenario: User_cannot_be_blank
    When user clicks on the user dropdown and select a user
    Then verify a user is selected

  @US_11_TC_07_User_can_choose_an_account_created_on_manage_accounts
  Scenario: User_can_select_a_created_account
    When user clicks on the account dropdown and select an account

  @US_11_TC_08_User_can_select_Zelle_Enrolled_optionally_and_save_it
  Scenario: User_can_select_Zelle_Enrolled_button
    When user is able to click on the Zelle Enrolled button
    Then verify the user is able to click on Save button successfully

  @US_11_TC_09_User_can_select_Zelle_Enrolled_optionally_and_save_it
  Scenario: User_can_skip_Zelle_Enrolled_button
    When user should not click on the Zelle Enrolled button
    Then verify the user is able to click on Save button successfully

#taner==>end