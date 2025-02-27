Feature: Upload/Edit/Delete File Module Functionality

  #Henifa

Scenario: user should be able to upload a file
  Given user is on the home pages
  When user clicks the new folder menu, they goes to a new page
  And user clicks the add icon
  And choose upload file and upload a file
  Then user sees the newly updated file



  Scenario: user should be able to create a new folder
    Given user is on the home pages
    When user clicks the new folder menu, they goes to a new page
    And user clicks the add icon
    And user clicks the new folder
    And user enters the name of the new folder
    And click the submit icon
    Then user could see the newly added folder


  Scenario: User can copy any selected item
    Given user is on the home pages
    When user clicks the new folder menu, they goes to a new page
    And user clicks the three dot to manipulate the file or folder
    And user select the move or copy option
    And user select a folder to copy the item
    And user clicks the copy to new folder button
    And user clicks the folder that item has been copied
    Then user should see the item in the folder



    Scenario: User can move any selected item to any folder and see the item in the selected folder
      Given user is on the home pages
      When user clicks the new folder menu, they goes to a new page
      And user clicks the three dot to manipulate the file or folder
      And user select the move or copy option
      And user select a folder to move the item
      And user clicks the move to new folder button
      And user clicks the folder that item has been moved
      Then user could see the item in the folder




  Scenario: User can delete any selected item
    Given user is on the home pages
    When user clicks the new folder menu, they goes to a new page
    And user clicks the three dot to delete the folder
    And user clicks the delete button




  Scenario:User can see the total number of files and folders under the files list table
        Given user is on the home pages
        When user clicks the new folder menu, they goes to a new page
        Then user could see the total number of the files and folders





