Feature: Valdiate widget feature

Background: Verify signup page
    Given User navigate to home page
    When User click on Skip Sign In CTA
    Then User successfully navigate to signup page 

@widget
Scenario: Validate the widget page
Given Click on widget menu
When Click on Accordian submenu
Then Click on collapsable group