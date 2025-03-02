@deck
Feature: Deck Functionality




    Scenario: Adding a deck
        Given user is logged in with valid "Employee12" and "Employee123"
        When The user clicks on the deck icon
        And User clicks to expand
        And User clicks Add board
        When User types in "New Board 2" and hits enter
        Then New board should be created