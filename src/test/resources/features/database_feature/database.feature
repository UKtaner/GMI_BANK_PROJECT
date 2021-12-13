@DB9Testing
Feature: Database testing




  Background:
    Given user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"


  @dbtest
  Scenario Outline: TC_02901_user reads all users' info.
    Given user sends their query to db and gets related data "<query>" and "<column_name>"
    And user sets DB data into correspondent files
    Then user validates db data using records
    Examples: test data
      |query|column_name|
      |Select * from tp_country|name|
#      |Select * from tp_manager|id|
#      |Select * from tp_admin|first_name|
#      |Select * from tp_employee|last_name|


  Scenario Outline: TC_02902_user reads all countries's info.
    Given user sends the query to db and reads related country data "<query>" and "<column_name>"
    And user sets DB data into correspondent files
    Then user validates db data using records
    Examples: test data
      |query|column_name|
      |Select * from tp_country|id|
      |Select * from tp_country|name|

  Scenario Outline: TC_02903_user reads all USA state's info.
    Given user sends the query to db and reads all USA states data "<query>" and "<column_name>"
    And user sets DB data into correspondent files
    Then user validates db data using records
    Examples: test data
      |query|column_name|
      |Select * from tp_state|id|
      |Select * from tp_state|name|


