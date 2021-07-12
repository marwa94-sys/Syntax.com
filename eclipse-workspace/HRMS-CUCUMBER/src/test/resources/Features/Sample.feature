Feature: login
Scenario: valid admin login
    When user enter valid admin username and password
    And user click on login button
    Then admin user is successfully logged in