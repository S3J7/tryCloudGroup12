@login
Feature: Login Functionality

  Background:
    Given the user is on the login page


  Scenario: Successful login with valid credentials
    When the user logs in with username and password
    And the user clicks on the "Login" button or presses the "Enter" key
    Then the user should be redirected to the homepage


  Scenario Outline: Unsuccessful login with invalid credentials
    When user enters the username "<username>" and "<password>"
    And the user should not be able to log in
    Then user should see the message "Wrong username or password."
    Examples:
      | username      | password      |
      | wrongUserName | Employee123   |
      | Employee12    | wrongPassword |
      | wrongUserName | wrongPassword |


  Scenario: Login attempt with empty username or password
    When the user leaves the username or password field empty
    And the user clicks on the "Login" button
    Then the user should see an error message "Please fill out this field."

  Scenario: Password should be hidden by default
    When the user enters a password
    Then the password should be displayed as dots


  Scenario: User can toggle password visibility
    And the user has entered a password
    When the user clicks on the "Show Password" icon
    Then the password should be displayed in plain text

  Scenario: User sees the "Forgot Password?" link
    Then the user should see the "Forgot password?" link

  Scenario: User can navigate to reset password page
    When the user clicks on the "Forgot Password?" link
    Then the user should be redirected to the "Trycloud QA" page
    And the user should see the "Reset Password" button

  Scenario: Username and Password fields have valid placeholders
    When user should go back to login page
    Then the username field should have the placeholder "Username or email"
    And the password field should have the placeholder "Password"




