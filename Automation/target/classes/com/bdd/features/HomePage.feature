Feature: Home page loading E2E testing

@home
  Scenario: Verify home page and navigate to signup page
    Given User navigate to home page
    When User click on Skip Sign In CTA
    Then User successfully navigate to signup page
  
