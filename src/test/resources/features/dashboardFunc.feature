
Feature: Modify Dashboard Page
  As a user
  I should be able to modify the Dashboard page

  Background: User is on dashboard page

  @dashboard
  Scenario: User logs in with valid credentials
    Given User is on the login page
    When User logs in with valid credentials
    Then User is on dashboard


  Scenario: User should see modules and user name on dashboard
    Given User enters username and password
    Then User should see all "modules" on the dashboard
    Then User should see their "Username" displayed


  Scenario: User customizes the dashboard
    Given User enters username and password
    When User clicks on the "Customize" button
    Then User should see "status" widgets
    Then User selects a "status" widget
    Then User should see background images
    Then User selects a background image"

  Scenario: User sets status on the dashboard
    Given User enters username and password
    When User clicks on the "Set Status" button
    Then User should see "Online" status options
    Then User selects an Online status option
    Then User should see "Status messages"
    Then User selects a Status message
    Then User can set a status message
    Then User can clear a status message
    Then User should see their selections applied on the dashboard
