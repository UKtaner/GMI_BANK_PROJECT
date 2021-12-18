Feature: System should not allow to make updates with invalid credentials

  Scenario: : User is on the password change page
    Given user is logged-in as a customer with valid credentials
    And username is present on the main navigation menu
    When user activates user profiles menu from the main navigation
    And user selects Password from the opening menu
    Then verify user is on the right page
    Then verify username appears on the top of the page in the title




  Scenario: The old password should not be used

  Scenario: There should be at least 1 lowercase char for stronger password and
  see the level chart change accordingly

  Scenario: There should be at least 1 uppercase char and see the level  chart change accordingly

  Scenario: There should be at least 1 digit  and see the level  chart change accordingly

  Scenario: There should be at least 1 special char and see the level bar change accordingly

  Scenario: There should be at least 7 chars for a stronger password

  Scenario: The new passwoerd should be confirmed