
Feature: Dashboard Functionality

  @mo
  Scenario: User logs in and modifies dashboard
    Given User is on login page
    When User enters valid credentials
    Then User should see the dashboard with modules and username

  Scenario: User customizes dashboard Test
    Given User is on dashboard page
    When User clicks Customize button
    And User selects a status widget
    And User selects a background image
    Then The dashboard should reflect the selections

  Scenario: User sets status message
    Given User is on dashboard page
    When User clicks Set Status button
    And User selects an online status
    And User selects a status message
    Then The dashboard should display the selected status