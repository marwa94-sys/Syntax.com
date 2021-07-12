#Author: your.email@your.domain.com

Feature: Sace Demo login


Scenario: invalid login 
Given user is on login page
When user enters invalid username as below
|username|
|admin|
|regular|
And user enters invalid password 
And click on login button
Then user should see the error message 


















































