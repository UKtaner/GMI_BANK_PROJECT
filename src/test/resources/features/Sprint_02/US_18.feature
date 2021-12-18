Feature: System_should_allow_Admin_to_manage_a_customer

  Background: Navigating_the_home_page
    Given admin on home page
    And admin go login page
    And admin enter the username "team3manager"
    And admin enter password "Team3manager."
    Then manager goes manager customers page

  Scenario:TC_01 All customers should show up on informations
    Then manager check sees FirstName
    Then manager check sees LastName
    Then manager check sees Middle Initial
    Then manager check sees Email
    Then manager check sees Mobile Phone Number
    Then manager check sees Phone Number
    Then manager check sees Address
    Then manager check sees Create Date

  Scenario:TC_02 There should be a View option where customer can be navigated to all customer info and see
  edit button there
    Then manager check all View pages Is there a edit button inside

  Scenario:TC_03 Then manager check all page Is there a Edit button
    Then manager check all page Is there a Edit button

    @customerInfo
  Scenario: TC_04 The Edit portal can allow user to create or update the user info
    Then manager goes Create customer page customer page
    Then manager Enter a First Name
    Then manager Enter a Last Name
    Then manager Enter a Middle Initial
    Then manager Enter a Email
    Then manager Enter a Mobile Phone Number
    Then manager Enter a Phone Number
    Then manager Enter a Zip Code
    Then manager Enter a Address
    Then manager Enter a City
    Then manager Enter a Ssn
    Then manager Enter a Country
    Then manager Enter a State
    Then manager Enter a User
    Then manager Enter a Account
    Then manager click Zelle Enrolled
    Then manager click Save button
    Then manager check the customer info

  @customerInfo
    Scenario: TC_05 The Edit portal can allow user to create or update the user info
      Then manager goes Edit customer page
      Then manager Enter a First Name
      Then manager Enter a Last Name
      Then manager Enter a Middle Initial
      Then manager Enter a Email
      Then manager Enter a Mobile Phone Number
      Then manager Enter a Phone Number
      Then manager Enter a Zip Code
      Then manager Enter a Address
      Then manager Enter a City
      Then manager Enter a Ssn
      Then manager Enter a Country
      Then manager Enter a State
      Then manager Enter a User
      Then manager Enter a Account
      Then manager click Save button
      Then manager check the customer info

    Scenario: TC_06 User can delete a customer, but seeing a message if the user is sure about deletion
      Then manager click delete button
      Then manager confirm and click delete again