Feature: Name Validations against DB 

Scenario: First Name validation against DB 
Given user enter valid admin username and password
And user navigate to employee list page 
When user entres valid employee id "10079"
And click on search button 
Then verify table is dispaly 
And get frist name form table 
And get data from db 
Then validate first name from ui against db 

























