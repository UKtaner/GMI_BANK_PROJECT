@admin_can_manager_users @smoke
Feature: Admin_Control_Functionality

  Background: Navigating_the_home_page
    Given admin on home page
    And admin go login page
    And admin enter the username "team3admin"
    And admin enter password "Team3admin."
    Then admin goes user-management page
    Then admin goes page

    @admin_create_test_users @smoke
  Scenario Outline: admin_go_page
    Then admin click new account
    Then admin create a test accounts login "<login>"
    Then admin create a test accounts first name "<firstname>"
    Then admin create a test accounts last name "<lastname>"
    Then admin create a test accounts email "<email>"
    Then admin create a test accounts profile "<profiles>"
    Then admin save changes

    Examples: Test Data
      | login        | firstname    | lastname | email                    | profiles      |
      | tt3_admin    | tt3_admin    | team3    | team3admin@gmail.com     | ROLE_ADMIN    |
      | tt3_user     | tt3_user     | team3    | team3user@gmail.com      | ROLE_USER     |
      | tt3_employee | tt3_employee | team3    | team3employee@gmail.com  | ROLE_EMPLOYEE |
      | tt3_manager  | tt3_manager  | team3    | team3manager@gmail.com  | ROLE_MANAGER  |


  @user_activate @smoke
  Scenario:TC001_Admin_can_activate_a_role_as_user
    Then admin activate user
    Then admin refresh the page
    Then admin check is user activated

  @employee_activate @smoke
  Scenario:TC002_Admin_can_activate_a_role_as_employee
    Then admin activate employee
    Then admin refresh the page
    Then admin check is employee activated

  @manager_activate @smoke
  Scenario:TC003_Admin_can_activate_a_role_as_manager
    Then admin activate manager
    Then admin refresh the page
    Then admin check is manager activated

  @admin_activate @smoke
  Scenario:TC004_Admin_can_activate_a_role_as_admin
    Then admin activate admin
    Then admin refresh the page
    Then admin check is admin activated

  @admin_details @smoke
  Scenario: TC005_Admin_can_view_all_user_info_admin
    Then admin goes admin details page
    Then admin check firstname "tt3_admin"
    Then  admin check lastname
    Then admin check admin profiles

  @manager_details @smoke
  Scenario: TC006_Admin_can_view_all_user_info_manager
    Then admin goes manager details page
    Then admin check firstname "tt3_manager"
    Then  admin check lastname
    Then admin check manager profiles

  @employee_details @smoke
  Scenario: TC007_Admin_can_view_all_user_info_employee
    Then admin goes employee details page
    Then admin check firstname "tt3_employee"
    Then  admin check lastname
    Then admin check employee profiles

  @user_details @smoke
  Scenario: TC008_Admin_can_view_all_user_info_user
    Then admin goes user details page
    Then admin check firstname "tt3_user"
    Then  admin check lastname
    Then admin check user profiles

  @admin_edit @smoke
  Scenario: TC009_Admin_can_edit_all_user_info_admin
    Then admin goes admin edit page
    Then admin enter new login value "tt3_admin"
    Then admin enter new firstname value "tester"
    Then admin enter new lastname value "team3"
    Then admin enter new email value "tt3admin@team.com"
    Then admin change language english
    Then admin come back page
    Then admin goes page
    Then admin check admin values

  @manager_edit @smoke
  Scenario: TC010_Admin_can_edit_all_user_info_manager
    Then admin goes manager edit page
    Then admin enter new login value "tt3_manager"
    Then admin enter new firstname value "tester"
    Then admin enter new lastname value "team3"
    Then admin enter new email value "tt3manager@team.com"
    Then admin change language english
    Then admin come back page
    Then admin goes page
    Then admin check manager values

  @employee_edit @smoke
  Scenario: TC011_Admin_can_edit_all_user_info_employee
    Then admin goes employee edit page
    Then admin enter new login value "tt3_employee"
    Then admin enter new firstname value "tester"
    Then admin enter new lastname value "team3"
    Then admin enter new email value "tt3employee@team.com"
    Then admin change language english
    Then admin come back page
    Then admin goes page
    Then admin check employee values

  @user_edit @smoke
  Scenario: TC012_Admin_can_edit_all_user_info_user
    Then admin goes user edit page
    Then admin enter new login value "tt3_user"
    Then admin enter new firstname value "tester"
    Then admin enter new lastname value "team3"
    Then admin enter new email value "tt3user@team.com"
    Then admin change language english
    Then admin come back page
    Then admin goes page
    Then admin check user values

  @admin_delete @smoke
  Scenario: TC013_Admin_can_delete_all_user_info_admin
    Then admin select admin delete button
    Then admin select delete button again
    Then  admin check the admin deleted

  @manager_delete @smoke
  Scenario: TC014_Admin_can_delete_all_user_info_manager
    Then admin select manager delete button
    Then admin select delete button again
    Then  admin check the manager deleted

  @employee_delete @smoke
  Scenario: TC015_Admin_can_delete_all_user_info_employee
    Then admin select employee delete button
    Then admin select delete button again
    Then  admin check the employee deleted

  @user_delete @smoke
  Scenario: TC016_Admin_can_delete_all_user_info_user
    Then admin select user delete button
    Then admin select delete button again
    Then  admin check the user deleted

