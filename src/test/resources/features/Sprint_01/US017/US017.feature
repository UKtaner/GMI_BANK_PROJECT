Feature: Admin_Control_Functionality

  Background: Navigating_the_home_page
    Given admin on home page
    And admin go login page
    And admin enter the username
    And Enter password

    @TC001_Admin_can_activate_a_role_as_user
    Then admin goes user-management page
    Then admin goes page 140
    Then admin goes user edit page
    When admin check activate checkbox
    Then admin go back user-management page
    Then admin check is user activated
