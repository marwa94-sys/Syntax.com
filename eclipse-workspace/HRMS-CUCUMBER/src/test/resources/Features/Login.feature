#Author: marwa.yaghourtne@gmailcom
Feature: Login

  @sprint5 @login @smoke
  Scenario Outline: valid admin and ess login  
    When user enter valid "<username>" and "<password>"
    And user click on login button
    Then "<firstname>" is successeffully logged in

    Examples: 
      | username | password   | firstname |
      | Mahady   | Mahady123! | John      |
      | abd77    | Syntax123! | Abdullah  |

  @regression
  Scenario Outline: Erroe message validation while invalid login
    When user enter "<username>" and "<password>"
    And user click on login button
    Then user see "<Error message>"
    
    Examples: 
    
      | username | password   | errorMessage             |
      | Admin    | Admin123   | Invalid Credendials      |
      | Hello    | Syntax123! | Invalid Credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax123! | Username cannot be empty |
