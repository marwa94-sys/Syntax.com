Feature: Employee Search

Scenario: Search Employee by id

Given user navigated to HRMS 
And user is logged with valid admin credentials 
And user navigated to employee list page
When user enters valid employee id
And click on search button 
Then user see empoyee information is displayed 





#Scenario: Search Employess by name 
#Given user navigated to HRMS 
#And user is logged with valid admin credentials 
#And user navigated to employee list page
#When user enters valid employee name 
#And click on search button 
#Then user see empoyee information is displayed 









