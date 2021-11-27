
Feature: US_003_Registration_Information

  Background: user goes to GMI bank webpage
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user select  Register button

Scenario: US_03_TC08_user_enter_new_password
Then user sends "9876a68"
Then verify bar is orange

Scenario:  US_03_TC08_user_enter_new_password
Then user send to "9876A68"
Then verify bar is orange

Scenario:  US_03_TC08_user_enter_new_password
Then user send "9ASDFGLH"
Then verify bar is orange

Scenario:  US_03_TC08_user_enter_new_password
Then user send "*98jgjt"
Then verify bar is yellow

Scenario:  US_03_TC08_user_enter_new_password
Then user send "Mypass9*"
Then verify bar is green