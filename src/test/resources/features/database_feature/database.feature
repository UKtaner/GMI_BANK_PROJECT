@db
  Feature: DataBase Test

    Scenario: TC_02901_user connects database
      Given user connects to the database
      And user reads all users' info.
      Then validate  all users

    Scenario: TC_02902_user connects database
      Given user connects to the database
      And read all countries's info.
      Then validate all countries

    Scenario: TC_02903_user connects database
      Given user connects to the database
      And read all USA state's info.
      Then validate all states related to USA
