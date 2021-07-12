package com.hrms.API.steps.practice;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import static  org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import com.hrms.steps.EmployeeSearchSteps;
import com.hrms.utils.Constants;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import comhrms.API.utils.APIConstants;
import comhrms.API.utils.PayloadConstants;
import groovyjarjarantlr4.v4.parse.GrammarTreeVisitor.tokenSpec_return;
public class WorkflowAllSteps {
	
	String BaseURI=RestAssured.baseURI="http://18.232.148.34/syntaxapi";
	RequestSpecification request;
	Response response;
	String employeeID;
	
	@Given("a request is prepared to create an employee")
	public void a_request_is_prepared_to_create_an_employee() {
	 request=given().header("Content-Type","application/json").header("Authorization",TokenGenerationSteps.token).body(PayloadConstants.createEmployeePayload());
	}

	@When("a POST call is made to create an employee")
	public void a_POST_call_is_made_to_create_an_employee() {
	 response= request.when().post(APIConstants.CREATE_EMPLOYEE_ENDPOINT);
	}

	@Then("the status code for creating an employee is {int}")
	public void the_status_code_for_creating_an_employee_is(Integer statuscode) {
	response.then().assertThat().statusCode(statuscode);
	}


	@Then("the employee is created and response containts key {string} and value {string}")
	public void the_employee_is_created_and_response_containts_key_and_value(String key, String value) {
		  response.then().assertThat().body(key, equalTo(value));
	}

	
	@Then("the employee ID {string} is stored as a global variable to be used for other calls")
	public void the_employee_ID_is_stored_as_a_global_variable_to_be_used_for_other_calls(String empID) {
	 employeeID=	response.body().jsonPath().getString(empID);
	 System.out.println(employeeID );
	 
	}

	
	
	

@Given("a request is prepared the created employee")
public void a_request_is_prepared_the_created_employee() {
	given().header("Content-type","application/json").header("Authorization",TokenGenerationSteps.token).queryParam("employee_id", employeeID);
 }


@When("a GET is made to retrieve the created employee")
public void a_GET_is_made_to_retrieve_the_created_employee() {
response=	request.when().get(APIConstants.GET_EMPLOYEE_ENDPOINT);
  }

@Then("the status code for retrieving the created employee is {int}")
public void the_status_code_for_retrieving_the_created_employee_is(Integer statusCode) {
   response.then().assertThat().statusCode(statusCode);
}

@Then("the retrieve employee ID {string} matches the globally stored  employee ID")
public void the_retrieve_employee_ID_matches_the_globally_stored_employee_ID(String value) {
	String empID=response.body().jsonPath().getString(value);
	//empID.contentEquals(empID)
	Assert.assertTrue(empID.contentEquals(employeeID));
}


@Then("the retrieved data matches the data used to create an employee")
public void the_retrieved_data_matches_the_data_used_to_creatd_an_employee(DataTable dataTable) {
	
     List<Map<String, String>> expectedData= dataTable.asMaps(String.class, String.class);
     
     List<Map<String, String>> actualData= response.jsonPath().get("employee");
     
    int index=0;
    for(Map<String, String> map: expectedData) {
    	Set<String> keys=map.keySet();
    	for (String key:keys) {
			String expectedValue=map.get(key);
			String actualValue=actualData.get(index).get(key);
			Assert.assertEquals(expectedValue, actualValue);
		}
    	index++;
      }
    
    String empId=response.body().jsonPath().getString("employee[0].employee_id");
    Assert.assertTrue(empId.contentEquals(employeeID));
    
	
   
}
	
	
	
	
	
	
	

	
	
	
	
}
