Feature: User should be able to change folder view functionality




  Scenario: User should be able to change folder view by clicking NAME
    Given user is logged in with valid credentials and user clicks on loginbutton
    When user clicks on folder files icon
    And user clicks on Name icon
    Then user should be able to see list of folders based of their names


  Scenario: User should be able to change folder view by clicking SIZE
    Given user is logged in with valid credentials and user clicks on loginbutton
    When user clicks on folder files icon
    When user clicks on Size icon
    Then user should be able to see list of folders based of their sizes



  Scenario: User should be able to change folder view by clicking MODIFIED
    Given user is logged in with valid credentials and user clicks on loginbutton
    When user clicks on folder files icon
    When user clicks on Modified icon
    Then user should be able to see list of folders based of their Modified dates



  Scenario: User should be able to change folder view by clicking the toggle-view button
    Given user is logged in with valid credentials and user clicks on loginbutton
    When user clicks on folder files icon
    When user clicks on the toggle-view button at the right corner of all files tab screen
    Then user should be able to see a list in a view of larger icons


  @folders
  Scenario: User should be able to select all the files at once and see the total value of all files
    Given user is logged in with valid credentials and user clicks on loginbutton
    When user clicks on folder files icon
    When user clicks on the select all checkbox at the left top corner of the list
    Then user should be able to see that all checkboxes are checked  and total values of folders and files are displayed correctly





