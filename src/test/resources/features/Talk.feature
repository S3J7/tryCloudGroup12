
@talk
Feature: User should  be able to create new conversation

#Scenario on this feature file should be executed indepedently



  Scenario: User should  be able to create new conversation
  Given  User is logged in with valid credentials
    When User click on talk module
    And  User click on + icon
    And User gives a name the conversation
    And User clicks on Add Participants
    And User clicks on search box
    And user adds the new contact
  #  And user click on contact
    Then User clicks on create conversation

    Scenario: User should be able to add any contact to the conversation
      Given User is logged in with valid credentials
      When User click on talk module
      And User clicks on any conversation
      And User clicks on user settings on top on right of conversation
      And User clicks on Participants
      And User clicks on Add Participants box
      #And User writes name on box
      Then User clicks on name



#  User can add any selected participant to any conversation
  Scenario: Display all conversation list under the Talk module
    Given  User is logged in with valid credentials
    When User click on talk module
    Then User should see all conversation list displayed under TalkModule

  Scenario: User can start a call with any participant and leave the call
    Given   User is logged in with valid credentials
    When User click on talk module
    And User click on conversation
    And User clicks on Start call button
    Then User Clicks on Leave call button



  Scenario: User can delete a conversation
    Given   User is logged in with valid credentials
    When User click on talk module
    And User clicks on three dots button in right corner of conversation
    And user clicks on Delete Conversation
    Then User clicks on Yes button on displayed message



