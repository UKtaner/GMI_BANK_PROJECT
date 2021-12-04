Feature: System_should_allow_Admin_to_manage_a_customer

  Background: Navigating_the_home_page
    Given admin on home page
    And admin go login page
    And admin enter the username "team3manager"
    And admin enter password "Team3manager."
    Then admin goes user-management page
    Then admin goes page

    Scenario: All customers should show up on informations
      Then manager goes manager customers page
      Then manager check sees FirstName
      Then manager check sees LastName
      Then manager check sees Middle Initial
      Then manager check sees Email
      Then manager check sees Mobile Phone Number
      Then manager check sees Phone Number
      Then manager check sees Address
      Then manager check sees Create Date

