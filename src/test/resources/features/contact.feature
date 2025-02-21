@contacts

Feature: Contacts Module functionalities

  Scenario: User enter valid credentials
    Given User enters username and password
    Then User clicks login button


  Scenario Outline: User should be able to create a new contact
    Given User click the contact button
    When User click on new contact button
    And user enter fullName "<fullName>"
    And user enters company "<company>"
    And user enters title "<title>"
    And user enters phone "<phone>"
    And user enters email "<email>"
    And user enters address "<address>"
    And user enters zip "<zip>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters country "<country>"
    And user should see "<expectedName>" in the first row of the web table
    And User can see all the contacts as a list inside the middle column
    Then User see the total number of the contacts near the “All Contacts” tab
    Examples:

      | fullName     | company | title  | phone      | email         | address       | zip   | city        | state    | country | expectedName |
      | John Doe     | Amazon  | SDET   | 3405879652 | abc@gmail.com | 123 Tester rd | 21547 | Queens      | New York | usa     | John Doe     |
      | Morgan Green | Etsy    | Tester | 2501469874 | def@yahoo.com | 456 brown rd  | 54120 | Fall Church | Virginia | usa     | Morgan Green |


  Scenario: edit/delete any contact under Contacts module

  Scenario:  User see the total number of the contacts near the “All Contacts” tab

  Scenario:  User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option

  Scenario: User can delete any selected contact