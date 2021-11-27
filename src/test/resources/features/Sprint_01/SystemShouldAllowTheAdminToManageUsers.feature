@admin_can_manager_users
Feature: Admin_Control_Functionality

  Background: Navigating_the_home_page
    Given admin on home page
    And admin go login page
    And admin enter the username
    And admin enter password
    Then admin goes user-management page
    Then admin goes page


  @user_activate
  Scenario:TC001_Admin_can_activate_a_role_as_user
    Then admin goes page
    Then admin activate user
    Then admin refresh the page
    Then admin check is user activated

  @employee_activate
  Scenario:TC002_Admin_can_activate_a_role_as_employee
    Then admin goes page
    Then admin activate employee
    Then admin refresh the page
    Then admin check is employee activated

  @manager_activate
  Scenario:TC003_Admin_can_activate_a_role_as_manager
    Then admin goes page
    Then admin activate manager
    Then admin refresh the page
    Then admin check is manager activated

  @admin_activate
  Scenario:TC004_Admin_can_activate_a_role_as_admin
    Then admin goes page
    Then admin activate admin
    Then admin refresh the page
    Then admin check is admin activated

  @admin_details
  Scenario: TC005_Admin_can_view_all_user_info_admin
    Then admin goes page
    Then admin goes admin details page
    Then admin check firstname
    Then  admin check lastname
    Then admin check admin profiles

  @manager_details
  Scenario: TC006_Admin_can_view_all_user_info_manager
    Then admin goes page
    Then admin goes manager details page
    Then admin check firstname
    Then  admin check lastname
    Then admin check manager profiles

  @manager_details
  Scenario: TC007_Admin_can_view_all_user_info_employee
    Then admin goes page
    Then admin goes employee details page
    Then admin check firstname
    Then  admin check lastname
    Then admin check employee profiles

  @user_details
  Scenario: TC008_Admin_can_view_all_user_info_user
    Then admin goes page
    Then admin goes user details page
    Then admin check user firstname
    Then  admin check user lastname
    Then admin check user profiles

    @admin_edit
    Scenario: TC009_Admin_can_edit_all_user_info_admin
      Then admin goes admin edit page
      Then admin enter new login value "team3admin"
      Then admin enter new firstname value "tester"
      Then admin enter new lastname value "team3"
      Then admin enter new email value "team3_@team.com"
      Then admin change language english
      Then admin come back page
      Then admin goes page
      Then admin check admin values

  @manager_edit
  Scenario: TC010_Admin_can_edit_all_user_info_manager
    Then admin goes manager edit page
    Then admin enter new login value "team3manager"
    Then admin enter new firstname value "tester"
    Then admin enter new lastname value "team3"
    Then admin enter new email value "team3____@team.com"
    Then admin change language english
    Then admin come back page
    Then admin goes page
    Then admin check manager values

  @employee_edit
  Scenario: TC011_Admin_can_edit_all_user_info_employee
    Then admin goes employee edit page
    Then admin enter new login value "team3employee"
    Then admin enter new firstname value "tester"
    Then admin enter new lastname value "team3"
    Then admin enter new email value "team3__@team.com"
    Then admin change language english
    Then admin come back page
    Then admin goes page
    Then admin check employee values

  @user_edit
  Scenario: TC012_Admin_can_edit_all_user_info_user
    Then admin goes user edit page
    Then admin enter new login value "team3user"
    Then admin enter new firstname value "tester"
    Then admin enter new lastname value "team3"
    Then admin enter new email value "team3@team.com"
    Then admin change language english
    Then admin come back page
    Then admin goes page
    Then admin check user values

    @admin_delete
    Scenario: TC013_Admin_can_delete_all_user_info_admin
      Then admin goes users page
      Then admin select admin delete button
      Then admin select delete button again
      Then  admin check the admin deleted

  @manager_delete
  Scenario: TC014_Admin_can_delete_all_user_info_manager
    Then admin goes users page
    Then admin select manager delete button
    Then admin select delete button again
    Then  admin check the manager deleted

  @employee_delete
  Scenario: TC015_Admin_can_delete_all_user_info_employee
    Then admin goes users page
    Then admin select employee delete button
    Then admin select delete button again
    Then  admin check the employee deleted

  @user_delete
  Scenario: TC016_Admin_can_delete_all_user_info_user
    Then admin goes users page
    Then admin select user delete button
    Then admin select delete button again
    Then  admin check the user deleted

