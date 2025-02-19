@login
Feature: Users should be able to login with credential

  Background: User is already in the log in page

    Scenario: User should be able to login correct credential
    Given User enter username and password
    And User click login button
    Then User should land to the homepage







