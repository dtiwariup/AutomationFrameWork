Feature: Valdiate switch to feature

Background: Verify signup page
    Given User navigate to home page
    # When User click on Skip Sign In CTA
    # Then User successfully navigate to signup page 

@alert    
Scenario: verify switchto page
Given Validate the alert text
Then Click on alert button 

@confirm
Scenario: verify the alertwithCancel
Given click on alertwithOk button
Then click on confirmbox


@wNewTab
Scenario: verify new tab window
Given Click on open new tab window
Then Click on new tab window button 

@wNewTab
Scenario: verify new seprate window
Given Click on open new seprate window
Then Click on open seprate window button 

@wNewTab2
Scenario: verify multiple seprate window
Given Click on open seprate multiple window
Then Click on open seprate multiple window button 