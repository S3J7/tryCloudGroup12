Feature: User should  be able to create new conversation

  @talk



  Scenario: User should  be able to create new conversation
    Given User is logged in with valid credentials and click loginbutton
    When User click on talk module
    And User click on + icon
    And User gives a name the conversation
    And User clicks on Add Participants
    And User clicks on search box
    Then User clicks on create conversation
