@customer_creation_by_employee




# taner==> start

Feature: Date_Creation_Functionality
     Background:Navigating_to_the_customer_creation_page

      Given user provides  prerequisite  valid  credentials
      |ssn         |middleName|phoneNumber |zipCode|city  |countryId|state|
      |234-56-7890 | Dain     |234-456-1234|  1234 |London|  UK     |YJET |

      And user clicks on the search button
      Then take the screenshot

 @date_creation
      Scenario : TC_1101_Date_Creation

        Then user verifies current time is displayed
        Then take the screenshot





#taner==>end