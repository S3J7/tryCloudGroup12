@Calendar
Feature:  Calendar Module Functionality

  @Day
  Scenario: User can display daily calendar view
   Given User enters username and password valid
    And the user clicks on the calendar button
    And the user clicks on the choose button
    Then the user clicks on the day button

    @Week
 Scenario: User can display weekly calendar view
    Given User enters username and password valid
    And the user clicks on the calendar button
    And the user clicks on the choose button
    Then the user clicks on the week button

   @Month
  Scenario: User can display monthly calendar view
    Given User enters username and password valid
    And the user clicks on the calendar button
    And the user clicks on the choose button
    Then the user clicks on the month button

   @Event
   Scenario: User can create new event
     Given User enters username and password valid
     And the user clicks on the calendar button
     And the user clicks on the new event
     And insert your name event
     And the user clicks on save
     And the user clicks on the choose button
     Then the user clicks on the month button
  @Delete
  Scenario: User can delete  event
    Given User enters username and password valid
    And the user clicks on the calendar button
    And the user clicks on the choose button
    Then the user clicks on the month button
    And choose one event
    And the user clicks on the more button
    And the user clicks on the three button
    And the user clicks on the delete button







