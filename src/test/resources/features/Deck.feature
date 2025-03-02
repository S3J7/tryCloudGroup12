@deck
Feature: Deck Functionality


    @cleanup_required
    Scenario: TC1: Adding a deck
        Given user is logged in with valid "Employee12" and "Employee123"
        When The user clicks on the deck icon
        And User clicks to expand
        And User clicks Add board
        When User types in "New Board 2" and hits enter
        Then New board should be created

    @cleanup_required
    Scenario: TC2: Adding a new list
        Given user is logged in with valid "Employee12" and "Employee123"
        When The user clicks on the deck icon
        And User clicks to expand
        And User clicks Add board
        When User types in "New Board 2" and hits enter
        And User clicks on created board
        And User types in list "List 1" and hits enter
        Then New list should be created