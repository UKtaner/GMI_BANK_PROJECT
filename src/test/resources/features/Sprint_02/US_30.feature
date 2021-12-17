@PdfCreation
Feature: Pdf_Creation
  Scenario Outline:
    Given user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And user sends the query to db and reads related country data "<query>"
    Then user creates pdf with information
    Examples:
      |query|
      |Select * from tp_country|