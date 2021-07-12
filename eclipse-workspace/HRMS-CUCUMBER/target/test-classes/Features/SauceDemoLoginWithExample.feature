#Author: marwaa.syntax@gmail.com
Feature: Sace Demo Login
  
  Description: US-3421 The purpose of this feature file is to automate sacue demo app login feature with valid and invalid credentials
  acceptance criteria: I want to automate sauce dmo login functionality

  Scenario Outline: invalid login
    Given user is on login page
    When user enter invalid username as "<username>"
    And user enter invalid password as "<password>"
    And click on login button
    Then user should see the error message

    Examples: 
      | username |  | password  |
      | Admin    |  | Admin123  |
      | Sarmed   |  | sarmed123 |

  Scenario: invalid login
    Given user is on login page
    When user enter invalid username
      """
      
      Each day has a promise to brighten up the 
      day but first you must allow the sun to come your way
      """
    And user enter invalid password as "<password>"
    And click on login button
    Then user should see the error message
