@workflow
Feature: Syntax HRMS API End to End Workflow
  Description: This feature tests and verifies Syntax HRMS Web Services 
  The Workflow consists of the following sequential calls

  Background: 
    Given a JWT is generated





  Scenario: Creating an employee
    Given a request is prepared to create an employee
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    And the employee is created and response containts key "Message" and value "Entry Created"
    And the employee ID "Employee[0].employee_id" is stored as a global variable to be used for other calls




  Scenario: Retrieving created employee
    Given a request is prepared the created employee
    When a GET is made to retrieve the created employee
    Then the status code for retrieving the created employee is 200
    And the retrieve employee ID "employee[0].employee_id" matches the globally stored  employee ID
    And the retrieved data matches the data used to create an employee
      | emp_firstname | emp_middle_name | emp_lastname | emp_birthday | emp_gender | emp_job_title        | emp_status |
      | abc           | mayadream       | mana         | 2020-07-20   | F          | Application Develope | Freelance  |
