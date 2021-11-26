@admin_can_manager_users
Feature: Admin_Control_Functionality

  Background: Navigating_the_home_page
    Given admin on home page
    And admin go login page
    And admin enter the username
    And admin enter password


  @user_activate
  Scenario:TC001_Admin_can_activate_a_role_as_user
    Then admin goes user-management page
    Then admin goes page
    Then admin activate user
    Then admin refresh the page
    Then admin check is user activated

  @employee_activate
  Scenario:TC002_Admin_can_activate_a_role_as_employee
    Then admin goes user-management page
    Then admin goes page
    Then admin activate employee
    Then admin refresh the page
    Then admin check is employee activated

  @manager_activate
  Scenario:TC003_Admin_can_activate_a_role_as_manager
    Then admin goes user-management page
    Then admin goes page
    Then admin activate manager
    Then admin refresh the page
    Then admin check is manager activated

  @admin_activate
  Scenario:TC004_Admin_can_activate_a_role_as_admin
    Then admin goes user-management page
    Then admin goes page
    Then admin activate admin
    Then admin refresh the page
    Then admin check is admin activated

    @admin_detais
    Scenario: TC005_Admin_can_view_all_user_info_admin
      Then admin goes admin details page
      Then admin check firstname
      Then  admin check lastname
      Then admin check profiles


