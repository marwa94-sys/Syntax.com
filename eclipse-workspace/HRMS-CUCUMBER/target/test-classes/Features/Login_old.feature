

Feature: Login

@smoke
 Scenario: valid admin login
    When user enter valid admin username and password
    And user click on login button
    Then admin user is successfully logged in


@smoke 
Scenario: valid ess login 
When user entres valid admin username and password 
And user click on login button 
Then ess user is successfully logged in


#Enhancing test with Scenario Outline 
@smoke 
Scenario Outline:
When user enter valid "<username>" and "<password>"
And user click on login button
Then "<firstname>" is successeffully logged in 

Examples:

| username | password  | firstname |
| Mahady   | Mahady123!| John      |
|abd77     | Syntax123!| Abdullah  |



@smoke 
Scenario: login with valid username and password 
When user enter valid username and invalid password 
And user click on login button 
Then user see invalid credentials text on login page 

@temp
Scenario: Login with invalid credentials
When I enter invalid username and password and see error message 
| username | password  | errorMessage       |
| Admin    | Admin123  | Invalid Credendials|
| Hello    | Syntax123!| Invalid Credentials|




#We use JUnit to execute our cucumber test 
#Using Cucumber Option we specify configurations for our test:
#-DryRun ---> Enable us to quick scan our features without running 
#them and check if all implementations are for steps present
#-Features--> path to the feature you wnat to execute 
#-Glue --> path for our Gherkin steps implementation code 
#-Tags --> it will execute groups of Scenarios from features file
#-monochrome --> Translate the console data to more understandable info 
# strict --> if we have unmplementad step, strict won't let it run 
# Cucumber Hooks 
#is block of code that gets executed before and after each Scenario 
#@Before 
#@After
#When preconditions are same for all scenarios


        








