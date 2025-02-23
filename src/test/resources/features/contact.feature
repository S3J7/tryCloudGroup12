@contacts

Feature: Contacts Module functionalities



#    And User clicks login button

  Scenario Outline: User should be able to create a new contact

    Given User enters username and password
    And User click the contact button
    And User click on new contact button
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
    Then user should see "<expectedName>" inside the middle column

    Examples:

      | fullName      | company | title  | phone      | email         | address       | zip   | city        | state    | country | expectedName  |
      | Jackson Floyd | Amazon  | SDET   | 3405879652 | abc@gmail.com | 123 Tester rd | 21547 | Queens      | New York | usa     | Jackson Floyd |
      | Morgan Green  | Etsy    | Tester | 2501469874 | def@yahoo.com | 456 brown rd  | 54120 | Fall Church | Virginia | usa     | Morgan Green  |



  Scenario:  User see the total number of the contacts near the “All Contacts” tab
    Given User enters username and password
    And User click the contact button
    Then User should see the total number of the contacts


  Scenario: edit/delete any contact under Contacts module
  Given User enters username and password
  And User click the contact button
  And User click any contact
  And User click on the three dots icon on the right by contact name
  And User click delete


  Scenario:  User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
    Given User enters username and password
    And User click the contact button
    And User click Susan
    And User click the photo icon at the John Doe
    And User click choose from files
    And User choose the picture from file
    And User click choose button
