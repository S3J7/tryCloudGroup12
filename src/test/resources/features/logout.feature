Feature: Log out functionality

  User Story: As a user, I should be able to log out.

  @logout
  Scenario: User can log out and end up in login page
    Given user is logged in with valid credentials
    When user clicks the user icon at the top right
    And user views the dropdown menu and selects Log out
    Then user sees login page is displayed


  Scenario: User cannot return to home page using the back button after logging out
    Given user is logged in with valid credentials
    And user clicks the user icon at the top right and selects Logout
    Then user sees the login page is displayed
    But verify if user remains on login page after clicking back button


  Scenario: User is logged out after 3 minutes of inactivity
    Given user is logged in with valid credentials
    When user remains AFK for three minutes
    Then verify if user is back on the login page
    # supposed to fail : success
