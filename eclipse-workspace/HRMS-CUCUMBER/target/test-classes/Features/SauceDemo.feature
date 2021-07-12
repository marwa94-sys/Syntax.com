#Author: marwa.syntax@gmail.com
Feature: Sace Demo login

Description: US-3421 The purpose of this feature file is to automate sacue demo app login feature with valid and invalid credentials 
Acceptance criteria: I want to automate sauce dmo login functionality
 
Background:
Given user is on login page 
When user enter invalid username 

Scenario: invalid login 
Given user is on login page
When user enters invalid username
And user enters invalid password 
And click on login button
Then user should see the error message 



Scenario: invalid login
Given user is on login page
When user enter invalid username as "admin"
And user enter invalid password as "admin@123"
And click on login button
Then user should see the error message 


