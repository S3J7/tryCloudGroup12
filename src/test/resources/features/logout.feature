@logout
Feature: Log out functionality

  Agile Story: As a user, I should be able to log out.


  Scenario: User can log out and end up in login page
    Given user is logged in with valid credentials
    When user clicks the user icon at the top right
    And user views the dropdown menu and selects Log out
    Then user sees login page is displayed


  Scenario: User cannot return to home page using the back button after logging out
    Given user is logged in with valid "Employee12" and "Employee123"
    And user clicks the user icon at the top right and selects Logout
    Then user sees the login page is displayed
    But verify if user remains on login page after clicking back button


  Scenario: User is logged out after 3 minutes of inactivity
    Given user enters below valid credentials
      | username | Employee12  |
      | password | Employee123 |
    When user remains AFK for three minutes
    Then verify if user is back on the login page
    # supposed to fail : success


  Scenario: Verify session termination after logout
    Given user is logged in with valid credentials
    When user clicks on the logout button
    Then the user's session is terminated
    Then the user is redirected to the login page

