
@customers_info
Feature: Employee_can_manage_Customers_info

  Background:
    Given user is on the main page
    And user enters employee username
    And user enters employee password
    When user clicks on the sign in button
    Then user goes to My Operations dropdown
    And clicks on Manage Customers

  Scenario: TC_1201_Populating_Account_Info_of_Customers
    Then verify the Customer is displayed
    Then close the application

  Scenario: TC_1202_Employee_navigates_through_view_button
    When user clicks on view button
    Then verify the edit button is displayed
    Then close the application

    Scenario: TC_1203_Employee_populates_through_edit_button
      When user clicks on edit button
      Then verify the Create or edit a Customer is displayed
      Then close the application

#      Scenario: TC_1204_Allow_employee_to_create_user_info
#        When user clicks on edit button
#        Then verify if creating new Customer Information is possible
#        Then close the application

    Scenario: TC_1205_Allow_employee_to_update_user_info
      When user clicks on edit button
      Then user updates all table required fields
      And click on save button
      Then verify if updating new Customer Information is possible
      Then close the application

    Scenario:  TC_1206_Employee_can_delete_user
      When user clicks on delete button
      Then verifying a pop up message about deletion
      Then click on delete button on pop up
      Then close the application

