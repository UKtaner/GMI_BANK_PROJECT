#Go to Main Page
#Click on Sign in Button
#Enter a valid Employee Username to the Username textbox
#Enter a valid Employee Password to the Password textbox
#Click on Sign in button
#Go to My Operations Dropdown List
#Click on Manage Customers
#Then Verify given account information's on Test Objective

@populating_customer_info
Feature: Populating_Account_Info_of_Customers

  Scenario: employee_should_see_customer_info
    Given user is on the main page
    And user enters employee username
    And user enters employee password
    When user clicks on the sign in button
    Then user goes to My Operations dropdown
    And clicks on Manage Customers
    Then verify the Customer is displayed
    Then close the application
