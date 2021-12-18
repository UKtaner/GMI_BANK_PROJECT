@DBTesting
Feature: Database testing

  Background:
    Given user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

  Scenario Outline: TC_02901_user reads all users' info.
       Given user sends their query to db and gets related data "<query>" , columnName  "<columnName>" and next "<columnName2>"
    And user sets DB data into user file
    Then user validates db data using user records
    Examples: test data
      |query|columnName|columnName2|
      |Select * from  jhi_user|first_name|id|

  Scenario Outline: TC_02902_user reads all countries's info.
    Given user sends the query to db and reads related country data "<query>" and "<column_name>"
    And user sets DB data into country file
    Then user validates db data using country records
    Examples: test data
      |query|column_name|
      |Select * from tp_country|name|

  Scenario Outline: TC_02903_user reads all USA state's info.
    Given user sends the query to db and reads all USA states data "<query>" and "<column_name>"
    And user sets DB data into state file
    Then user validates db data using state records
    Examples: test data
      |query|column_name|
      |Select * from tp_state|name|


