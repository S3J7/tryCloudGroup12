Feature: Profile Settings Functionality

  As a user, I should be able to change profile info settings under the Profile module

Scenario: User can see at least following titles inside personal info under Profile Settings page;
  Given user is in the login page
  When user clicks the settings
  And user can see Full name/Email/Phone Number
  And User can change "John doe" info under Profile Settings page
  And User can make Phone number info as private under Profile Settings page
  And User cannot pass any characters, except number, into the Phone Number inputbox
  And User can see the current local time under the Local dropdown
