
Feature: User should be able to search file or contact from Dashboard and see the photos under Photos Module
  Agile Story : User can search file typing its name through the magnifying glass icon and see the details side page of the file when clicked on it.

  Background:User should be on the homepage

    @fileSearch
  Scenario: trycloud files search verification
   Given user is on the trycloud homepage
   When user can click on the magnifying glass icon
   And user types file name in the search box and click on it
   Then user sees the details side page of the file when clicked on it.