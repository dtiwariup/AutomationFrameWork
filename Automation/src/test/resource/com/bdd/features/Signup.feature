Feature: Validate signup page

Background: Verify signup page
    Given User navigate to home page
    When User click on Skip Sign In CTA
    Then User successfully navigate to signup page 
   
#Scenario Outline: Verify registration flow
#Given User enter firstname "Hello" and lastname "Hi"
#When User enter the address "Test address"
#And User enter email address "dt@test.com"
#And User enter the phone number "1234567890"

@signup 
Scenario: Verify registration flow
Given User enter firstname and lastname 
When User enter the address 
And User enter email address 
And User enter the phone number
And User select the gender
And User select hobbies
And User select language
And User select skill
And User select the country
And User select the Year
And User select the Month
And User select the Day
And User enter the password
And User enter the confirm password
Then User click on submit button
