Feature: Employee Search 

Background: 
Given  user entres valid admin username and password 
And user navigate to employee list page 


@smoke
Scenario: Search employee by id 
When user enters valid employee id "10079"
And click on search button 
Then user see employee information is displayed 
 
 
 @regression
 Scenario: Serch employee by name   
When user enters valid employee name and last name 
And click on search button 
Then user see employee information is displayed 




 


