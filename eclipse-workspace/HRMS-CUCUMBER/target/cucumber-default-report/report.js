$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/APIWorkflow.feature");
formatter.feature({
  "name": "Syntax HRMS API End to End Workflow",
  "description": "Description: This feature tests and verifies Syntax HRMS Web Services \nThe Workflow consists of the following sequential calls ",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@workflow"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.TokenGenerationSteps.a_JWT_is_generated()"
});
formatter.result({
  "error_message": "io.restassured.path.json.exception.JsonPathException: Failed to parse the JSON document\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1002)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:352)\r\n\tat com.hrms.API.steps.practice.TokenGenerationSteps.a_JWT_is_generated(TokenGenerationSteps.java:32)\r\n\tat ✽.a JWT is generated(file:///C:/Users/marwa/eclipse-workspace/HRMS-CUCUMBER/src/test/resources/features/APIWorkflow.feature:9)\r\nCaused by: groovy.json.JsonException: Lexing failed on line: 1, column: 1, while reading \u0027\u003c\u0027, no possible valid JSON value or punctuation could be recognized.\r\n\tat groovy.json.JsonLexer.nextToken(JsonLexer.java:86)\r\n\tat groovy.json.JsonLexer$nextToken.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:130)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parse(ConfigurableJsonSlurper.groovy:97)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper$parse.callCurrent(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:171)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:185)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parseText(ConfigurableJsonSlurper.groovy:83)\r\n\tat io.restassured.path.json.JsonPath$4$1.method(JsonPath.java:965)\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1000)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:352)\r\n\tat com.hrms.API.steps.practice.TokenGenerationSteps.a_JWT_is_generated(TokenGenerationSteps.java:32)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Creating an employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@workflow"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create an employee",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.a_request_is_prepared_to_create_an_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a POST call is made to create an employee",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.a_POST_call_is_made_to_create_an_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the status code for creating an employee is 201",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.the_status_code_for_creating_an_employee_is(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the employee is created and response containts key \"Message\" and value \"Entry Created\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.the_employee_is_created_and_response_containts_key_and_value(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the employee ID \"Employee[0].employee_id\" is stored as a global variable to be used for other calls",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.the_employee_ID_is_stored_as_a_global_variable_to_be_used_for_other_calls(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.TokenGenerationSteps.a_JWT_is_generated()"
});
formatter.result({
  "error_message": "io.restassured.path.json.exception.JsonPathException: Failed to parse the JSON document\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1002)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:352)\r\n\tat com.hrms.API.steps.practice.TokenGenerationSteps.a_JWT_is_generated(TokenGenerationSteps.java:32)\r\n\tat ✽.a JWT is generated(file:///C:/Users/marwa/eclipse-workspace/HRMS-CUCUMBER/src/test/resources/features/APIWorkflow.feature:9)\r\nCaused by: groovy.json.JsonException: Lexing failed on line: 1, column: 1, while reading \u0027\u003c\u0027, no possible valid JSON value or punctuation could be recognized.\r\n\tat groovy.json.JsonLexer.nextToken(JsonLexer.java:86)\r\n\tat groovy.json.JsonLexer$nextToken.call(Unknown Source)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parse(ConfigurableJsonSlurper.groovy:97)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper$parse.callCurrent(Unknown Source)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parseText(ConfigurableJsonSlurper.groovy:83)\r\n\tat io.restassured.path.json.JsonPath$4$1.method(JsonPath.java:965)\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1000)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:352)\r\n\tat com.hrms.API.steps.practice.TokenGenerationSteps.a_JWT_is_generated(TokenGenerationSteps.java:32)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Retrieving created employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@workflow"
    }
  ]
});
formatter.step({
  "name": "a request is prepared the created employee",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.a_request_is_prepared_the_created_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a GET is made to retrieve the created employee",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.a_GET_is_made_to_retrieve_the_created_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the status code for retrieving the created employee is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.the_status_code_for_retrieving_the_created_employee_is(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the retrieve employee ID \"employee[0].employee_id\" matches the globally stored  employee ID",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.the_retrieve_employee_ID_matches_the_globally_stored_employee_ID(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the retrieved data matches the data used to creatd an employee",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.WorkflowAllSteps.the_retrieved_data_matches_the_data_used_to_creatd_an_employee()"
});
formatter.result({
  "status": "skipped"
});
});