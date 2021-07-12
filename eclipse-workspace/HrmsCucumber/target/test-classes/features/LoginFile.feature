Feature: Login

Scenario: valid admin login 
Given user navigated to HRMS
When user is logged with valid admin credentials 
And user click on login button 
Then admin user is successfully logged in 

Scenario: valid ess login 
Given user navigated to HRMS
When user enters valid ess username and password 
And user click on login button
Then user is successfully logged in 

Scenario: login with valid username and invalid password 
Given user navigated to HRMS  
When user entres valid usernmae and invalid password 
And user click on login button 
Then user see invalid credentials test on login page 
