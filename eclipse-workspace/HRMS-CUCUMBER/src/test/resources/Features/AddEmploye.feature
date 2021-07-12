Feature: Add new Employee

  Background: 
    Given user entres valid admin username and password
    And user navigates to AddEmployeePage

  Scenario: Add Employee with first and Lastname
    When user entres employee firstName and lastName
    And user clicks save button
    Then user is added successfully

  Scenario: Add Employee without employee id
    When user entres employee firstName and lastName
    And user delete employee id
    And user clicks save button
    Then user is added successfully

  Scenario: AddEmployee and create login Credentials
    When user entres employee firstName and lastName
    And user clicks on create login checkbox
    And user entres login credentials
    And user clicks save button
    Then user is added successfully

  #To perform DDT in cucumber we use Scenario Outline with Examples
  @smoke
  Scenario Outline: Adding multiple employees
    When user enter employee "<FirstName>", "<MiddleName>" and "<LastName>"
    And user clikcs save button
    Then "<FirstName>", "<MiddleName>" and "<LastName>" is Added successefully

    Examples: 
      | FirstName | MiddleName | LastName   |
      | James     | J          | Smith      |
      | Faisal    | F          | Smith      |
      | Sohail    | S          | Instructor |
      | Yunus     | Emre       | Yakut      |

  #adding multiple employees using Cucumber Database
  Scenario: Adding multiple employees
    When user enters employee details and click on save
      | firstName | middleName | lastName |
      | John      | J          | Smith    |
      | Jane      | J          | Smith    |
   

  @excel
  Scenario: Adding multiple employees from execl
    When user enters employee data from "Employee" execl sheet then employee is added
