
Feature:Date should be created on the time of account creation

  Background: The employee must be logged in with a valid username and password
    Given user is on the main page
    Then user is logged-in as an employee with valid credentials
      | username       | password        |
      | team3employee2 | Team3employee2. |
    And  user goes to My Operations dropdown

    Scenario: TC_01_The date cannot be typed earlier in the past at the time of creation an account


    Then user clicks to Manage Accounts button
    Then user clicks Create a new Account button
    Then user enter "TRIAL ACCOUNT" in description and "1598" in the balance
    Then user enter earlier date in Create Date box
    Then user enter later date in End Date box
    Then user enter save button
     And verifies if new account created

  Scenario: TC_02_The date should be created as month, day, year, hour and minute

  Then user clicks to Manage Accounts button
  Then user clicks Create a new Account button
  Then user enter "TRIAL ACCOUNT2" in description and "8951" in the balance
  Then User create Date as month day year hour and minute and click Enter
  Then verify date  month day year format

  Scenario: TC_03 User can choose a user from the registration and it cannot be blank

    And clicks on Manage Customers
    Then user clicks the create a new customer button
    Then user enters a valid SSN number in SSNBox
    Then user clicks Search
    Then verifies if the boxes are blank or not


  Scenario: TC_04 User can choose an account created on manage accounts

    And user selects Manage Accounts
    Then user select an account by ID
    And verifies if this is an account

  Scenario: TC_05 User can select Zelle Enrolled optionally and save it

    And clicks on Manage Customers
    Then user select a customer by ID
    Then user clicks edit button on customer page
    Then User clicks Zelle Enrolled button and save button
    And user checks Zelle Enrolled changed








